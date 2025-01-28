package clasesComunes;

import org.openqa.selenium.WebElement;

public class WrapperClasses {
	
	//Method to do clicks call "clickElemento"
	public static void clickElement (WebElement webElementUI) {
		webElementUI.click();
		
	}
	
	//Method to send text to a web element
	public static void sendText (WebElement webElementUI, String text) {
		webElementUI.sendKeys(text);
	}
	
	

}
