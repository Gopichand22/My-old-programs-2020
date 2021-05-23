package com.gopi.oopsintro;

public class Book {
	private int noOfCopies;

	public void setnoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		
	}
		
		public void increasecopy(int howMany) {
			this.noOfCopies = this.noOfCopies + howMany;
		}

		public int getNoOfCopies() {
			return noOfCopies;
		}

		public void setNoOfCopies(int noOfCopies) {
			this.noOfCopies = noOfCopies;
		}
	}

