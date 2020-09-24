package ui;

import model.DeliveryManager;	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Menu {
	
	private final static int EXIT_OPTION = 3;
	
	private BufferedReader br;
	private BufferedWriter bw;
	private DeliveryManager deliveryManager;
	
	public Menu() {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		deliveryManager =  new DeliveryManager();
	}	
	
	public void startPrincipalMenu() throws IOException {
		String menu = getMenuText();
		int option;
		do {
			bw.write(menu);
			option = readOption();
			executeOperation(option);
		}while(option!=EXIT_OPTION);
	}
	
	private String getMenuText() {
		String menu;
		menu  = "==============================\n";
		menu += "      DELIVERY MANAGER\n";
		menu += "==============================\n";
		menu += "1. Register a client\n";
		menu += "2. Register a product\n";
		menu += "3. Register a order\n";
		menu += "4. Update a restaurant\n";
		menu += "5. Update a Client\n";
		menu += "6. Register a product\n";
		menu += "7. Register a client\n";
		menu += "8. Register a product\n";
		menu += "9. Exit\n";
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
			case 1:	registerClient();   break;
			case 2: registerProduct();  break;
			case 3: registerRestaurants();  break;
			case 4: registerOrder();  break;
			case 5: updateClient();   break;
			case 6: updateRestaurant();  break;
			case 7: updateProduct();  break;
			case 8: updateOrder();   break;
			case 9: visualizeRestaurants();  break;
			case 10: visualiazeClients();   break;
			case 11: ChangeStatus(); break;
			case 12: searchClient(); break;
			case 13: exitProgram(); break;
			default: break;
		}
	}

	private void searchClient() {
		// TODO Auto-generated method stub
		
	}

	private void ChangeStatus() {
		// TODO Auto-generated method stub
		
	}

	private void visualiazeClients() {
		// TODO Auto-generated method stub
		
	}

	private void updateOrder() {
		// TODO Auto-generated method stub
		
	}

	private void updateProduct() {
		// TODO Auto-generated method stub
		
	}

	private void updateRestaurant() {
		// TODO Auto-generated method stub
		
	}

	private void updateClient() {
		// TODO Auto-generated method stub
		
	}

	private void registerOrder() {
		// TODO Auto-generated method stub
		
	}

	private void registerRestaurants() {
		// TODO Auto-generated method stub
		
	}

	private void registerProduct() {
		// TODO Auto-generated method stub
		
	}

	private void registerClient() {
		// TODO Auto-generated method stub
		
	}

	private void exitProgram() throws IOException {
		br.close();
	}

	private void visualizeRestaurants() {
		System.out.println(deliveryManager.getRestaurants());
	}

	private void registerCustomer() throws IOException {
		//private String type;
		//private int idNumber;
		//private String name;
		//private int phone;
		//private String address;
		bw.write("registering customer.");
		bw.write("Please enter the ID type: ");
		String idType = br.readLine();
		bw.write("Please enter the ID Number: ");
		int idNumber= Integer.parseInt(br.readLine());
		bw.write("Please enter the name: ");
		String positionName = br.readLine();
		bw.write("Please enter the phone");
		int phone = Integer.parseInt(br.readLine());
		bw.write("Please enter the address");
		String address = br.readLine();
		
		//team.addPlayer(shirtNumber, fullName, positionName);
		
		System.out.println("The player has been added succesfully");
	}
}
