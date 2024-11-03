package BCL;

import java.awt.Dimension;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import static java.time.Duration.ofMillis;




public class Dresscode extends basicbcl {

    @Test
    public void Dress() throws MalformedURLException, InterruptedException {
        // Create report
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

        Thread.sleep(10000);

        // login
        FormPage formPage = new FormPage(driver);
        formPage.setPhone("01700704427");
        formPage.setPassword("123456");
        formPage.setLogin();
        Thread.sleep(10000);

        // Check BC club
        driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.btracsolutions.bananiclub:id/rlMenu']/android.widget.ImageView"))
                .click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.btracsolutions.bananiclub:id/llTheClub")).click();
        Thread.sleep(3000);

        // Guest Rules
        driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id='com.btracsolutions.bananiclub:id/clMain'])[1]"))
                .click();
        Thread.sleep(3000);
        
        
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
        	    "left", 100, "top", 1000, "width", 800, "height", 800,
        	    "direction", "down",
        	    "percent", 3.0
        	));
        
        

    }

    
}
