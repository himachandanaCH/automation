package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/navee/Desktop/checkbox.html");
		
		//to get address of all checkboxes
		List<WebElement> allcb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//to count the number of checkbox
		int count = allcb.size();

		System.out.println(count);
		
		//to select all checkboxes
		for(int i=0;i<count;i++) {
			WebElement cb = allcb.get(i);
			cb.click();
			
			Thread.sleep(1000);
			}
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
