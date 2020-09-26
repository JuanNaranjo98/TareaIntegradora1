package ui;

import model.DeliveryManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;

public class Menu {
	
	private final static int EXIT_OPTION = 6;
	
	public BufferedReader br;
	public BufferedWriter bw;
	private DeliveryManager deliveryManager;
	
	public Menu() {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		deliveryManager =  new DeliveryManager();
	}	
	
	public void startPrincipalMenu() throws IOException {
		String menu = getPrincipalMenu();
		int option;
		do {
			System.out.println(menu);
			option = readOption();
			executeOperation(option);
		}while(option!=EXIT_OPTION);
		
	}
	
	private String getPrincipalMenu() {
		String menu;
		menu  = "==============================\n";
		menu += "      DELIVERY MANAGER\n";
		menu += "==============================\n";
		menu += "1. Registers module \n";
		menu += "2. Update module \n";
		menu += "3. Display module \n";
		menu += "4. Change order status \n";
		menu += "5. Search Customer \n";
		menu += "6. Exit\n";
		menu += "Please enter the option: ";
		return menu;
	}
	
	private String getRegistersModule(){
		String menu;
		menu  = "==============================\n";
		menu += "      DELIVERY MANAGER\n";
		menu += "==============================\n";
		menu += "1. Register a customer\n";
		menu += "2. Register a product\n";
		menu += "3. Register a restauran\n";
		menu += "4. Register a order\n";
		menu += "Please enter the option: ";
		return menu;
	}
	
	private String getUpdateModule() {
		String menu;
		menu  = "==============================\n";
		menu += "      DELIVERY MANAGER\n";
		menu += "==============================\n";
		menu += "1. Update a customer\n";
		menu += "2. Update a restaurant\n";
		menu += "3. Update a product\n";
		menu += "4. Update a order\n";
		menu += "Please enter the option: ";
		return menu;
	}
	
	private String getDisplayModule() {
		String menu;
		menu  = "==============================\n";
		menu += "      DELIVERY MANAGER\n";
		menu += "==============================\n";
		menu += "1. Display restaurants\n";
		menu += "2. Display customers\n";
		menu += "Please enter the option: ";
		return menu;
	}
	
	private int readOption() throws NumberFormatException, IOException {
		int op;
		op = Integer.parseInt(br.readLine());
		return op;
	}
	
	private void executeOperation(int option) throws IOException {
		switch(option) {
			case 1: startRegisterOperation();  break;
			case 2: startUpdateOperation(); break;
			case 3: startDisplayOperation(); break;
			case 4: ChangeOrderStatus(); break;
			case 5: searchCustomer(); break;
			case 6:	exitProgram(option); break;
			default: System.out.println("Choose one of the correct options \n"); break;
		}
	}
	
	private void startRegisterOperation() throws IOException {
		String menu = getRegistersModule();
		System.out.println(menu);
		int op = readOption();
		executeRegisterOperation(op);
		}
	
	private void startUpdateOperation() throws IOException {
		String menu = getUpdateModule();
		System.out.println(menu);
		int op = readOption();
		executeUpdateOperation(op);
		}
	
	private void startDisplayOperation() throws IOException {
		String menu = getDisplayModule();
		System.out.println(menu);
		int op = readOption();
		executeDisplayOperation(op);
		}
	
	private void executeRegisterOperation(int option) throws IOException {
		switch(option) {
			case 1:	registerCustomer();   break;
			case 2: registerProduct();  break;
			case 3: registerRestaurants();  break;
			case 4: registerOrder();  break;
			default: break;
		}
	}
	
	private void executeUpdateOperation(int option) throws IOException {
		switch(option) {
			case 1: updateCustomer();   break;
			case 2: updateRestaurant();  break;
			case 3: updateProduct();  break;
			case 4: updateOrder();   break;
			default: break;
		}
	}
	
	private void executeDisplayOperation(int option) throws IOException {
		switch(option) {
			case 1: displayRestaurants();  break;
			case 2: displayCustomers();   break;
			default: break;
		}
	}
	
	private void registerCustomer() throws IOException {
		System.out.println("Registering customer\n");
		System.out.println("Please enter the ID type: \n");
		String idType = br.readLine();
		
		System.out.println("Please enter the ID Number: \n");
		int idNumber= Integer.parseInt(br.readLine());
		
		System.out.println("Please enter the name: \n");
		String name = br.readLine();
		
		System.out.println("Please enter the last name: \n");
		String lastName = br.readLine();
		
		System.out.println("Please enter the phone\n");
		int phone = Integer.parseInt(br.readLine());
		
		System.out.println("Please enter the address\n");
		String address = br.readLine();
		
		deliveryManager.addCustomer(idType, idNumber, name, lastName, phone, address);
		
		System.out.println("The customer has been added succesfully\n");
	}
	
	private void registerProduct() throws IOException {
		System.out.println("Registering product\n");
		System.out.println("Please enter code: \n");
		String code = br.readLine();
		
		System.out.println("Please enter the name: \n");
		String name= br.readLine();
		
		System.out.println("Please enter the product description: \n");
		String description = br.readLine();
		
		System.out.println("Please enter the cost\n");
		double cost = Double.parseDouble(br.readLine());
		
		System.out.println("Please enter the restaurant Nit \n");
		int restauranNit = Integer.parseInt(br.readLine());
		
		deliveryManager.addProduct(code, name, description, cost, restauranNit);
		
		System.out.println("The product has been added succesfully\n");
	}
		
	
	private void registerRestaurants() throws IOException {
		
		System.out.println("Registering Restaurant\n");
		System.out.println("Please enter name: \n");
		String name = br.readLine();
		
		System.out.println("Please enter the Nit: \n");
		int nit = Integer.parseInt(br.readLine());
		
		System.out.println("Please enter the administrator name: \n");
		String administratorName = br.readLine();
		
		deliveryManager.addRestauran(name, nit, administratorName);
		
		System.out.println("The restaurant has been added succesfully\n");
		
	}

	private void registerOrder() throws IOException {
		
		System.out.println("Registering product\n");
		System.out.println("Please enter code: \n");
		String code = br.readLine();
		
		Date objDate = new Date(); 
		String date = objDate.toString(); 
		
		System.out.println("Please enter the customerCode \n");
		String customerCode = br.readLine();
		
		System.out.println("Please enter the restaurant Nit \n");
		int restauranNit = Integer.parseInt(br.readLine());
		
		deliveryManager.addOrder(code, date, customerCode, restauranNit);
		
		System.out.println("The player has been added succesfully\n");
		
	}
	
	private void updateCustomer() {
		// TODO Auto-generated method stub
		
	}
	
	private void updateRestaurant() {
		// TODO Auto-generated method stub
		
	}
	
	private void updateProduct() {
		// TODO Auto-generated method stub
		
	}
	
	private void updateOrder() {
		// TODO Auto-generated method stub
		
	}
	
	private void displayCustomers() {
		System.out.println(deliveryManager.getCustomers());
		
	}
	
	private void displayRestaurants() {
		System.out.println(deliveryManager.getRestaurants());
	}

	private void searchCustomer() {
		// TODO Auto-generated method stub
		
	}

	private void ChangeOrderStatus() {
		// TODO Auto-generated method stub
		
	}

	

	

	

	

	private void exitProgram(int op) throws IOException {
		System.out.println("=========== Come back soon ===========");
		op = EXIT_OPTION;
		
	}

	

	
	
}
