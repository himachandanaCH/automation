package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookbutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		//to check whether the element is select or not
		WebElement r = driver.findElement(By.id("u_0_7"));
		r.click();
		if(r.isSelected()) {
			System.out.println("female is selected");
		}
		else {
			System.out.println("male is selected");
		}
		Thread.sleep(2000);
		driver.close();
		
		  

	}

}
