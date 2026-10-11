package app.com;

import java.util.*;
public class Customer {

	private String customerId;
	private String customerName;
	private String mobileNumber;
	private String address;
	
	private List<Car> purchasedcars;

	public Customer(String customerId, String customerName, String mobileNumber, String address,
			List<Car> purchasedcars) {
		
		super();
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.purchasedcars = purchasedcars;
	}

	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Car> getPurchasedcars() {
		return purchasedcars;
	}

	public void setPurchasedcars(Car c) {
		purchasedcars.add(c);
	}
	
}
