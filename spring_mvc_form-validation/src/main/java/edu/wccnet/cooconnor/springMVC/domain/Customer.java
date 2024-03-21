package edu.wccnet.cooconnor.springMVC.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	@NotBlank(message = "enter a name")
	@Size(min = 4,message="name has to be at least four characters long")
	private String name;
	
	@NotBlank(message = "must enter an age")
	@Min(value=18, message="must be 18 years or older")
	private String age;
	
	@NotBlank(message = "enter a zip code")
	@Pattern(regexp = "^[0-9]{5}", message="zip code should be 5 digits")
	private String zipCode;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	} 
	
}