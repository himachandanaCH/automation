package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		WebElement submit = driver.findElement(By.id("s"));
		Thread.sleep(1000);
		
		//to click on submit button
		submit.submit();
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement fname = driver.findElement(By.id("fn"));
		
		//to enter the text
		fname.sendKeys("hima");
		Thread.sleep(1000);
		
		//to clear the text field
		fname.clear();
		WebElement fb = driver.findElement(By.linkText("facebook"));
		
		//to get tagname of an element
		String tag = fb.getTagName();
		System.out.println("tag name"+tag);
		
		//to get attribute value of an element
		String value = fb.getAttribute("href");
		System.out.println("atribute value"+value);
		
		//to get text of an element
		String text = fb.getText();
		System.out.println("text"+text);
		
		//to get color of an element
		String color = fb.getCssValue("color");
		System.out.println("color"+color);
		
		//to get font size of an element
		String size = fb.getCssValue("font size");
		System.out.println("size"+size);
		driver.close();
		
		
		
		

		
	}

}
