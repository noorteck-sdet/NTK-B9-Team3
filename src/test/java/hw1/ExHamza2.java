package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExHamza2 {

	public static void main(String arge[]) throws InterruptedException {

		// Step 1. set system property
		System.setProperty("webdriver.chrome.driver", "/Users/hamzasadeq/Desktop/Selenium-B9//chromedriver");

		// step 2. Create an object of Webdriver
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.manage().window().maximize();

		WebElement Register = driver.findElement(By.linkText("REGISTER"));

		Register.click();
		Thread.sleep(3000);

		WebElement firstName = driver.findElement(By.name("firstName"));

		firstName.sendKeys("Hamza");
		Thread.sleep(3000);

		WebElement lastName = driver.findElement(By.name("lastName"));

		lastName.sendKeys("Sadeq");
		Thread.sleep(3000);

		WebElement phoneNumber = driver.findElement(By.name("phone"));

		phoneNumber.sendKeys("571-315-9212");
		Thread.sleep(3000);

		WebElement email = driver.findElement(By.name("userName"));

		email.sendKeys("hamza_alhaq@yahoo.com");

		Thread.sleep(3000);

		WebElement Address = driver.findElement(By.name("address1"));

		Address.sendKeys("6666 Bowlin ter");

		Thread.sleep(3000);

		WebElement City = driver.findElement(By.name("city"));

		City.sendKeys("Strling");
		Thread.sleep(3000);

		WebElement State = driver.findElement(By.name("state"));

		State.sendKeys("VA");
		Thread.sleep(3000);

		WebElement Postal = driver.findElement(By.name("postalCode"));

		Postal.sendKeys("20165");
		Thread.sleep(3000);

		WebElement UserName = driver.findElement(By.name("email"));

		UserName.sendKeys("hamzasadeq");
		Thread.sleep(3000);

		WebElement Password = driver.findElement(By.name("password"));

		Password.sendKeys("12345");
		Thread.sleep(3000);

		WebElement Comfirm = driver.findElement(By.name("confirmPassword"));

		Comfirm.sendKeys("12345");
		Thread.sleep(3000);

		WebElement submit = driver.findElement(By.name("submit"));

		submit.click();

		WebElement comfirmtion = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String str = comfirmtion.getText();

		if (str.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
