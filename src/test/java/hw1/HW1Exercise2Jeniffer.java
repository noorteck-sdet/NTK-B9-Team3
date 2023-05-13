package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Exercise2Jeniffer {

	public static void main(String[] args) throws InterruptedException {

		// *** HOMEWORK 2 ***

		// Step 1: Set System property

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rimsky\\Desktop\\Selenium - B9\\" + "chromedriver.exe");

		// Step 2: Create webDriver object

		WebDriver driver = new ChromeDriver();

		// Maximize website:

		driver.manage().window().maximize();

		// Go to website:
		driver.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(3000);

		// Inspect Register hyperlink
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();

		Thread.sleep(3000);

		// Inspect pageTitle: Mercury Tours
		String pageTitle = driver.getTitle();
		System.out.println("Page Title" + pageTitle);

		Thread.sleep(3000);

		// Inspect submit button
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();

		Thread.sleep(3000);

		// Retrieve confirmation message and check it contains: "Thank you for
		// registering."

		// WebElement thankYouMessage = driver.findElement(By.tagName("font"));

		WebElement thankYouMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String thankYou = thankYouMessage.getText();
		System.out.println("Mesage:" + thankYou);

		String correctMessage = "Thank you for registering.";

		if (thankYou.contains(correctMessage)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		driver.quit();
		//jeniffer 
	}

}
