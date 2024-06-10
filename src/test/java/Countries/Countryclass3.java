package Countries;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Countryclass3 {
  @Test
  public void mex() {
	  String name = "Mexico";
	  Assert.assertEquals(name, "Mexico");
	  System.out.println("The given country name is correct as : " +name);
	  }
  @Test
	  public void ger() {
	  String name = "Germany";
	  Assert.assertEquals(name, "Germany");
	  System.out.println("The given country name is correct as : " +name);
	  }
  @Test
	  public void ind() {
	  String name = "Indonesia";
	  Assert.assertEquals(name, "Indonesia");
	  System.out.println("The given country name is correct as : " +name);
	  }
  @Test
	  public void bur() {
	  String name = "Burma";
	  Assert.assertEquals(name, "Burma");
	  System.out.println("The given country name is correct as : " +name);
	  }
  @Test
  	public void ire() {
	String name = "Ireland";
	Assert.assertEquals(name, "Ireland");
	System.out.println("The given country name is correct as : " +name);
  }
  @Test
  	public void col() {
	String name = "Colombia";
	Assert.assertEquals(name, "Colombia");
	System.out.println("The given country name is correct as : " +name);
  }
  @Test
	public void can() {
	String name = "Canada";
	Assert.assertEquals(name, "Canada");
	System.out.println("The given country name is correct as : " +name);

  }
}

