package BCL;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;
//import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class BCl_Afilliation_new extends basicbcl {
	@Test

	public void Affiliation() throws MalformedURLException, InterruptedException {
		

        ExtentTest test = extent.createTest("Affiliation", "Check all the modules work successfully or not");
        
		Thread.sleep(5000);
		
		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(5000); 
		 test.log(Status.PASS, "SUccessfully logged in");
		
		//Check BC club		
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\'com.btracsolutions.bananiclub:id/rlMenu\']/android.widget.ImageView")).click();
		Thread.sleep(3000); 
		 test.log(Status.PASS, "This step shows successfully click on the BC Club Button");
			Thread.sleep(3000); 
		
//Check Affiliation		
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/llAffiliation")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Affiliation Button");
//				
//				//Club
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[1]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Club Button");

				scrollDown();
				scrollUp();
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
//				
//				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
//	
//				
//				//Reciprocal
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[2]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Reciprocal Button");
				scrollDown();
				scrollUp();
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");


	}
	



	
	private void scrollDown() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 300, "width", 800, "height", 1500,
			    "direction", "down",
			    "percent", 90.0
			));  // Replaced Thread.sleep with custom wait method
		
		Thread.sleep(3000);
    }

    private void scrollUp() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 300, "width", 800, "height", 1500,
			    "direction", "up",
			    "percent", 90.0
			));  // Replaced Thread.sleep with custom wait method
		
		Thread.sleep(3000); // Replaced Thread.sleep with custom wait method
    }
}