package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yearDropDown {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	////label[text()='Male']/../input[@type='radio']
	//identify the month dropdown
	WebElement yearDropdown = driver.findElement(By.id("year"));
	//create the select class Object
	Select yearselect = new Select(yearDropdown);
	//capture all the options in the month dropdown 
	List<WebElement> allyearOptions = yearselect.getOptions();
	//iterate it and take one WebElement at a time
	for (WebElement dayOption : allyearOptions) {
		String visibleText = dayOption.getText();
		yearselect.selectByVisibleText(visibleText);
		if (dayOption.isSelected()) {
			System.out.println("Pass: "+visibleText+" is Selected");
		}else {
			System.out.println("Fail: "+visibleText+" is not Selected");
		}
	}
}
}