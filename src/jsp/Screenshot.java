package jsp;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Screenshot { 
	       
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					driver.get("http://demo.actitime.com/login.do");
					
					
					//Create reference of take screenshot
					TakesScreenshot t=(TakesScreenshot) driver;
					
					//To take the screenshot
					   File src = t.getScreenshotAs(OutputType.FILE);
					
					//To create destination
					File dest=new File("./screenshot.png");
					
					//To copy the file from src to dest
					FileUtils.copyFile(src, dest);
					driver.close();
			}

		

	}


