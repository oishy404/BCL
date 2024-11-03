package BCL;

import java.net.MalformedURLException;

import org.Carcopolo.framework_design.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class BCl_club extends basicbcl {
	@SuppressWarnings("deprecation")
	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
		
//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
  
		Thread.sleep(5000); 
		
//login

		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(10000); 


//Check BC club		
				driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\'com.btracsolutions.bananiclub:id/rlMenu\']/android.widget.ImageView")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"The Club\"]")).click();
				Thread.sleep(3000); 
				

//Club History
				
				driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMenu\"])[1]")).click();
				Thread.sleep(5000); 
				
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

//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"taste\"))"));
//				Thread.sleep(10000); 
//	

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
					
				//Founder Member
				
				driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMenu\"])[2]")).click();
				Thread.sleep(10000);
				
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
				
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward().scrollIntoView(new UiSelector().text(\"DILAN\"))"));
//				Thread.sleep(10000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Founder President Message
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
				Thread.sleep(10000); 
				
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
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Founder Advisor Message
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Guest Rules
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
				Thread.sleep(3000); 
				
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
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Dress COde
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[6]")).click();
				Thread.sleep(3000); 
				
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
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Timing
				
				driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.btracsolutions.bananiclub:id/textView3\"])[7]")).click();
				Thread.sleep(3000); 
				
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
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000);
				
				
				
	

    
		
	}
	
}