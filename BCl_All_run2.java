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

public class BCl_All_run2 extends basicbcl {
	@Test
	public void BC_Club() throws MalformedURLException, InterruptedException {
		
//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("The Club", "Check all the modules work successfully or not");
  
		Thread.sleep(5000); 
		
//login

		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(10000); 
		test.log(Status.PASS, "This step shows successfully login");

//Check BC club		
				driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\'com.btracsolutions.bananiclub:id/rlMenu\']/android.widget.ImageView")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Menu Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/llTheClub")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the The Club Button");
				//Club History
				
				driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMenu\"])[1]")).click();
				Thread.sleep(5000); 
				test.log(Status.PASS, "This step shows successfully click on the Club History Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"taste\"))"));
//				Thread.sleep(10000); 
//	

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
					
				//Founder Member
				
				driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMenu\"])[2]")).click();
				Thread.sleep(10000);
				test.log(Status.PASS, "This step shows successfully click on the Founder Member Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward().scrollIntoView(new UiSelector().text(\"DILAN\"))"));
//				Thread.sleep(10000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				//Founder President Message
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
				Thread.sleep(10000); 
				test.log(Status.PASS, "This step shows successfully click on the Founder President Message Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				//Founder Advisor Message
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Founder Advisor Message Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				//Guest Rules
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Guest Rules Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				//Dress COde
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[6]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Dress Code Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				//Timing
				
				driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.btracsolutions.bananiclub:id/textView3\"])[7]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Timing Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000);
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				
				Thread.sleep(3000);
	
	}

	@Test
	public void committee() throws MalformedURLException, InterruptedException {
        ExtentTest test = extent.createTest("Committee", "Check all the modules work successfully or not");
        
		Thread.sleep(5000);


//Check Committee		
				driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llCommittee\"]/android.widget.RelativeLayout")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Committee Button");
//				
//				//President msg
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[1]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the President Message Button");
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "down",
				    "percent", 3.0
				));

				// Scroll Up
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 1000, "width", 800, "height", 800,
				    "direction", "up",
				    "percent", 3.0
				));
				test.log(Status.PASS, "This step shows successfully scroll up and down");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
//				
//				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
//	
//				
//				//Present EC
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[2]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Present EC Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				
				
//				//Former EC
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
				Thread.sleep(3000);
				test.log(Status.PASS, "This step shows successfully click on the Former EC Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
//				
//				//Past President
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Past President Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
//				
//				//Present Sub Committe
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Present Sub Committee Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				Thread.sleep(3000);
				
	
	}

	@Test
	public void Affiliation() throws MalformedURLException, InterruptedException {
		

        ExtentTest test = extent.createTest("Affiliation", "Check all the modules work successfully or not");
        
		Thread.sleep(5000);
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
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Back Button");
				Thread.sleep(3000);
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