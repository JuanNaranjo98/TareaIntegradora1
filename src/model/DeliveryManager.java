package model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class DeliveryManager implements Serializable {
	public final static long serialVersionUID = 2;
	
	private List<Restaurant> restaurants;
	private List<Customer> customers;
	private List<Product> products;
	private List<Order> orders;
	
	public DeliveryManager() {
		
		restaurants = new ArrayList<Restaurant>();
		customers = new ArrayList<Customer>();
		products = new ArrayList<Product>();
		orders = new ArrayList<Order>();
	}
	
	//ADD METHODS
	public void addRestauran(String name,int nit,String administratorName) {
		Restaurant r = new Restaurant(name,nit,administratorName);
		restaurants.add(r);
	}
	
	public void addCustomer(String type, int idNumber, String name, int phone, String address) {
		Customer c = new Customer(type,idNumber,name,phone,address);
		customers.add(c);
	}	
	
	public void addProduct(String code,String name, String description, double cost, int restauranNit) {
		Product p = new Product(code,name,description, cost,restauranNit);
		products.add(p);
	}
	
	public void addOrder(String code, String date, String hour, String customerCode, int restauranNit) {
		Order o = new Order(code,date,hour,customerCode,restauranNit);
		orders.add(o);
	}
	
	//GETTERS AND SETTERS
	public List<Restaurant> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
	

}
