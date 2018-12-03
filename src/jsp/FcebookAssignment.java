package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FcebookAssignment {
	//declaration
	@FindBy(id="u_0_j")
	private WebElement fname;
	@FindBy(id="u_0_l")
	private WebElement sname;
	@FindBy(id="u_0_o")
	private WebElement mnumber;
	@FindBy(id="u_0_v")
	private WebElement npswd;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(id="u_0_9")
	private WebElement rfemale;
	@FindBy(id="u_0_a")
	private WebElement rmale;
	@FindBy(id="u_0_11")
	private WebElement signup;
	
	//initialization
	public FcebookAssignment(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void enterFirstname(String fn) {
		fname.sendKeys(fn);
	}
	public void enterSurname(String sn) {
		sname.sendKeys(sn);
	}
	public void enterEmailrMbnum(String em) {
		mnumber.sendKeys(em);
	}
	public void enterNewpswd(String npd) {
		npswd.sendKeys(npd);
	}
	public void checkday(String dy) {
		day.sendKeys(dy);
	}
	public void checkmonth(String mth) {
		month.sendKeys(mth);
	}
	public void checkyear(String yr) {
		year.sendKeys(yr);
	}
	public void clickonfemale() {
		rfemale.click();
	}
	public void clickonmale() {
		rmale.click();
	}
	public void clickonlogin() {
		signup.click();
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	

	


	}


