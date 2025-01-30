package logueoTesting;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import clasesComunes.DriverConfig;
import clasesComunes.VariablesGlobales;
import clasesComunes.WrapperClasses;
import paginasNavegacion.PaginaNotificaciones;

public class TC03_Notificaciones {
	
	//Declare and initialize WebDriver
	WebDriver driver = DriverConfig.setDriver();
	
	//Page Notifications
	PaginaNotificaciones paginaNotificaciones = new PaginaNotificaciones(driver);
  
	
	@BeforeTest  //To load page
	public void loadLinkedIn() {
		driver.get(VariablesGlobales.LINKEDIN_LOGINPAGE);
	}
	
	
	@Test
    public void TC02_Pagina_Notificaciones() throws InterruptedException {
		
		//Method login
		paginaNotificaciones.logueo(VariablesGlobales.LOGIN_USER, VariablesGlobales.LOGIN_PASSWORD);
		
		//Method to click notifications
		paginaNotificaciones.notificaciones();
		
		//Method validate label notifications
		String validarLabel = WrapperClasses.getTexto(paginaNotificaciones.labelNotificaciones);
		System.out.println(validarLabel);
		
    }
	
	
	
	@AfterTest
	public void closeDriver() {
		
		//driver.quit();
		
	}
}
