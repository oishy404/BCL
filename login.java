package BCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class login extends basicbcl {
	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");
	
	

		Thread.sleep(5000); 
		
//invalid password
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "invalid password");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//		Assert.assertEquals(toast, "invalid password.");
//		test.log(Status.FAIL, "This step shows the toast message for invalid password");
//		Thread.sleep(5000); 
		
		// invalid password
        try {
           

        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "invalid password.");  // Expected to fail here
            test.log(Status.PASS, "Invalid password test passed");

        } catch (AssertionError e) {
            test.log(Status.FAIL, "Invalid password test failed. Expected: 'invalid password.' but found: '" + e.getMessage() + "'");
        }
		Thread.sleep(3000); 

}
	@Test
public void inv_mob() throws MalformedURLException, InterruptedException {
	
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");
	
	

		Thread.sleep(5000); 
	
//invalid phone
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "invalid phone");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		
//		String msg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//		Assert.assertEquals(msg,"Invalid mobile number.");
//		test.log(Status.PASS, "This step shows the toast message for invalid mobile");
		
        try {
            

        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "Invalid mobile number.");  // Expected to fail here
            test.log(Status.PASS, "Invalid phone test passed");

        } catch (AssertionError e) {
            test.log(Status.FAIL, "Invalid mobile number. Expected: 'Invalid mobile number.' but found: '" + e.getMessage() + "'");
        }
		Thread.sleep(3000); 

		
	}
	@Test

public void inv_mob_pass() throws MalformedURLException, InterruptedException {
	//Create report		
	// creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");



	Thread.sleep(5000); 
		
//invalid phone and password
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "invalid phone and password");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
				
//				String ms = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//				Assert.assertEquals(ms,"Invalid mobile number.");
//				test.log(Status.PASS, "This step shows the toast message for invalid mobile and password");
//				
		        try {
		            

		        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		            Assert.assertEquals(toast1, "Invalid mobile number and password.");  // Expected to fail here
		            test.log(Status.PASS, "invalid phone and password test passed");

		        } catch (AssertionError e) {
		            test.log(Status.FAIL, "Invalid mobile number. Expected: 'Invalid mobile number.' but found: '" + e.getMessage() + "'");
		        }
				Thread.sleep(3000); 
}
	@Test

public void emp_mob() throws MalformedURLException, InterruptedException {
	//Create report		
	// creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");



	Thread.sleep(5000); 
//empty phone 
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("  ");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "empty phone ");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
				
//				String emptphn = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//				Assert.assertEquals(emptphn,"Mobile number is required.");
//				test.log(Status.PASS, "This step shows the toast message for empty phone");
				
		        try {
		            

		        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		            Assert.assertEquals(toast1, "Mobile number is required.");  // Expected to fail here
		            test.log(Status.PASS, "empty phone test passed");

		        } catch (AssertionError e) {
		            test.log(Status.FAIL, "Mobile number is required. Expected: 'Invalid mobile number.' but found: '" + e.getMessage() + "'");
		        }
				Thread.sleep(3000); 
}
	@Test

public void emp_pass() throws MalformedURLException, InterruptedException {
	//Create report		
	// creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");



	Thread.sleep(5000); 
//empty password 
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "empty password");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
				
//				String emptpass = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//				Assert.assertEquals(emptpass,"Password is required.");
//				test.log(Status.PASS, "This step shows the toast message for empaty password");
				
	        try {
		            

		        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		            Assert.assertEquals(toast1, "Password is required.");  // Expected to fail here
		            test.log(Status.PASS, "empty password test passed");

		        } catch (AssertionError e) {
		            test.log(Status.FAIL, "Password is required. Expected: 'Invalid mobile number.' but found: '" + e.getMessage() + "'");
		        }
				Thread.sleep(3000); 
}
	@Test
public void both_emp() throws MalformedURLException, InterruptedException {
	//Create report		
	// creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");



	Thread.sleep(5000); 
//empty password and phone
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("  ");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "empty password and phone");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
				
//				String empt = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
//				Assert.assertEquals(empt,"Mobile number is required.");
//				test.log(Status.PASS, "This step shows the toast message for empty mobile and password");
				
	        try {
		            

		        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		            Assert.assertEquals(toast1, "Mobile number is required.");  // Expected to fail here
		            test.log(Status.PASS, "Empty password and phone test passed");

		        } catch (AssertionError e) {
		            test.log(Status.FAIL, "Mobile number is required. Expected: 'Invalid mobile number.' but found: '" + e.getMessage() + "'");
		        }
				Thread.sleep(3000); 
}
	
	@Test
public void valid_both() throws MalformedURLException, InterruptedException {
	//Create report		
	// creates a toggle for the given test, adds all log events under it    
    ExtentTest test = extent.createTest("LOGIN", "Login for the BCL");



	Thread.sleep(5000); 
//login with valid credential
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows valid credential login");
		Thread.sleep(5000);
		
        try {
            

        	String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "Success.");  // Expected to fail here
            test.log(Status.PASS, "Valid Credential test passed");

        } catch (AssertionError e) {
            test.log(Status.FAIL, "Success. Expected: 'Success.' but found: '" + e.getMessage() + "'");
        }
		Thread.sleep(3000); 
		


		
}	
	
} 
