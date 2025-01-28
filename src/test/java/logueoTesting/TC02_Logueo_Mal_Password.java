package logueoTesting;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import clasesComunes.DriverConfig;
import clasesComunes.VariablesGlobales;
import clasesComunes.WrapperClasses;
import paginasNavegacion.LogueoLinkedin;

public class TC02_Logueo_Mal_Password {
	
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
	  public void TC02_Invalid_Password() throws InterruptedException {
		  
		  //Method to login
		  logueoLinkedin.logueo(VariablesGlobales.LOGIN_USER, VariablesGlobales.BAD_PASSWORD);
		  
		  //boolean variable to validate error message
		  boolean errorEnPassword = logueoLinkedin.validarMensajeError();
		  
		  //Validate if content of the web element has the expected text
		  Assert.assertTrue(errorEnPassword);
		  
		  //Get the text of the error and print
		  String validandoError = WrapperClasses.getTexto(logueoLinkedin.mensajeDeError);
		  System.out.println(validandoError);
		  
	    }
	  
	  
	  
	  @AfterTest
	  public void closeDriver() {
		  driver.quit();
	  }
	  
	  
}
