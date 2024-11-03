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

public class BCl_Order_update extends basicbcl {

    @Test
    public void facility() throws MalformedURLException, InterruptedException {
        
        // Create report        
        ExtentTest test = extent.createTest("Login", "Facilities");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explicit wait instance

        // Login
        FormPage formPage = new FormPage(driver);
        
        // Wait for phone input to be visible and interact with it
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")));
        phoneInput.sendKeys("01700704427");

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

        // Click on the Order section
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id='com.btracsolutions.bananiclub:id/llOrder']/android.widget.RelativeLayout"))).click();
        test.log(Status.PASS, "Clicked on the Order section");

        scrollDown(); // Scroll down if necessary to bring more links into view
        scrollUp();



        // Find and click a random menu category
        List<WebElement> moreButtons = driver.findElements(By.xpath("//android.widget.LinearLayout[@resource-id='com.btracsolutions.bananiclub:id/list_day_name']"));
        if (!moreButtons.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(moreButtons.size());
            moreButtons.get(randomIndex).click();
            test.log(Status.PASS, "Clicked on a specific menu category");
        } else {
            test.log(Status.FAIL, "No menu category found.");
        }
        
        
      // Check if cart is empty
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='View your cart']"))).click();
      String toast3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
      Assert.assertEquals(toast3, "Cart is empty");
      test.log(Status.PASS, "Cart is empty");
        

        // Add a random product to the cart
        List<WebElement> addButtons = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.btracsolutions.bananiclub:id/ivAdd']"));
        if (!addButtons.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(addButtons.size());
            addButtons.get(randomIndex).click();
            test.log(Status.PASS, "Product added to the cart");
        } else {
            test.log(Status.FAIL, "No product found to add.");
        }
        
        // Add a random product to the cart
        List<WebElement> addButtons1 = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.btracsolutions.bananiclub:id/ivAdd']"));
        if (!addButtons.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(addButtons1.size());
            addButtons1.get(randomIndex).click();
            test.log(Status.PASS, "Product added to the cart");
        } else {
            test.log(Status.FAIL, "No product found to add.");
        }

        // Remove a random product from the cart
        List<WebElement> removeButtons = driver.findElements(By.xpath("//android.widget.ImageView[@resource-id='com.btracsolutions.bananiclub:id/ivMinus']"));
        if (!removeButtons.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(removeButtons.size());
            removeButtons.get(randomIndex).click();
            test.log(Status.PASS, "Product removed from the cart");
        } else {
            test.log(Status.FAIL, "No product found to remove.");
        }

        // Click on View Cart
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='View your cart']"))).click();
        test.log(Status.PASS, "Clicked on View Cart");

        // Try to submit order without selecting delivery zone
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))).click();
        String toast2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
        Assert.assertEquals(toast2, "Please select delivery zone");
        test.log(Status.PASS, "Prompt for delivery zone appeared");

        // Select random delivery zone
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/tvDeliveryZone"))).click();
        List<WebElement> zones = driver.findElements(By.xpath("//android.widget.RadioButton[@resource-id='com.btracsolutions.bananiclub:id/radioButton']"));
        if (!zones.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(zones.size());
            zones.get(randomIndex).click();
            test.log(Status.PASS, "Selected a random delivery zone");
        } else {
            test.log(Status.FAIL, "No zone found to select.");
        }

        // Try to submit order without selecting table number
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))).click();
        String toast5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
        Assert.assertEquals(toast5, "Please select table no");
        test.log(Status.PASS, "Prompt for table number appeared");

        // Select random table number
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/tvTableNo"))).click();
        List<WebElement> tables = driver.findElements(By.xpath("//android.widget.RadioButton[@resource-id='com.btracsolutions.bananiclub:id/radioButton']"));
        if (!tables.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(tables.size());
            tables.get(randomIndex).click();
            test.log(Status.PASS, "Selected a random table number");
        } else {
            test.log(Status.FAIL, "No table found to select.");
        }
        Thread.sleep(3000);
        
        // Submit the order
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))).click();
        String toast1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//android.widget.Toast)[1]"))).getAttribute("name");
        Assert.assertEquals(toast1, "Your order has placed successfully.");
        test.log(Status.PASS, "Order placed successfully");
        
        Thread.sleep(3000);
    }
}
