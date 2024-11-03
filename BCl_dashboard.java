package BCL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;
import java.net.MalformedURLException;


public class BCl_dashboard extends basicbcl {
	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
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
	
}