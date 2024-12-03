package framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class f1 {
	@Test
	public void function() {
	System.out.println("hello");
	}
	@BeforeTest
	public void function1() {
		System.out.println("classroom");
	}
	@AfterTest
	public void function2() {
		System.out.println("mobilephone");
	}

}
