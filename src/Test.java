import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) {
		try{
		//System.setProperty("webdriver.chrome.driver", "D:\\SB\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.id("photo")).click();
		Runtime.getRuntime().exec("D:\\SB\\FileUpload.exe");
		
		

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}}}


