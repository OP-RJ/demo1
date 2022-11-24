package dummy;

import java.io.IOException;

import org.testng.annotations.Test;
import com.testAutomation.Base.Base1;
import com.testAutomation.POM_Pages.LogIn;

public class testingWithoutDDT extends Base1 {
	
  @Test
  public void testLogIn() throws IOException {
	  LogIn obj=new LogIn(driver);
	  obj.enterUserName();
	  obj.enterPassword();
	  obj.clickOnSubmitButton();
  }
}

