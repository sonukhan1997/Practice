package RAJESHSIRRIVISION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Doodle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		Actions actions=new Actions(driver);
		//WebElement Srilanka = driver.findElement(By.xpath("//img[@alt='Sri Lanka Independence Day 2020']"));
		//actions.moveToElement(Srilanka);
		for(;;){try {
			WebElement Srilanka = driver.findElement(By.xpath("//img[@alt='Sri Lanka Independence Day 2020']"));
			Srilanka.click();
			break;
		} catch(NoSuchElementException e)
		{
			jse.executeScript("window.scrollBy(0,600)");
			
		}
		}
	
	}

}
