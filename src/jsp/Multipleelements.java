package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipleelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/navee/Desktop/cigniti/jsp.html");
		
		//to get address of the links
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		//to get the number of links
		int count = alllinks.size();
		System.out.println(count);
		
		//to print all links
		for(int i=0;i<count;i++) {
			WebElement link = alllinks.get(i);
			String text = link.getText();
			System.out.println(text);
			
		}
		driver.close();
		
		
		
		

	}

}
