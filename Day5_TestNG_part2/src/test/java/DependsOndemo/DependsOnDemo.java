package DependsOndemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {
	@Test
	public void Father()
	{
		//System.out.println("father");
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods={"Son"})
	public void GrandSon()
	{
		System.out.println("grandson");
	}
	
	@Test (dependsOnMethods={"Father"})
	public void Son()
	{
		System.out.println("son");
	}
	/*
	 * @Test (enabled=true) public void AmIEnabled() {
	 * System.out.println("AmIEnabled"); }
	 * 
	 * @Test (timeOut=4000) public void timeOut() { System.out.println("timeOut"); }
	 */
}
