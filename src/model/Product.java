package model;

public class Product {
	//código, nombre, una descripción, costo y nit del restaurante
	private String code;
	private String name;
	private String description;
	private double cost;
	private int restaurantNit;
	
	public Product(String c,String n, String d, double cd, int rn) {
		code = c;
		name = n;
		description = d;
		cost = cd;
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
