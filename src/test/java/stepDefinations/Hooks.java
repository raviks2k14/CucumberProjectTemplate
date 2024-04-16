package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void executeBeforeEveryMobileTest() {
		System.out.println("Hooks : Start of mobile test");
	}
	
	@After("@MobileTest")
	public void executeAfterEveryMobileTest() {
		System.out.println("Hooks : End of mobile test");
	}
}
