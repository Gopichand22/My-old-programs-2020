package studentdata;

public class Bank {
	private long accountNumber;
	private String name, accountType, address;
	private String dateOfBirth;
	private double balance;

	public Bank(long accountNumber, String name, String accountType, String address, String dateOfBirth,
			double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.accountType = accountType;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void print() {
		System.out.println("account number:" + accountNumber);
		System.out.println("account holder name:" + name);
		System.out.println("date of birth:" + dateOfBirth);
		System.out.println("account type:" + accountType);
		System.out.println("address:" + address);
		System.out.println("account balance:" + balance);

	}

}
