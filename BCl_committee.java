package BCL;

import java.net.MalformedURLException;


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

public class BCl_committee extends basicbcl {
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

		driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\'com.btracsolutions.bananiclub:id/rlMenu\']/android.widget.ImageView")).click();
		Thread.sleep(3000); 
		
		//Check Committee		
		driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llCommittee\"]/android.widget.RelativeLayout")).click();
		Thread.sleep(3000); 
		
//		
//		//President msg
//		
		driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[1]")).click();
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
//		
//		test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
//
//		
//		//Present EC
//		
		driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[2]")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
		Thread.sleep(3000); 
		
		
		
//		//Former EC
//		
		driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
		Thread.sleep(3000); 
//		
//		//Past President
//		
		driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
		Thread.sleep(3000); 
//		
//		//Present Sub Committe
//		
		driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
		Thread.sleep(3000); 
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
		Thread.sleep(3000); 
		
		

}
				

				
				
	

    
		
	}
	
