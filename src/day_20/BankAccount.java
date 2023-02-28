package day_20;

public class BankAccount {

	
	String accountHolder;
	double accountBalance;
	static String bankName = "ELM";
	
	public BankAccount(String holder, double balance) {
		
		accountHolder = holder;
		accountBalance = balance;
		
	}
	
	public void deposit(double money) {
		
		accountBalance += money;
		
	}
	
	public void withdrawMoney(double withdrawAmount, String bank) {
		
		if (bankName.equals(bank)) {
			
			if (withdrawAmount <= accountBalance) {
				accountBalance -=withdrawAmount;
			}else {
				System.out.println("Insufficient Balance");
			}
			
		}else {
			//		100							100
			if (withdrawAmount + withdrawAmount*0.03 <= accountBalance) {
									//100 +3
				accountBalance -= (withdrawAmount + withdrawAmount*0.03);
			}else {
				
				System.out.println("Insufficient Balance");
			}
			
		}	
		
	}
	public void printBankAccount() {
		
		System.out.println("Account holder: " + accountHolder+ "\nAccount Balance: $"+ accountBalance+ "\nBank: "+ bankName);
	}
	
	
	

}


/*
 * accountHolder
 * accountBalance
 * static String bankName = "ELM"
 * 
 * constructor(String name, double balance)
 * depositMoney(double d){}
 * withDrawFrom(double amount, String bank){} -> 3% , if there is not enough money it should print "Insufficient Balance"
 * 
 * printBankAccount() -> Account holder: Fred Solomon
 * 						 Account balance: $201.5
 * 						 Bank: ELM	
 * */