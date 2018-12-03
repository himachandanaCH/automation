package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecifiedbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		
		//close specified browser
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals("Fullerton")) {
				driver.close();
			}
		}
	}

}
