package app.com;

import java.util.*;

public class Inventory {

	private List<Car> car;
	Scanner sc = new Scanner(System.in);

	public Inventory() {

		car = new ArrayList<>();
	}

	public List<Car> getCar() {
		return car;
	}

	public void setCar(Car c) {
		car.add(c);
	}

	public void addCar() {

		System.out.println("1.Fortuner.\n" + "2.Thar.\n" + "3.Scorpio.\n");
		System.out.println("Enter Your Choise: ");
		int n = sc.nextInt();

		switch (n) {

		case 1:

			System.out.println("Enter Car Number: ");
			String cn = sc.next();

			System.out.println("Enter Brand Name: ");
			String cb = sc.next();

			System.out.println("Enter Car Color: ");
			String cc = sc.next();

			System.out.println("Enter Price : ");
			double cp = sc.nextDouble();

			System.out.println("Sold (true/false): ");
			boolean cs = sc.nextBoolean();

			System.out.println("Enter Varient: ");
			String cv = sc.next();

			System.out.println("FourWheelDrive (true/false): ");
			boolean cf = sc.nextBoolean();

			Car c1 = new Fortuner(cn, cb, cc, cp, cs, null, cv, cf);

			car.add(c1);

			//customer.setPurchasedcars(c1);

			System.out.println("Car Added Successfully.");

			break;

		case 2:

			System.out.println("Enter Car Number: ");
			String cn1 = sc.next();

			System.out.println("Enter Brand Name: ");
			String cb1 = sc.next();

			System.out.println("Enter Car Color: ");
			String cc1 = sc.next();

			System.out.println("Enter Price : ");
			double cp1 = sc.nextDouble();

			System.out.println("Sold (true/false): ");
			boolean cs1 = sc.nextBoolean();

			System.out.println("Enter Varient: ");
			String cv1 = sc.next();

			System.out.println("FourWheelDrive (true/false): ");
			boolean cf1 = sc.nextBoolean();

			Car c2 = new Thar(cn1, cb1, cc1, cp1, cs1, null, cv1, cf1);

			car.add(c2);

			//customer.setPurchasedcars(c2);

			System.out.println("Car Added Successfully.");

			break;

		case 3:

			System.out.println("Enter Car Number: ");
			String cn2 = sc.next();

			System.out.println("Enter Brand Name: ");
			String cb2 = sc.next();

			System.out.println("Enter Car Color: ");
			String cc2 = sc.next();

			System.out.println("Enter Price : ");
			double cp2 = sc.nextDouble();

			System.out.println("Sold (true/false): ");
			boolean cs2 = sc.nextBoolean();

			System.out.println("Enter Varient: ");
			String cv2 = sc.next();

			System.out.println("FourWheelDrive (true/false): ");
			boolean cf2 = sc.nextBoolean();

			Car c22 = new Scorpio(cn2, cb2, cc2, cp2, cs2, null, cv2, cf2);

			car.add(c22);

			//customer.setPurchasedcars(c22);

			System.out.println("Car Added Successfully.");

			break;

		default:

			System.out.println("Invalid Choice");
		}

	}

	public void removeCar() {

		System.out.println("1.Fortuner.\n" + "2.Thar.\n" + "3.Scorpio.\n");
		System.out.println("Enter Your Choise: ");
		int n = sc.nextInt();

		switch (n) {

		case 1:

			System.out.println("1.Remove All Cars.\n" + "2.Remove Car By CarNumber.\n");
			System.out.println("Enter Your Choise: ");
			int choise = sc.nextInt();

			switch (choise) {

			case 1:

				car.clear();

				System.out.println("All Car Removed SuccessFully.");

				break;

			case 2:

				System.out.println("Enter Car Number:");
				String carNumber = sc.next();

				boolean found = false;

				Iterator<Car> itr = car.iterator();

				while (itr.hasNext()) {

					Car c = itr.next();

					if (c.getCarNumber().equalsIgnoreCase(carNumber)) {

						itr.remove();

						System.out.println("Car Removed Successfully.");

						found = true;

						break;
					}
				}

				if (!found) {
					System.out.println("Car Not Found.");
				}

				break;

			default:

				System.out.println("Emter Valid Choise.");

			}

			break;

		default:

			System.out.println("Enter Valid Choise.");

		case 2:

			System.out.println("1.Remove All Cars.\n" + "2.Remove Car By CarNumber.\n");
			System.out.println("Enter Your Choise: ");
			int choise1 = sc.nextInt();

			switch (choise1) {

			case 1:

				car.clear();

				System.out.println("All Car Removed SuccessFully.");

				break;

			case 2:

				System.out.println("Enter Car Number:");
				String carNumber = sc.next();

				boolean found = false;

				Iterator<Car> itr = car.iterator();

				while (itr.hasNext()) {

					Car c = itr.next();

					if (c.getCarNumber().equalsIgnoreCase(carNumber)) {

						itr.remove();

						System.out.println("Car Removed Successfully.");

						found = true;

						break;
					}
				}

				if (!found) {
					System.out.println("Car Not Found.");
				}

				break;

			default:

				System.out.println("Enter Valid Choise.");

			}

			break;

		case 3:

			System.out.println("1.Remove All Cars.\n" + "2.Remove Car By CarNumber.\n");
			System.out.println("Enter Your Choise: ");
			int choise2 = sc.nextInt();

			switch (choise2) {

			case 1:

				car.clear();

				System.out.println("All Car Removed SuccessFully.");

				break;

			case 2:

				System.out.println("Enter Car Number:");
				String carNumber = sc.next();

				boolean found = false;

				Iterator<Car> itr = car.iterator();

				while (itr.hasNext()) {

					Car c = itr.next();

					if (c.getCarNumber().equalsIgnoreCase(carNumber)) {

						itr.remove();

						System.out.println("Car Removed Successfully.");

						found = true;

						break;
					}
				}

				if (!found) {
					System.out.println("Car Not Found.");
				}

				break;

			default:

				System.out.println("Emter Valid Choise.");

			}

			break;

		}
	}

	public void searchCar() {

		System.out.println("1.Fortuner");
		System.out.println("2.Thar");
		System.out.println("3.Scorpio");
		System.out.println("Enter Your Choice:");
		int n = sc.nextInt();

		System.out.println("Enter Car Number:");
		String carNumber = sc.next();

		boolean found = false;

		switch (n) {

		case 1:

			for (Car c : car) {

				if (c.getCarNumber().equalsIgnoreCase(carNumber)) {

					c.display();
					found = true;
					break;
				}
			}

			break;

		case 2:

			for (Car c : car) {

				if (c.getCarNumber().equalsIgnoreCase(carNumber)) {

					c.display();
					found = true;
					break;
				}
			}

			break;

		case 3:

			for (Car c : car) {

				if (c.getCarNumber().equalsIgnoreCase(carNumber)) {

					c.display();
					found = true;
					break;
				}
			}

			break;

		default:

			System.out.println("Invalid Choice.");
		}

		if (!found) {

			System.out.println("Car Not Found.");
		}
	}

	public void displayAllcars() {

		if (car.isEmpty()) {

			System.out.println("No Cars Available.");
			return;
		}

		for (Car c : car) {

			c.display();
		}
	}

	public void displayAvailablecar() {

		boolean found = false;

		for (Car c : car) {

			if (!c.isSold()) {

				c.display();
				found = true;

			}
		}

		if (!found) {

			System.out.println("No Available Cars.");
		}
	}

	public void displaySoldcars() {

		boolean found = false;

		for (Car c : car) {

			if (c.isSold()) {

				c.display();

				found = true;
			}
		}

		if (!found) {

			System.out.println("No Sold Cars are Available.");
		}
	}

	public void totalCars() {

		int sold = 0;
		int available = 0;

		for (Car c : car) {

			if (c.isSold()) {

				sold++;

			} else {

				available++;
			}
		}

		System.out.println("Total Cars     : " + car.size());
		System.out.println("Sold Cars      : " + sold);
		System.out.println("Available Cars : " + available);
	}
	
	public void sellCar(Customer customer) {

	    if (car.isEmpty()) {
	        System.out.println("No Cars Available.");
	        return;
	    }

	    
	    System.out.println("Enter Car Number:");
	    String carNumber = sc.next();

	    boolean found = false;

	    for (Car c : car) {

	        if (c.getCarNumber().equals(carNumber)) {

	            if (c.isSold()) {

	                System.out.println("Car Already Sold.");
	                return;
	            }

	            c.setSold(true);
	            c.setOwner(customer);
	            customer.setPurchasedcars(c);

	            System.out.println("Car Sold Successfully.");

	            found = true;
	            break;
	        }
	    }

	    if (!found) {
	        System.out.println("Car Not Found.");
	    }
	}

}
