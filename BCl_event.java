package BCL;

import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;


public class BCl_event extends basicbcl {

	@SuppressWarnings("deprecation")
	@Test
	public void Event() throws MalformedURLException, InterruptedException {
		
//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Event", "Sample description");
  
		Thread.sleep(5000); 
		
//login

		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(5000); 
		test.log(Status.PASS, "This step shows valid credential login");



//Check BC club		
				driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\'com.btracsolutions.bananiclub:id/rlMenu\']/android.widget.ImageView")).click();
				Thread.sleep(2000); 
				test.log(Status.PASS, "This step shows menu works");
				
	

//
////Check Event Calendar		
		

				// Clicking on the Event Calendar
				driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llEventCal\"]/android.widget.RelativeLayout"))
				        .click();
				Thread.sleep(2000); 
				test.log(Status.PASS, "This step shows event button works");
				
				// Scroll Down
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 300, "width", 800, "height", 1500,
				    "direction", "down",
				    "percent", 90.0
				));
				Thread.sleep(3000);
				
				//Find 1st More Button
				// Find all buttons with the same resource ID
				List<WebElement> moreButtons = driver.findElements(By.xpath("//android.widget.Button[@resource-id='com.btracsolutions.bananiclub:id/btnMore']"));

				// Click the first button if it exists
				if (!moreButtons.isEmpty()) {
				    moreButtons.get(0).click();  
				    test.log(Status.PASS, "This step shows by clicking event it shows the details");// Clicks the first "More" button
				} else {
				    System.out.println("No 'More' buttons found.");
				    test.log(Status.FAIL, "No 'More' buttons found. No events to display.");
				}
				Thread.sleep(2000); 
//				
//				test.log(Status.PASS, "This step shows by clicking event it shows the details");

	
	
		        scrollDown();

				Thread.sleep(2000);
		        
				test.log(Status.PASS, "This step shows by scroll down works");
		        
		        
		        scrollUp();
		        
				Thread.sleep(2000);
	
							
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
//				test.log(Status.FAIL, "No data found to scroll up");
				
				try {
//				    // Example: Check if an element that should be visible after clicking Back button is present
//				    // Replace this with the actual condition or element you expect to see after navigating back
				    WebElement expectedElement = driver.findElement(By.id("com.btracsolutions.bananiclub:id/expectedElementId"));
				    Assert.assertTrue(expectedElement.isDisplayed(), "Expected element is not displayed after clicking Back button.");
				    test.log(Status.PASS, "Back button click verified successfully. Expected element is displayed.");
				} catch (AssertionError e) {
//				    // Log failure if the expected element is not found or not visible
				    test.log(Status.FAIL, "Back button click failed. Expected element was not found or not displayed: " + e.getMessage());
				} catch (NoSuchElementException e) {
//				    // Handle case where element is not found
				    test.log(Status.FAIL, "Back button click failed. Expected element was not found: " + e.getMessage());
				}
				Thread.sleep(2000); 			
				
				//Find 2nd More button
				((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
					    "left", 100, "top", 300, "width", 800, "height", 2000,
					    "direction", "down",
					    "percent", 90.0
					));  // Replaced Thread.sleep with custom wait method
		        scrollDown();
				Thread.sleep(3000);
				
	//			 Find and click the 2nd "More" button if it exists
		        List<WebElement> moreButtons1 = driver.findElements(By.xpath("//android.widget.Button[@resource-id='com.btracsolutions.bananiclub:id/btnMore']"));
				if (!moreButtons1.isEmpty()) {
					moreButtons1.get(0).click();  // Clicks the first "More" button
				} else {
				    System.out.println("No 'More' buttons found.");
				}
				
				
				
//				// Find all "More" buttons
//				List<WebElement> moreButtons1 = driver.findElements(By.xpath("//android.widget.Button[@resource-id='com.btracsolutions.bananiclub:id/btnMore']"));
//
//				// Check if there are at least two "More" buttons
//				if (moreButtons1.size() >= 2) {
//				    // Click the second "More" button
//				    moreButtons1.get(1).click();
//				    test.log(Status.PASS, "Second 'More' button clicked successfully.");
//				} else if (moreButtons1.size() == 1) {
//				    // If only one button is found
//				    test.log(Status.FAIL, "Only one 'More' button found. Second button does not exist.");
//				} else {
//				    // No "More" buttons found
//				    test.log(Status.FAIL, "No 'More' buttons found. No events to display.");
//				}

				Thread.sleep(2000);
				
	
				Thread.sleep(3000);
		        scrollDown();
		        scrollUp();
		        
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
		        
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
//				try {
//				    // Example: Check if an element that should be visible after clicking Back button is present
//				    // Replace this with the actual condition or element you expect to see after navigating back
//				    WebElement expectedElement = driver.findElement(By.id("com.btracsolutions.bananiclub:id/expectedElementId"));
//				    Assert.assertTrue(expectedElement.isDisplayed(), "Expected element is not displayed after clicking Back button.");
//				    test.log(Status.PASS, "Back button click verified successfully. Expected element is displayed.");
//				} catch (AssertionError e) {
//				    // Log failure if the expected element is not found or not visible
//				    test.log(Status.FAIL, "Back button click failed. Expected element was not found or not displayed: " + e.getMessage());
//				} catch (NoSuchElementException e) {
//				    // Handle case where element is not found
//				    test.log(Status.FAIL, "Back button click failed. Expected element was not found: " + e.getMessage());
//				}
//				Thread.sleep(2000); 	
//				
//				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
//				Thread.sleep(3000); 
				

	
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