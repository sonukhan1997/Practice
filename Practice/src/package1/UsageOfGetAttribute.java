package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com");
	WebElement loginOption = driver.findElement(By.linkText("Login"));
	loginOption.click();
	WebElement usernameTextField = driver.findElement(By.xpath("Email ID / Username"));
	String actualUsernameplaceHolderText = usernameTextField.getAttribute("placeholder");
	System.out.println("actualUsernameplaceHolderText= "+actualUsernameplaceHolderText);
	
	WebElement passwordTextField=driver.findElement(By.xpath("Password"));
	String actaulPasswordPlaceHolderText = passwordTextField.getAttribute("placeholder");
	System.out.println("actaulPasswordPlaceHolderText= "+actaulPasswordPlaceHolderText);
	
}
}
