package in.coExceptionHandling;

public class BankTest {
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setBal(1000);
		obj.deposit(4000);
		try {
			obj.withdraw(2000);
		    System.out.println(obj.getBal());
		}catch(BankExcep e){
			System.out.println(e.getMessage());
		}
	}

}
