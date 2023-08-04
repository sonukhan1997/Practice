package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scriptno1 {
public static void main(String[] args) throws InterruptedException {
	//step No1 : launch the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5) );
	//Step No2 : enter the main URL
	driver.get("https://demo.actitime.com/");
	String expectedLoginPageTitle = "actiTIME - Login";
	
	if (wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle))){
		System.out.println("the title of login page is correct");
		String actualLoginPageTitle=driver.getTitle();
		System.out.println("actualLoginPageTitle="+actualLoginPageTitle);
		String expectedLoginPageURL = "https://demo.actitime.com/login.do";
		String actualLoginPageURL=driver.getCurrentUrl();
		System.out.println("actualLoginPageURL="+actualLoginPageURL);
		if(wait.until(ExpectedConditions.urlToBe(expectedLoginPageURL))) {
			System.out.println("The URL of the loginpage is correct");
			String actualLoginPageURL1=driver.getCurrentUrl();
			System.out.println("actualLoginPageURL="+actualLoginPageURL1);
			//Step No3 : Enter the Valid Username
			WebElement usernameTextField = driver.findElement(By.id("username"));
			usernameTextField.click();
			usernameTextField.sendKeys("admin");
			//Step NO4 : Enter the valid password
			WebElement pwdTextField=driver.findElement(By.name("pwd"));
			pwdTextField.click();
			pwdTextField.sendKeys("manager");
			//Step No5 : click on login button
			WebElement loginButton=driver.findElement(By.id("loginButton"));
			loginButton.click();
			WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5) );
			String expectedHomePageTitle = "actiTIME - Enter Time-Track";
			
			if(wait.until(ExpectedConditions.titleIs(expectedHomePageTitle))) {
				System.out.println("the title of HomePage is correct.");
				String actualHomePageTitle=driver.getTitle();
				System.out.println("actualHomePageTitle="+actualHomePageTitle);
				String expectedHomePageURL="https://demo.actitime.com/user/submit tt.do";
				
				if(wait.until(ExpectedConditions.urlToBe(expectedHomePageURL))) {
					System.out.println("the URL of homepage is correct");
					String actualHomePageURL=driver.getCurrentUrl();
					System.out.println("actualHomePageURL="+actualHomePageURL);
					WebElement logoutlink=driver.findElement(By.id("logoutLink"));
					logoutlink.isDisplayed();
					logoutlink.click();
					String actualLoginPageTitleAfter = driver.getTitle();
					String expectedLoginPgeTitleAfter="actiTIME - Login";
					System.out.println("actualLoginPageTitleAfter="+actualLoginPageTitleAfter);
					if(actualLoginPageTitleAfter.equals(expectedLoginPgeTitleAfter)) {
						System.out.println("the loginpage title is correct");
						String actualLoginPageURLAfter=driver.getCurrentUrl();
						String expectedLoginPageURLAfter="https://demo.actitime.com/login.do";
						System.out.println("actualLoginPageURLAfter="+actualLoginPageURLAfter);
						if(actualLoginPageURLAfter.equals(actualLoginPageURLAfter)) {
							System.out.println("the url of login page is correct");
							
						}else {
							System.out.println("the login page url is not correct");
						}
						
					}else {
						System.out.println("the login page title is not correct");
					}
				}
			
			}else {
				System.out.println("The title of the home page is incorrect");
				
			}
			
			
		}else {
			System.out.println("The UrL of the login page is not correct");
		}
		
	}else {
		System.out.println("the title of loginpage is incorrect");
	}
		
	
}
}
