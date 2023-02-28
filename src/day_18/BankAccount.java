package day_18;

public class BankAccount {
	
	int accountNumber;
	String accountHolder;
	double amount;
	
	public void insertData(int aNumber, String aHolder, double d) {
		
		accountNumber = aNumber;
		accountHolder = aHolder;
		amount = d;
		
	}
	
	public void deposit(double depo) {
		
		amount += depo;
	}
	

	public void withdraw(double withd) {
		
		if (amount < withd) {
			System.out.println("Insufficient Balance!");
		}else {
			amount -= withd;
		}
	}
	
	public void display() {
		
		System.out.println(accountNumber + " "+ accountHolder+ " "+ amount);
		
	}
}
