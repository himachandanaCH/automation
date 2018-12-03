package jsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Redbrickassignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://home.redbrickhealth.com/");
		
		WebElement solutions = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		Thread.sleep(1000);
		
		Actions act=new Actions(driver);
		act.moveToElement(solutions).perform();
		List<WebElement> allsolutions = driver.findElements(By.xpath("//a[.='RedBrick Health']/../..//a[.='Solutions']"));
		
		Thread.sleep(1000);
		
		
		
		int count = allsolutions.size();
		System.out.println(count);
		
		for(WebElement option:allsolutions)
		{
			String text = option.getText();
			System.out.println(text);
			
		} 
		
		
		
		
		}

}
