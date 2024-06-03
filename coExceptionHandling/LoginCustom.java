package in.coExceptionHandling;

public class LoginCustom {
public static void main(String[] args) throws LoginException {
	String loginID="shruti";
	if(loginID==null || loginID !="shti") {
		throw new LoginException();
	}
	else {
		System.out.println("login succesfully");
	}
}
}
