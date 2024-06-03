package in.coExceptionHandling;

public class Bank {
	double bal;

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	public void deposit(double amt) {
		bal=bal+amt;
	}
	public double withdraw(double amt)throws BankExcep {
		if(bal<2000) {
			throw new BankExcep("balance cant be less than 2000");
		}
		if(amt>bal) {
			throw new BankExcep("insufficent balance");
		}
	bal=bal-amt;
	return bal;
	}
}
