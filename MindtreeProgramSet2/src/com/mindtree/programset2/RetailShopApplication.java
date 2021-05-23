package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RetailShopApplication {

	public static void main(String[] args) {
		int records;
		Product[] product;
		System.out.println("Enter the number of records");
		records = AllValidationChecks.integerCheck();
		product = new Product[records];
		int ids[] = new int[records];
		int price[] = new int[records];
		System.out.println("Enter the book id");
		for (int i = 0; i < records; i++) {
			ids[i] = AllValidationChecks.integerCheck();
		}
		System.out.println("Enter the price of book");
		for (int i = 0; i < records; i++) {
			price[i] = AllValidationChecks.integerCheck();
		}
		for (int i = 0; i < records; i++) {
			product[i] = new Product(ids[i], price[i]);
		}
		calCost(product, records);
	}

	private static void calCost(Product[] data, int records) {
		System.out.println("Enter the product id ");
		int productId = AllValidationChecks.integerCheck();
		System.out.println("Enter the quantity of book");
		int quantity = AllValidationChecks.integerCheck();
		int billamount, billid = 101, purchaseid = 1100, customerid = 1000;
		int discount, totalamount;
		boolean flag = true;

		for (int i = 0; i < records; i++) {
			if (data[i].getBookid() == productId) {
				billamount = data[i].getPrice() * quantity;
				discount = (int) (0.5 * billamount);
				totalamount = billamount - discount;
				System.out.println("bill amount       =" + "    " + billamount);
				System.out.println("bill id           =" + "    " + billid);
				System.out.println("customerid        =" + "    " + customerid);
				System.out.println("purchaseid        =" + "    " + purchaseid);
				System.out.println("Discount amount   =" + "    " + discount);
				System.out.println("Total amount      =" + "    " + totalamount);
				flag = false;

			}
			purchaseid++;
			customerid++;
			billid++;
		}

		if (flag) {
			System.out.println("Please enter correct Product id");
		}

	}
}
