package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver","C:\Users\navee\eclipse-workspace\automation\drivers\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/navee/Desktop/hima.html");
		
		//by using id
		driver.findElement(By.id("link")).click();
		driver.navigate().back();
		
	
		//by using name
		driver.findElement(By.name("fb")).click();
		driver.navigate().back();
		
		//by using classname
		driver.findElement(By.className("ab")).click();
		driver.navigate().back();
		
		//by using tagname
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		
		//by using linktext
		driver.findElement(By.linkText("Forgot Password????")).click();

		driver.navigate().back();
		
		//by using partial  linklist
		driver.findElement(By.partialLinkText("Inbox")).click();
		
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}