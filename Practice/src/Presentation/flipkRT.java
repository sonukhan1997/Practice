package Presentation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkRT {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.flipkart.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	String fileAdress = srcFile.getAbsolutePath();
	System.out.println(fileAdress);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	File destFile = new File("./errorsandesh/flipkartwebpage"+timeStamp+".png");
	FileUtils.copyFile(srcFile, destFile);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
