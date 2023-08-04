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

public class western {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.westernunion.com/in/en/home.html");
	File westernUnion = driver.findElement(By.xpath("//div[@id='inbug-nav-item']/a/div/img[@class='d-none d-M-inline wu-logo--host wu-logo--desktop mar-xs-rt']")).getScreenshotAs(OutputType.FILE);
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	File destFile = new File("./errorshots/westernUnionButton"+timeStamp+".png");
	FileUtils.copyFile(westernUnion, destFile);
	driver.manage().window().minimize();
	driver.quit();
}
}
