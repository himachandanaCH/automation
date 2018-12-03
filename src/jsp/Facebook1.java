package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		FcebookAssignment fb=new FcebookAssignment(driver);
		
		fb.enterFirstname("Hima");
		fb.enterSurname("CH");
		fb.enterEmailrMbnum("9000840197");
		fb.enterNewpswd("Hima@433");
		fb.checkday("25");
		fb.checkmonth("Jan");
		fb.checkyear("1997");
		fb.clickonfemale();
		//fb.clickonmale();
		//fb.clickonlogin();
	}

	

}
