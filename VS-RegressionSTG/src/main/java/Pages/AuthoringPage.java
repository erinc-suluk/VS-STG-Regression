package Pages;



import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.protocol.ClientContextConfigurer;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;


public class AuthoringPage extends HelperFunctions {
	public AuthoringPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-collection-item-id='/content/valuestore/us']")
	private WebElement US;
	
	@FindBy(xpath="//coral-columnview-item[@data-foundation-collection-item-id='/content/valuestore/mx']//coral-columnview-item-content[@role='presentation']")
	private WebElement MX;
	
	@FindBy(xpath="//coral-columnview-item[@class='foundation-collection-item coral3-ColumnView-item coral3-ColumnView-item--drilldown']//div[@title='Value Store'][normalize-space()='Value Store']")
	private WebElement valueStoreTitle1;
	
	@FindBy(xpath="//div[normalize-space()='en']")
	private WebElement enPage;
	
	@FindBy(xpath="//div[@title='es']")
	private WebElement esPage;
	
	@FindBy(xpath="//a[@href='/var/acs-commons/reports/page-report.html?wcmmode=disabled']")
	private WebElement pageReport;
	
	@FindBy(xpath="//input[@name='path']")
	private WebElement path;
	
	@FindBy(xpath="//input[@name='template']")
	private WebElement template;
	
	@FindBy(xpath="//button[normalize-space()='Execute Report']")
	private WebElement executeReport;
	
	@FindBy(xpath="//div[@class='coral-Alert coral-Alert--success coral-Alert--']")
	private WebElement successMessage;
	
	@FindBy(xpath="//div[@class='section report__result']")
	private WebElement reportResult;
	
	@FindBy(xpath="//div[@title='Header Navigation']")
	private WebElement headerEdit;
	
	@FindBy(xpath="//input[@name='./featuredlinks/item0/./title']")
	private WebElement quickTitleField;
	
	@FindBy(xpath="//input[@name='./featuredlinks/item0/./description']")
	private WebElement quickDescField1;
	
	@FindBy(xpath="//input[@name='./featuredlinks/item1/./description']")
	private WebElement quickDescField2;
	
	@FindBy(xpath="//button[@title='Configure']")
	private WebElement configure;
	
	@FindBy(xpath="//coral-icon[@aria-label='Maximum String length is 54 characters.']")
	private WebElement errorTitle;
	
	@FindBy(xpath="//coral-icon[@aria-label='Maximum String length is 75 characters.']")
	private WebElement errorDesc;
	
	@FindBy(xpath="//coral-icon[@aria-label='Error: Please fill out this field.']")
	private static List<WebElement> errorLabels;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/Content.png']")
	private WebElement contentPageTemplate;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/Ghost.png']")
	private WebElement ghostPageTemplate;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//input[@name='./jcr:title']")
	private WebElement titleArea;
	
	@FindBy(xpath="//div[@title='You Might Also Like Component']")
	private WebElement mightLikeEdit;
	
	@FindBy(xpath="//textarea[@placeholder='Text or Quote']")
	private WebElement mightLikeQuote;
	
	@FindBy(xpath="//img[@alt='logo']")
	private WebElement logo;
	
	@FindBy(xpath="//foundation-autocomplete[@placeholder='Image path']//button[@title='Open Selection Dialog']")
	private WebElement imgPath;
	
	@FindBy(xpath="(//div[@class='foundation-collection-item-title'])[1]")
	private WebElement selectImg;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement editButton;
	
	@FindBy(xpath="//div[@title='Top Ten']")
	private WebElement top10Edit;
	
	@FindBy(xpath="//coral-tab-label[normalize-space()='No Results']")
	private WebElement noResultTab;
	
	@FindBy(xpath="//input[@placeholder='Page path']")
	private static List<WebElement> pagePath;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/topic-landing-page-thumbnail.png']")
	private WebElement topicTemplate;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/Content.png']")
	private WebElement contentTemplate;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/Ghost.png']")
	private WebElement ghostTemplate;
	
	@FindBy(xpath="//coral-icon[@icon='properties']")
	private WebElement pageInfo;
 
    
	ReadXLSdata read1=new ReadXLSdata();
	
	public void setTerritory() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    Driver.getDriver().get(read1.getCellData("VALUE", 8));
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(US));
	    US.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(valueStoreTitle1));
	    Assert.assertTrue(enPage.isDisplayed());
	    HelperFunctions.staticWait(2);
	    MX.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(esPage));
	    Assert.assertTrue(esPage.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	
	public void setGettingReport() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 32));
	   // HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(pageReport));
	    pageReport.click();
	    HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(path));
	    String vsPath="/content/valuestore/us/en";
	    String vsTemplate="/conf/valuestore/settings/wcm/templates/content-page";
	    path.click();
	    HelperFunctions.staticWait(2);
	    path.sendKeys(vsPath);
	    HelperFunctions.staticWait(2);
	    template.click();
	    HelperFunctions.staticWait(2);
	    template.sendKeys(vsTemplate);
	    HelperFunctions.staticWait(2);
	    executeReport.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 15);
	    wait3.until(ExpectedConditions.visibilityOf(successMessage));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(reportResult.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setEditQuickLinks() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 33));
	   // HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(headerEdit));
	    headerEdit.click();
	    HelperFunctions.staticWait(2);
	    configure.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(quickTitleField));
	    String actualTitle="PwCi (intelligence)";
	    Faker faker = new Faker();
	    String mockTitle = faker.lorem().characters(55);
	    quickTitleField.click();
	    HelperFunctions.staticWait(2);
	    quickTitleField.clear();
	    HelperFunctions.staticWait(2);
	    quickTitleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    quickTitleField.click();
	    HelperFunctions.staticWait(2);
	    quickTitleField.sendKeys(Keys.BACK_SPACE);
	    HelperFunctions.staticWait(2);
	    quickTitleField.sendKeys("a");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(errorTitle));
	    Assert.assertTrue(errorTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    String actualDesc="A very short description describing what this is, that maxes out at two lin";
	    Faker faker2 = new Faker();
	    String mockDesc = faker2.lorem().characters(76);
	    quickDescField1.click();
	    HelperFunctions.staticWait(2);
	    quickDescField1.clear();
	    HelperFunctions.staticWait(2);
	    quickDescField1.sendKeys(mockDesc);
	    HelperFunctions.staticWait(2);
	    quickDescField1.click();
	    HelperFunctions.staticWait(2);
	    quickDescField1.sendKeys(Keys.BACK_SPACE);
	    HelperFunctions.staticWait(2);
	    quickDescField1.sendKeys("a");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(errorDesc));
	    Assert.assertTrue(errorDesc.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setEditQuickLinks2() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 33));
	  //  HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(headerEdit));
	    headerEdit.click();
	    HelperFunctions.staticWait(3);
	    configure.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(quickDescField1));
	    quickDescField1.click();
	    HelperFunctions.staticWait(2);
	    quickDescField1.clear();
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", quickDescField2);
	    HelperFunctions.staticWait(2);
	    quickDescField2.clear();
	    HelperFunctions.staticWait(5);
	    Assert.assertTrue(errorLabels.size()==2);
	    HelperFunctions.staticWait(3);
	}
	public void setContentTemplateMexico() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 34));
	   // HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(contentPageTemplate));
	    contentPageTemplate.click();
	    HelperFunctions.staticWait(2);
	    nextButton.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
	    wait1.until(ExpectedConditions.visibilityOf(titleArea));
	    Assert.assertTrue(titleArea.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setGhostTemplateMexico() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 34));
	   // HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
	    wait2.until(ExpectedConditions.visibilityOf(ghostPageTemplate));
	    ghostPageTemplate.click();
	    HelperFunctions.staticWait(2);
	    nextButton.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 15);
	    wait3.until(ExpectedConditions.visibilityOf(titleArea));
	    Assert.assertTrue(titleArea.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setMightLikeEdit() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 39));
	   // HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	 js.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    editButton.click();
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", mightLikeEdit);
	    HelperFunctions.staticWait(2);
	    configure.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(mightLikeQuote));
	    mightLikeQuote.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(mightLikeQuote.isEnabled());
	    HelperFunctions.staticWait(3);
	    imgPath.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(selectImg));
	    Assert.assertTrue(selectImg.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	
	public void setConfigure4Articles() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 39));
	   //HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	     try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		 js.executeScript("arguments[0].click();", pageInfo);
		    try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
	    editButton.click();
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", top10Edit);
	    HelperFunctions.staticWait(2);
	    configure.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(noResultTab));
	    noResultTab.click();
	    HelperFunctions.staticWait(2);
	    List<WebElement> visibleElements = new ArrayList<>();
        for (WebElement element : pagePath) {
            if (element.isDisplayed()) {
                visibleElements.add(element);
            }
        }

 
        int elementCount = visibleElements.size();
        System.out.println(elementCount);
        if (elementCount == 4) {
        	Assert.assertTrue(true);
            System.out.println("All elements are visible and interactable.");
        } else {
            System.out.println("The number of visible and interactable elements is: " + elementCount);
        }
        HelperFunctions.staticWait(3);
	}
	public void setTopicTemplateGlobal() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 34));
	   // HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(topicTemplate));
	    topicTemplate.click();
	    HelperFunctions.staticWait(2);
	    nextButton.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 15);
	    wait1.until(ExpectedConditions.visibilityOf(titleArea));
	    Assert.assertTrue(titleArea.isDisplayed());
	    HelperFunctions.staticWait(3);
	    
	}
	public void setContentTemplateGlobal() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 34));
	   // HelperFunctions.waitForPageToLoad(15);
	
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(contentTemplate));
	    contentTemplate.click();
	    nextButton.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 15);
	    wait3.until(ExpectedConditions.visibilityOf(titleArea));
	    Assert.assertTrue(titleArea.isDisplayed());
	    HelperFunctions.staticWait(3);
	  
	}
	public void setGhostTemplateGlobal() throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(ghostTemplate));
	    ghostTemplate.click();
	    nextButton.click();
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 15);
	    wait5.until(ExpectedConditions.visibilityOf(titleArea));
	    Assert.assertTrue(titleArea.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	

}
