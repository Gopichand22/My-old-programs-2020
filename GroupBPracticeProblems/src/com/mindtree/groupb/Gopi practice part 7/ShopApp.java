package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ShopApp {
	static ShopDetails[] clientObjects;
	static int count = 0;
	static int records;

	public static void main(String[] args) {
		System.out.println("Enter no of records ");
		records = AllValidationChecks.positiveIntegerCheck();
		clientObjects = new ShopDetails[records];
		boolean isValid = true;
		do {
			switch (menuToChooseOption()) {
			case 1:
				addShopToApplication();
				break;
			case 2:
				thirdHighestRevenueShop();
				break;
			case 3:
				differenceBetweenThirdAndFirstShopRevenue();
				break;
			case 4:
				searchDataWithRespectToId();
				break;
			case 5:
				isValid = false;
				break;
			default:
				System.out.println("Please enter correct option i.e: between 1-4:");
			}

		} while (isValid);

	}

	private static void searchDataWithRespectToId() {
		if (count > 0) {
			// bubble sort is used to sort the data
			for (int i = 0; i < count; i++) {
				for (int j = i + 1; j < count; j++) {
					if (clientObjects[i].getShopId() > clientObjects[j].getShopId()) {
//swaped id
						int temp2 = clientObjects[i].getShopId();
						clientObjects[i].setShopId(clientObjects[j].getShopId());
						clientObjects[j].setShopId(temp2);
//swapped revenue
						long temp = clientObjects[i].getRevenue();
						clientObjects[i].setRevenue(clientObjects[j].getRevenue());
						clientObjects[j].setRevenue(temp);
//swapped name
						String temp3 = clientObjects[i].getShopName();
						clientObjects[i].setShopName(clientObjects[j].getShopName());
						clientObjects[j].setShopName(temp3);
//swapped gst number
						int temp4 = clientObjects[i].getGst();
						clientObjects[i].setGst(clientObjects[j].getGst());
						clientObjects[j].setGst(temp4);
					}
				}
			}
			// sorting logic ended here
			// searching based on key ********Binary search is useda to search key
			System.out.println("Enter the id of the shop to get the shop details");
			int key = AllValidationChecks.integerCheck();
			int left = 0, right = count - 1, mid;
			while (left <= right) {
				mid = (left + right) / 2;
				if (key == clientObjects[mid].getShopId()) {
					System.out.println(clientObjects[mid].getShopId() + " | " + clientObjects[mid].getShopName() + " | "
							+ clientObjects[mid].getRevenue() + " | " + clientObjects[mid].getGst());
					break;
				} else if (key < clientObjects[mid].getShopId()) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}

			}

		} else {
			System.out.println("Sorry, The registered shops are less than 3");
		}

	}

	private static void differenceBetweenThirdAndFirstShopRevenue() {
		if (count >= 2) {
			// sort based on revenue
			// sorting loic started here ********BUBBLE SORT is used********
			for (int i = 0; i < count; i++) {
				for (int j = i + 1; j < count; j++) {
					if (clientObjects[i].getRevenue() < clientObjects[j].getRevenue()) {
//swapped revenue
						long temp = clientObjects[i].getRevenue();
						clientObjects[i].setRevenue(clientObjects[j].getRevenue());
						clientObjects[j].setRevenue(temp);
//swaped id
						int temp2 = clientObjects[i].getShopId();
						clientObjects[i].setShopId(clientObjects[j].getShopId());
						clientObjects[j].setShopId(temp2);
//swapped name
						String temp3 = clientObjects[i].getShopName();
						clientObjects[i].setShopName(clientObjects[j].getShopName());
						clientObjects[j].setShopName(temp3);
//swapped gst number
						int temp4 = clientObjects[i].getGst();
						clientObjects[i].setGst(clientObjects[j].getGst());
						clientObjects[j].setGst(temp4);
					}
				}
			}
			// sorting logic ended here
			// find difference between 3rd and 1st
			System.out.println("The difference between 3rd highest revenued shop & 1st revenued shop is:"
					+ (clientObjects[0].getRevenue() - clientObjects[2].getRevenue()));
		} else {
			System.out.println("Sorry, The registered shops are less than 3");
		}

	}

	private static void thirdHighestRevenueShop() {
		if (count >= 2) {
			// sort based on revenue
			// sorting loic started here ********BUBBLE SORT is used********
			for (int i = 0; i < count; i++) {
				for (int j = i + 1; j < count; j++) {
					if (clientObjects[i].getRevenue() < clientObjects[j].getRevenue()) {
//swapped revenue
						long temp = clientObjects[i].getRevenue();
						clientObjects[i].setRevenue(clientObjects[j].getRevenue());
						clientObjects[j].setRevenue(temp);
//swaped id
						int temp2 = clientObjects[i].getShopId();
						clientObjects[i].setShopId(clientObjects[j].getShopId());
						clientObjects[j].setShopId(temp2);
//swapped name
						String temp3 = clientObjects[i].getShopName();
						clientObjects[i].setShopName(clientObjects[j].getShopName());
						clientObjects[j].setShopName(temp3);
//swapped gst number
						int temp4 = clientObjects[i].getGst();
						clientObjects[i].setGst(clientObjects[j].getGst());
						clientObjects[j].setGst(temp4);
					}
				}
			}
			// sorting logic ended here
			// now find 3rd highest revenue shop details
			System.out.println("The third highest revenued shop is: " + clientObjects[2].getShopId() + " | "
					+ clientObjects[2].getShopName() + " | " + clientObjects[2].getRevenue() + " | "
					+ clientObjects[2].getGst());

		} else {
			System.out.println("Sorry, The registered shops are less than 3");
		}

	}

	private static void addShopToApplication() {
		if (count < records) {
			System.out.println("Enter shop Id: ");
			int shopId = AllValidationChecks.integerCheck();
			AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter shop name: ");
			String shopName = AllValidationChecks.stringLineCheck();
			System.out.println("Enter revenue of the shop: ");
			long revenue = AllValidationChecks.positiveIntegerCheck();
			System.out.println("Enter the shop GST number");
			int gst = AllValidationChecks.integerCheck();
			clientObjects[count] = new ShopDetails(shopId, shopName, revenue, gst);
			count++;
		} else {
			System.out.println("Currently facing some technical issue #No space to add your data");
		}
	}

	private static int menuToChooseOption() {

		System.out.println("......................MENU......................");
		System.out.println("Enter the choice");
		System.out.println("1. Add shop to the application");
		System.out.println("2. Third highest revenue generating SHOP");
		System.out.println("3. Highest revenue generating shop minus(-) third highest revenue generating shop");
		System.out.println("4. Search for the shop Based on Id ");
		System.out.println("5. Exit");
		int opt = AllValidationChecks.integerCheck();
		return opt;

	}

}
