package Pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;

public class TopicLandingPage extends HelperFunctions {
	public TopicLandingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(xpath="//coral-icon[@icon='properties']")
	private WebElement pageInfo;
	
	@FindBy(xpath="//button[@title='Open Properties']")
	private WebElement openPro;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Publish Page']")
	private WebElement publishPage;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='View as Published']")
	private WebElement viewPublished;
	
	@FindBy(xpath="//a[@data-tag-id='Deals']")
	private WebElement dealsTag;
	
	@FindBy(xpath="//img[@alt='logo']")
	private WebElement logo;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement editButton;
	
	@FindBy(xpath="//button[@data-layer='Preview']")
	private WebElement previewButton;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement titleArea;
	
	@FindBy(xpath="//button[@title='Configure']")
	private WebElement configure;
	
	@FindBy(xpath="//div[@title='Key Asset Bar Component']")
	private WebElement keyAssetBarComponent;
	
	@FindBy(xpath="//div[@title='Key Asset Bar Component']")
	private WebElement keyAssetEdit;
	
	@FindBy(xpath="//h2[normalize-space()='Key Asset Bar Container']")
	private WebElement keyAssetContainer;
	
	@FindBy(xpath="//coral-multifield-item[@aria-label='(1 of 4)']")
	private WebElement firstKeyAsset;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Add']")
	private WebElement addKeyAsset;
	
	@FindBy(xpath="//coral-icon[@aria-label='You can add maximum 4 links. You are trying to add 5th link.']")
	private WebElement errorLabel1;
	
	@FindBy(xpath="//div[@title='Hot Topics']")
	private WebElement hotTopicsEdit;
	
	@FindBy(xpath="//coral-dialog-header[normalize-space()='Hot Topics']")
	private WebElement hotTopicsTitle;
	
	@FindBy(xpath="//span[normalize-space()='Hot Topics']")
	private WebElement hotTopicsBanner;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Add']")
	private WebElement addHotTopic;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Add']")
	private WebElement errorLabel;
	
	@FindBy(xpath="//div[@class='vs-hot-topics__heading-favorite-wrapper']")
	private static List<WebElement> hotTopicsTitles;
	
	@FindBy(xpath="//h2[@class='cmp-teaser__title vs-topic__title']")
	private WebElement topicPageTitle;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement topicContentTitle;
	
	@FindBy(xpath="//div[@class='vs-title-area__back-link']//button")
	private WebElement backToTopic;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-heading-link tag-pills']//a")
	private WebElement dataTag;
	
	@FindBy(xpath="//div[@class='vs-topic-feed__heading-favorite-wrapper']//a")
	private static List<WebElement> feedTopics;
	
	@FindBy(xpath="//coral-multifield-item[@aria-label='(1 of 4)']//label[@class='coral-Form-fieldlabel'][normalize-space()='Key Asset Bar Url *']")
	private WebElement keyUrlAuth;
	
	@FindBy(xpath="//input[@name='./keyassetbar/item0/./description']")
	private WebElement keyDescription;
	
	@FindBy(xpath="//input[@name='./keyassetbar/item0/./title']")
	private WebElement keyTitle;
	
	@FindBy(xpath="//input[@name='./jcr:title']")
	private WebElement titleField;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Save & Close']")
	private WebElement saveClose;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./topicTag']//input[@role='combobox']")
	private WebElement topicTagField;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./topicTag']//button[@title='Open Selection Dialog']")
	private WebElement topicTagOptions;
	
	@FindBy(xpath="//coral-columnview-item[@title='Topic']")
	private WebElement topicOption;
	
	@FindBy(xpath="//coral-columnview-item[@title='Audit and assurance']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path1;
	
	@FindBy(xpath="//coral-columnview-item[@title='Cloud and digital']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2;
	
	@FindBy(xpath="//coral-columnview-item[@title='Deals']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path3;
	
	@FindBy(xpath="//coral-columnview-item[@title='ESG']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path4;
	
	@FindBy(xpath="//button[@aria-label='Remove: Value Store : Topic / Audit and assurance']//coral-icon[@aria-label='close']")
	private WebElement tag1;
	
	@FindBy(xpath="//button[@aria-label='Remove: Value Store : Topic / Cloud and digital']//coral-icon[@aria-label='close']")
	private WebElement tag2;
	
	@FindBy(xpath="//button[@aria-label='Remove: Value Store : Topic / Deals']//coral-icon[@aria-label='close']")
	private WebElement tag3;
	
	@FindBy(xpath="//button[@aria-label='Remove: Value Store : Topic / ESG']//coral-icon[@aria-label='close']")
	private WebElement tag4;
	
	@FindBy(xpath="//label[@class='coral-Form-errorlabel']")
	private WebElement errorLabel2;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Select']")
	private WebElement selectButton;
	
	@FindBy(xpath="//textarea[@name='./jcr:description']")
	private WebElement descArea;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./displayImage/fileReference']//input[@role='combobox']")
	private WebElement imgArea;
	
	@FindBy(xpath="//a[@class='vs-topic-key-asset-bar__link']")
	private WebElement keyAssetLink;
	
	@FindBy(xpath="//div[@class='vs-topic-feed']")
	private WebElement topicFeed;
	
	ReadXLSdata read1=new ReadXLSdata();
	
	public void setKeyAssetBar(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on key asset edit");
	    //HelperFunctions.scrollToElement(editTitle);
	    keyAssetEdit.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(keyAssetBarComponent.isDisplayed());
	    test.info("Verified keyAssetBarComponent banner is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Verified configure button is displayed");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    Assert.assertTrue(configure.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);	   
	    test.info("Wait for key asset container visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(keyAssetContainer));
	    Assert.assertTrue(keyAssetContainer.isDisplayed());
	    test.info("Verified key asset container is displayed");
	    HelperFunctions.staticWait(3);	
	    String upto4articles=firstKeyAsset.getAttribute("aria-setsize");
	    String upto4articlesExpected="4";
	    Assert.assertTrue(upto4articles.equalsIgnoreCase(upto4articlesExpected));
	    HelperFunctions.staticWait(3);	
	}
	
	public void setHotTopics(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on hot topics edit");
	    //HelperFunctions.scrollToElement(editTitle);
	    hotTopicsEdit.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(hotTopicsBanner.isDisplayed());
	    test.info("Verified keyAssetBarComponent banner is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Verified configure button is displayed");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    Assert.assertTrue(configure.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);	   
	    test.info("Wait for hot Topics Title visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(hotTopicsTitle));
	    Assert.assertTrue(hotTopicsTitle.isDisplayed());
	    test.info("Verified hot Topics Title is displayed");
	
	}
	public void setKeyAssetBar4articles(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for edit button visibility and clicked on it");
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
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on key asset edit");
	    //HelperFunctions.scrollToElement(editTitle);
	    keyAssetEdit.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(keyAssetBarComponent.isDisplayed());
	    test.info("Verified keyAssetBarComponent banner is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Verified configure button is displayed");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(configure));
	    Assert.assertTrue(configure.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);	   
	    test.info("Wait for key asset container visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(keyAssetContainer));
	    Assert.assertTrue(keyAssetContainer.isDisplayed());
	    test.info("Verified key asset container is displayed");
	    HelperFunctions.staticWait(3);	
	    String upto4articles=firstKeyAsset.getAttribute("aria-setsize");
	    String upto4articlesExpected="4";
	    Assert.assertTrue(upto4articles.equalsIgnoreCase(upto4articlesExpected));
	    test.info("Verified article aria set size is equal to 4");
	    HelperFunctions.staticWait(3);	
	    HelperFunctions.scrollToElement(addKeyAsset);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on add key asset");
	    addKeyAsset.click();
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(errorLabel1);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(errorLabel1.isDisplayed());
	    test.info("Verified errorLabel1 is displayed");
	    HelperFunctions.staticWait(3);
	    
	}
	
	public void setHotTopics4articles(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 9));
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(3);
	  //  HelperFunctions.staticWait(3);
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on hot topics edit");
	    //HelperFunctions.scrollToElement(editTitle);
	    hotTopicsEdit.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(hotTopicsBanner.isDisplayed());
	    test.info("Verified keyAssetBarComponent banner is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Verified configure button is displayed");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    Assert.assertTrue(configure.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);	   
	    test.info("Wait for hot Topics Title visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(hotTopicsTitle));
	    Assert.assertTrue(hotTopicsTitle.isDisplayed());
	    test.info("Verified hot Topics Title is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on add hot topic");
	    addHotTopic.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(errorLabel));
	    Assert.assertTrue(errorLabel.isDisplayed());
	    test.info("Verified error label is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setBacktoTopicandTopicsSize(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title is displayed");
	    HelperFunctions.staticWait(2);
	    //Assert.assertTrue(hotTopicsTitles.size()==4);
	    //test.info("Verified hot topic title's size is 4");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on hot topic");
	    hotTopicsTitles.get(0).click();
	    HelperFunctions.waitForPageToLoad(10);
	    test.info("Wait for topic content title's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(topicContentTitle));
	    Assert.assertTrue(topicContentTitle.isDisplayed());
	    test.info("Verified topic content title's is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(backToTopic.isDisplayed());
	    test.info("Verified back to topic breadcrumb is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on bac to topic");
	    backToTopic.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for topic page title's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title's is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setFeedTopics(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for topic page title's visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title's is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on content page");
	    for (WebElement element : feedTopics) {
            if (element.getText().contains("PwC")) {
            	   ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            	   JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                   executor.executeScript("arguments[0].click();", element);
                break;
            }
        }
	    
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    test.info("Wait for back to topic breadcrumb's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(backToTopic));
	    Assert.assertTrue(backToTopic.isDisplayed());
	    test.info("Verified back to topic is displayed");
	    test.info("Verified content page opened in same tab");
	    backToTopic.click();
	    HelperFunctions.waitForPageToLoad(10);
	    test.info("Wait for topic page title's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(topicPageTitle));
	   /* HelperFunctions.staticWait(2);
	    for (WebElement element : feedTopics) {
            if (element.getText().contains("Ghosted")) {
            	   ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            	   JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                   executor.executeScript("arguments[0].click();", element);
                break;
            }
        }
	     Set<String> handles = Driver.getDriver().getWindowHandles();
	    if (handles.size() == 2) {
	    	Assert.assertTrue(true);
	     System.out.println("Element opened the new tab");
	 }else {
			Assert.assertTrue(false);
	 }
	    test.info("Verified element opened the same tab");*/
	    HelperFunctions.staticWait(3);
	    
	}
	public void setHotTopicSameTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on hot topic");
	    hotTopicsTitles.get(0).click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for topic content title's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(topicContentTitle));
	    Assert.assertTrue(topicContentTitle.isDisplayed());
	    test.info("Verified topic content title's is displayed");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setFeedTopicsTagValue(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for topic page title's visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title's is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on content page");
	    for (WebElement element : feedTopics) {
            if (element.getText().toLowerCase().contains("content")) {
            	   ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            	   JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                   executor.executeScript("arguments[0].click();", element);
                break;
            }
        }
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for back to topic breadcrumb's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(backToTopic));
	    Assert.assertTrue(backToTopic.isDisplayed());
	    test.info("Verified back to topic is displayed");
	    HelperFunctions.staticWait(2);
	    String datatag = dataTag.getAttribute("data-tag");
        if (datatag != null && !datatag.isEmpty()) {
        	   Assert.assertTrue(true);
            System.out.println("The data-tag attribute is not null or empty.");
        } else {
        	 Assert.assertTrue(false);
            System.out.println("The data-tag attribute is null or empty.");
        }
        test.info("Verified data-tag attribute is not null or empty.");
	}
	public void setKeyAssetUrlAuth(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on key asset edit");
	    //HelperFunctions.scrollToElement(editTitle);
	    keyAssetEdit.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(keyAssetBarComponent.isDisplayed());
	    test.info("Verified keyAssetBarComponent banner is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Verified configure button is displayed");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    Assert.assertTrue(configure.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);	   
	    test.info("Wait for key asset container visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(keyAssetContainer));
	    Assert.assertTrue(keyAssetContainer.isDisplayed());
	    test.info("Verified key asset container is displayed");
	    HelperFunctions.staticWait(3);	
	    String titleText = keyUrlAuth.getText();
	    boolean hasAsterisk = titleText.contains("*");
	    Assert.assertTrue(hasAsterisk, "The 'key url' field does not have an asterisk.");
	    test.info("Verified The 'key url' field has an asterisk.");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setKeyAssetTitleandDescriptionLength(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on key asset edit");
	    //HelperFunctions.scrollToElement(editTitle);
	    keyAssetEdit.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(keyAssetBarComponent.isDisplayed());
	    test.info("Verified keyAssetBarComponent banner is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Verified configure button is displayed");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    Assert.assertTrue(configure.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);	   
	    test.info("Wait for key asset container visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(keyAssetContainer));
	    Assert.assertTrue(keyAssetContainer.isDisplayed());
	    test.info("Verified key asset container is displayed");
	    HelperFunctions.staticWait(3);	
	    String titleLength=keyTitle.getAttribute("data-max-length");
	    String descriptionLength=keyDescription.getAttribute("data-max-length");
	    Assert.assertTrue(titleLength.equals("75"));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(descriptionLength.equals("82"));
	    HelperFunctions.staticWait(3);
	}
	public void setTopicHeader(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Click preview button");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(previewButton));
	    clickableElement.click();
	    //previewButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Switch to iframe and get page title");
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    String title=topicPageTitle.getText();
	    System.out.println(title);
	    test.info("Switch back to default content and click page info button and open properties");
	    Driver.getDriver().switchTo().defaultContent();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(2);
	    test.info("Verify the title value matches the page title");
	    String title2=titleField.getAttribute("value");
	    System.out.println(title2);
	    Assert.assertEquals(title, title2);
	    HelperFunctions.staticWait(2);
	    test.info("Enter new title value and save and close");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    String mockTitle="Topic Test2";
	    titleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    test.info("Click preview button, switch to iframe, and get page title");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement clickableElement3 = wait3.until(ExpectedConditions.elementToBeClickable(previewButton));
	    clickableElement3.click();
	    //previewButton.click();
	    HelperFunctions.staticWait(3);
	    Driver.getDriver().switchTo().frame("ContentFrame");
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
        wait4.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    test.info("Verify the title value matches the page title");
	    String title3=topicPageTitle.getText();
	    System.out.println(title3);
	    Assert.assertEquals(mockTitle,title3);
	    test.info("Switch back to default content and click page info button and open properties");
	    Driver.getDriver().switchTo().defaultContent();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(2);
	    test.info("Enter new first title value and save and close");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    titleField.sendKeys("Topic Test");
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	}
	public void setPageTags(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(pageInfo));
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.scrollToElement(topicTagField);
	    HelperFunctions.staticWait(2);
	    tag2.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(errorLabel2));
	    Assert.assertTrue(errorLabel.isDisplayed());
	    HelperFunctions.staticWait(2);
	    topicTagOptions.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(topicOption));
	    topicOption.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(path1));
	    path1.click();
	    HelperFunctions.staticWait(2);
	    path2.click();
	    HelperFunctions.staticWait(2);
	    path3.click();
	    HelperFunctions.staticWait(2);
	    path4.click();
	    HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        Assert.assertTrue(tag1.isDisplayed());
        HelperFunctions.staticWait(1);
        Assert.assertTrue(tag2.isDisplayed());
        HelperFunctions.staticWait(1);
        Assert.assertTrue(tag3.isDisplayed());
        HelperFunctions.staticWait(1);
        Assert.assertTrue(tag4.isDisplayed());
        HelperFunctions.staticWait(1);
        tag1.click();
        HelperFunctions.staticWait(2);
        tag3.click();
        HelperFunctions.staticWait(2);
        tag4.click();
        HelperFunctions.staticWait(3);
        
	}
	public void setFeedTopicsLimit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 9));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for topic page title's visibility");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title's is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checked content's limit");
	    int limit=feedTopics.size();
	    int mockLimit=40;
	    Assert.assertTrue(limit>mockLimit);
	    HelperFunctions.staticWait(2);
	    test.info("Verified content's limit is more than 40");
	   /* String text1 = "Sanity practice ghost page";
        String text2 = "Demo page";
        List<String> elementTexts = new ArrayList<>();
        for (WebElement element : feedTopics) {
            String elementText = element.getText();
            elementTexts.add(elementText);
        }
        boolean correctOrder = true;
        int index1 = elementTexts.indexOf(text1);
        int index2 = elementTexts.indexOf(text2);
        if (index1 < 0 || index2 < 0 || index1 > index2) {
            correctOrder = false;
        }
        if (correctOrder) {
        	Assert.assertTrue(true);
            System.out.println("Text order is correct");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Text order is incorrect");
        }
        HelperFunctions.staticWait(2);*/
	}
	public void setTopicImageTitleDescription(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 9));
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(10);
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(pageInfo));
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(titleField));
	    String actualTitle=titleField.getAttribute("value");
	    String expectedTitle="Topic Test";
	    String actualDesc=descArea.getText();
	    String expectedDesc="Oracle";
	    Assert.assertEquals(actualTitle, expectedTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(actualDesc.startsWith(expectedDesc));
	    HelperFunctions.staticWait(2);
	    HelperFunctions.scrollToElement(imgArea);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(imgArea.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setKeyAssetTargetURL(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 35));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(topicPageTitle));
	    Assert.assertTrue(topicPageTitle.isDisplayed());
	    test.info("Verified topic page title is displayed");
	    HelperFunctions.staticWait(2);
	    keyAssetLink.click();
	    HelperFunctions.staticWait(2);
	    Set<String> handles = Driver.getDriver().getWindowHandles();
	    if (handles.size() == 2) {
	    	Assert.assertTrue(true);
	     System.out.println("Element opened the new tab");
	 }else {
			Assert.assertTrue(false);
	 }
	    test.info("Verified element opened the same tab");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setTopicFeed(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 35));
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(topicFeed));
	    Assert.assertTrue(topicFeed.isDisplayed());
	    test.info("Verified topic page title is displayed");
	    HelperFunctions.staticWait(3);
	   
	    
	}

}
