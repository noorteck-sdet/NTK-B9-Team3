package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExHamza3 {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		System.setProperty("webdriver.chrome.driver", "/Users/hamzasadeq/Desktop/Selenium-B9//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();

		WebElement Click = driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']"));

		Click.click();
		Thread.sleep(1000);

		String pageTitle = driver.getTitle();

		if (pageTitle.contains("nopCommerce demo store. Register")) {
			System.out.println("Verifation PASSED");
		} else {
			System.out.println("Verifation FAILED");
		}

		WebElement Gender = driver.findElement(By.id("gender-male"));

		Gender.click();
		Thread.sleep(1000);

		WebElement firstName = driver.findElement(By.id("FirstName"));

		firstName.sendKeys("Hamza");

		WebElement lasttName = driver.findElement(By.id("LastName"));

		lasttName.sendKeys("Sadeq");

		Gender.click();
		Thread.sleep(1000);

		Select obj1 = new Select(driver.findElement(By.name("DateOfBirthDay")));

		obj1.selectByVisibleText("1");

		Select obj2 = new Select(driver.findElement(By.name("DateOfBirthMonth")));

		obj2.selectByVisibleText("June");
		Thread.sleep(1000);

		Select obj3 = new Select(driver.findElement(By.name("DateOfBirthYear")));

		obj3.selectByVisibleText("1989");
		Thread.sleep(1000);

		WebElement Email = driver.findElement(By.id("Email"));

		Email.sendKeys("HSJ.hamza@gmail.com");
		Thread.sleep(1000);

		WebElement company = driver.findElement(By.id("Company"));

		company.sendKeys("HSJ");
		Thread.sleep(1000);

		WebElement Password = driver.findElement(By.id("Password"));

		Password.sendKeys("123456");
		Thread.sleep(1000);

		WebElement conPassword = driver.findElement(By.id("ConfirmPassword"));

		conPassword.sendKeys("123456");
		Thread.sleep(1000);

		WebElement clickRegister = driver.findElement(By.id("register-button"));

		clickRegister.click();

		WebElement comfirmtion = driver.findElement(By.xpath("//div[text()='Your registration completed']"));

		String str = comfirmtion.getText();

		if (str.contains("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		driver.quit();

	}

}
