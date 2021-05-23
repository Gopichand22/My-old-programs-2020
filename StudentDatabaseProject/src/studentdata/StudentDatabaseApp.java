package studentdata;

import com.mindtreefirstset.validations.AllValidationChecks;

public class StudentDatabaseApp {
	public static int arrayCount = 0;
	public static int records;
	public static BankRecords[] acObj;

	public static void main(String[] args) {
		System.out.println("Enter Records:");
		records = AllValidationChecks.integerCheck();
		acObj = new BankRecords[records];
		do {
			System.out.println("......................MENU......................");
			System.out.println("Enter the choice");
			System.out.println("1. Create a bank user");
			System.out.println("2. Update the details of customer");
			System.out.println("3. Delete user details");
			System.out.println("4. Display user details");
			System.out.println("5. Exit");
			switch (AllValidationChecks.integerCheck()) {
			case 1:
				createBankAc();
				break;
			case 2:
				// updateDetails();
				break;
			case 3:
				// deleteUserDetails();
				break;
			case 4:
				// DisplayUserDetails();
			case 5:
				return;
			default:
				System.out.println("Please enter Correct input btw 1-5");
			}

		} while (true);
	}

	private static int[] createBankAc() {
		if (arrayCount < records) {
			System.out.println("Enter the account number");
			long accountNumber = AllValidationChecks.System.out.println("Enter the account holder name");
			String customerName = AllValidationChecks.System.out.println("Enter the account type");
			String accountType = AllValidationChecks.System.out.println("Enter the date of birth");
			String dateOfBirth = AllValidationChecks.System.out.println("Enter the address");
			String address = AllValidationChecks.System.out.println("Enter the amount");
			double balance = AllValidationChecks.acObj[arrayCount] = new BankRecords(accountNumber, customerName,
					accountType, dateOfBirth, address, balance);
			arrayCount++;
		}
		return null;

	}
}
