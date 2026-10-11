package app.com;

public class Fortuner extends Car {

	private String varient;
	private boolean fourWheelDrive;
	
	public Fortuner(String carNumber, String brand, String color, double price, boolean sold, Customer owner,
			String varient, boolean fourWheelDrive) {
		
		super(carNumber, brand, color, price, sold, owner);
		
		this.varient = varient;
		this.fourWheelDrive = fourWheelDrive;
	}

	public String getVarient() {
		return varient;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}

	@Override
	public void display() {
		
		System.out.println("\n================Car Details================\n");
		
		System.out.println("Number           : "+getCarNumber());
		System.out.println("Brand            : "+getBrand());
		System.out.println("Color            : "+getColor());
		System.out.println("Price            : "+getPrice());
		System.out.println("Sold             : "+isSold());
		System.out.println("isFourWheelDrive :"+isFourWheelDrive());
	
//		Customer o = getOwner();
//		
//		if(o !=null) {
//			
//			System.out.println("\n================Customer Details================\n");
//
//			System.out.println("Customer Id            : "+o.getCustomerId());
//			System.out.println("Customer Name          : "+o.getCustomerName());
//			System.out.println("Customer Mobile Number : "+o.getMobileNumber());
//			System.out.println("Customer Address       : "+o.getAddress());
//			System.out.println("\n--------------------------------------------------\n");
//
//		} else {
//			
//			System.out.println("Owner Not Assigned.");
//		}
	}	
	
}
