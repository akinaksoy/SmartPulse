package Android.Utils;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;

public class functions {

	
	public void clickFunction (AppiumDriver driver, By element) {
		driver.findElement(element).click();
	}
	
	public double returnDoubleVariable (AppiumDriver driver, By element) {
		
		return Double.parseDouble(driver.findElement(element).getText()); 
	}
	
}
