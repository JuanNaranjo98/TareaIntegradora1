package model;

import java.util.List;
import java.util.ArrayList;

public class Order {
	
	private String code;
	private String date;
	private String hour;
	private String customerCode;
	private int restaurantNit;
	private List<Product> productList;
	
	public Order(String c, String d, String h, String cc, int rn) {
		code = c;
		date = d;
		hour = h;
		customerCode = cc;
		restaurantNit = rn;
		productList = new ArrayList<Product>();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public int getRestaurantNit() {
		return restaurantNit;
	}

	public void setRestaurantNit(int restaurantNit) {
		this.restaurantNit = restaurantNit;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
}
