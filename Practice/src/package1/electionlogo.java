package package1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class electionlogo {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(4));
	driver.get("https://www.election.com/");
	WebElement electionLogo = driver.findElement(By.xpath("//span[text()='Connect  with  Election.com']"));
	File srcFile = electionLogo.getScreenshotAs(OutputType.FILE);
	String timestamp = LocalDateTime.now().toString().replace(':', '=');
	File destFile = new File("errorshoyz/electionLogo"+timestamp+".png");
	FileUtils.copyFile(srcFile, destFile);
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
