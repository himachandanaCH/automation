package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/navee/Desktop/cigniti/dropdownlist.html");
		WebElement hotel = driver.findElement(By.id("marya"));
		Select sel=new Select(hotel);
		if(sel.isMultiple()) {
			System.out.println("multi selected");
		}
		else {
			System.out.println("single selected");
		}
		
	}
}
