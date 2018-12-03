package jsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(1000);
		f.close();

	}

}
