package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimetask {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/user/submit_tt.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='scrollableContainer']//tbody//tr[1]//td[1]//div[1]//div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'innerWrapper')]//div[contains(@class,'deleteButton')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_cancelBtn']")).click();
		Thread.sleep(1000);
		
		
		
		

	}

}
