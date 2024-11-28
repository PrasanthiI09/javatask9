package javatask9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1Google {

static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\prabh\\eclipse-workspace\\GuviMavenProject\\chromedriver\\firefoxdriver.exe");
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String myElement = driver.getCurrentUrl();
		driver.navigate().refresh();
		System.out.println("The Url is --- "+myElement);
		driver.close();
		
		
	}

}
