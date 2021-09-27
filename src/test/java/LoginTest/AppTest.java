package LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import Login.App;

public class AppTest {
  @Test(description="valid test")
  public void validLogin() {
	  App ap=new App();
	 boolean status= ap.userLogin("demo", "password");
	  Assert.assertTrue(status);
	  
  }
  
	  @Test(description="invalid test")
	  public void invalidLogin() {
		  App ap=new App(); 
		 boolean status= ap.userLogin("demo1", "password");
		  Assert.assertFalse(status,"invalid credientials are given");
		  
	  }
}
