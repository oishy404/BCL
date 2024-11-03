package BCL;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.Carcopolo.framework_design.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.offset.PointOption;

public class BCl_election extends basicbcl {
	@SuppressWarnings("deprecation")
	@Test
	public void Apptest() throws InterruptedException, IOException {
		
//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Election", "Check all the modules works");
  
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
				 test.log(Status.PASS, "This step shows successfully click on the BC Club Button");
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"Election\"]")).click();
				Thread.sleep(3000); 
				 test.log(Status.PASS, "This step shows successfully click on the Election Button");
				

//Election board
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[1]")).click();
				Thread.sleep(5000); 
				test.log(Status.PASS, "This step shows successfully click on the Election Board Button");
		        scrollDown();
		        
		        scrollUp();
				test.log(Status.PASS, "This step shows successfully click on the Scroll Up and Down");
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"taste\"))"));
//				Thread.sleep(10000); 
//	

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
					
				//Election Appeal Board
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[2]")).click();
				Thread.sleep(10000);
				 test.log(Status.PASS, "This step shows successfully click on the Election Appeal Button");
		        scrollDown();
		        scrollUp();
				test.log(Status.PASS, "This step shows successfully click on the Scroll Up and Down");	
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward().scrollIntoView(new UiSelector().text(\"DILAN\"))"));
//				Thread.sleep(10000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Final List of Candidates President
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
				Thread.sleep(10000); 
				 test.log(Status.PASS, "This step shows successfully click on the Final List of Candidates President Button");
		        scrollDown();
		        scrollUp();
				test.log(Status.PASS, "This step shows successfully click on the Scroll Up and Down");
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Final List of Candidates EC
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Final List of Candidates EC Button");
		        scrollDown();
		        scrollUp();
				test.log(Status.PASS, "This step shows successfully click on the Scroll Up and Down");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Code of Conduct
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
				Thread.sleep(3000); 

				test.log(Status.PASS, "This step shows successfully click on the Code of Conduct Button");
				// Execute the adb command to simulate the back button press
				Runtime.getRuntime().exec("adb shell input keyevent 4");
				Thread.sleep(3000);

				// Additional back navigation if necessary
				driver.navigate().back();
			
 
				
//				//Final Result
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[6]")).click();
				Thread.sleep(5000); 
				test.log(Status.PASS, "This step shows successfully click on the Final Result Button");
//				
//				// Execute the adb command to simulate the back button press
				Runtime.getRuntime().exec("adb shell input keyevent 4");
				Thread.sleep(3000);
//				
//								// Additional back navigation if necessary
				driver.navigate().back();
				
//				//Rules
//				
				driver.findElement(By.xpath( "(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[7]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Rules Button");
//				// Execute the adb command to simulate the back button press
				Runtime.getRuntime().exec("adb shell input keyevent 4");
				Thread.sleep(3000);
//			
//				
				driver.navigate().back();
				
//				//Schedule
//				
				driver.findElement(By.xpath( "(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[8]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Schedule Button");
//				// Execute the adb command to simulate the back button press
				Runtime.getRuntime().exec("adb shell input keyevent 4");
				Thread.sleep(3000);

				driver.navigate().back();
				
				
//				//Rules
//				
				driver.findElement(By.xpath( "(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[9]")).click();
				Thread.sleep(3000); 
				test.log(Status.PASS, "This step shows successfully click on the Rules Button");
//				// Execute the adb command to simulate the back button press
				Runtime.getRuntime().exec("adb shell input keyevent 4");
				Thread.sleep(3000);

				driver.navigate().back();
//				
//				Thread.sleep(3000); 
	

    
		
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