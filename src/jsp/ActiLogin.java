package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiLogin {
	
	//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//initialization
	public ActiLogin(WebDriver driver) {
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[.='Login ']"));
		
	}
	
	//utilization
	public void enterusername(String un) {
		unTB.sendKeys(un);
	}
	public void enterpassword(String pw) {
		pwTB.sendKeys(pw);
	}
	public void clickonLogin() {
		loginBTN.click();
		
	}
	
	


		

	}


