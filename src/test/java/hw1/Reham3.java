package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reham3 {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";
		// 1.lunch chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 2. navigate to the url
		driver.get(url);
		Thread.sleep(5000);

		// 3. click rigster
		WebElement register = driver.findElement(By.linkText("Register"));
		register.click();
		Thread.sleep(3000);

		// 4.page title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		// 5. fill out
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		Thread.sleep(3000);

		WebElement firstName = driver.findElement(By.xpath("//input[@name = 'FirstName']"));
		firstName.sendKeys("Reham");

		Thread.sleep(3000);

		WebElement lastName = driver.findElement(By.xpath("//input[contains(@name, 'LastN')]"));
		lastName.sendKeys("Alrawi");
		Thread.sleep(3000);

		WebElement day = driver.findElement(By.xpath("//select[@name = 'DateOfBirthDay']"));
		Select select = new Select(day);
		select.selectByValue("18");
		Thread.sleep(3000);

		WebElement month = driver.findElement(By.xpath("//select[@name = 'DateOfBirthMonth']"));
		Select select1 = new Select(month);
		select1.selectByValue("1");
		Thread.sleep(3000);

		WebElement year = driver.findElement(By.xpath("//select[@name = 'DateOfBirthYear']"));
		Select select2 = new Select(year);
		select2.selectByValue("1988");
		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("//input[@id = 'Email']"));
		email.sendKeys("abcd@gmail.com");

		Thread.sleep(3000);
		// TagName[contains(@attributeName, ’attributeValue’)]

		// 6. company name
		WebElement companyName = driver.findElement(By.xpath("//input[contains(@id, 'Company')]"));
		companyName.sendKeys("makeup company");
		Thread.sleep(3000);

		// 7. uncheck
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@id, 'Newsletter')]"));
		checkbox.click();
		Thread.sleep(3000);

		// 8. enterPassword
		WebElement password = driver.findElement(By.xpath("//input[contains(@type, 'password')]"));
		password.sendKeys("123456");
		Thread.sleep(2000);

		// 9. re-enterPassword
		WebElement repassword = driver.findElement(By.xpath("//input[contains(@name, 'ConfirmPassword')]"));
		repassword.sendKeys("123456");
		Thread.sleep(2000);

		// 10. click register
		WebElement clickRegister = driver.findElement(By.xpath("//button[text()= 'Register']"));
		clickRegister.click();
		Thread.sleep(2000);

		// 11. confirmationText
		WebElement confirmationText = driver
				.findElement(By.xpath("//html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
		if (confirmationText.equals("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		Thread.sleep(2000);
		String name = "reham";

		driver.quit();

	}

}
