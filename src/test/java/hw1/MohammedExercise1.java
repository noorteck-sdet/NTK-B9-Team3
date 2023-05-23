package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MohammedExercise1 {
	public static void main(String args[]) throws InterruptedException {

		// #1 launch chrome browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\malzu\\OneDrive\\Desktop\\Selenium-B9\\chromedriver.exe");

		// #2 Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/login
		WebDriver driver = new ChromeDriver();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// #3 Enter ntk-admin in the username field

		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("ntk-admin");
		Thread.sleep(3000);

		// #4 Enter Ntk-orange!admin.123 in the password field
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);

		// #4 Click Login Button

		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();
		Thread.sleep(3000);

		// #5 Retrieve the Header Text and Verify the header is Dashboard
		WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
		String dashboardStr = dashboard.getText();
		System.out.println("Header Text: " + dashboardStr);

		Thread.sleep(3000);

		driver.quit();

		// Mohammed

	}
}
