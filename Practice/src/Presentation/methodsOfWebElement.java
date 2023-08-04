package Presentation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class methodsOfWebElement {
	private static final Duration Duration = null;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		String expectedLoginPageTitle="vtiger";
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("actualLoginPageTitle="+actualLoginPageTitle);
		String expectedLoginPageURL="https://demo.vtiger.com/vtigercrm/";
		String actualLoginPageURL=driver.getCurrentUrl();
		System.out.println("actualLoginPageURL="+actualLoginPageURL);
		if(actualLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("the loginPageTitle is found correct and is verified");
			if(actualLoginPageURL.equals(expectedLoginPageURL)) {
				System.out.println("the Url of LoginPage is found correct and is verified");
				WebElement usernameTextField = driver.findElement(By.id("username"));
				if(usernameTextField.getAttribute("value").isEmpty()) {
				usernameTextField.sendKeys("admin");
				}else {
					usernameTextField.clear();
					usernameTextField.sendKeys("admin");
				}
				WebElement passwordTextField = driver.findElement(By.id("password"));
				passwordTextField.clear();
				passwordTextField.sendKeys("Test@123");
				passwordTextField.sendKeys(Keys.ENTER);
				
				
			}else {
				System.out.println("the url of the LoginPage id found incorrect and is verified");
			}
			
		}else
		{
			System.out.println("The loginPageTitle is found incorrect and is verified");
		}
		
	}
 
	
	
	
	
	
	
	
	
	
}