package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class youtube {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement searchTextField=driver.findElement(By.xpath("//input[@id='search']"));
		searchTextField.sendKeys("methods of webelent in selenium");
		searchTextField.sendKeys(Keys.ENTER);
//		driver.manage().window().minimize();
//		driver.quit();
		
	}

}
