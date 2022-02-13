package Web.Testcases;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Web.utils.Driver.webDriver;

public class realTimeProduction  {

	
	
	public realTimeProduction() throws InterruptedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void realTimeProductionDifferences(WebDriver driver) {
		
		WebElement scriptElement = driver.findElement(By.xpath("//form/script[5]"));
		// saat sýnýfýn uzunlugunu bulma
		long stringListLength = (long) ((JavascriptExecutor) driver).executeScript("return generationData.length ;", scriptElement);
		double[] totalList = new double[(int) stringListLength] ;
		double difference =0;
		
		//get ALL "total" data
		for (long index= 0 ; index < stringListLength ; index++) {
			String total = ((JavascriptExecutor) driver).executeScript("return generationData["+index+"].total ;", scriptElement).toString();
			totalList[(int) index] = Double.parseDouble(total);
			
			
		}
		
		System.out.println("------------Üretim Miktarlarý Saatlik farklar----------");
		for (int i = 1 ; i< stringListLength;i++) {
			// Saat farklarýndaki deðiþimleri bulma
			difference = totalList[i]-totalList[i-1]; 
			
			
			
			if(difference >= 0) {
				System.out.println(i+". saatte üretim("+(i-1)+".00-"+i+".00) "+Math.round(difference) + " arttý");
			}else {
				System.out.println(i+". saatte üretim("+(i-1)+".00-"+i+".00) "+Math.round(Math.abs(difference))+ " azaldý" );
			}
			
		}
	
		
		 
		
	}
	
	
	
	
	
}
