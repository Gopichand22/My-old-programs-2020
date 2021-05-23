package studentdata;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class IntegratedAssessment2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("how many customer details you want to store:");
		int size = AllValidationChecks.integerCheck();
		Bank[] user = new Bank[size];
		boolean isValid = true;
		int index = 0;
		do {
			System.out.println("==============================\nselect from the following:");
			System.out.println("1.create bank user account\n" + "2.update the user details\n"
					+ "3.delete user details\n" + "4.display user details\n" + "5.exit");
			System.out.println("==============================");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if (!(index > 10)) {
					user[index++] = createcust();
				} else {
					System.out.println("size exceeded:");
				}
				break;

			case 2:
				updateDetails(user, index);
				break;

			case 3:
				index = deleteUser(user, index);
				break;
			case 4:
				viewUserDetails(user, index);
				break;

			case 5:
				isValid = false;
				break;

			}
		} while (isValid);

	}

	public static void sortAccountNum(Bank[] arr, int index) {
		int j;
		Bank key;
		for (int i = 1; i < index; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key.getAccountNumber() < arr[j].getAccountNumber()) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}

	}

	public static void sortAddress(Bank[] arr, int size) {
		Bank key;
		int j;
		for (int i = 1; i < size; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key.getAddress().compareTo(arr[j].getAddress()) > 0) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}
	}

	public static void viewUserDetails(Bank[] user, int index) {
		int i;
		if (index == 0) {
			System.out.println("there are no users to display");
		} else {
			System.out.println("****************************************************");
			System.out.println("select from the following");
			System.out.println("****************************************************");
			System.out.println("1. Display user details based on account number\n"
					+ "2. Display user details based on Name\n" + "3. Display all users who have non-zero balance\n"
					+ "4. Display user sorted based on address (location wise)\n"
					+ "5. Display users sorted based on account account number");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter account number of the user to see the details");
				long accountNumber = validateAccountNum();
				int dis = displayWrtAccuntNum(user, accountNumber, index);
				if (dis < index)
					user[dis].print();
				break;
			case 2:

				System.out.println("enter the name of the user to see the details");
				scan.nextLine();
				String name = scan.nextLine();
				dis = displayWrtName(user, name, index);
				if (dis < index)
					user[dis].print();
				break;
			case 3:
				int flag = 0;
				for (i = 0; i < index; i++) {
					if (user[i].getBalance() > 0) {
						user[i].print();
						flag = 1;
					}
				}
				if (flag == 0) {
					System.out.println("no user have balance grater than zero");
				}
				break;
			case 4:
				sortAddress(user, index);
				for (i = 0; i < index; i++) {
					user[i].print();
				}
				break;
			case 5:
				sortAccountNum(user, index);
				for (i = 0; i < index; i++) {
					user[i].print();
				}
				break;
			default:
				System.out.println("invalid option:");
			}
		}
	}

	public static void updateDetails(Bank[] user, int index) {
		if (index == 0) {
			System.out.println("there are no users to display");
		} else {
			int i, choice = 0;
			System.out.println("enter the account number of the user whose details need to be updated");
			long num = validateAccountNum();
			for (i = 0; i < index; i++) {
				if (user[i].getAccountNumber() == num) {
					System.out.println("what do you want to alter\n1.name\n2.address");
					choice = scan.nextInt();
					break;
				}
			}
			switch (choice) {
			case 0:
				System.out.println("account number is invalid");
				break;
			case 1:
				System.out.println("enter new name");
				scan.nextLine();
				String name = validateName();
				user[i].setName(name);
				System.out.println("***********name successfully updated***********");
				break;
			case 2:
				System.out.println("enter new address");
				scan.nextLine();
				String address = scan.nextLine();
				user[i].setAddress(address);
				System.out.println("***********address successfully updated***********");
				break;
			}
		}
	}

	public static int deleteUser(Bank[] user, int index) {
		if (index == 0) {
			System.out.println("there are no users to delete");
		} else {
			int i;
			System.out.println("Enter the Account number to delete user from records:");
			long accountNumber = validateAccountNum();
			for (i = 0; i < index; i++) {
				if (user[i].getAccountNumber() == accountNumber) {
					System.out.println("***********account successfully deleted***********");
					for (int j = i; j < index - 1; j++) {
						user[j] = user[j + 1];
					}
					index--;
					break;
				}
			}

		}
		return index;
	}

	public static long validateAccountNum() {

		long accNum;

		while (true) {
			accNum = AllValidationChecks.sc.nextLong();
			int count = 0;
			long num = accNum;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			if (count == 7)
				return accNum;
			else
				System.out.println(
						"invalid entry:\n" + "account number should not start with '0' & it must contain 7 digits");
		}

	}

	public static String validateAccountType() {
		String accountType = "";
		boolean isValid = true;
		do {
			System.out.println("select account type\n1.savings\n2.current\n3.loan");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				accountType = "savings";
				isValid = false;
				break;
			case 2:
				accountType = "current";
				isValid = false;
				break;
			case 3:
				accountType = "loan";
				isValid = false;
				break;
			default:
				System.out.println("invalid option");
				break;
			}

		} while (isValid);
		return accountType;
	}

	public static String validateName() {
		String name;
		boolean isValid = true;
		do {
			name = scan.nextLine();
			int i;
			for (i = 0; i < name.length(); i++) {
				char check = name.charAt(i);
				if (check >= 'A' && check <= 'Z' || check >= 'a' && check <= 'z' || check == ' ') {
					continue;
				} else {
					System.out.println("name should not contain numbers\n" + "please enter correct name:");
					break;
				}
			}
			if (i == name.length())
				isValid = false;
		} while (isValid);
		name = AllValidationChecks.stringCheck();
		return name;

	}

	public static double validateAccountBal() {
		double balance;
		do {
			balance = AllValidationChecks.doubleCheck();
			if (balance < 0)
				System.out.println("account balance should not be less than '0'\n" + "please enter again");
			else
				break;
		} while (true);
		return balance;
	}

	public static Bank createcust() {
		long accountNumber;
		String name, accountType, address;
		String dateOfBirth;
		double balance;
		System.out.println("enter account number:");
		System.out.println("Note:account number should not start with '0' & it must contain 7 digits");
		accountNumber = validateAccountNum();
		System.out.println("enter name of the user:");
		scan.nextLine();
		name = validateName();
		accountType = validateAccountType();
		System.out.println("enter address of the user:");
		scan.nextLine();
		address = scan.nextLine();
		System.out.println("enter date of birth of the user:");
		dateOfBirth = VerifyDate.validateDate();
		System.out.println("enter accout balance:");
		balance = validateAccountBal();
		Bank obj = new Bank(accountNumber, name, accountType, address, dateOfBirth, balance);
		System.out.println("***********account successfully created***********");
		return obj;
	}

	public static int displayWrtAccuntNum(Bank[] user, long accountNumber, int index) {
		int i;
		for (i = 0; i < index; i++) {
			if (user[i].getAccountNumber() == accountNumber) {
				return i;
			}
		}
		System.out.println("invalid account number:");
		return i;
	}

	public static int displayWrtName(Bank[] user, String name, int index) {
		int i;
		for (i = 0; i < index; i++) {
			if (user[i].getName().compareTo(name) == 0) {
				return i;
			}
		}
		System.out.println("no details found with that name:");
		return i;
	}

}
