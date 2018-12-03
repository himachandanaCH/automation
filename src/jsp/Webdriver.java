package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //to enter url
        driver.get("http://www.google.co.in/");
        
        //to get the title of the webpage
        String title=driver.getTitle();
        System.out.println(title);
        
        
        //to get the url of the current page
        String Url=driver.getCurrentUrl();
        System.out.println(Url);
        
        driver.close();
        
        

	}

}
