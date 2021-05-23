package com.begintoend.coding;

public class Patient {

	private String name;
	private int age;
	private String gender;
	private String mobileNumber;
	private String address;
	private String docName;
	private String testName;
	private String commentsOnTest;

	public Patient(String name, int age, String gender, String mobileNumber, String address, String docName,
			String testName, String commentsOnTest) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.docName = docName;
		this.testName = testName;
		this.commentsOnTest = commentsOnTest;

	}

	public Patient() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getCommentsOnTest() {
		return commentsOnTest;
	}

	public void setCommentsOnTest(String commentsOnTest) {
		this.commentsOnTest = commentsOnTest;
	}

	@Override
	public String toString() {
		return name + age + gender + mobileNumber + address + docName + testName + commentsOnTest;
	}
}
