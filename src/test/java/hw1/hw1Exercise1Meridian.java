package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1Exercise1Meridian {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Office\\Desktop\\Selenium\\chromedriver.exe");

		// Step 2. Create an object of WebDriver
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);

		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// navigate to page
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		Thread.sleep(3000);

		// user name entry
		WebElement usernameField = driver.findElement(By.name("username"));

		// send.keys() enters value to the search box
		usernameField.sendKeys("ntk-admin");
		Thread.sleep(3000);

		// password entry
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);

		// clicking login button
		WebElement LogInButton = driver.findElement(By.tagName("button"));
		LogInButton.click();
		Thread.sleep(3000);

		// verifying the header
		WebElement dashboardField = driver.findElement(By.tagName("h6"));

		String headerText = dashboardField.getText();
		System.out.println("Header Text is:" + " " + headerText);

		Thread.sleep(3000);
		driver.quit();
	}

}
