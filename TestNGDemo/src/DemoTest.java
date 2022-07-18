import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest 
{

	@Test
	public void test1()
	{
		String exptitle,acttile;
		exptitle = "Google";
		acttile = "Google";
		Assert.assertEquals(exptitle,acttile);
	}
	
	@Test
	public void test2()
	{
		String exptitle,acttile;
		exptitle = "Google";
		acttile = "Gmail";
		Assert.assertEquals(exptitle, acttile);
	}

}
