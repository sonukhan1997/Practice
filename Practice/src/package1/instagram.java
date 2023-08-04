package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class instagram {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.instagram.com/");
	WebElement usernameTextField = driver.findElement(By.name("username"));
	usernameTextField.sendKeys("9449060109");
	WebElement passwordTextField = driver.findElement(By.name("password"));
	passwordTextField.sendKeys("Powerstar@1997");
	WebElement showButton=driver.findElement(By.xpath("//button[text()='Show']"));
	showButton.click();
	WebElement LoginButton=driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p _abcm']"));
	LoginButton.click();
	WebElement saveInfoButton=driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	saveInfoButton.click();
	//String handle = driver.getWindowHandle();
	//System.out.println(handle);
	WebElement notNowButton=driver.findElement(By.xpath("//button[text()='Not Now']"));
}
}
