import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestRecharge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 AutomationReadProperties prop = new AutomationReadProperties();
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://justrechargeit.com");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath(prop.getProperty("home.signin"))).click();
	 driver.findElement(By.xpath(prop.getProperty("login.username"))).sendKeys("suhasbhanuse1@gmail.com");
	 driver.findElement(By.xpath(prop.getProperty("login.password"))).sendKeys("987654");
	 driver.findElement(By.xpath(prop.getProperty("login.login"))).click();
	 

	}

}
