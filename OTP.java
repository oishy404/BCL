package BCL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTP extends basicbcl {
	

	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("OTP", "Check the OTP");
	
		Thread.sleep(5000); 
		

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLoginWithOtp")).click();
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
	
}