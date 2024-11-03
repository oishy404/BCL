package BCL;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {
    ExtentSparkReporter login;  // First report (Login.html)
  // Second report (Event.html)

    ExtentReports extent;

    @BeforeSuite
    public void reportsetup() {
        // Start the first reporter for Login


        // Start the second reporter for Event
    	login = new ExtentSparkReporter("login.html");

        // Create ExtentReports and attach both reporters
        extent = new ExtentReports();

        extent.attachReporter(login);
    }

    @AfterSuite
    public void reportteardown() {
        // Calling flush writes everything to both log files
        extent.flush();
    }
}