package edu.wccnet.cooconnor.springMVC.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	@NotBlank(message = "enter a name")
	@Size(min = 4,message="name has to be at least four characters long")
	private String name;
	
	@NotBlank(message = "enter a state")
	private String state;
	
	@NotBlank(message = "enter an address")
	private String address; 
	
	@NotBlank(message = "enter a zip code")
	@Pattern(regexp = "^[0-9]{5}", message="zip code should be 5 digits")
	private String zipCode;

	@NotBlank(message = "enter some toppings")
	private String[] toppings;
	

	@NotBlank(message = "enter a size")
	private String size; 
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getToppings() {
		return toppings;
	}
	public void setToppings(String[] toppings) {
		this.toppings = toppings;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}