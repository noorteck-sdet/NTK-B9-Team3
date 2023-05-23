package hw1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HW2Exercise3Jeniffer {
	
	public static void main(String args[]) throws InterruptedException {

		String url = "https://demo.nopcommerce.com/";

		// Step 1: WebDriver Manager:
		WebDriverManager.chromedriver().setup();

		// Step 2: Create webDriver object
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);

		// Maximize website:
		driver.manage().window().maximize();

		driver.get(url);
		
		//Click Register
	
		WebElement Register = driver.findElement(By.xpath("//a[@class= 'ico-register']"));
		Register.click();
	
		//Verify the page title is nopCommerce demo store. Register:
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
	
		//Fill out Your Personal Details Section
		
		//a. Gender:
		WebElement gender = driver.findElement(By.id("gender-female"));
		gender.click();
		
		//b. First Name:
		WebElement firstName = driver.findElement(By.id("FirstName"));
		firstName.sendKeys("Jen");
		
		//c. Last Name:
		WebElement lastName = driver.findElement(By.id("LastName"));
		lastName.sendKeys("Albur");
		
		Thread.sleep(2000);
		
		//d. Day:
		WebElement day = driver.findElement(By.name("DateOfBirthDay"));
		Select select1 = new Select(day);
		select1.selectByValue("5");
		
		Thread.sleep(2000);
		 
		//e. Month:
		WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
		Select select = new Select (month);
		
		List<WebElement> getMonths = select.getOptions();
		
		for(WebElement DateOfBirthMonth : getMonths) {
			
			String myMonth = DateOfBirthMonth.getText();
			
			if (myMonth.equals("April")) {
				System.out.println("My Month: " + myMonth );
				
				DateOfBirthMonth.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		//f. year:
		WebElement year = driver.findElement(By.name("DateOfBirthYear"));
		Select select3 = new Select(year);
		select3.selectByValue("1987");
		
		Thread.sleep(2000);
		
		//g. Email:
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("nakedflavors3@gmail.com");
		
		//Company Details:
		WebElement companyDetails = driver.findElement(By.id("Company"));
		companyDetails.sendKeys("NoorTeck");
		
		Thread.sleep(2000);
		
		//Uncheck checkbox:
		WebElement newsletterCheck = driver.findElement(By.id("Newsletter"));
		newsletterCheck.click();
		
		//Enter password:
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys("tesTing@23!");
		
		//Confirm password:
		WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
		confirmPassword.sendKeys("tesTing@23!");
		
		//Click Register button 
		WebElement register = driver.findElement(By.id("register-button"));
		register.click();
		
		WebElement message = driver.findElement(By.xpath("//div[@class='result']"));
		String finalMessage = message.getText(); 
		
		if(finalMessage.equals("Your registration completed!!!")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		
	
		
		Thread.sleep(2000);
		driver.quit();
			
		}
}
