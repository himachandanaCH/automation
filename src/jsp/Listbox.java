package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/navee/Desktop/listbox.html");
		WebElement hotel = driver.findElement(By.id("maarya"));
		Select sel=new Select(hotel);
		Thread.sleep(1000);
		
		//select by index
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		//select by value
		sel.selectByValue("p");
		Thread.sleep(1000);
		
		//select by visible text
		sel.selectByVisibleText("Fish");
		
		
	

	}

}
