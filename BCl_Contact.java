package BCL;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

public class BCl_Contact extends basicbcl {

    @SuppressWarnings("deprecation")
    @Test
    public void News() throws MalformedURLException, InterruptedException {
        
        // Create report        
        ExtentTest test = extent.createTest("Contact", "Check Contact works or not");
      
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

    
 // Generate a random string of numbers with a specific length
    public String getRandomPhoneNumber(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Ensure the first digit is not zero
        sb.append(random.nextInt(9) + 1);

        // Append the remaining digits
        for (int i = 1; i < length; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }

    // Generate a random email address
    public String getRandomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        // Randomly generate a username
        for (int i = 0; i < 8; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        sb.append("@example.com");
        return sb.toString();
    }

    // Generate a random name (could be a simple random string for now)
    public String getRandomName() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }

        return sb.toString();
    }


    // Method to click a random news link
    public void clickRandomNewsLink() throws InterruptedException {
        // Create report        
        ExtentTest test = extent.createTest("Contact", "Check Contact works or not");
      
        Thread.sleep(5000); 
        // Click on the News section
        driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llContactUs\"]/android.widget.RelativeLayout"))
              .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows successfully click on the Contact Button"); 

        // Find all news links
        driver.findElement(By.id("com.btracsolutions.bananiclub:id/etEmail")).sendKeys(getRandomEmail());
        test.log(Status.PASS, "This step shows successfully giving input");
        driver.findElement(By.id("com.btracsolutions.bananiclub:id/etName")).sendKeys(getRandomName());
        test.log(Status.PASS, "This step shows successfully giving input");
        driver.findElement(By.id("com.btracsolutions.bananiclub:id/etPhone")).sendKeys(getRandomPhoneNumber(11));
        test.log(Status.PASS, "This step shows successfully giving input");
        driver.findElement(By.id("com.btracsolutions.bananiclub:id/etMsg")).sendKeys(getRandomName()); // Using name as a simple random message
        test.log(Status.PASS, "This step shows successfully giving input");
        driver.findElement(By.id( "com.btracsolutions.bananiclub:id/btnSubmit")).click();
        test.log(Status.PASS, "This step shows successfully giving input");
        Thread.sleep(3000);
        
 // Scroll down if necessary to bring more links into view
        scrollDown();
        scrollUp();
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
				"left", 100, "top", 1000, "width", 800, "height", 800,
			    "direction", "up",
			    "percent", 3.0
			));  // Replaced Thread.sleep with custom wait method
		
		Thread.sleep(3000); // Replaced Thread.sleep with custom wait method
    }
}
