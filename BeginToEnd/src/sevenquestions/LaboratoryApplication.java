package sevenquestions;

import java.util.Arrays;
import java.util.Scanner;

import com.begintoend.coding.Patient;
import com.mindtreefirstset.validations.AllValidationChecks;

public class LaboratoryApplication {
	static Scanner sc = new Scanner(System.in);

	static Patient[] patientObject;

	public static void main(String[] args) {
		int arrayCount = 0;
		boolean isValid = true;
		do {
			switch (chooseOption()) {
			case 1:
				patientObject = registerPatient(patientObject, arrayCount);
				break;
			case 2:
				patientObject = updateTestReports(patientObject, arrayCount);
				break;
			case 3:
				getTestDetails(patientObject, arrayCount);
				break;
			case 4:
				arrayCount = deleteRecord(patientObject, arrayCount);
				break;
			case 5:
				System.out.println("Exiting...");
				isValid = false;
				break;
			default:
				System.out.println("choose correct option btw 1-5:");
				break;
			}

		} while (isValid);

	}

	private static int deleteRecord(Patient[] patientObject, int arrayCount) {
		System.out.println("choose patient who is about to discharge & delete the data of that patient");
		display(patientObject, arrayCount);
		boolean flag = true;
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (patientObject[i].getName().equals(name)) {
				for (int j = i; j < arrayCount; j++) {
					patientObject[j] = patientObject[j + 1];
					flag = false;
					arrayCount--;
				}
			}
		}

		if (flag) {
			System.out.println("There is no patient with that name,Check it out");
			return deleteRecord(patientObject, arrayCount);
		} else {
			System.out.println("Account Deleted successfully");
		}
		return arrayCount;
	}

	// display patientName & testName
	private static void getTestDetails(Patient[] patientObject, int arrayCount) {
		display(patientObject, arrayCount);
	}

// update ur report
	private static Patient[] updateTestReports(Patient[] patientObject, int arrayCount) {
		boolean flag = true;
		System.out.println("Enter Patient name:");
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		for (int i = 0; i < arrayCount; i++) {
			if (patientObject[i].getName().equals(name)) {
				System.out.println("Enter report details of the patient:");
				patientObject[i].setCommentsOnTest(AllValidationChecks.stringLineCheck());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("There is no patient with that name,Check it out");
			return updateTestReports(patientObject, arrayCount);
		} else {
			System.out.println(Arrays.toString(patientObject));
			display(patientObject, arrayCount);
			return patientObject;
		}
	}

//patient registration 
	private static Patient[] registerPatient(Patient[] patientObject, int arrayCount) {
		System.out.println("Enter Patient Name:");
		AllValidationChecks.stringLineCheck();
		String name = AllValidationChecks.stringLineCheck();
		System.out.println("Enter gender:");
		String gender = AllValidationChecks.stringCheck();
		System.out.println("Enter age:");
		byte age = sc.nextByte();
		System.out.println("Enter mobile number:");
		String mobileNumber = AllValidationChecks.stringMobileNumberCheck();
		System.out.println("Enter Address:");
		AllValidationChecks.validateStringAddress();
		String address = AllValidationChecks.validateStringAddress();
		System.out.println("Referred by:");
		String docName = AllValidationChecks.validateStringAddress();
		String testName = validateTest(docName);
		String commentsOnTest = null;
		arrayCount += checkName(name);
		Patient[] patientObject1 = new Patient[arrayCount];
		patientObject1[arrayCount] = new Patient(name, age, gender, mobileNumber, address, docName, testName,
				commentsOnTest);
		System.out.println(Arrays.toString(patientObject1));
		arrayCount++;
		return patientObject1;
	}

//increment based on data entry
	private static int checkName(String name) {
		if (name != null) {
			return 1;
		} else {
			return 0;
		}
	}

	// validate test name
	private static String validateTest(String docName) {
		System.out.println(
				"Enter the test which is recomended by your doc " + docName + " -(Bloodtest,sugartest,X Ray):");
		String test = AllValidationChecks.stringLineCheck();
		if (test.equals("bloodtest") || test.equals("Bloodtest") || test.equals("blood test")
				|| test.equals("Blood Test") || test.equals("sugartest") || test.equals("Sugartest")
				|| test.equals("Sugar test") || test.equals("X-ray") || test.equals("x-ray") || test.equals("x ray")
				|| test.equals("X-Ray")) {
			return test;
		} else {
			System.out.println("Enter a valid test");
			return validateTest(docName);
		}

	}

//main menu options
	private static int chooseOption() {
		System.out.println("1. Register patient");
		System.out.println("2. Update test details/test reports");
		System.out.println("3. Retrive/get test details");
		System.out.println("4. Delete record for the given ");
		System.out.println("5. Exit");
		return AllValidationChecks.positiveIntegerCheck();
	}

//Display details from database to user	
	private static void display(Patient[] patientObject, int arrayCount) {
		for (int i = 0; i < arrayCount; i++) {
			System.out.println(patientObject[i].getName() + " \t " + patientObject[i].getTestName());
		}
	}
}
