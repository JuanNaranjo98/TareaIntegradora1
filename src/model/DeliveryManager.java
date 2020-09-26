package model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;


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
	
	public void addCustomer(String type, int idNumber, String name, String lastName, int phone, String address) {
		Customer c = new Customer(type, idNumber, name, lastName,phone,address);
		customers.add(c);
		
		if(customers.isEmpty()){
	 		customers.add(c);
	  	}else{
	  		int i = 0;
	 		while(i<customers.size() && customers.get(i).getLastName().compareTo(c.getLastName())>0){
	  			i++;
	 		}
	 		while(i<customers.size() && customers.get(i).getName().compareTo(c.getName())>0){
	  			i++;
	 		}
	 		((ArrayList<Customer>)customers).add(i,c);
	 	}
	}	
	
	public void addProduct(String code,String name, String description, double cost, int restauranNit) {
		Product p = new Product(code,name,description, cost,restauranNit);
		products.add(p);
	}
	
	public void addOrder(String code, String date, String customerCode, int restauranNit) {
		Order o = new Order(code,date,customerCode,restauranNit);
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
