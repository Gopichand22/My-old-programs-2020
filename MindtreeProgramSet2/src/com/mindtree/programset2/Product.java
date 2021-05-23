package com.mindtree.programset2;

public class Product {
	private int price;
	private int productId;

	public Product(int productId, int price) {
		this.productId = productId;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBookid() {
		return productId;
	}

	public void setBookid(int bookid) {
		this.productId = bookid;
	}
}
