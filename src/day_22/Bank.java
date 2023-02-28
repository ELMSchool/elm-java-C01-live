package day_22;

public class Bank {
	
	private String accountHolder;
	private long accountNumber;
	private long routeNumber;
	private double balance;
	
	
	public Bank(String accountHolder, long accountNumber, long routeNumber, double balance) {
		
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.routeNumber = routeNumber;
		this.balance = balance;
	}
	
	//getters(to read), setters(to write)
	public String getAccountHolder() {
		
		return this.accountHolder;
	}
	
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setRouteNumber(long routeNumber) {
		this.routeNumber = routeNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountHolder(String accountHolder) {
		
		this.accountHolder = accountHolder;
	}
	
	public long getAccountNumber() {
		
		return this.accountNumber;
	}

     public long getRouteNumber() {
		
		return this.routeNumber;
	}
     
     public double getBalance() {
 		
 		return this.balance;
 	}
}
