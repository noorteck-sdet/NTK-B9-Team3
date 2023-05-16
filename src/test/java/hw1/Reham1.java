package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reham1 {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\19495\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://ntkhr.noortecktraining.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement enterUserName=driver.findElement(By.name("username"));
		enterUserName.sendKeys("ntk-admin");
		Thread.sleep(3000);
		
		WebElement enterPassword=driver.findElement(By.name("password"));
		enterPassword.sendKeys("Ntk-orange!admin.123");
		Thread.sleep(3000);
		WebElement clickButton =driver.findElement(By.tagName("button"));
		
		clickButton.click();
		
		Thread.sleep(3000);
		
		
		WebElement retHeader =driver.findElement(By.tagName("h6"));
		
		String header =retHeader.getText();
		
		if(header.equals("Dashboard")) {
			
			System.out.println("Header Verfication Passed");
			
			
		} else {
			
			System.out.println("Header Verficcation Failed");
		}
		
		
		
		driver.quit();
		

	}

}
