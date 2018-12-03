package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Redbrickhealth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://home.redbrickhealth.com/");
		WebElement aboutus = driver.findElement(By.xpath("//a[.='RedBrick Health']/../..//a[.='About Us']"));
		Actions act=new Actions(driver);
		act.moveToElement(aboutus).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Company']")).click();
		driver.close();
	}

}