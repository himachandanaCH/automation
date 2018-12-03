package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		WebElement un = driver.findElement(By.name("username"));

		//to get size of an element
		Dimension s = un.getSize();
		int h = s.getHeight();
		int w = s.getWidth();
		System.out.println("height"+h);
		System.out.println("width"+w);
		System.out.println("*******************");
		
		//to get location of an element
		Point l = un.getLocation();
		int x=l.getX();
		int y=l.getY();
		System.out.println("x-axis"+x);
		System.out.println("y-axis"+y);
		System.out.println("*******************");
		
		//to check whether the element is present or not
		if(un.isDisplayed()) {
			System.out.println("element is present");
		}
		else {
			System.out.println("elememnt is not present");
		}
		System.out.println("*******************");
		
		
		//to check whether the element is select or not
		WebElement cb = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(un.isSelected()) {
			System.out.println("selected");
		}
		else {
			System.out.println("not selected");
		}
		driver.close();
	}
		
	}


