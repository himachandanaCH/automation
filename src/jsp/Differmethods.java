package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Differmethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.google.co.in/");
		Thread.sleep(1000);
		
		//to enter Url
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(1000);
		
		//to navigate to previous page
		driver.navigate().back();
		Thread.sleep(1000);
		
		//to navigate to next page
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//refresh the page
		driver.navigate().refresh();
		
		driver.close();

	}
	

}
