package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Exercise1Jeniffer {

	public static void main(String[] args) throws InterruptedException {

		// *** HOMEWORK 1: ***

		// Step 1: Set System property

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rimsky\\Desktop\\Selenium - B9\\" + "chromedriver.exe");

		// Step 2: Create webDriver object

		WebDriver driver = new ChromeDriver();

		// Navigate to url

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		Thread.sleep(3000);

		// Inspect username field

		WebElement userNameField = driver.findElement(By.name("username"));
		userNameField.sendKeys("ntk-admin");

		Thread.sleep(3000);

		// Inspect password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");

		Thread.sleep(3000);

		// Inspect Login Button

		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		Thread.sleep(3000);

		// Inspect Dashboard

		WebElement headerText = driver.findElement(By.tagName("h6"));

		String textStr = headerText.getText();
		System.out.println("Text:" + textStr);

		Thread.sleep(3000);

		driver.quit();

		//Jeniffer
	}

}

	
	

