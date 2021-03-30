package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {

	
	@Before ("@smoke")
	public void launch() {
		
		System.out.println("Launch the chrome browser");
		}
	
	@Before("@regression")
	public void switchon() {
		System.out.println("Switch onn the PC");
	}
	
		
	@After (order =2)
	public void quit() {
		System.out.println("CLose the browser");
	}
	
	@After (order =1)
	
	public void logout() {
		
		System.out.println("Log out from application");
	}

	@After(order =3)
	public void wtf() {
		System.out.println("WTF");
	}
	
	
}
