package com.practice.problems;

public class BookInLibrary {

	private int id;
	private String name;
	private String publisher;
	private String author;
	private int copies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	public BookInLibrary(int id, String name, String publisher, String author, int copies) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.copies = copies;

	}

}
