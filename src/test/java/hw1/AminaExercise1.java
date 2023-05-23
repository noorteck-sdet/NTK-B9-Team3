package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AminaExercise1 {
	
	
	public static void main(String[] args) throws InterruptedException {

		// 1. Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaiam\\Desktop\\Selenium-B9\\chromedriver.exe");

		// 2. Navigate to https://ntkhr.noortecktraining.com/web/index.php/auth/login
		WebDriver driver = new ChromeDriver();

		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// 3. Enter ntk-admin in the username field
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("ntk-admin");
		Thread.sleep(3000);

		// 4. Enter Ntk-orange!admin.123 in the password field
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);

		// 5.Click Login Button
		WebElement LoginButton = driver.findElement(By.tagName("button"));
		LoginButton.click();

		// 6. Retrieve the Header Text and Verify the header is Dashboard
		WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
		String dashboardStr = dashboard.getText();
		System.out.println("Header Text: " + dashboardStr);

		Thread.sleep(3000);
		driver.quit();
		
		//Amina

	}

}


