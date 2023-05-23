package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exercise3YuliyaParamonava {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();

		driver.get(url);

		WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));

		registerLink.click();
		Thread.sleep(2000);

		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		String rightTitle = "nopCommerce demo store. Register";

		if (pageTitle.contains(rightTitle)) {
			System.out.println("Page Title verification PASSED");
		} else {
			System.out.println("Page Title verification FAILED");
		}

		WebElement female = driver.findElement(By.id("gender-female"));
		female.click();

		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Yuliya");
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Paramonava");

		Thread.sleep(2000);

		Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
		day.selectByValue("27");
		Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		month.selectByValue("2");
		Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
		year.selectByValue("1992");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("yuliya12345@gmail.com");

		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("NoorTeck");

		WebElement checkBox = driver.findElement(By.id("Newsletter"));
		checkBox.click();
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("Champ123");

		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("Champ123");
		Thread.sleep(2000);

		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		Thread.sleep(2000);

		WebElement message = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
		String actualMessage = message.getText();
		String rightMessage = "Your registration completed!!!";
		if (actualMessage.equals(rightMessage)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		driver.quit();

	}

}
