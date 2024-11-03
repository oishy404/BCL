package BCL;

import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

public class BCl_Order extends basicbcl {

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
        Thread.sleep(5000); 

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

    // Method to click a random menu 
    public void clickRandomNewsLink() throws InterruptedException {
    	
    	// Create report        
        ExtentTest test = extent.createTest("Order", "Check the Menu shows");
      
        Thread.sleep(5000); 
        // Click on the Order section
        
        driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llOrder\"]/android.widget.RelativeLayout"))
              .click();
        Thread.sleep(3000);
        test.log(Status.PASS, "This step shows by click on the Order");
        scrollDown(); // Scroll down if necessary to bring more links into view
        
        scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
       
        

//		//cart without selection
//		  driver.findElement(By.xpath("//android.widget.TextView[@text=\"View your cart\"]")).click();
//		  String toast3 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//        Assert.assertEquals(toast3, "Cart is empty");  // Expected to fail here
//        test.log(Status.PASS, "Cart is empty");
//        Thread.sleep(5000); 
		  
        
		// Find all buttons with the same resource ID for Details
		List<WebElement> moreButtons = driver.findElements(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.btracsolutions.bananiclub:id/list_day_name\"])"));

		// Click the first button if it exists
		  if (!moreButtons.isEmpty()) {
	            Random rand = new Random();
	            int randomIndex = rand.nextInt(moreButtons.size()); // Select a random index
	            moreButtons.get(randomIndex).click();  // Click the randomly selected link
	            
	            Thread.sleep(3000);
		    test.log(Status.PASS, "This step shows by clicking on specific menu category shows the details");// Clicks the first "More" button
		} else {
		    System.out.println("No menu category found.");
		    test.log(Status.FAIL, "No menu category found.");
		}
		Thread.sleep(5000); 
		
		
		scrollDown(); // Scroll down if necessary to bring more links into view
        scrollUp();
        test.log(Status.PASS, "This step shows by scroll down and up works");
        
        Thread.sleep(5000); 

        
    	// Find all buttons with the same resource ID for Details
		List<WebElement> add = driver.findElements(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivAdd\"])"));

		// Click the add if it exists
		if (!add.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(add.size()); // Select a random index
            add.get(randomIndex).click();  // Click the randomly selected link
            
		    test.log(Status.PASS, "This step shows by clicking on specific item is selected");// Clicks the first "More" button
		} else {
		    System.out.println("No item selected");
		    test.log(Status.FAIL, "No item selected");
		}
		Thread.sleep(5000); 
		
		// Find all buttons with the same resource ID for Details
				List<WebElement> add1 = driver.findElements(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivAdd\"])"));
		
		// Click the add another if it exists
		if (!add1.isEmpty()) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(add1.size()); // Select a random index
            add1.get(randomIndex).click();  // Click the randomly selected link
		    test.log(Status.PASS, "This step shows by clicking on specific table is selected");// Clicks the first "More" button
		} else {
		    System.out.println("No table selected");
		    test.log(Status.FAIL, "No table selected");
		}
		Thread.sleep(3000); 
		
		
		// Find all buttons with the same resource ID for Details
		List<WebElement> rmv = driver.findElements(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMinus\"])"));
		// Click the remove product if it exists
		if (!rmv.isEmpty()) {
            Random rmv1 = new Random();
            int randomIndex = rmv1.nextInt(rmv.size()); // Select a random index
            rmv.get(randomIndex).click();  // Click the randomly selected link
		    test.log(Status.PASS, "This step shows by clicking on removed");// Clicks the first "More" button
		} else {
		    System.out.println("No remove selected");
		    test.log(Status.FAIL, "No remove selected");
		}
		Thread.sleep(5000); 
		
		
		//cart
		  driver.findElement(By.xpath("//android.widget.TextView[@text=\"View your cart\"]"))
          .click();
		  Thread.sleep(5000);
		  test.log(Status.PASS, "This step shows by click on the Cart");
		  Thread.sleep(5000); 
		  
//		//submit kitchen without any selection 
//	        driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))
//	        .click();
//			  String toast2 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//	          Assert.assertEquals(toast2, "Please select delivery zone.");  // Expected to fail here
//	          test.log(Status.PASS, "Please select delivery zone.");
//
//	        Thread.sleep(5000);
		  
		//Location
		  driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.btracsolutions.bananiclub:id/tvDeliveryZone\"]"))
          .click();
		  Thread.sleep(5000);
		  test.log(Status.PASS, "This step shows by click on the Delivery zone");
    
		  //Select random zone
			// Find all buttons with the same resource ID for Details
			List<WebElement> zone = driver.findElements(By.xpath("(//android.widget.RadioButton[@resource-id=\"com.btracsolutions.bananiclub:id/radioButton\"])"));

			// Click the add if it exists
			if (!zone.isEmpty()) {
	            Random rand = new Random();
	            int randomIndex = rand.nextInt(zone.size()); // Select a random index
	            zone.get(randomIndex).click();  // Click the randomly selected link
			    test.log(Status.PASS, "This step shows by clicking on specific zone is selected");// Clicks the first "More" button
			} else {
			    System.out.println("No zone selected");
			    test.log(Status.FAIL, "No zone selected");
			}
			Thread.sleep(5000); 

			
//			//submit kitchen without any table
//	        driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))
//	        .click();
//			  String toast5 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//	          Assert.assertEquals(toast5, "Please select table no");  // Expected to fail here
//	          test.log(Status.PASS, "Please select table no");
//
//	        Thread.sleep(3000);
			
	        
			//Table
			  driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvTableNo"))
	          .click();
			  Thread.sleep(3000);
			  test.log(Status.PASS, "This step shows by click on the Table");
	    
			  //Select random zone
				// Find all buttons with the same resource ID for Details
				List<WebElement> table = driver.findElements(By.xpath("(//android.widget.RadioButton[@resource-id=\"com.btracsolutions.bananiclub:id/radioButton\"])"));

				// Click the add if it exists
				if (!table.isEmpty()) {
		            Random rand = new Random();
		            int randomIndex = rand.nextInt(table.size()); // Select a random index
		            table.get(randomIndex).click();  // Click the randomly selected link
				    test.log(Status.PASS, "This step shows by clicking on specific table is selected");// Clicks the first "More" button
				} else {
				    System.out.println("No table selected");
				    test.log(Status.FAIL, "No table selected");
				}
				Thread.sleep(5000); 
				

//				//cart without selection
//				  driver.findElement(By.xpath("//android.widget.TextView[@text=\"View your cart\"]")).click();
//				  String toast3 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//		        Assert.assertEquals(toast3, "Cart is empty");  // Expected to fail here
//		        test.log(Status.PASS, "Cart is empty");
//		        Thread.sleep(5000); 
				  

		//
		  
      
        
		//submit kitchen
        driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnSubmit"))
        .click();
		  test.log(Status.PASS, "This step shows by click on the submit kitchen");
		  String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
          Assert.assertEquals(toast1, "Your order has placed successfully.");  // Expected to fail here
          test.log(Status.PASS, "Order placed successfully");

        Thread.sleep(3000);
        
//        try {
//            
//
//        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//            Assert.assertEquals(toast1, "Your order has placed successfully.");  // Expected to fail here
//            test.log(Status.PASS, "Order placed successfully");
//
//        } catch (AssertionError e) {
//            test.log(Status.FAIL, "Please select delivery zone. Expected: 'Invalid mobile number.' but found: '" + e.getMessage() + "'");
//        }
//		Thread.sleep(3000); 


      

        

        
        
    }
}
