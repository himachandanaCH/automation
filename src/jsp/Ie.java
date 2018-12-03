package jsp;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Ie {

	public static void main(String[] args) {
		System.setProperty("webdriver.internetexplorer.driver","C:\\Users\\navee\\eclipse-workspace\\automation\\drivers\\IEDriverServer.exe");
		InternetExplorerDriver i=new InternetExplorerDriver();
		i.close();
	}

}
