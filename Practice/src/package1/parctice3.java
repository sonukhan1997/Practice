package package1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parctice3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	List<WebElement> allimages= driver.findElements(By.className("img-responsive"));
	System.out.println(allimages.size());
	for (WebElement menuOption : allimages) {
		int startY = menuOption.getRect().getY();
		System.out.println(startY);
		if (startY==123) {
			System.out.println("Pass: Top Alignment of the Menu Option is found correct and it is verified.");
		}else {
			System.out.println("Fail: Top Alignment of the Menu Option is found incorrect and it is verified.");
		}
	}
	driver.manage().window().minimize();
     WebElement dropdown = driver.findElement(By.xpath("//span[@class='atsa-downArrow sprites-arrowDownBold myntraweb-sprite'])"));
     dropdown.click();
}
}
