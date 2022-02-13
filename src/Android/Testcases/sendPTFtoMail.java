package Android.Testcases;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import Android.Pages.mainPageItems;
import Android.Pages.piyasaTakasFiyatýPage;
import Android.Pages.sideMenu;
import Android.Utils.functions;
import io.appium.java_client.AppiumDriver;

public class sendPTFtoMail {

	mainPageItems mainPage = new mainPageItems();
	sideMenu menuItems = new sideMenu();
	piyasaTakasFiyatýPage ptfItems = new piyasaTakasFiyatýPage();
	
	functions function = new functions();

	public void goToPTFPage(AppiumDriver driver) {
		
		function.clickFunction(driver, mainPage.menuIcon);
		function.clickFunction(driver, menuItems.piyasalar);
		function.clickFunction(driver, menuItems.piyasaTakipFiyatý);
		
	}
	
	public double getArtOrtalama(AppiumDriver driver) {
		return function.returnDoubleVariable(driver, ptfItems.artOrtalama);
		}
	
	public double getAgrOrtalama(AppiumDriver driver) {
		return function.returnDoubleVariable(driver, ptfItems.agrOrtalama);
	}
	
	
	
	public void sentPTFmail (AppiumDriver driver) {
		goToPTFPage(driver);
		double artOrtalama = getArtOrtalama(driver);
		double agrOrtalama = getAgrOrtalama(driver);
		sendMail();
	}
	
	public void sendMail() {
		// Recipient's email ID needs to be mentioned.
	      String to = "analyst.team@smartpulse.io";

	      // Sender's email ID needs to be mentioned
	      String from = "akinaksoytr@gmail.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }
	}

