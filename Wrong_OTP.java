package BCL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wrong_OTP extends basicbcl {
	

	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Wrong OTP", "Check the wrong OTP");
	
		Thread.sleep(5000); 
		

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvForgot")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		test.log(Status.PASS, "This step shows the toast message for OTP");
		Thread.sleep(5000);
	        // Extract OTP from the toast message using regex


	        // Enter the OTP in the OTP field
	        driver.findElement(By.id("com.btracsolutions.bananiclub:id/pinView")).sendKeys("3254");
			driver.findElement(By.id("com.btracsolutions.bananiclub:id/cvConfirm")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
			Assert.assertEquals(toast,"OTP not matched.");
			test.log(Status.PASS, "This step shows the toast message for not matching with OTP");
			
			Thread.sleep(5000); 
			
		
	}
	
	
}