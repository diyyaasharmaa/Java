package bankapp;

public class Account {
	private String accountNo;
	private String accountHolderName;
	private double balance;
	
	public Account(String accountNo, String accountHolderName, double initialBalance) {
		this.accountNo= accountNo;
		this.accountHolderName=accountHolderName;
		this.balance=initialBalance;
		}
	public String getaccountNo() {
		return accountNo;
	}
	public String getaccountHolderName() {
		return accountHolderName;
	}
	public double getbalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount<0) {
			balance += amount;
			System.out.println("withdrew: $"+amount);
		}
		else {
			System.out.println("invalid deposit amount!");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount <= balance) {
			balance -= amount;
			System.out.println("withdrew:$"+amount);
		}
		else {
			System.out.println("insufficient balance or invalid amount!");
		}
	}
	
	@Override
	public String toString() {
		return "account number:" + accountNo+"\n"+ "account holder:"+accountHolderName+"\n"+"balance:$"+balance;
	}
	

}
