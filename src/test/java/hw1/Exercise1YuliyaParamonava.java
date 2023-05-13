package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1YuliyaParamonava {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/yuliyaparamonava/Desktop/B9-Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Navigate to the URL
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");

		// Maximize the browser
		driver.manage().window().maximize();

		// Locate username field by Name locator
		WebElement username = driver.findElement(By.name("username"));
		// Enter ntk-admin to username field
		username.sendKeys("ntk-admin");

		// Enter password in the password field: Ntk-orange!admin.123
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");

		// Locate login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		Thread.sleep(5000);

		// Retrieve the Header Text and verify Header Text

		WebElement headerText = driver.findElement(By.tagName("h6"));
		String headerTextStr = headerText.getText();
		String correctHeader = "Dashboard";
		System.out.println(headerTextStr);
		if (headerTextStr.equals(correctHeader)) {
			System.out.println("Header Text verification PASSED");
		} else {
			System.out.println("Header verification FAILED");
		}

		driver.quit();

	}
}
