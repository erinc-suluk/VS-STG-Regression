package Pages;




import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;



public class LoginPageObjects extends HelperFunctions{
	public LoginPageObjects() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='submit-button']//coral-button-label")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='initEmail']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	
	ReadXLSdata read1=new ReadXLSdata();
	
	
	public void setLogin() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		HelperFunctions.waitForPageToLoad(3);
		username.sendKeys(read1.getCellData("DATA", 1));
		HelperFunctions.staticWait(2);
		password.sendKeys(read1.getCellData("VALUE", 1));
		signin.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(2);
	}
	public void setLogin3() throws Exception {
		//HelperFunctions.waitForPageToLoad(5);
		//JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	   // js2.executeScript("window.scrollBy(0,250)", "");
	   // HelperFunctions.staticWait(3);
	   // logintoMyproducts.click();
	    //loginLink2.click();
	   // HelperFunctions.staticWait(5);
		HelperFunctions.waitForPageToLoad(5);
		read1.setExcelFile("./testdata.xlsx", "STG");
		email.sendKeys(read1.getCellData("VALUE", 14));
		HelperFunctions.staticWait(3);
		next.click();
		HelperFunctions.staticWait(5);
		Robot rb= new Robot();
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    HelperFunctions.staticWait(2);
	   /* rb.keyPress(KeyEvent.VK_ALT);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    rb.keyRelease(KeyEvent.VK_ALT);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_TAB);
	    rb.keyRelease(KeyEvent.VK_TAB);
	    HelperFunctions.staticWait(2);
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	    HelperFunctions.staticWait(2);*/
	    HelperFunctions.waitForPageToLoad(15);
	
	    
	}
	public void setLogin4() throws Exception {
		//HelperFunctions.waitForPageToLoad(5);
		//JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	   // js2.executeScript("window.scrollBy(0,250)", "");
	   // HelperFunctions.staticWait(3);
	   // logintoMyproducts.click();
	    //loginLink2.click();
	   // HelperFunctions.staticWait(5);
		HelperFunctions.waitForPageToLoad(5);
		HelperFunctions.staticWait(5);
		read1.setExcelFile("./testdata.xlsx", "STG");
		email.sendKeys(read1.getCellData("VALUE", 14));
		HelperFunctions.staticWait(3);
		next.click();
	    HelperFunctions.waitForPageToLoad(15);

	
	    
	}

}


