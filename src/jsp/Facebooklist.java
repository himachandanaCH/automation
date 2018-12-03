package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		Select d=new Select(day);
		WebElement month = driver.findElement(By.id("month"));
		Select m=new Select(month);
		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(year);
		Thread.sleep(1000);
		
		//select by index
		d.selectByIndex(25);
		Thread.sleep(1000);
		
		//select by value
		y.selectByValue("1997");
		Thread.sleep(1000);

		//select by visible text
		m.selectByVisibleText("Jan");
		
		
		

	}

}
