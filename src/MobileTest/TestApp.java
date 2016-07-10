package MobileTest;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestApp {

	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("VERSION", "5.1.1");
		capabilities.setCapability("deviceName", "Emulator");
		capabilities.setCapability("Device", "Android");
		capabilities.setCapability("app", "D:\\SB\\Android Jars\\App\\CamScanner.apk");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		try
		{
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			driver.findElement(By.name("4")).click();
			driver.findElement(By.name("+")).click();
			driver.findElement(By.name("2")).click();
			driver.findElement(By.name("=")).click();
			driver.quit();
		}
		catch(Exception e){
			e.printStackTrace(); 
		

	}

}
}
