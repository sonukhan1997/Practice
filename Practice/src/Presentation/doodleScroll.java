package Presentation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class doodleScroll {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.google.com/doodles");
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(;;){try {
		WebElement doodleclick = driver.findElement(By.xpath("//div[text()='May 5, 2022']/..//a[text()='Israel Independence Day 2022']"));
		doodleclick.click();
		break;
	} catch(NoSuchElementException e)
	{
		jse.executeScript("window.scrollBy(0,600)");
		
	}
	}
}
}
