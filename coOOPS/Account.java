package in.coOOPS;

public class Account {
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private String account;
	private double balance;
	
	public Account(int number, String account, double balance) {
		this.number = number;
		this.account = account;
		this.balance = balance;
	}
	public void desposit(int amt) {
		if(amt>0) {
			balance=balance+amt;
			System.out.println("Amount is deposited");
			System.out.println("Current balance is"+balance);
		}else
			System.out.println("Entered Amount is invalid");
			
	}
	public void withdraw(int amt) {
		if(amt>0 && amt<=balance) {
			balance =balance - amt;
			System.out.println("withdrawed succesfully "+balance);
		}
		else System.out.println("insufficent amount");
	}
	public static void main(String[] args) {
		Account ac = new Account(123456,"current",50000);
		ac.getBalance();
		ac.getAccount();
		ac.getNumber();
		ac.desposit(3000);
		ac.withdraw(1000);
	}
}
