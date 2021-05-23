package studentdata;

public class BankRecords {

	private long accountNumber;
	private String customerName;
	private String accountType;
	private String dateOfBirth;
	private String address;

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private double balance;

	public BankRecords(long accountNumber, String customerName, String accountType, String dateOfBirth, String address,
			double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.balance = balance;
	}

}
