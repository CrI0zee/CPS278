package edu.wccnet.cooconnor.springMVC.domain;


import java.util.Formatter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Loan {
	
	@NotNull(message = "enter a principal")
	private int principal;
	
	@NotNull(message = "must enter a downpayment")
	private int downPayment;
	
	
	@NotBlank(message = "enter a valid interest")
	@Pattern(regexp = "^-?[0-9]+(\\.[0-9]+)?([eE][-+]?[0-9]+)?$", message="interest rate must be in a decimal format")
	private String interest;
	
	@NotNull(message = "enter a loan term")
	private int loanTerm;

	
	
	private double loanBalance = principal;
	
	private int paymentNo;
	
	private double monthlyPayment;
	
	
	
	public double getLoanBalance() {
		double balance = 0;
		if(this.loanBalance == 0) {
			this.setLoanBalance(this.getPrincipal());
			balance = this.loanBalance - this.getMonthlyPayment();
		}else {
		balance = this.loanBalance - this.getMonthlyPayment();
		this.setLoanBalance(balance);
		
		}
		return balance;
		
	}

	public void setLoanBalance(double loanBalance) {
		this.loanBalance = loanBalance;
	}

	

	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public int getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(int paymentNo) {
		
		this.paymentNo = paymentNo;
	}

	
	

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public int getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(int downPayment) {
		this.downPayment = downPayment;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public int getLoanTerm() {
		return loanTerm * 12;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	
	
	
	public double getMonthlyPayment() {
		int principal = getPrincipal();
		double interest = Double.parseDouble(getInterest()) / 100 ;
		double monthlyinterest = interest / 12;
		int loanTerm = getLoanTerm();
		this.monthlyPayment = (principal*monthlyinterest) / (1-Math.pow(1+monthlyinterest, -loanTerm));
		return interest;
	}
	/*public double updatePrincipalPayment() 
	{
		double monthlyPayment = makeMonthlyPayment();
		
	}
	
	public updateInterestPayment()
	{
		
	}*/
	
	
	
}
