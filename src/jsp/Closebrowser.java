package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closebrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		 Set<String> allwh = driver.getWindowHandles();
		 for(String wh:allwh) {
			 driver.switchTo().window(wh);
			 String text = driver.getTitle();
			 System.out.println(text);
			 driver.close();
			 Thread.sleep(1000);
		 }
		
		 

	}

}
