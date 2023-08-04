package Presentation;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myntrascrnshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File webpgscreenshot = ts.getScreenshotAs(OutputType.FILE);
	String Timestamp = LocalDateTime.now().toString().replace(':', '-');
	File destFile = new File("./errorshoooots/myntrawbpagescreenshot"+Timestamp+".png");
	String fileAddress = webpgscreenshot.getAbsolutePath();
	System.out.println(fileAddress);
	FileUtils.copyFile(webpgscreenshot, destFile);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
