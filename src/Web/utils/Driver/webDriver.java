package Web.utils.Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriver {
	
	public WebDriver driver ;  
	
	public webDriver() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","src/Web/utils/chromeDriver/chromedriver.exe");
        driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seffaflik.epias.com.tr/transparency/");
		
		
		Thread.sleep(10000);
		
		
	}
	
	
	public void closeDriver(WebDriver _driver) {
		_driver.close();
	}
	
}
