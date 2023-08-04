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

public class kpsclogo {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	driver.get("https://www.kpsc.com/");
	File kpsclogo = driver.findElement(By.id("1242540873")).getScreenshotAs(OutputType.FILE);
	String timestamp = LocalDateTime.now().toString().replace(':', '-');
	String kpscaddress = kpsclogo.getAbsolutePath();
	System.out.println("kpscaddress   : "+kpscaddress);
	File destFile = new File("./errorkpsc/kpsclogo"+timestamp+".png");
	FileUtils.copyFile(kpsclogo, destFile);
	driver.manage().window().minimize();
	driver.quit();
	
}
}
