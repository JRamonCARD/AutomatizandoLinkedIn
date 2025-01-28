package probandoSelenium;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pruebaUno {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
