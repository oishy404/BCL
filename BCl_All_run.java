package BCL;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class BCl_All_run extends basicbcl {
	@Test
	public void Affliation() throws MalformedURLException, InterruptedException {
		
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
				
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"Affiliation\"]")).click();
				Thread.sleep(3000); 
				

				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"John Doe\"))"));
				Thread.sleep(1000); 
				
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward().scrollIntoView(new UiSelector().text(\"ali Doe\"))"));
				Thread.sleep(1000); 
				
				test.log(Status.PASS, "This step shows successfully find the given club and check the scroll up and scroll down");
				
				WebElement element = driver.findElement(By.id("com.btracsolutions.bananiclub:id/etSearch"));
				element.sendKeys("Test");
				Thread.sleep(3000);
				element.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				test.log(Status.PASS, "This step shows successfully find the given club");
				
				WebElement elementinv = driver.findElement(By.id("com.btracsolutions.bananiclub:id/etSearch"));
				elementinv.sendKeys("egtert");
				Thread.sleep(3000);
				elementinv.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				test.log(Status.PASS, "This step shows successfully not find the given club");
				
				WebElement elementccross = driver.findElement(By.id("com.btracsolutions.bananiclub:id/etSearch"));
				elementccross.sendKeys("egtert");
				Thread.sleep(3000);
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivCross")).click();
				Thread.sleep(3000);
				test.log(Status.PASS, "This step shows successfully the functionality of cross button");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				driver.navigate().back();
				Thread.sleep(3000);
				
				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
					
	}
	@Test
	public void Club() throws MalformedURLException, InterruptedException {
		
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
						

						driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Virgie\"))"));
						Thread.sleep(1000); 
						
						driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward().scrollIntoView(new UiSelector().text(\"Albert\"))"));
						Thread.sleep(1000); 
						
						test.log(Status.PASS, "This step shows successfully find the given club and check the scroll up and scroll down");
						
						driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
						Thread.sleep(3000); 
						
						driver.navigate().back();
						Thread.sleep(3000);
						
						test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
				
	}
	@Test
	public void Committee() throws MalformedURLException, InterruptedException {
		
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
						
						driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llCommittee\"]/android.widget.RelativeLayout")).click();
						Thread.sleep(3000); 
										
						driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
						Thread.sleep(3000); 
						
						driver.navigate().back();
						Thread.sleep(3000);
						
						test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
				
	}
	@Test
	public void Dashboard() throws MalformedURLException, InterruptedException {
		//Create report		
				// creates a toggle for the given test, adds all log events under it    
		        ExtentTest test = extent.createTest("MySecondTest", "Sample description");
	

		Thread.sleep(5000); 
		
//login
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");
		test.log(Status.PASS, "This step shows usage of log(status, details)");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		test.log(Status.PASS, "This step shows usage of log(status, details)");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows usage of log(status, details)");
		Thread.sleep(10000); 


//Check BC club		
			
				WebElement firstImage = driver.findElement(By.xpath("(//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\'com.btracsolutions.bananiclub:id/llMain\'])[2]"));
		        String firstvalue = firstImage.getAttribute("focusable");
		        Assert.assertEquals("true",firstvalue);
		        Thread.sleep(3000);
		        
			    ((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", ((RemoteWebElement) firstImage).getId(),
			    		"direction", "left",
		        	    "percent", 0.75));

		        String secondvalue = firstImage.getAttribute("focusable");
		        Assert.assertEquals("true",secondvalue);
		        test.log(Status.PASS, "This step shows usage of log(status, details)");
		        firstImage.click();
		        Thread.sleep(3000);
		        test.log(Status.PASS, "This step shows usage of log(status, details)");
		
	}
	@Test
	public void Profile() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	
	
		Thread.sleep(5000); 
		
//login

		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(5000); 
		

//profile update with valid information
		
		update Update = new update(driver);
		Update.setUpdate();
		Update.setMob("01700704427");
		Update.setEmail("abcd@gmail.com");
		Update.setSubmit();
		test.log(Status.PASS, "This step shows successfully profile update");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toast, "Success");
		test.log(Status.PASS, "This step shows the toast message for successfully profile update");
		Thread.sleep(5000); 
		
//Back button check and verify updated information 		
		Update.setBack();
		Update.setUpdate();
		Update.setBack();
		test.log(Status.PASS, "This step shows successfully work of Back button and check the updated information");
		
		
//profile update with invalid email
				
				update invalid = new update(driver);
				invalid.setUpdate();
				invalid.setMob("01700704427");
				invalid.setEmail("asfdaf");
				invalid.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid email"); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String toastemail = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(toastemail, "Invalid email address.");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000); 
				invalid.setBack();
	
				
//profile update with invalid phone
			
				update invalidphone = new update(driver);
				invalidphone.setUpdate();
				invalidphone.setMob("fsdfsd");
				invalidphone.setEmail("asfdaf@gmail.com");
				invalidphone.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String toastmob = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(toastmob, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);
				invalidphone.setBack();

				
//profile update with invalid phone and email
				

				update invalidboth = new update(driver);
				invalidboth.setUpdate();
				invalidboth.setMob("fsdfsd");
				invalidboth.setEmail("asfda");
				invalidboth.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone and email");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String toastall = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(toastall, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);
				invalidboth.setBack();


//profile update with empty email
				
				update emptyemail = new update(driver);
				emptyemail.setUpdate();
				emptyemail.setMob("01700704427");
				emptyemail.setEmail("");
				emptyemail.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid email"); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String emptmail = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptmail, "Email address is required.");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000); 
				emptyemail.setBack();
				
//profile update with empty phone
			
				update emptphone = new update(driver);
				emptphone.setUpdate();
				emptphone.setMob("");
				emptphone.setEmail("asfdaf@gmail.com");
				emptphone.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String emptphn = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptphn, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);
				emptphone.setBack();
				
				
//profile update with empty phone and email
				

				update empt = new update(driver);
				empt.setUpdate();
				empt.setMob("");
				empt.setEmail("");
				empt.setSubmit();
				test.log(Status.PASS, "This step shows error message for invalid phone and email");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				String empty = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(empty, "Invalid mobile number");
				test.log(Status.PASS, "This step shows the toast message for successfully profile update");
				Thread.sleep(5000);	
		
	}
	@Test
	public void Login() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	
	

		Thread.sleep(5000); 
		
//invalid password
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows invalid credential login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toast, "invalid mobile or password.");
		test.log(Status.PASS, "This step shows the toast message for invalid password");
		Thread.sleep(5000); 
		
//invalid phone
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows invalid credential login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		String msg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(msg,"Invalid mobile number.");
		test.log(Status.PASS, "This step shows the toast message for invalid mobile");
		
		Thread.sleep(5000); 
		
//invalid phone and password
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows invalid credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String ms = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(ms,"Invalid mobile number.");
				test.log(Status.PASS, "This step shows the toast message for invalid mobile and password");
				
				Thread.sleep(5000); 
				
//empty phone 
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("  ");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows empty phone credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String emptphn = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptphn,"Mobile number is required.");
				test.log(Status.PASS, "This step shows the toast message for empty phone");
				
				Thread.sleep(5000); 
				
//empty password 
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows empty credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String emptpass = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptpass,"Password is required.");
				test.log(Status.PASS, "This step shows the toast message for empaty password");
				
				Thread.sleep(5000); 
				
//empty password and phone
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("  ");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows invalid credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String empt = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(empt,"Mobile number is required.");
				test.log(Status.PASS, "This step shows the toast message for empty mobile and password");
				
				Thread.sleep(5000); 
		
//login with valid credential
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows valid credential login");
		Thread.sleep(10000);
				
	}
	@Test
	public void OTP() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("bcL", "Sample description");
	
		Thread.sleep(5000); 
		

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvForgot")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getText();
		  Thread.sleep(5000);
	        // Extract OTP from the toast message using regex
	        String otp = extractOTPFromToast(toastMessage);

	        // Print the extracted OTP
	        System.out.println("Extracted OTP: " + otp);

	        // Enter the OTP in the OTP field
	        driver.findElement(By.id("com.btracsolutions.bananiclub:id/pinView")).sendKeys(otp);
			driver.findElement(By.id("com.btracsolutions.bananiclub:id/cvConfirm")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
			Assert.assertEquals(toast,"Success");
			test.log(Status.PASS, "This step shows the toast message for successfull login with OTP");
			
			Thread.sleep(5000); 
			
		
	}
	private String extractOTPFromToast(String toastMessage) {
        // Define a regular expression pattern to match "OTP is XXXX" format
        Pattern pattern = Pattern.compile("Otp is (\\d+)");
        Matcher matcher = pattern.matcher(toastMessage);

        if (matcher.find()) {
            // Extract and return the OTP
            return matcher.group(1);
        } else {
            return null; // Handle the case where the OTP format is not found
        }
        
	}
	
	@Test
	public void Wrong_OTP() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("bcL", "Sample description");
	
		Thread.sleep(5000); 
		

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvForgot")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		Thread.sleep(3000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		test.log(Status.PASS, "This step shows the toast message for OTP");
		Thread.sleep(5000);
	        // Extract OTP from the toast message using regex


	        // Enter the OTP in the OTP field
	        driver.findElement(By.id("com.btracsolutions.bananiclub:id/pinView")).sendKeys("3254");
			driver.findElement(By.id("com.btracsolutions.bananiclub:id/cvConfirm")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
			Assert.assertEquals(toast,"OTP not matched.");
			test.log(Status.PASS, "This step shows the toast message for not matching with OTP");
			
			Thread.sleep(5000); 
			
		
	}
	
}