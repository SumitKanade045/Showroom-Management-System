package app.com;

public abstract class Car {

	private String carNumber;
	private String brand;
	private String color;
	private double price;
	private boolean sold;
	private Customer owner;
	
	
	public Car(String carNumber, String brand, String color, double price, boolean sold, Customer owner) {
		super();
		this.carNumber = carNumber;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.sold = sold;
		this.owner = owner;
	}


	public String getCarNumber() {
		return carNumber;
	}


	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isSold() {
		return sold;
	}


	public void setSold(boolean sold) {
		this.sold = sold;
	}


	public Customer getOwner() {
		return owner;
	}


	public void setOwner(Customer owner) {
		this.owner = owner;
	}
	
	public abstract void display();
}
