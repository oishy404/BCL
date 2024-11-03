package BCL;

import java.net.MalformedURLException;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.collect.ImmutableMap;

public class BCl_affliation extends basicbcl {
    ExtentReports extent;
    ExtentTest test;

    @BeforeSuite
    public void reportsetup() {
        ExtentSparkReporter login = new ExtentSparkReporter("Login.html");
        ExtentSparkReporter event = new ExtentSparkReporter("Event.html");

        extent = new ExtentReports();
        extent.attachReporter(login, event);
    }

    @Test
    public void login() throws MalformedURLException, InterruptedException {
        test = extent.createTest("BCL - Login", "Affiliation");

        FormPage formPage = new FormPage(driver);
        formPage.setPhone("01700704427");
        formPage.setPassword("123456");
        formPage.setLogin();
        Thread.sleep(5000);

        try {
            String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "invalid password.");
            test.log(Status.PASS, "Invalid password test passed");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Invalid password test failed. Expected: 'invalid password.' but found: '" + e.getMessage() + "'");
        }
    }

    @Test
    public void Affilation() throws MalformedURLException, InterruptedException {
        test = extent.createTest("BCL - Affiliation", "Affiliation");

        driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id='com.btracsolutions.bananiclub:id/rlMenu']/android.widget.ImageView")).click();
        Thread.sleep(3000);

        try {
            String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "Success");
            test.log(Status.PASS, "Menu Worked");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to click Menu");
        }

        driver.findElement(By.xpath("//android.widget.TextView[@text='Affiliation']")).click();
        Thread.sleep(3000);

        try {
            String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "Success");
            test.log(Status.PASS, "Affiliation Worked");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to click Affiliation");
        }

        driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id='com.btracsolutions.bananiclub:id/clMain'])[1]")).click();
        Thread.sleep(3000);

        try {
            String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "Success");
            test.log(Status.PASS, "Affiliation Club Worked");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to click Affiliation Club");
        }

        driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
        Thread.sleep(3000);

        scrollDown();
        scrollUp();

        driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id='com.btracsolutions.bananiclub:id/clMain'])[2]")).click();
        Thread.sleep(3000);

        try {
            String toast1 = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
            Assert.assertEquals(toast1, "Success");
            test.log(Status.PASS, "Reciprocal Worked");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Failed to click Reciprocal");
        }

        scrollDown();
        scrollUp();

        driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Test Case Failed is " + result.getName());
            test.log(Status.FAIL, "Test Case Failed is " + result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Test Case Skipped is " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Test Case Passed is " + result.getName());
        }
    }

    @AfterSuite
    public void reportteardown() {
        extent.flush();
    }

    private void scrollDown() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
            "left", 100, "top", 300, "width", 800, "height", 1500,
            "direction", "down",
            "percent", 90.0
        ));
        Thread.sleep(3000);
    }

    private void scrollUp() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
            "left", 100, "top", 300, "width", 800, "height", 1500,
            "direction", "up",
            "percent", 90.0
        ));
        Thread.sleep(3000);
    }
}
