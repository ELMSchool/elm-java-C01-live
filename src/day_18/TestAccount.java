package day_18;

public class TestAccount {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount();
		
		account1.insertData(10000001, "Jeff Bezos", 1.0);
		account1.deposit(1000);
		account1.withdraw(1500);
		account1.display();
		
		
	}

}
