package studentdata;

import java.util.Scanner;

import com.sun.tools.javac.util.StringUtils;

public class IntegratedAssessment1 {
	static Scanner scan = new Scanner(System.in);
	static String presentDate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter today's date:");
		presentDate = VerifyDate.validateDate();
		System.out.println("every booking done is comes under " + presentDate);
		int index = 0;
		boolean isValid = true;
		System.out.println("how many customer details you want to store:");
		int size = InputValidation.positiveNumber();
		// take size from the user.
		User[] cust = new User[size];

		do {
			System.out.println("select from the following\n1.to create new account\n" + "2.book ticket\n"
					+ "3.display customer details\n" + "4.exit");
			int option = InputValidation.validateInt();
			switch (option) {
			case 1:
				cust[index++] = createCust();
				break;
			case 2:
				System.out.println("already registered customer please enter your id and phone number\n"
						+ "if ur a new customer please register and come to step 2\npress 1 to continue\npress any key to exit");
				int temp = InputValidation.validateInt();
				if (temp == 1) {
					System.out.println("enter id");
					int id = InputValidation.validateInt();
					System.out.println("enter phone number");
					String phoneNum = validateMobileNum();
					bookTicket(cust, id, phoneNum, index);
				}
				break;
			case 3:
				if (index != 0) {
					System.out.println("select from the following\n1.Display customer based on city names\n"
							+ "2. Display customers based on ID\n" + "3. Display customer Names in sorted order");
					int choice = InputValidation.validateInt();
					switch (choice) {
					case 1:
						System.out.println("enter city name to display customers");
						String city = IntegratedAssessment2.validateName();
						displayWrtCity(cust, city, index);
						break;
					case 2:
						System.out.println("enter id to display customers");
						int id = InputValidation.validateInt();
						int dis = displayWrtId(cust, id, index);
						if (dis < index)
							cust[dis].print();
						break;
					case 3:
						cust = sortName(cust, index);
						for (int i = 0; i < index; i++) {
							System.out.println("details of " + i + 1 + " st customer are");
							cust[i].print();
						}
						break;

					}
				} else {
					System.out.println("there are no custoners to display");
				}
				break;
			case 4:
				isValid = false;
				break;
			default:
				System.out.println("invalid option please try again");
				break;

			}
		} while (isValid);

	}

	public static String selectTime() {
		String time;
		System.out.println("select timing from the following\n1.9:00 AM\n2.12:00 PM\n3.6:00 PM\n4.9:00 PM");
		int choice = scan.nextInt();
		do {
			switch (choice) {
			case 1:
				time = "9:00 AM";
				return time;
			case 2:
				time = "12:00 PM";
				return time;
			case 3:
				time = "6:00 PM";
				return time;
			case 4:
				time = "9:00 PM";
				return time;
			default:
				System.out.println("invalid option! select from the following");
				break;
			}
		} while (true);
	}

	public static User createCust() {
		int custId, age;
		String mobileNum, name, address;
		System.out.println("enter customer id");
		custId = InputValidation.validateInt();
		System.out.println("enter customer name");
		name = IntegratedAssessment2.validateName();
		System.out.println("enter customer mobile number");
		mobileNum = validateMobileNum();
		System.out.println("eneter address of the customer");
		scan.nextLine();
		address = scan.nextLine();
		String dob;
		while (true) {
			System.out.println("enter date of birth of the customer");
			dob = VerifyDate.validateDate();
			System.out.println("enter the age of the customer");
			age = validateAge();
			if (verifyDobAge(age, dob) == 1) {
				break;
			} else {
				System.out.println("age and date of birth did not match please enter again");
			}
		}
		User cust = new User(custId, age, mobileNum, name, address, dob);
		System.out.println("account successfully created");
		return cust;

	}

	public static int verifyDobAge(int age, String dob) {
		if (VerifyDate.getAge(dob, presentDate) == age)
			return 1;
		else
			return 0;

	}

	public static String validateMobileNum() {
		String num;
		System.out.println("it starts with '0' followed by 10 digits number");
		while (true) {
			num = scan.next();
			if (num.charAt(0) != '0' || num.length() != 11) {
				System.out.println("number should start with '0' followed by 10 digits number");
			}
			if (!((num.charAt(1) >= '6' && num.charAt(1) <= '9') && (num.charAt(2) >= '0' && num.charAt(2) <= '9')
					&& (num.charAt(3) >= '0' && num.charAt(3) <= '9') && (num.charAt(4) >= '0' && num.charAt(4) <= '9')
					&& (num.charAt(5) >= '0' && num.charAt(5) <= '9') && (num.charAt(6) >= '0' && num.charAt(6) <= '9')
					&& (num.charAt(7) >= '0' && num.charAt(7) <= '9') && (num.charAt(8) >= '0' && num.charAt(8) <= '9')
					&& (num.charAt(9) >= '0' && num.charAt(9) <= '9')
					&& (num.charAt(10) >= '0' && num.charAt(10) <= '9'))) {
				System.out.println("please enter the proper phone number");
			} else
				break;
		}
		return num;
	}

	public static int validateAge() {
		int age;
		while (true) {
			age = InputValidation.validateInt();
			if (!(age > 0 && age <= 100))
				System.out.println("please enter valid age");
			else
				break;
		}
		return age;
	}

	public static boolean validatSourDest(String source, String destination) {
		if (source.compareTo(destination) != 0) {
			return true;
		} else
			return false;
	}

	public static String verifyTicketBookingDate() {
		String dateOfJourney;
		int flag = 0;
		while (true) {
			System.out.println("eneter the date of journey");
			dateOfJourney = VerifyDate.validateDate();
			int day, month, year, presentDay, presentMonth, presentYear;
			day = VerifyDate.convertToInt(StringUtils.substring(0, 2, dateOfJourney));
			month = VerifyDate.convertToInt(StringUtils.substring(3, 5, dateOfJourney));
			year = VerifyDate.convertToInt(StringUtils.substring(6, 10, dateOfJourney));
			presentDay = VerifyDate.convertToInt(StringUtils.substring(0, 2, presentDate));
			presentMonth = VerifyDate.convertToInt(StringUtils.substring(3, 5, presentDate));
			presentYear = VerifyDate.convertToInt(StringUtils.substring(6, 10, presentDate));
			if (presentMonth != 12) {
				if (year == presentYear) {
					if (month == presentMonth + 1) {
						if (day <= presentDay) {
							flag = 1;
						}
					} else if (month == presentMonth) {
						if (day > presentDay) {
							flag = 1;
						}
					}
				}
			} else if (presentMonth == 12) {
				if (year == presentYear || year == presentYear + 1) {
					if (month == 1) {
						if (day <= presentDay) {
							flag = 1;
						}
					} else if (month == 12) {
						if (day > presentDay) {
							flag = 1;
						}
					}
				}
			}
			if (flag == 1)
				return dateOfJourney;
			else
				System.out.println(
						"booking will be done before one day of journey & date of journey will not be more than one month from today");

		}

	}

	public static User[] sortName(User[] arr, int size) {
		User key;
		int j;
		for (int i = 1; i < size; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && key.getName().compareTo(arr[j].getName()) < 0) {
				arr[j + 1] = arr[j];
				--j;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public static void bookTicket(User[] cust, int id, String phoneNum, int index) {
		int flag = 0;
		for (int i = 0; i < index; i++) {
			if (cust[i].getCustId() == id && cust[i].getMobileNum().compareTo(phoneNum) == 0) {
				System.out.println("enter starting point");
				String source = IntegratedAssessment2.validateName();
				System.out.println("enter ending point");
				String destination = IntegratedAssessment2.validateName();
				while (true) {
					if (validatSourDest(source, destination)) {
						cust[i].setSource(source);
						cust[i].setDestination(destination);
						break;
					} else {
						System.out.println("source and destination can't be same\nplease try again\nenter source");
						source = IntegratedAssessment2.validateName();
						System.out.println("enter destination");
						destination = IntegratedAssessment2.validateName();
					}

				}
				String dateOfJourney = verifyTicketBookingDate();
				cust[i].setDate(dateOfJourney);
				String time = selectTime();
				cust[i].setTime(time);
				System.out.println("your ticket confirmed for " + dateOfJourney);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("invali id & number");
	}

	public static void displayWrtCity(User[] cust, String city, int index) {
		int i, flag = 0;
		for (i = 0; i < index; i++) {
			if (city.compareTo(cust[i].getSource()) == 0) {
				cust[i].print();
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("no customers found with that city name");
		}
	}

	public static int displayWrtId(User[] cust, int id, int index) {
		int i;
		for (i = 0; i < index; i++) {
			if (id == cust[i].getCustId()) {
				return i;
			}
		}
		System.out.println("no customer found with that id:");
		return id;
	}

}
