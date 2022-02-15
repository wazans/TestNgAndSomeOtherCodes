package DependsOndemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependsOndemo1 {
	
	
	@Test(dependsOnMethods="registration")
		public void Login()
		{
			System.out.println("i can login only after registration");
			
		}
	@Test
	public void registration()
	{
		//System.out.println("regesterd !!");
		Assert.assertTrue(false);
	}

}
