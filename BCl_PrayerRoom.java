package BCL;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

public class BCl_PrayerRoom extends basicbcl {

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

    public void nodata() throws InterruptedException
    {
    	// Create report        
        ExtentTest test = extent.createTest("Facilities", "Check the facilities shows");

        try {
            // Use explicit wait to check if the "No data found" toast message is present
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Check if the "No data found" message appears
            boolean isToastPresent = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.Toast[@text='No data found']"))) != null;

            // If the toast message is found, fail the test case
            if (isToastPresent) {
                test.log(Status.FAIL, "'No data found' message is displayed, test case failed.");
            }

        } catch (NoSuchElementException  e) {
            // If the toast is not found within the specified time, it means data is present
            test.log(Status.PASS, "Data found for Prayer Room, test case passed.");
            scrollDown();  // Scroll down as part of the test
            scrollUp();    // Scroll back up as part of the test
            driver.navigate().back();
            Thread.sleep(3000);
        } catch (Exception e) {
            // Handle any unexpected exceptions
            test.log(Status.FAIL, "An error occurred: " + e.getMessage());
        }
    }    
    
    // Method to click a random news link
    public void clickRandomNewsLink() throws InterruptedException {
    	

    	// Create report        
        ExtentTest test = extent.createTest("Facilities", "Check the facilities shows");
        Thread.sleep(5000); 
        // Click on the Facilities section
        driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llFacilities\"]/android.widget.RelativeLayout/android.widget.ImageView"))
              .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Facilities");

       
     // Click on the Prayer Room element
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[8]"))
                .click();
        Thread.sleep(3000);

        // Log the click event
        test.log(Status.PASS, "This step shows by clicking on the Prayer Room");

       nodata();
      

        
        //Club Lobby
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[9]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Club Lobby");
        nodata();
        //Sports
        
        driver.findElement(By.xpath("(//android.view.View[@resource-id=\"com.btracsolutions.bananiclub:id/view\"])[10]"))
        .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Sports");
        nodata();

        
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
        
        
    }
}
