package day_20;

public class Main {
	public static void main(String[] args) {

		
		BankAccount ba = new BankAccount("Elon Musk", 10);
		
		ba.deposit(90); //100
		
		ba.withdrawMoney(96, "Chase");
		
		ba.printBankAccount();
	}

}
