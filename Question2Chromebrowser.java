package javatask9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2Chromebrowser {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prabh\\eclipse-workspace\\GuviMavenProject\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		WebElement myElement = driver.findElement(By.tagName("title"));
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("title of the page is :: " + title);
		if (title.equalsIgnoreCase("STORE")) {

			System.out.println("Page landed on correct Website ---Title is -- "+title);
		} else {

			System.out.println("Page not landed on correct Website ---Title is -- "+title);
		}
		driver.close();
	}

}
