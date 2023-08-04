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

public class callbackIcon {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	driver.get("https://www.goldenchariot.org/#/home");
	File callbackLogo = driver.findElement(By.xpath("//a[@class='d-block text-center']/i")).getScreenshotAs(OutputType.FILE);
	String timeDate = LocalDateTime.now().toString().replace(':', '-');
	File logo = new File("./errorshots/callbacklogo"+timeDate+".png");
	FileUtils.copyFile(callbackLogo, logo);
	driver.manage().window().minimize();
	driver.quit();
}
}
