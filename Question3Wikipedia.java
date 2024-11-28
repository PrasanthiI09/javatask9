package javatask9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Question3Wikipedia {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prabh\\eclipse-workspace\\GuviMavenProject\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		Thread.sleep(100);		
		WebElement myElement=driver.findElement(By.id("searchInput"));
		myElement.sendKeys("Artificial Intelligence");
		myElement.sendKeys(Keys.ENTER);
		myElement=driver.findElement(By.xpath("//span[text()='View history']"));
		myElement.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
}}