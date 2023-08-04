package package1;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSwitchTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	WebElement newTabButton = driver.findElement(By.id("tabButton"));
	newTabButton.click();
	Set<String> windowsId = driver.getWindowHandles();
	Iterator<String> itr = windowsId.iterator();
	String defaultWindowId = itr.next();
	String childWindowId = itr.next();
	driver.switchTo().window(childWindowId);
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.navigate().refresh();
	System.out.println(driver.manage().window().getPosition());
	System.out.println(driver.manage().window().getSize());
	driver.manage().window().setSize(null);
	
}
}
