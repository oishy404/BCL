package BCL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.offset.PointOption;

public class basicbcl extends ExtendReport {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
@SuppressWarnings("deprecation")
@BeforeClass
public void config() throws MalformedURLException {
		
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\anika.hossain\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options option = new UiAutomator2Options();
		
		option.setDeviceName("Pixel 6A API 33");
		option.setApp("D:\\eclipse\\Appium\\src\\test\\java\\Resources\\BCL.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
		
	}
@AfterClass
public void shutdown() {

	driver.quit();
	service.stop();

}

}



//appium inspector setup


//	  "appium:app": "D://eclipse//Appium//src//test//java//Resources//bananiclubv1.0.0.apk",
	//  "appium:devicename": "Pixel 7 Pro API 33",
	  //"appium:platformName": "android",
	  //"appium:automationName": "UIAutomator2"
	