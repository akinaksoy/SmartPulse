package Android.Drivers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class androidDriver {
	
	public AppiumDriver driver ; 
	
	
	
	
	public androidDriver() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		
		capabilities.setCapability("platformName","Android");
	    capabilities.setCapability("platformVersion","10");
	    capabilities.setCapability("deviceName","4d8acec0");
	    capabilities.setCapability("newCommandTimeout","0");
	    capabilities.setCapability("appPackage","com.foreks.android.epias");
	    
		
	    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"), capabilities);
	    
	    
	    Thread.sleep(5000);
	    
	   
	    
	}
}
