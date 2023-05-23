package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HW2Exercise3Meridian {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		// this step here does all the work!!
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		driver.get(url);

		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));

		registerLink.click();
		Thread.sleep(2000);

		// here we are getting the page title
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		String rightTitle = "nopCommerce demo store. Register";

		// here we have to verify if the page title is the same as the requirement
		if (pageTitle.contains(rightTitle)) {
			System.out.println("Page Title verification PASSED");
		} else {
			System.out.println("Page Title verification FAILED");
		}

		// Gender box
		WebElement female = driver.findElement(By.id("gender-female"));
		female.click();
		Thread.sleep(2000);

		// first name box select/enter value
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("MERIDIAN");
		Thread.sleep(2000);

		// last name box select/enter value
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("VALVERDE");
		Thread.sleep(2000);

		// here we have to use the select class
		Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
		day.selectByValue("19");
		Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		month.selectByValue("1");
		Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		year.selectByValue("1988");
		Thread.sleep(2000);

		// email box and enter value
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("my2luvz.8811@gmail.com");
		Thread.sleep(2000);

		// entering company name
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("SDET BootCamp");
		Thread.sleep(2000);

		// unchecking newsletter check box
		WebElement checkBox = driver.findElement(By.id("Newsletter"));
		checkBox.click();
		Thread.sleep(2000);

		// enter password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Iwant2BanSDET");

		// confirming password
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("Iwant2BanSDET");
		Thread.sleep(2000);

		// click on the register button
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		Thread.sleep(2000);

		// Retrieving confirmation message
		WebElement confmessage = driver.findElement(By.xpath("//div[text()='Your registration completed']"));

		String actualMessage = confmessage.getText();
		String correctMessage = "Your registration completed";
		if (actualMessage.equals(correctMessage)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
