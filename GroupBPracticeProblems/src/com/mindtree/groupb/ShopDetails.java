package com.mindtree.groupb;

public class ShopDetails {

	private int shopId;
	private String shopName;
	private long revenue;
	private int gst;

	public ShopDetails(int shopId, String shopName, long revenue, int gst) {
		this.shopId = shopId;
		this.shopName = shopName;
		this.revenue = revenue;
		this.gst = gst;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

}
