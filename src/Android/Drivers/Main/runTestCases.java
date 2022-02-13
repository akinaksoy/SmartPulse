package Android.Drivers.Main;

import java.net.MalformedURLException;

import Android.Drivers.androidDriver;
import Android.Testcases.sendPTFtoMail;
import io.appium.java_client.AppiumDriver;

public class runTestCases {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		androidDriver mainDriver = new androidDriver();
		
		sendPTFtoMail T1_sendPTFtoMail = new sendPTFtoMail();
		T1_sendPTFtoMail.sentPTFmail(mainDriver.driver);
		
	}

}
