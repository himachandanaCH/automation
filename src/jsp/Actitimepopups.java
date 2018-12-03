package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimepopups {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Help & Support')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'About actiTIME')]")).click();
		WebElement buildnum = driver.findElement(By.xpath("//td[contains(text(),'3.3 (build 17573), Auto-installation package')]"));
		System.out.println(buildnum);
		driver.close();

	}

}
