package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https:/www.instagram.com/");
	Thread.sleep(2000);
	WebElement usernameTextField = driver.findElement(By.name("username"));
    usernameTextField.sendKeys("9449060109");
    Thread.sleep(2000);
    WebElement passwordTextField=driver.findElement(By.name("password"));
    passwordTextField.sendKeys("Powerstar@1997");
    Thread.sleep(2000);
    //WebElement showButton=driver.findElement(By.xpath("_acan _aiit _acao _aija _acat _aj1-"));
    //showButton.click();
    //Thread.sleep(2000);
    WebElement loginButton=driver.findElement(By.xpath("//div[text()='Log in']"));
   
    loginButton.click();
    driver.manage().window().minimize();
    Thread.sleep(4000);
    driver.quit();
    
}
}

