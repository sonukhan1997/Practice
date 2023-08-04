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

public class webpage {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.youtube.com/watch?v=HBOdscUwUnc");
//	WebElement youtubLogo = driver.findElement(By.id("logo-icon"));
//	File yutubscrnshot = youtubLogo.getScreenshotAs(OutputType.FILE);
//	String timestamp = LocalDateTime.now().toString().replace(':', '-');
//	File destFile = new File("./errorrrs/yutube"+timestamp+".png");
//	FileUtils.copyFile(yutubscrnshot, destFile);
//	driver.manage().window().minimize();
//	driver.quit();
	
	
	
}
}
