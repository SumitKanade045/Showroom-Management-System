package app.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowRoom {

	private Inventory inventory;
	private List<Customer> customers;

	Scanner sc = new Scanner(System.in);

	public ShowRoom(Inventory inventory) {

		this.inventory = inventory;
		this.customers = new ArrayList<>();
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public void registerCustomer() {

		System.out.println("Enter Customer Id:");
		String cId = sc.next();

		System.out.println("Enter Customer Name:");
		String cname = sc.next();

		System.out.println("Enter Mobile Number:");
		String mobile = sc.next();

		System.out.println("Enter Customer Address:");
		String address = sc.next();

		Customer c = new Customer(cId, cname, mobile, address, new ArrayList<>());

		customers.add(c);

		System.out.println("Customer Registered Successfully.");
	}

	public void searchCustomer() {

		if (customers.isEmpty()) {

			System.out.println("No Customer Registered.");
			return;
		}

		System.out.println("Enter Customer Id:");
		String id = sc.next();

		boolean found = false;

		for (Customer c : customers) {

			if (c.getCustomerId().equals(id)) {

				System.out.println("\n========== Customer Details ==========\n");

				System.out.println("Customer Id      : " + c.getCustomerId());
				System.out.println("Customer Name    : " + c.getCustomerName());
				System.out.println("Mobile Number    : " + c.getMobileNumber());
				System.out.println("Customer Address : " + c.getAddress());

				found = true;
				break;
			}
		}

		if (!found) {

			System.out.println("Customer Not Found.");
		}
	}

	public void displayCustomer() {

		if (customers.isEmpty()) {

			System.out.println("No Customers Registered.");
			return;
		}

		System.out.println("\n========== Customer List ==========\n");

		for (Customer c : customers) {

			System.out.println("-------------------------------");
			System.out.println("Customer Id      : " + c.getCustomerId());
			System.out.println("Customer Name    : " + c.getCustomerName());
			System.out.println("Mobile Number    : " + c.getMobileNumber());
			System.out.println("Customer Address : " + c.getAddress());
		}
	}

	public void purchedcar() {

		if (customers.isEmpty()) {

			System.out.println("No Customer Registered.");
			return;
		}

		System.out.println("Enter Customer Id:");
		String id = sc.next();

		boolean found = false;

		for (Customer c : customers) {

			if (c.getCustomerId().equals(id)) {

				found = true;

				if (c.getPurchasedcars().isEmpty()) {

					System.out.println("No Cars Purchased.");
				} else {

					System.out.println("\n===== Purchased Cars =====\n");

					for (Car car : c.getPurchasedcars()) {

						car.display();
					}
				}

				break;
			}
		}

		if (!found) {

			System.out.println("Customer Not Found.");
		}
	}

	public void searchCar() {

	    List<Car> car = inventory.getCar();

	    if (car.isEmpty()) {

	        System.out.println("No Cars Available.");
	        return;
	    }

	    System.out.println("Enter Car Number:");
	    String carNumber = sc.next();

	    boolean found = false;

	    for (Car c : car) {

	        if (c.getCarNumber().equals(carNumber)) {

	            c.display();
	            found = true;
	            break;
	        }
	    }

	    if (!found) {

	        System.out.println("Car Not Found.");
	    }
	}
	
	public void displayShowRoom() {

	    System.out.println("\n========== ShowRoom Details ==========\n");

	    System.out.println("Total Customers : " + customers.size());
	    System.out.println("Total Cars      : " + inventory.getCar().size());
	}
	
	public void displayInventory() {

	    inventory.displayAllcars();
	}
	
	public void displayAvailableCars() {

	    inventory.displayAvailablecar();
	}
	
	public void displaySoldCars() {

	    inventory.displaySoldcars();
	}
	
	
	public void displayCustomerCars() {

	    if (customers.isEmpty()) {

	        System.out.println("No Customers Registered.");
	        return;
	    }

	    System.out.println("Enter Customer Id:");
	    String id = sc.next();

	    boolean found = false;

	    for (Customer c : customers) {

	        if (c.getCustomerId().equals(id)) {

	            found = true;

	            if (c.getPurchasedcars().isEmpty()) {

	                System.out.println("This Customer Has Not Purchased Any Car.");
	            }
	            else {

	                System.out.println("\n===== Customer Cars =====\n");

	                for (Car car : c.getPurchasedcars()) {

	                    car.display();
	                }
	            }

	            break;
	        }
	    }

	    if (!found) {

	        System.out.println("Customer Not Found.");
	    }
	}
}