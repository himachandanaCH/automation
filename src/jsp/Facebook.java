package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com");
		
		//to select email field in facebook
		driver.findElement(By.cssSelector("input[type='email']"));
		
		//to select password field from login in facebook
		driver.findElement(By.cssSelector("input[name='pass']"));
		
		//to select first name from signup
		driver.findElement(By.cssSelector("input[type='text']"));
		
		//to select last name from signup
		driver.findElement(By.cssSelector("input[type='text']"));
		
		//to select email or mobile from signup
		driver.findElement(By.cssSelector("input[name='reg_email_']"));
		
		//to select new password from signup
		driver.findElement(By.cssSelector("input[type='password']"));
		
		//to select day from signup
		driver.findElement(By.cssSelector("select[id='day']"));
		
		//to select month from signup
		driver.findElement(By.cssSelector("select[id='month']"));
		
		//to select year from signup
		driver.findElement(By.cssSelector("select[id='year']"));
		
		//to select signup from signup
		driver.findElement(By.cssSelector("button[type='submit']"));
		
		driver.close();

	}

}
