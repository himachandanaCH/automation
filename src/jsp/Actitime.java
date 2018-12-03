package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		//driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		//driver.findElement(By.id("loginButton")).click();
	//driver.findElement(By.className("initial")).click();
		driver.findElement(By.xpath("//div[.='loginButton']")).click();
		
		//driver.close();
	}

}
