package BCL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BCL_update_profile extends basicbcl {
	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Profile Update", "Check profile updates successfully or not");
	
	
		Thread.sleep(5000); 
		
//login

		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(5000); 
		

//profile update with valid information
		
		update Update = new update(driver);
		Update.setUpdate();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/clProfile")).click();
		Thread.sleep(3000); 
		Update.setEmail("abcd@gmail.com");
		test.log(Status.PASS, "This step shows by updating field");
		Update.setSubmit();
		test.log(Status.PASS, "This step shows successfully profile update");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toast, "Success");
		test.log(Status.PASS, "This step shows the toast message for successfully profile update");
		Thread.sleep(5000); 
		
//Back button check and verify updated information 		
		Update.setBack();
		Update.setBack();
		Update.setUpdate();
		Update.setBack();
		test.log(Status.PASS, "This step shows successfully work of Back button and check the updated information");
		
		
//profile update with invalid email
				
				update invalid = new update(driver);
				invalid.setUpdate();
				invalid.setMob("01700704427");
				invalid.setEmail("asfdaf");
				invalid.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid email"); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String toastemail = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(toastemail, "Invalid email address.");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000); 
				invalid.setBack();
	
				
//profile update with invalid phone
			
				update invalidphone = new update(driver);
				invalidphone.setUpdate();
				invalidphone.setMob("fsdfsd");
				invalidphone.setEmail("asfdaf@gmail.com");
				invalidphone.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String toastmob = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(toastmob, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);
				invalidphone.setBack();

				
//profile update with invalid phone and email
				

				update invalidboth = new update(driver);
				invalidboth.setUpdate();
				invalidboth.setMob("fsdfsd");
				invalidboth.setEmail("asfda");
				invalidboth.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone and email");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String toastall = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(toastall, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);
				invalidboth.setBack();


//profile update with empty email
				
				update emptyemail = new update(driver);
				emptyemail.setUpdate();
				emptyemail.setMob("01700704427");
				emptyemail.setEmail("");
				emptyemail.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid email"); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String emptmail = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptmail, "Email address is required.");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000); 
				emptyemail.setBack();
				
//profile update with empty phone
			
				update emptphone = new update(driver);
				emptphone.setUpdate();
				emptphone.setMob("");
				emptphone.setEmail("asfdaf@gmail.com");
				emptphone.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String emptphn = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptphn, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);
				emptphone.setBack();
				
				
//profile update with empty phone and email
				

				update empt = new update(driver);
				empt.setUpdate();
				empt.setMob("");
				empt.setEmail("");
				empt.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone and email");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String empty = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(empty, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);	
				

    
		
	}
	
}