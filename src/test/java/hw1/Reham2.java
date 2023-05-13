package hw1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reham2 {
	public static void main(String[] args) throws InterruptedException {
		//1 lunch chrome 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\19495\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		//2. navigate to the URL
		driver.get("https://demo.guru99.com/test/newtours/");
		//3. click register
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		Thread.sleep(3000);
		//4. verifying 
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		if (pageTitle.contains("Mercury Tours")) {
			System.out.println(" page title verification passed");
		} else {
			System.out.println(" page title verification failed ");
		}
		//5. firstname 
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("Reham");
		Thread.sleep(3000);
		
		//6. lastname 
		WebElement lastName = driver.findElement(By.name("lastName"));
	     lastName.sendKeys("Alrawi");
		Thread.sleep(3000);
		
		//7. phone number
		WebElement phoneNum = driver.findElement(By.name("phone"));
		phoneNum.sendKeys("780-565-1234");
		Thread.sleep(3000);
		
		//8. email
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("alrawi@yahoo.com");
		Thread.sleep(3000);
		
		//9. address 
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("123 abc drive");
		Thread.sleep(3000);
		
		//10. enter city 
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("lorton");
		Thread.sleep(3000);
		
		//11. enter state 
		WebElement state = driver.findElement(By.name("state"));
		state.sendKeys("VA");
		Thread.sleep(3000);
		
		//12. zipcode 
		WebElement zipCode = driver.findElement(By.name("postalCode"));
		zipCode.sendKeys("22079");
		Thread.sleep(3000);
		
		//13. enter userName 
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("rAlrawi");
		Thread.sleep(3000);
		
		//14. password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("r123456");
		Thread.sleep(3000);
		
		//15. re enterpassword
		WebElement reEnterPassword = driver.findElement(By.name("confirmPassword"));
		reEnterPassword.sendKeys("r123456");
		Thread.sleep(3000);
		
		//16. click submit
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		//17. retrieve the conformation
		WebElement confirmation = driver.findElement(By.tagName("body"));
		String text = confirmation.getText();
		
		if (text.contains("Thank you for registering.")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		// 18. close the browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
