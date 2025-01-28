package logueoTesting;

import org.testng.annotations.Test;
import clasesComunes.DriverConfig;
import clasesComunes.VariablesGlobales;
import paginasNavegacion.LogueoLinkedin;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC01_Logueo {
	
	
	//Declare and initialized WebDriver 
	  WebDriver driver = DriverConfig.setDriver();
	  
	 //Page Objects
	 LogueoLinkedin logueoLinkedin = new LogueoLinkedin(driver);
 
  @BeforeTest
  //Method to load LinkedIn to the corresponding URL
  public void loadLinkedIn() {
	  driver.get(VariablesGlobales.LINKEDIN_LOGINPAGE);
	  
  }
  
  @Test
  public void TC01_Credenciales_Validas() throws InterruptedException {
	  
	  logueoLinkedin.logueo(VariablesGlobales.LOGIN_USER, VariablesGlobales.LOGIN_PASSWORD);
	  
  }

  
  
  @AfterTest
  public void afterTest() {
  }
  

}
