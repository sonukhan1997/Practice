package package1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	File loginButtonScreenshot = driver.findElement(By.name("login")).getScreenshotAs(OutputType.FILE);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	File detsFile = new File("./errors/loginButtonScreenshot"+timeStamp+".png");
	FileUtils.copyFile(loginButtonScreenshot, detsFile);
	driver.manage().window().minimize();
	driver.quit();
}
}
