package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1NoorShamara {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\noors\\OneDrive" + "\\Desktop\\Selenium-B9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launch chrome browser
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		// Enter ntk-admin in the username field
		WebElement useNameField = driver.findElement(By.name("username"));
		useNameField.sendKeys("ntk-admin");
		Thread.sleep(1000);

		// Enter Ntk-orange!admin.123 in the password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(1000);
		
		// Click Login Button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(1000);

		// Retrieve the Header Text and Verify the header is Dashboard
		WebElement heder = driver.findElement(By.tagName("h6"));
		String str = heder.getText();
		String str2 = "Dashboard";
		if (str.equals(str2)) {
			System.out.println("Header Verification Passed");
		} else {
			System.out.println("Header Verification Failed");
		}

		Thread.sleep(1000);
		// Close the browser
		driver.quit();

	}

}
