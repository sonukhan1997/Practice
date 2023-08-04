package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManageMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement newWindowButton = driver.findElement(By.id("tabButton"));
		newWindowButton.click();
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		driver.switchTo().window(parentWindowHandle);
	    int childWindowHeight = driver.manage().window().getSize().getHeight();
		System.out.println(childWindowHeight);
		int childWindowWidth = driver.manage().window().getSize().getWidth();
		System.out.println(childWindowHeight);
		int childWindowStartX = driver.manage().window().getPosition().getX();
		System.out.println("childWindowStartX=="+childWindowStartX);
		int childWindowStartY = driver.manage().window().getPosition().getY();
		System.out.println("childWindowStartY=="+childWindowStartY);
		Thread.sleep(3000);
		
		
		
	}

}
