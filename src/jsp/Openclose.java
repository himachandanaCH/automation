package jsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openclose {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("enter the browser");
		
		Scanner sc=new Scanner(System.in);
		
		String browser=sc.nextLine();
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
			
		else if(browser.equalsIgnoreCase("gc")) {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		Thread.sleep(1000);
		driver.close();

	}



}