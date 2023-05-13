package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1Hamza {

	public static void main(String arge[]) throws InterruptedException {

		// Step 1. set system property
		System.setProperty("webdriver.chrome.driver", "/Users/hamzasadeq/Desktop/Selenium-B9//chromedriver");

		// step 2. Create an object of Webdriver
		WebDriver driver = new ChromeDriver();
		// Navigate to the URL
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		String pageTitle = driver.getTitle();
		System.out.println("pageTitle" + pageTitle);

		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("username"));

		username.sendKeys("ntk-admin");
		Thread.sleep(3000);

		WebElement password = driver.findElement(By.name("password"));

		password.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);

		WebElement LoginButton = driver.findElement(By.tagName("button"));

		LoginButton.click();
		Thread.sleep(3000);

		
		Thread.sleep(3000);
		driver.quit();

	}

}
