package RAJESHSIRRIVISION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insta1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
	driver.get("https://www.instagram.com/");
	WebElement usernameTextField = driver.findElement(By.name("username"));
	usernameTextField.click();
	usernameTextField.sendKeys("9449060109");
	WebElement passwordTextField = driver.findElement(By.name("password"));
	passwordTextField.click();
	passwordTextField.sendKeys("Powerstar@1997");
	WebElement showButton = driver.findElement(By.xpath("//button[text()='Show']"));
	showButton.click();
	WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));
	loginButton.click();
	WebElement notNowButton = driver.findElement(By.xpath("//button[text()='Not Now']"));
	notNowButton.click();
	Thread.sleep(3000);
	
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
	driver.switchTo().activeElement().sendKeys("rahul950497");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@role='none']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Message']")).click();
	Thread.sleep(3000);
	WebElement msgtextfield = driver.findElement(By.xpath("//textarea[@placeholder='Message...']"));
    msgtextfield.sendKeys("hi....from automation script");
    actions.sendKeys(Keys.ENTER).perform();
    driver.findElement(By.xpath("//div[text()='More']")).click();
    driver.findElement(By.xpath("//div[text()='Log out']")).click();
    driver.manage().window().minimize();
    driver.quit();
}
}
