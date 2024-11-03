package BCL;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtendReportEvent {
	ExtentSparkReporter event;

	ExtentReports extentev;

@BeforeSuite
	public void reportsetup() {
	// start reporters
	event = new ExtentSparkReporter("Event.html");
	

    // create ExtentReports and attach reporter(s)
	extentev = new ExtentReports();
	extentev.attachReporter(event);
    



		
	}

@AfterSuite
	public void reportteardown() {
		
    // calling flush writes everything to the log file
	extentev.flush();
	}
}
