package paginasNavegacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import clasesComunes.WrapperClasses;

public class LogueoLinkedin {
	
	//Method to use the ChromeDriver always use
	public LogueoLinkedin (WebDriver driver) {
		PageFactory.initElements(driver,this);  //line to initialized all web elements
	}
	
	//FindElements
	@FindBy(xpath= "/html/body/nav/div/a[2]") 
	private WebElement iniciarSessionBoton;
	
	@FindBy(id= "username") 
	private WebElement usuarioTextBox;
	
	@FindBy(id="password") 
	private WebElement passwordTextBox;
	
	@FindBy(xpath= "//*[@id=\"organic-div\"]/form/div[4]/button") 
	private WebElement sesionBotonAzul;
	
	@FindBy(id="error-for-password")
	public WebElement mensajeDeError;
	
	
	//Method to move to login page then login
	public void logueo(String usuario, String password) throws InterruptedException {
		
		WrapperClasses.clickElement(iniciarSessionBoton);
		Thread.sleep(2000);
		
		WrapperClasses.clickElement(usuarioTextBox);
		WrapperClasses.sendText(usuarioTextBox, usuario);
		
		WrapperClasses.clickElement(passwordTextBox);
		WrapperClasses.sendText(passwordTextBox, password);
		
		WrapperClasses.clickElement(sesionBotonAzul);
		
	}
	
	
	//Method to validate error message using bad password
	public boolean validarMensajeError() {
		
		boolean errorMensaje = WrapperClasses.getTexto(mensajeDeError).contains("Dirección de email o contraseña incorrectas. Vuelve a intentarlo");
		return errorMensaje;
	}
	
	

}
