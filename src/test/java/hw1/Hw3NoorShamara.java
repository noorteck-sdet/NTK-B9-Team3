package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw3NoorShamara {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demo.nopcommerce.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		// Click Register Link
		WebElement rigester = driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));
		rigester.click();
		Thread.sleep(1000);
		// Verify the page title is nopCommerce demo store. Register
		String verifaying = driver.getTitle();
		String str = "nopCommerce demo store. Register";
		if (verifaying.contains(str)) {
			System.out.println("Verification Pass");
		} else {
			System.out.println("Verification Faile");
		}
		// a. Gender
		WebElement f = driver.findElement(By.id("gender-female"));
		f.click();
		Thread.sleep(1000);
		// First name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Noor");
		Thread.sleep(1000);
		// Last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Shamara");
		Thread.sleep(1000);
		// d. Date of birth
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		Select dayS = new Select(day);
		dayS.selectByValue("30");
		Thread.sleep(1000);
		// d. Date of birth
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select mounthsS = new Select(month);
		mounthsS.selectByValue("4");
		Thread.sleep(1000);
		// d. Date of birth
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select yearS = new Select(year);
		yearS.selectByValue("1983");
		Thread.sleep(1000);
		// e. Email
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("nnnnzo@yahoo.com");
		Thread.sleep(1000);
		// 13. Enter Company name
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("shamara family");
		Thread.sleep(1000);
		// 14. Uncheck Newsletter checkbox
		WebElement newsletterheckbox = driver.findElement(By.id("Newsletter"));
		newsletterheckbox.click();
		Thread.sleep(1000);
		// 15. Enter password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("12121212");
		Thread.sleep(1000);
		// 15. RE-Enter password
		WebElement confurmPassword = driver.findElement(By.id("ConfirmPassword"));
		confurmPassword.sendKeys("12121212");
		Thread.sleep(1000);
		// 17. Click register button
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
		// 18. Retrieve the confirmation text message and check if the confirmation text
		// message equals to
		WebElement regestration = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		String reg = regestration.getText();
		String str1 = "Your registration completed!!!";
		if (reg.equals(str1)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
