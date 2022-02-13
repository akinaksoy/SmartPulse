package Web.main;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import Android.Drivers.androidDriver;
import Web.Testcases.realTimeConsumption;
import Web.Testcases.realTimeProduction;
import Web.utils.Driver.webDriver;

public class runTestCases  {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub

		webDriver mainDriver = new webDriver(); 
		
		realTimeProduction testCase1 = new realTimeProduction();
		testCase1.realTimeProductionDifferences(mainDriver.driver);
		
		realTimeConsumption testCase2 = new realTimeConsumption();
		testCase2.realTimeConsumptionDifferences(mainDriver.driver);
		
		
		
		
		mainDriver.closeDriver(mainDriver.driver);
		
	}

}
