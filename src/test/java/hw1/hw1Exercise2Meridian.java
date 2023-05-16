package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw1Exercise2Meridian {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Office\\Desktop\\Selenium\\chromedriver.exe");

		// Step 2. Create an object of WebDriver
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);

		// maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// navigate to page
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);

		// clicking register link
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
		Thread.sleep(3000);

		// verifying the page title
		String pageTitle = driver.getTitle();

		System.out.println("Verifying Page Title:" + " " + pageTitle);
		Thread.sleep(3000);

		// click for the submit button
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);

		// thank you for registering message
		WebElement thankYouMessage = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]"
				+ "/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));

		String thankYou = thankYouMessage.getText();
		System.out.println("Message:" + thankYouMessage);

		String correctMessage = "Thank you for registering";

		if (thankYou.contains(correctMessage)) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
