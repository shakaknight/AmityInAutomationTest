package dataMaker;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeAndAfterTest {
	@BeforeTest
	public void beofeTest() {
		System.out.println("Test is starting succesfully");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Test ending succesfully");
	}

}
