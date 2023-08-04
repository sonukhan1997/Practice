package package1;

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

public class wbpgscrsht {
public static void main(String[] args) throws IOException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
	 driver.get("https://www.kpsc.com/");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File wbscrnsht = ts.getScreenshotAs(OutputType.FILE);
	 String timestamp = LocalDateTime.now().toString().replace(':', '-');
	 File destfile = new File("./errorscreen/kpsc"+timestamp+".png");
	 FileUtils.copyFile(wbscrnsht, destfile);
	 driver.manage().window().minimize();
	 driver.quit();
	 
}
}
