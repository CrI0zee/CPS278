package edu.wccnet.cooconnor.DIDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Finaid {
	
	private College college; 
	
	private FinaidService finaidService;
	
	
	public Finaid(College college, FinaidService finaidService) {
		super();
		this.college = college;
		this.finaidService = finaidService;
	}
	
	public void displayFinaid() {
		System.out.println("You received " + finaidService.getFinaidType() + " from " + college.getCollegeName());
		 
	}
	
}
