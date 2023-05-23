package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AminaExercise2 {
	
	public static void main(String[] args) throws InterruptedException {

		// 1. Launch chrome browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaiam\\Desktop\\Selenium-B9\\chromedriver.exe");

		// 2. Navigate to https://demo.guru99.com/test/newtours/
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		// 3. Click REGISTER link
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		Thread.sleep(3000);

		// 4. Verify the page title is Mercury Tours
		String pageTitle = driver.getTitle();
		System.out.println("VerifyingPageTitle:" + pageTitle);
		Thread.sleep(3000);

		// 5. Enter first name
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Amina");
		Thread.sleep(3000);

		// 6. Enter last name
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("Chakrouf");
		Thread.sleep(3000);

		// 7. Enter phone number
		WebElement phoneNumber = driver.findElement(By.name("phone"));
		phoneNumber.sendKeys("123456");
		Thread.sleep(3000);

		// 8. Enter email
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("Aminac");
		Thread.sleep(3000);

		// 9. Enter address
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 Rockville");
		Thread.sleep(3000);

		// 10. Enter city
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Rockville");
		Thread.sleep(3000);

		// 11. Enter state
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("MD");
		Thread.sleep(3000);

		// 12. Enter zip code
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("20852");
		Thread.sleep(3000);

		// 13. Enter username
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("Aminac@");
		Thread.sleep(3000);

		// 14. Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("ch235");
		Thread.sleep(3000);

		// 15. Re-Enter password in confirm password field
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("ch235");
		Thread.sleep(3000);

		// 16. Click Submit
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);

		/*
		 * 17. Retrieve the confirmation text message and check if the confirmation text
		 * message contains following phrase: Thank you for registering. a. If it does
		 * then print TESTCASE PASSED b. Otherwise print TESTCASE FAILED
		 */
		WebElement confirmation = driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td"));

		String confStr = confirmation.getText();
		String thanks = "Thank you for registering";

		if (confStr.contains(thanks)) {

			System.out.println("Passed");
		} else {
			System.out.println("Failed");

		}

		Thread.sleep(3000);
		driver.quit();
		
		//Amina

	}

}
