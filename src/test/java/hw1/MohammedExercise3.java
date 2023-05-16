package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MohammedExercise3 {
	public static void main(String[] args) throws InterruptedException {
		// #1 launch chrome browser
		// #2 Navigate to https://demo.nopcommerce.com/
		String url = "https://demo.nopcommerce.com/";

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		// #3 Click Register Link
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		Thread.sleep(1500);

		// #4 Verify the page title is nopCommerce demo store. Register
		String pgTitleStr = driver.getTitle();
		System.out.println(pgTitleStr);
		if (pgTitleStr.contains("nopCommerce demo store. Register")) {
			System.out.println("Intended Page Title : " + pgTitleStr);
		} else {
			System.out.println("Wrong Page title: " + pgTitleStr);
		}
		Thread.sleep(1500);

		// #5 Fill out Your Personal Details Section
		// a. Gender
		WebElement gender = driver.findElement(By.id("gender-male"));
		gender.click();
		Thread.sleep(1500);
		// b. First name
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Mohammed");
		Thread.sleep(1500);

		// c. Last name
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Alzubaidi");
		Thread.sleep(1500);

		// d. Date of birth
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		Select objSelectDay = new Select(day);
		objSelectDay.selectByVisibleText("1");
		Thread.sleep(1500);

		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select objSelectMonth = new Select(month);
		objSelectMonth.selectByVisibleText("October");
		Thread.sleep(1500);

		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select objSelectYear = new Select(year);
		objSelectYear.selectByVisibleText("1990");

		// e. Email
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("maaazs@gmail.com");
		Thread.sleep(1500);

		// #6 Enter Company name
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.sendKeys("Yates");
		Thread.sleep(1500);

		// #7. Uncheck Newsletter checkbox
		WebElement uncheckNewLetter = driver.findElement(By.id("Newsletter"));
		uncheckNewLetter.click();
		Thread.sleep(1500);

		// #8 Enter password
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("M123456789@@");
		Thread.sleep(1500);

		// #9 Enter Username --> should be confirm password
		WebElement confPassword = driver.findElement(By.id("ConfirmPassword"));
		confPassword.sendKeys("M123456789@@");
		Thread.sleep(1500);

		// #10 Click register button
		WebElement clickRegister = driver.findElement(By.id("register-button"));
		clickRegister.click();
		Thread.sleep(1500);

		// #11 Retrieve the confirmation text message and check if the confirmation text
		// message equals to Your registration completed!!!
		// a. If it does then print TESTCASE PASSED
		// b. Otherwise print TESTCASE FAILED
		WebElement confMessage = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
		String confMessageStr = confMessage.getText();
		String messageText = "Your registration completed!!!";

		if (confMessageStr.contains(messageText)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		Thread.sleep(1500);

		driver.quit();

	}
}
