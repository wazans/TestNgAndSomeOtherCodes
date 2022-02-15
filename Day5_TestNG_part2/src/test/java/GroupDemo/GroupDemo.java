package GroupDemo;

import org.testng.annotations.Test;

public class GroupDemo {
	@Test
	public void demoGroup1()
	{
		System.out.println("one");
	}
	@Test
	public void demoGroup2()
	{
		System.out.println("two");
	}
	@Test (groups = { "Smoke"})	
	public void demoGroup3()
	{
		System.out.println("three");
	}
	@Test
	public void demoGroup4()
	{
		System.out.println("four");
	}
	@Test (groups = { "Smoke"})	
	public void demoGroup5()
	{
		System.out.println("five");
	}
	
	//convert this class to testng.xml call it testngGroup.xml 

}
