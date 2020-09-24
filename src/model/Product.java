package model;

public class Product {
	
	private String code;
	private String name;
	private String description;
	private double cost;
	private int restaurantNit;
	
	public Product(String c,String n, String d, double ct, int rn) {
		code = c;
		name = n;
		description = d;
		cost = ct;
		restaurantNit = rn;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getRestaurantNit() {
		return restaurantNit;
	}

	public void setRestaurantNit(int restaurantNit) {
		this.restaurantNit = restaurantNit;
	}
	
	
}
