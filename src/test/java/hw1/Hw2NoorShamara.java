package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2NoorShamara {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\noors\\OneDrive" + "\\Desktop\\Selenium-B9\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();

		WebElement regesterField = driver.findElement(By.linkText("REGISTER"));
		regesterField.click();

		String pageTitle = driver.getTitle();
		String strC = "Mercury Tours";
		System.out.println("Page Title: " + pageTitle);
		if (pageTitle.contains(strC)) {
			System.out.println("Page Title Verification Passed");
		} else {
			System.out.println("Page Title Verification Failed");
		}

		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Noor");

		WebElement lasttNameField = driver.findElement(By.name("lastName"));
		lasttNameField.sendKeys("Hamza");
		
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("1234567890");
		
		WebElement emailFeild = driver.findElement(By.id("userName"));
		emailFeild.sendKeys("noor@yahoo.com");
		
		WebElement addressFeild = driver.findElement(By.name("address1"));
		addressFeild.sendKeys("123drive");
		
		WebElement cityFeild = driver.findElement(By.name("city"));
		cityFeild.sendKeys("Alexandia");

		WebElement stateFeild = driver.findElement(By.name("state"));
		stateFeild.sendKeys("Va");

		WebElement postalCodeFeild = driver.findElement(By.name("postalCode"));
		postalCodeFeild.sendKeys("22345");

		WebElement userNameFeild = driver.findElement(By.id("email"));
		userNameFeild.sendKeys("N.M.R");

		WebElement passswordFeild = driver.findElement(By.name("password"));
	    passswordFeild.sendKeys("meerruby");
	    
	    WebElement confirmPassswordFeild = driver.findElement(By.name("confirmPassword"));
	    confirmPassswordFeild.sendKeys("meerruby");
	    
	    WebElement clickSubmit = driver.findElement(By.name("submit"));
	    clickSubmit.click();
		
	   
	   // driver.get("https://demo.guru99.com/test/newtours/register_sucess.php");
	   WebElement check = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font"));
	   
	   String str = check.getText();
	   String strC2 = "Thank you for registering";
	   if (str.contains(strC2))
	   System.out.println("TESTCASE PASSED");
	   else {
		   System.out.println("TESTCASE FAILED");
	   }
	   //System.out.println("Text: "+ str);

		Thread.sleep(1000);
		driver.quit();
	}
}
