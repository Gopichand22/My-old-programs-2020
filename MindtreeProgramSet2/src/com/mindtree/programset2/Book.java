package com.mindtree.programset2;

public class Book {
	private String bookname;
	private String author;
	private double cost;
	private int publication;

	public Book(String bookname, String author, double cost, int publication) {
		this.setBookname(bookname);
		this.setAuthor(author);
		this.setCost(cost);
		this.setPublication(publication);
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getPublication() {
		return publication;
	}

	public void setPublication(int publication) {
		this.publication = publication;
	}
}