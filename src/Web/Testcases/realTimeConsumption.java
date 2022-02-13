package Web.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class realTimeConsumption {
	
	
	
public void realTimeConsumptionDifferences(WebDriver driver) {
		
		WebElement scriptElement = driver.findElement(By.xpath("//form/script[5]"));
		// saat s�n�f�n uzunlugunu bulma
		long stringListLength = (long) ((JavascriptExecutor) driver).executeScript("return consumptionJsonData.length ;", scriptElement);
		double[] totalList = new double[(int) stringListLength] ;
		double difference =0;
		
		//get ALL "total" data
		for (long index= 0 ; index < stringListLength ; index++) {
			String total = ((JavascriptExecutor) driver).executeScript("return consumptionJsonData["+index+"].consumption ;", scriptElement).toString();
			totalList[(int) index] = Double.parseDouble(total);
			
			
		}
		
		System.out.println("------------T�ketim Miktarlar� Saatlik farklar----------");
		
		for (int i = 1 ; i< stringListLength;i++) {
			// Saat farklar�ndaki de�i�imleri bulma
			difference = totalList[i]-totalList[i-1]; 
			
			
			
			if(difference >= 0) {
				System.out.println(i+". saatte t�ketim("+(i-1)+".00-"+i+".00) "+Math.round(difference) + " artt�");
			}else {
				System.out.println(i+". saatte t�ketim("+(i-1)+".00-"+i+".00) "+Math.round(Math.abs(difference))+ " azald�" );
			}
			
		}
	
		
		 
		
	}
}
