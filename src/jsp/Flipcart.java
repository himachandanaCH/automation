package jsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	static {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(1000);
		
		//to get address of all suggestions
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(1000);
		
		//To get address of all sugg
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
		
		//To get the size of all suggestions
		int count = allSugg.size();
		System.out.println(count);
		
		//To print all suggestions
		for(WebElement Sugg:allSugg)
		{
			 String text = Sugg.getText();
			 System.out.println(text);
		}
		
		driver.close();
		
	

	}

}
