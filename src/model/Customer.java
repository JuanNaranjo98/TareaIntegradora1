package model;

public class Customer {
	
	private String idType;
	private int idNumber;
	private String name;
	private int phone;
	private String address;
	
	public Customer(String idt, int id, String n, int p, String a) {
		idType = idt;
		idNumber = id;
		name = n;
		phone = p;
		address = a;
	}
	public String getType() {
		return idType;
	}
	public void setType(String type) {
		this.idType = type;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
		
	
}
