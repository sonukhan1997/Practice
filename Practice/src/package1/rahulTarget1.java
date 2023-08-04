package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rahulTarget1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement searchTextField = driver.findElement(By.xpath("//input[@class='_3704LK']"));
	searchTextField.click();
	searchTextField.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	searchTextField.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	searchTextField.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	searchTextField.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	searchTextField.sendKeys(Keys.ARROW_DOWN);
	searchTextField.sendKeys(Keys.ENTER);
	
 }
}
