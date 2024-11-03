package BCL;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

public class BCl_Booking extends basicbcl {

    @Test
    public void facility() throws MalformedURLException, InterruptedException {
        
        // Create report        
        ExtentTest test = extent.createTest("Login", "Booking");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait instance

        // Login
        FormPage formPage = new FormPage(driver);
        
        // Wait for phone input to be visible and interact with it
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")));
        phoneInput.sendKeys("01730311611");

        // Wait for password input and interact with it
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")));
        passwordInput.sendKeys("123456");

        // Click login button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnLogin")));
        loginButton.click();

        // Wait after login to ensure next screen loads properly
        Thread.sleep(5000);

        // Navigate to BC club
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout[@resource-id='com.btracsolutions.bananiclub:id/rlMenu']/android.widget.ImageView"))).click();
        test.log(Status.PASS, "Navigated to BC Club");

        // Call the method to click a random news link
        clickRandomNewsLink(test, wait);
        
        Thread.sleep(5000);
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


    // Method to click a random menu
    public void clickRandomNewsLink(ExtentTest test, WebDriverWait wait) throws InterruptedException {
    	// Click on the booking section
    	wait.until(ExpectedConditions.elementToBeClickable(
    	    By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id='com.btracsolutions.bananiclub:id/llBooking']/android.widget.RelativeLayout")
    	)).click();

    	test.log(Status.PASS, "Clicked on the Booking section");
    	Thread.sleep(3000);

    	// Click on the booking button
    	wait.until(ExpectedConditions.elementToBeClickable(
    	    By.xpath("//android.widget.Button[@resource-id='com.btracsolutions.bananiclub:id/btnBook']")
    	)).click();

    	test.log(Status.PASS, "Clicked on the Booking button");


        // Click on the booking type button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/clBookingType"))).click();
        test.log(Status.PASS, "Clicked on the Booking type");

        
        
        // Find and select a random booking type
        List<WebElement> moreButtons = driver.findElements(By.xpath( "(//android.widget.RadioButton[@resource-id=\"com.btracsolutions.bananiclub:id/radioButton\"])"));
        if (!moreButtons.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(moreButtons.size());
            moreButtons.get(randomIndex).click();
            test.log(Status.PASS, "Clicked on a specific booking type");
        } else {
            test.log(Status.FAIL, "No booking type found.");
        }
        
        Thread.sleep(3000);
        

     // Click on the Calendar
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/tvDate"))).click();
        test.log(Status.PASS, "Clicked on the calendar");

        // Wait for the calendar to be displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/month_view")));
        test.log(Status.PASS, "Calendar displayed");

        // Loop to navigate to a future month
        boolean futureDateFound = false;
        int maxMonthScrolls = 12; // Assume we won't scroll more than 12 months into the future

        for (int i = 0; i < maxMonthScrolls; i++) {
            // Get the dates available in the current calendar month
            List<WebElement> futureDates = driver.findElements(By.xpath("//android.view.View[@resource-id='android:id/month_view']/*[@content-desc]"));
            
            // Check if there are any clickable dates in the current view
            if (!futureDates.isEmpty()) {
                // Select a random date from the current view
                Random rand = new Random();
                int randomIndex = rand.nextInt(futureDates.size());
                
                // Click on the randomly selected date
                futureDates.get(randomIndex).click();
                test.log(Status.PASS, "Random future date selected from the calendar");
                futureDateFound = true;
                break;
            } else {
                // If no future date found, click the next month button to go to the future
                WebElement nextMonthButton = driver.findElement(By.id("android:id/next"));
                nextMonthButton.click();
                test.log(Status.PASS, "Moved to the next month");
                Thread.sleep(2000); // Wait for the next month to load
            }
        }

        // Check if the script found a future date
        if (!futureDateFound) {
            test.log(Status.FAIL, "Failed to find a future date in the calendar after checking multiple months.");
        }

        // Click on the OK button to confirm the date selection
        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"))).click();
        test.log(Status.PASS, "Calendar date confirmed");
        Thread.sleep(3000);
        
        
        // Click on the calendar button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/tvDate"))).click();
        test.log(Status.PASS, "Check cancel button");
        
        // Click on the cancel button
        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button2"))).click();
        test.log(Status.PASS, "Check cancel button");
        
        
        // Click on the time
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/tvTime"))).click();
        test.log(Status.PASS, "Clicked on the Booking time");

        
        // Add a random time 
        List<WebElement> addButtons5 = driver.findElements(By.xpath("(//android.widget.RadioButton[@resource-id=\"com.btracsolutions.bananiclub:id/radioButton\"])"));
        if (!addButtons5.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(addButtons5.size());
            addButtons5.get(randomIndex).click();
            test.log(Status.PASS, "time added");
        } else {
            test.log(Status.FAIL, "failed to add time.");
        }
        
        Thread.sleep(3000);
        
        
        // Click on the club/hall
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/clHall"))).click();
        test.log(Status.PASS, "Clicked on the hall/club");
        
        // Add a random Hall/ Club
        List<WebElement> addButtons1 = driver.findElements(By.xpath("(//android.widget.RadioButton[@resource-id=\"com.btracsolutions.bananiclub:id/radioButton\"])"));
        if (!addButtons1.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(addButtons1.size());
            addButtons1.get(randomIndex).click();
            test.log(Status.PASS, "Hall/club added");
        } else {
            test.log(Status.FAIL, "Failed to add hall/club.");
        }
        Thread.sleep(3000);
        
         scrollDown();
      // Submit the booking without reservation
         driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnBook")).click();
         Thread.sleep(3000);
         test.log(Status.PASS, "Button clicked successfully");

         try {
             // Locate the toast message using MobileBy and getAttribute("text")
             String toast1 = wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.Toast"))).getAttribute("text");

             // Assert the correct message text
             Assert.assertEquals(toast1, "Please enter purpose");
             test.log(Status.PASS, "Booking unsuccessful as expected");
         } catch (Exception e) {
             test.log(Status.FAIL, "Toast message not found or text did not match. Error: " + e.getMessage());
         }


      Thread.sleep(3000);
      // Generate random text for the purpose of reservation
      String randomText = getRandomString(10); // This will generate a random string of 10 characters

      // Send the random text to the purpose field
      wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/etPurpose"))).sendKeys(randomText);
      test.log(Status.PASS, "Added random purpose of reservation: " + randomText);
        
        // Submit the booking without sound system
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnBook"))).click();
        String toast2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
        Assert.assertEquals(toast2, "Please select sound system facility sourcing");
        test.log(Status.PASS, "booked unsuccessfully");
        
        
     // Locate both "Yes" and "No" buttons
        WebElement yesButton = driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvYesSound"));
        WebElement noButton = driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvNoSound"));

        // Create a random instance to choose Yes or No
        Random rand = new Random();
        int randomChoice = rand.nextInt(2); // This will return 0 or 1

        // Randomly click Yes or No
        if (randomChoice == 0) {
            yesButton.click();
            test.log(Status.PASS, "Clicked Yes for sound system");
        } else {
            noButton.click();
            test.log(Status.PASS, "Clicked No for sound system");
        }

        Thread.sleep(3000);
        
        // Submit the booking without decoration
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnBook"))).click();
        String toast3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
        Assert.assertEquals(toast3, "Please select interior decoration sourcing");
        test.log(Status.PASS, "booked unsuccessfully");
        
        // Click on the decoration
        
        
        List<WebElement> addButtons4 = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"com.btracsolutions.bananiclub:id/tv"));
        if (!addButtons4.isEmpty()) {
            Random rand1 = new Random();
            int randomIndex = rand1.nextInt(addButtons4.size());
            addButtons4.get(randomIndex).click();
            test.log(Status.PASS, "Decoration added");
        } else {
            test.log(Status.FAIL, "Failed to add Decoration");
        }
        Thread.sleep(3000);
        
        
        
        
        
//
//        // Try to submit order without selecting delivery zone
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))).click();
//        String toast2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
//        Assert.assertEquals(toast2, "Please select delivery zone");
//        test.log(Status.PASS, "Prompt for delivery zone appeared");

      
//        // Submit the order
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))).click();
//        String toast1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
//        Assert.assertEquals(toast1, "Your order has placed successfully.");
        test.log(Status.PASS, "Order placed successfully");
        
        Thread.sleep(3000);
    }
    
    
 // Method to generate a random string
    public String getRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random rand = new Random();
        
        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(rand.nextInt(characters.length())));
        }
        
        return randomString.toString();
    }
    
}
