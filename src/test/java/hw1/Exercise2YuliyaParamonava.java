package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2YuliyaParamonava {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/yuliyaparamonava/Desktop/B9-Selenium/chromedriver");

		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();

		// Navigate to the URL
		driver.get("https://demo.guru99.com/test/newtours/");

		// Locate Register and click on it
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();

		// Retrieving the page title and verify the Page Title name
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
		String correctPageTitle = "Mercury Tours";
		if (pageTitle.contains(correctPageTitle)) {
			System.out.println("Page title verification PASSED");
		} else {
			System.out.println("Page title verification FAILED");
		}

		// Locate and input FirstName
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Yuliya");

		// Locate and enter LastName
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Paramonava");

		// Locate and input Phone Number
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("+18433159107");

		// Locate and input email
		WebElement emailAddress = driver.findElement(By.id("userName"));
		emailAddress.sendKeys("yuliya.paramonava@gmail.com");

		// Locate and input Address
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 Port ave");

		// Locate and input city
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Alexandria");

		// Locate and input state
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("VA");

		// Locate and input ZipCode
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("22314");

		// Locate and input Username
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("yuliya.paramonava@gmail.com");

		// Locate and input Password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Yuliya123");

		// Locate and input confirm password
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("Yuliya123");

		// Locate and click Submit
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();

		// Locate and retrieve text from Thank you page
		WebElement message = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
		String strMessage = message.getText();
		String rightMessage = "Thank you for registering";

		if (strMessage.contains(rightMessage)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		driver.quit();

	}

}
