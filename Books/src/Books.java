
public class Books {
	private int noOfCopies;

	public void setCopies(int noOfCopies) {
		if (noOfCopies > 0)
		this.noOfCopies = noOfCopies;

	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void addCopies(int howMany) {
		setCopies(this.noOfCopies + howMany);
	}

	public void removeCopies(int howMany) {
		this.noOfCopies = this.noOfCopies - howMany;
	}

}
