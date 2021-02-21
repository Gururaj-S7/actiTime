package demo;

import org.testng.annotations.Test;

public class Test_NG {

	
	@Test(priority=1,description = "First case")
	public void doc()
	{
		System.out.println("Finally");
		
	}
	
	@Test(priority=2,description = "Second case")
	public void cod()
	{
		System.out.println("TestNG");
		
	}
	
}
