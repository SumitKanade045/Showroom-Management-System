package app.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Inventory inventory = new Inventory();

		ShowRoom showroom = new ShowRoom(inventory);

		while (true) {

			System.out.println("\n========== SHOWROOM MANAGEMENT ==========");
			System.out.println("1. Register Customer");
			System.out.println("2. Search Customer");
			System.out.println("3. Display Customers");
			System.out.println("4. Add Car");
			System.out.println("5. Remove Car");
			System.out.println("6. Search Car");
			System.out.println("7. Display All Cars");
			System.out.println("8. Display Available Cars");
			System.out.println("9. Display Sold Cars");
			System.out.println("10. Display Purchased Cars");
			System.out.println("11. Total Cars");
			System.out.println("12. Sell Cars");
			System.out.println("13. Purchased Cars");
			System.out.println("14. Exit");

			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				showroom.registerCustomer();
				break;

			case 2:
				showroom.searchCustomer();
				break;

			case 3:
				showroom.displayCustomer();
				break;

			case 4:

				
			    inventory.addCar();

				break;

			case 5:
				
				inventory.removeCar();
				break;

			case 6:
				inventory.searchCar();
				break;

			case 7:
				inventory.displayAllcars();
				break;

			case 8:
				inventory.displayAvailablecar();
				break;

			case 9:
				inventory.displaySoldcars();
				break;

			case 10:
				showroom.purchedcar();
				break;

			case 11:
				inventory.totalCars();
				break;
				
			case 12:

			    if(showroom.getCustomers().isEmpty()) {

			        System.out.println("No Customer Registered.");
			        break;
			    }

			    System.out.print("Enter Customer Id: ");
			    String id = sc.next();

			    Customer customer = null;

			    for(Customer c : showroom.getCustomers()) {

			        if(c.getCustomerId().equals(id)) {

			            customer = c;
			            break;
			        }
			    }

			    if(customer == null) {

			        System.out.println("Customer Not Found.");
			    }
			    else {

			        inventory.sellCar(customer);
			        
			    }

			    break;
			    
			case 13: 
				
				showroom.purchedcar();
				break;

			case 14:
				System.out.println("Thank You...");
				System.exit(0);

			default:
				System.out.println("Invalid Choice.");
			}
		}
	}
}