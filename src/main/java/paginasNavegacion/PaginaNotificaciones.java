package paginasNavegacion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import clasesComunes.WrapperClasses;

public class PaginaNotificaciones {
	
	//Method to load ChromeDriver
	public PaginaNotificaciones (WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	
	@FindBy (xpath="//*[@id=\"global-nav\"]/div/nav/ul/li[5]/a")
	private WebElement botonNotificaciones;
	
	@FindBy (xpath = "//*[@id=\"ember224\"]/div[2]/div/div/div/div/div/section/h1")
	public WebElement labelNotificaciones;
	
	
	
	//Method to login
	public void logueo(String usuario, String password) throws InterruptedException {
		
		WrapperClasses.clickElement(iniciarSessionBoton);
		Thread.sleep(1500);
		
		WrapperClasses.clickElement(usuarioTextBox);
		WrapperClasses.sendText(usuarioTextBox, usuario);
		
		WrapperClasses.clickElement(passwordTextBox);
		WrapperClasses.sendText(passwordTextBox, password);
		
		WrapperClasses.clickElement(sesionBotonAzul);
		
	}
	
	
	//Method to find Notification button and go there
	public void notificaciones() {
		
		WrapperClasses.clickElement(botonNotificaciones);
		
	}
	
	//Method to validate notifications label
	public boolean validarMensaje() {
		boolean etiquetaNotificaciones = WrapperClasses.getTexto(labelNotificaciones).contains("Gestiona tus notificaciones");
		return etiquetaNotificaciones;
	}

}
