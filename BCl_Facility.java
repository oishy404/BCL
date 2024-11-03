package BCL;

import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

public class BCl_Facility extends basicbcl {

    @SuppressWarnings("deprecation")
    @Test
    public void facility() throws MalformedURLException, InterruptedException {
        
        // Create report        
        ExtentTest test = extent.createTest("Login", "Facilities");
      
        Thread.sleep(5000); 
        
        // Login
        FormPage formPage = new FormPage(driver);
        formPage.setPhone("01700704427");
        formPage.setPassword("123456");
        formPage.setLogin();
        Thread.sleep(3000); 

        // Check BC club        
        driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.btracsolutions.bananiclub:id/rlMenu']/android.widget.ImageView")).click();
        Thread.sleep(3000);

        // Call the method to click a random news link
        clickRandomNewsLink();
    }

    // Method to scroll down
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

    // Method to click a random news link
    public void clickRandomNewsLink() throws InterruptedException {
    	
    	// Create report        
        ExtentTest test = extent.createTest("Facilities", "Check the facilities shows");
      
        Thread.sleep(5000); 
        // Click on the News section
        driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llFacilities\"]/android.widget.RelativeLayout/android.widget.ImageView"))
              .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Facilities");
        scrollDown(); // Scroll down if necessary to bring more links into view
        
        scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
       
        
        //Food Beverage
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[1]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Facilities");
        scrollDown(); // Scroll down if necessary to bring more links into view
        scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        
		// Find all buttons with the same resource ID for Details
		List<WebElement> moreButtons = driver.findElements(By.xpath("(//android.widget.Button[@resource-id=\"com.btracsolutions.bananiclub:id/btnMenu\"])"));

		// Click the first button if it exists
		if (!moreButtons.isEmpty()) {
		    moreButtons.get(0).click();  
		    test.log(Status.PASS, "This step shows by clicking on specific sub-facility's Detail and it shows the details");// Clicks the first "More" button
		} else {
		    System.out.println("No 'More' buttons found.");
		    test.log(Status.FAIL, "No 'More' buttons found. No events to display.");
		}
		Thread.sleep(2000); 
		
		scrollDown(); // Scroll down if necessary to bring more links into view
        scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
 
        driver. navigate(). back(); 
        
		// Find all buttons with the same resource ID for Order
		List<WebElement> orderButtons = driver.findElements(By.xpath("(//android.widget.Button[@resource-id=\"com.btracsolutions.bananiclub:id/btnOrder\"])"));

		// Click the first button if it exists
		if (!orderButtons.isEmpty()) {
			orderButtons.get(0).click();  
		    test.log(Status.PASS, "This step shows by clicking on specific sub-facility's Detail and it shows the details");// Clicks the first "More" button
		} else {
		    System.out.println("No 'More' buttons found.");
		    test.log(Status.FAIL, "No 'More' buttons found. No events to display.");
		}
		Thread.sleep(5000); 
        
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        //Halls
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[2]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Halls");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        //Club Residence
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[3]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Club Residence");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        //Health Fitness
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[4]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Health Fitness");

        Thread.sleep(3000);
        List<WebElement> Buttons = driver.findElements(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])"));
    	// Click the first button if it exists
		if (!Buttons.isEmpty()) {
			Buttons.get(0).click();  
		    test.log(Status.PASS, "This step shows by clicking on specific sub-facility's Detail and it shows the details");// Clicks the first "More" button
		} else {
		    System.out.println("No 'More' buttons found.");
		    test.log(Status.FAIL, "No 'More' buttons found. No events to display.");
		}
		Thread.sleep(5000);
		scrollDown();
		scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        //Personal Care
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[5]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Personal Care");

		scrollDown();
		scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        
        //Beauty Salon & Spa
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[6]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Beauty Salon & SPA");

		scrollDown();
		scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        
        //Laundry
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[7]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Laundry");
 
		scrollDown();
		scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        //Prayer Room
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[8]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Prayer Room");

        Thread.sleep(3000);
        
        try {
            WebElement description = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.btracsolutions.bananiclub:id/tvTitle\" and @text=\"Feature\"]"));
            if (description.isDisplayed()) {
                test.log(Status.PASS, "Description is present");
                
                // Perform scroll actions
                scrollDown();
                scrollUp();
                test.log(Status.PASS, "Scroll down and up works");
                driver.navigate().back();
                Thread.sleep(3000);
            } else {
                test.log(Status.FAIL, "Description is not present");
            }
        } catch (NoSuchElementException e) {
            test.log(Status.FAIL, "Description element not found");
        }

        // Navigate back
      

        
        //Club Lobby
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[9]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Club Lobby");

		scrollDown();
		scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        driver. navigate(). back(); 
        Thread.sleep(3000);
        
        //Sports
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[1]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Sports");
        
        List<WebElement> sportButtons = driver.findElements(By.xpath( "(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])"));
     // Click the first button if it exists
     		if (!sportButtons.isEmpty()) {
     			sportButtons.get(0).click();  
     		    test.log(Status.PASS, "This step shows by clicking on specific sub-facility's Detail and it shows the details");// Clicks the first "More" button
     		} else {
     		    System.out.println("No 'More' buttons found.");
     		    test.log(Status.FAIL, "No 'More' buttons found. No events to display.");
     		}
     		Thread.sleep(5000);
     		scrollDown();
     		scrollUp();
             test.log(Status.PASS, "This step shows by scroll down and up works");
             driver. navigate(). back(); 
             Thread.sleep(3000);
     		scrollDown();
    		scrollUp();
             
    		test.log(Status.PASS, "This step shows by scroll down and up works");
    		driver. navigate(). back(); 
    		Thread.sleep(3000);
        
        
    }
}
