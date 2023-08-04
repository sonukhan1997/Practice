package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	////label[text()='Male']/../input[@type='radio']
	//identify the month dropdown
	WebElement dayDropdown = driver.findElement(By.id("day"));
	//create the select class Object
	Select monthSelect = new Select(dayDropdown);
	//capture all the options in the month dropdown 
	List<WebElement> alldayOptions = monthSelect.getOptions();
	//iterate it and take one WebElement at a time
	for (WebElement dayOption : alldayOptions) {
		String visibleText = dayOption.getText();
		monthSelect.selectByVisibleText(visibleText);
		if (dayOption.isSelected()) {
			System.out.println("Pass: "+visibleText+" is Selected");
		}else {
			System.out.println("Fail: "+visibleText+" is not Selected");
		}
	}
}
}