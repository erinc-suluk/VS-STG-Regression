package com.pwc.valuestore;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pwc.valuestore.ConfigurationsReader;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;
import com.pwc.valuestore.screenshotUtil;

import Pages.AuthoringPage;
import Pages.ContentPage;
import Pages.GhostedPage;
import Pages.HomePage;
import Pages.LoginPageObjects;
import Pages.TopicLandingPage;




public class RegressionTestCases extends HelperFunctions {
	
	ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	public static ConfigurationsReader read;
	String platform = null;
	LoginPageObjects lpo=new LoginPageObjects();
	HomePage hp=new HomePage();
	ContentPage cp=new ContentPage();
	GhostedPage gp=new GhostedPage();
	AuthoringPage ap=new AuthoringPage();
	TopicLandingPage tlp=new TopicLandingPage();
	screenshotUtil ssu=new screenshotUtil();
	private ExtentTest test;
	
	
	
	Logger logger=Logger.getLogger("SanityTestCases");
	
	ReadXLSdata read1=new ReadXLSdata();
	
	


	
	@BeforeSuite
	public void setUp() {
		 PropertyConfigurator.configure(".\\log4j.properties");
		    read = new ConfigurationsReader();
		    platform = read.getPlatform();
		    read.platformName();
		    String reportFilePrefix = "Regression Automation Report for Value Store";
		    String reportFileName = reportFilePrefix + ".html";
		    
		   
		    File existingReport = new File(reportFileName);
		    
		    if (existingReport.exists()) {
		       
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
		        String timestamp = dateFormat.format(new Date());
		        String newReportFileName = reportFilePrefix + "_" + timestamp + ".html";
		        
		        if (existingReport.renameTo(new File(newReportFileName))) {
		            System.out.println("Renamed existing report to: " + newReportFileName);
		        } else {
		            System.out.println("Failed to rename existing report.");
		        }
		    }

		
		    htmlReporter = new ExtentHtmlReporter(reportFileName);
		    extent = new ExtentReports();
		    extent.attachReporter(htmlReporter);
	    
	     
	}
		
	@BeforeMethod
	public void initTest() throws Exception {
	    Driver.getDriver();
	    read1.setExcelFile("./testdata.xlsx", "STG");
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().deleteAllCookies();
		HelperFunctions.setWaitTime();
		
		
	}
	
	
	/*******************************************************Regression Test Case********************************************************/
	
	
	@Test
	public void WEB_56() throws Exception{
		  String testName = "To verify that author can configure a picture and a quote for the highlight of the month which is combined with 'In case you missed it'.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 39));
		        lpo.setLogin3();
		        cp.setInCaseMissedItEdit(test);
		        test.pass("WEB_56 passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_57() throws Exception{
		  String testName = "To verify that \"In case you missed it\" items can be Content or Ghost pages."
				  +"To verify that 3 articles display in card format under \"In case you missed it\" section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setInCaseMissedItCardsNumbers(test);
		        test.pass("WEB_57 passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_58() throws Exception{
		  String testName = "To verify that the In case you missed it section articles display article title, topic label & favorite icon on the cards.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setIncaseYouMissedIt(test);
		        test.pass("WEB_58 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	@Test
	public void WEB_59() throws Exception{
		  String testName = "To verify that the topic tag and the article titles are pulled from the properties of the content page or ghost page."
				  +"To verify that the Topic tag is not clickable & the existing tag pill behavior has been removed."
				  +"To verify that the tag label applies ellipses when the character limit is exceeded 31 characters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        cp.setIncaseYouMissedItLabels(test);
		        test.pass("WEB_59 passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_60() throws Exception{
		  String testName = "To verify that Global header should contain User icon."+
	"To verify that Global header should contain PWC logo.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        //lpo.setLogin4();
		        hp.setUserIconandLogo(test);
		        test.pass("WEB_60 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_61() throws Exception{
		  String testName = "To verify that after clicking on external link share model appears and it should  display X icon."+
	"To verify that after clicking on external link share model appears and it should display Email button.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setExternalLinkShare(test);
		        test.pass("WEB_61 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_62() throws Exception{
		  String testName = "To verify that user can click on a shareable link under the helpful assets to open page in new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setExternalLinkShare(test);
		        test.pass("WEB_62 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_63() throws Exception{
		  String testName = "To verify that clicking on the share icon opens the share dialogue."+
	"To verify that when user clicks on the Copy link button it becomes \"Link copied!\".";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setExternalLinkShare(test);
		        test.pass("WEB_63 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_64() throws Exception{
		  String testName = "To verify that author can add multiple lines of text that handles typical styling/formatting like bold, paragraph alignment etc.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setAddingText(test);
		        test.pass("WEB_64 passed");
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_65() throws Exception{
		  String testName = "To verify that orange large text is available for stats and author can manually configure it.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2)); 
		        lpo.setLogin4();
		        cp.setMarketDemandOrange(test);
		        test.pass("WEB_65 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_66() throws Exception{
		  String testName = "To verify that \"Clear filters\" button should also be displayed  & clicking the button will clear all filters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setClearFilters(test);
		        test.pass("WEB_66 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_67() throws Exception{
		  String testName = "To verify that user should see the no result message when the system cannot find matching search content. ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setNoSearchResult(test);
		        test.pass("WEB_67 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_68() throws Exception{
		  String testName = "Verify that, as user types or pastes keyword in the search bar, system should start presenting suggested terms after 3rd character.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSearchResultsBasedonKeywordChar(test);
		        test.pass("WEB_68 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_69() throws Exception{
		  String testName = "Verify that, selecting a term will fill the keyword/phrases in the search bar, trigger the search and bring to the search results page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSearchResultsBasedonKeyword(test);
		        test.pass("WEB_69 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_70() throws Exception{
		  String testName = "Verify that, Clicking anywhere outside the search overlay should close the overlay."+
	"Verify that, on click, search overlay is displayed with a search bar and close button.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setClickingOutsideSearchOverlay(test);
		        test.pass("WEB_70 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_71() throws Exception{
		  String testName = "Verify that, clicking the “X” button will close the search overlay and leave the search keyword in the search bar";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setLeaveKeySuggestion(test);
		        test.pass("WEB_71 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_72() throws Exception{
		  String testName = "Verify that, on hover, the search icon turns pink and clickable.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSearchIconColor(test);
		        test.pass("WEB_72 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_73() throws Exception{
		  String testName = "To verify that the regular tile - Description (.vs-card_figure-description) character count increases to 185 characters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setCardDescriptionChar(test);
		        test.pass("WEB_73 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_74() throws Exception{
		  String testName = "To verify that the regular tile - Title (.vs-card_figure-heading) character count increases to 105 characters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setCardHeadingChar(test);
		        test.pass("WEB_74 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_75() throws Exception{
		  String testName = "To verify that trending & recent search terms should be presented without having to click into the search bar.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setTrendingandRecentSearches(test);
		        test.pass("WEB_75 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_76() throws Exception{
		  String testName = "To verify that after users click on the 'Did you mean' suggested keyword and trigger the search, display a message \"Showing results for suggested keyword\"."
				  +"To verify that clicking the 'Did you mean' suggested term will trigger the search.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setDidYouMean(test);
		        test.pass("WEB_76 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_77() throws Exception{
		  String testName = "Verify that, users can click on a number to navigate to that specific results page  ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSearchPagination(test);
		        test.pass("WEB_77 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_78() throws Exception{
		  String testName = "Verify that, users can click on “>” to navigate to the next page of results. ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setNextPage(test);
		        test.pass("WEB_78 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_79() throws Exception{
		  String testName = "Verify that, system should display 15 results per page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setTotalSearchItems(test);
		        test.pass("WEB_79 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_80() throws Exception{
		  String testName = "Verify that, clicking the content title of search results should open the page in the current window";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSearchResultsTopicTitleIcon(test);
		        test.pass("WEB_80 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_81() throws Exception{
		  String testName = "Verify that, results count should display number of results for the search as \"Showing <result number> of <result count> results\""
				  +"Verify that, clicking the “X” button should clear the keywords";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setResultCount(test);
		        test.pass("WEB_81 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_82() throws Exception{
		  String testName = "To verify that when a user opens the URL of the search result page that will directly load with pre-populated results that contain the keyword, Filter facets & Pagination.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSharetheURLwithSearchResults(test);
		        test.pass("WEB_82 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_83() throws Exception{
		  String testName = "To verify that filter menu should be expanded by clicking filters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setExpandedFilterItems(test);
		        test.pass("WEB_83 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_84() throws Exception{
		  String testName = "To verify that \"Off time\" is changed to a mandatory field on the page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 4));
		        lpo.setLogin4();
		        cp.setOffTimeMandatory(test);
		        test.pass("WEB_84 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_85() throws Exception{
		  String testName = "To verify that Inline links within text in Did you know component should stay black and underlined.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setDidYouKnowInline(test);
		        test.pass("WEB_85 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_86() throws Exception{
		  String testName = "To verify that underline hover state is added for all 'helpful assets' links.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setHelpfulAssetsLinkUnderlined(test);
		        test.pass("WEB_86 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_87() throws Exception{
		  String testName = "To verify that share icon has been removed from the content page title area.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setNotContainsShareIcon(test);
		        test.pass("WEB_87 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_88() throws Exception{
		  String testName = "To verify that Key asset must have a minimum of 1 link in the component";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setKeyAssetUrlAuth(test);
		        test.pass("WEB_88 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_89() throws Exception{
		  String testName = "To verify that a limit of 82 characters is allowed for description."
				  +"To verify that a Limit of maximum of 75 characters is allowed for the Link title.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setKeyAssetTitleandDescriptionLength(test);
		        test.pass("WEB_89 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_90() throws Exception{
		  String testName = "To verify that author can define up to 4 assets that are linked to the target asset."
				  +"To verify that author can select 3-column or 4-column layout depending on the number of topics.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setKeyAssetBar4articles(test);
		        test.pass("WEB_90 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_91() throws Exception{
		  String testName = "To verify that the Topic header is populated from the page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setTopicHeader(test);
		        test.pass("WEB_91 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_92() throws Exception{
		  String testName = "To verify that on clicking on the Topic title or topic icon, page should open in the current window.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setMoretoExploreItemCurrentTab(test);
		        test.pass("WEB_92 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_93() throws Exception{
		  String testName = "To verify that 'The Top 10' heading should hide when filters are applied.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setTop10Visibility(test);
		        test.pass("WEB_93 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_94() throws Exception{
		  String testName = "To verify that the tag label keeps as the Rose label for the article page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setRoseTagLabel(test);
		        test.pass("WEB_94 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_95() throws Exception{
		  String testName = "To verify that when user clicks on VS Home button, It should reload the homepage.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setVSHomepage(test);
		        test.pass("WEB_95 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_96() throws Exception{
		  String testName = "To verify that the top 10 article section contains two highlighted content in a larger size than the rest of the content.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setFirst2Article(test);
		        test.pass("WEB_96 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_97() throws Exception{
		  String testName = "To verify that the favicon should display as a visual reminder of the website identity in the address bar or in tabs.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setFavicon(test);
		        test.pass("WEB_97 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_98() throws Exception{
		  String testName = "To verify that the same hover effect exists on the article title."
				 // +"To verify that on mouse hover over article title of In case you missed it component display rose hyperlink(#D93954)."
				 + "Verify that 'You might also like' component displays below the retired page message";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setMightAlsoLikeHoverEffect(test);
		        test.pass("WEB_98 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_99() throws Exception{
		  String testName = "To verify that the article page opens in the same window."
				  +"To verify that the user can click on the article title to open the content page."
				  +"To verify that when the user clicks on the browser back button, it should bring a user back to the homepage and retain the filter results if any.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setMightLikeItemCurrentTab(test);
		        test.pass("WEB_99 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	@Test
	public void WEB_101() throws Exception{
		  String testName = "To verify that the filter results screen shows 3 rows of articles by default."
				  +"To verify that the user allows clicking the 'Load more' button to show additional 3 rows of the article at a time until all results are displayed.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setLoadMore3rows(test);
		        test.pass("WEB_101 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_102() throws Exception{
		  String testName = "To verify that  for content page template \"Alliances\" text should translated to \"Alianzas\"  for Spanish translation."
				  
				  +"To verify that  for content page template \"Enablers\" text should translated to \"Habilitadores\"  for Spanish translation.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 43));
		        lpo.setLogin4();
		        cp.setMexicoSideTitles(test);
		        test.pass("WEB_102 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_103() throws Exception{
		  String testName = "To verify that author can configure shareable via Dynamic Signal for each link item."
				  +"To verify that 'Share via Dynamic Signal' is optional."
				  +"To verify that this Helpful asset section should contain groups of links and it can configure manually.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setConfigureDynamicSignal(test);
		        test.pass("WEB_103 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_104() throws Exception{
		  String testName = "To verify that clicking the 'Share via Dynamic Signal' button takes user to the post and opens a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setDynamicSignalOpenNewTab(test);
		        test.pass("WEB_104 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_105() throws Exception{
		  String testName = "To verify that user can click on hyperlink and it should open in new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setCampaignMaterialsOpenNewTab(test);
		        test.pass("WEB_105 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_106() throws Exception{
		  String testName = "To verify that this section is manually configure to add text and URL. ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setConfigureCampaignMaterials(test);
		        test.pass("WEB_106 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_107() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setConfigureClientExamples(test);
		        test.pass("WEB_107 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_108() throws Exception{
		  String testName = "To verify that a user can see client examples.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setClientExampleVisibility(test);
		        test.pass("WEB_108 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_109() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting."
				  +"To verify that author can manually configure this section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setConfigureMarketDemand(test);
		        test.pass("WEB_109 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_110() throws Exception{
		  String testName = "To verify that all alliances hyperlinks should open in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setAlliancesLinkOpenNewTab(test);
		        test.pass("WEB_110 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_111() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting in alliances section."
				  +"To verify that author can add hyperlink in alliances section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setConfigureAlliances(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_112() throws Exception{
		  String testName = "To verify that user is able to click a hyperlink and this link should open in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 16));
		        lpo.setLogin4();
		        cp.setCampaignStructureLinkOpenNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_113() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting in did you know section."
				  +"To verify that user can see key opportunity information related to the content in this section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 2));
		        lpo.setLogin4();
		        cp.setConfigureDidYouKnow(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_114() throws Exception{
		  String testName = "To verify that in this section for each group, there should be  a Group label, item label and  item URL.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setHelpfulAssetsItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_115() throws Exception{
		  String testName = "To verify that clicking on the quick links icon, the mega menu is displayed with the underline on the quick links icon.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setQuickLinksIconOpensItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_116() throws Exception{
		  String testName = "To verify that the first tag is mandatory."+
	"To verify that 2nd, 3rd and 4th tags are optional on topic landing page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setPageTags(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_117() throws Exception{
		  String testName = "To verify that this area should split into two or more section e.g. who’s impacted and often asked questions.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setSplit2sections(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_118() throws Exception{
		  String testName = "To verify that this section should contain links that point to helpful reference material both internal and external to PwC.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setHelpfulAssetsInternalExternal(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_119() throws Exception{
		  String testName = "To verify that there is three groups of links in enablers section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setEnablersLinks(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_120() throws Exception{
		  String testName = "To verify that author can update these non mandatory field later in page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 30));
		        lpo.setLogin4();
		        cp.setUpdateNonMandatoryTag(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_121() throws Exception{
		  String testName = "To verify that ghost page does not have revised date property."
				  +"-To verify that ghost page has published date property which is mandatory."
				  +"-To verify that ghost page has target URL property which is mandatory."
				  +"-To verify that ghost page has description property which is mandatory."
				 + "-To verify that ghost page has title property which is mandatory.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 6));
		        lpo.setLogin4();
		        gp.setMandatoryFields(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_122() throws Exception{
		  String testName = "To verify that \"Read on pwc.com\" button is manually authored.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 30));
		        lpo.setLogin4();
		        cp.setPWCButton(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	@Test
	public void WEB_127() throws Exception{
		  String testName = "To verify that spinner will show while loading filter results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSpinner(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_128() throws Exception{
		  String testName = "To verify that only one filter can be expanded at a time."
				  +"To verify that the user clicks on a filter header to expand the filter menu."
				 +"To verify that the filter header presents the Sector, Economic buyer & Topic."
				  +"To verify that the user can select multiple filter options in one category as well as in multiple categories.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSelectedDropdown(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_129() throws Exception{
		  String testName = "To verify that when the user clicks on the browser back button, It should bring the user back to the Homepage and retain the filter results if any."
				  +"To verify that when user opens the article page, It should open in the same window.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setBrowserBackButton(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_130() throws Exception{
		  String testName = "To verify that each article displays the image, title, description & this data pulled from the properties of the content page or ghost page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setArticleImagesTitleDescription(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_131() throws Exception{
		  String testName = "To verify that the article page should open in a new tab if it is external content(ghost page).";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setNewTabGhostPage(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_132() throws Exception{
		  String testName = "To verify that the height of the cards adapts according to the length and the number of characters in the title and description, rather than a set height.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setCardsSize(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_133() throws Exception{
		  String testName = "To verify that Feed article should open  in the current window if it's internal VS content."
				  +"/To verify that article should open in a new tab if it's an external content (ghost page)(exluded)."
				  +"/To verify that clicking the back button brings the user back to the topic page where the user came from.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 44));
		        lpo.setLogin4();
		        tlp.setFeedTopics(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_134() throws Exception{
		  String testName = "To verify that feed presents all relevant content & there is no limit.";
				 // +"To verify that feed contents are sorted by the most recent publication date.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 44));
		        lpo.setLogin4();
		        tlp.setFeedTopicsLimit(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_135() throws Exception{
		  String testName = "To verify that If user navigates to a VS content page from the topic landing page, present a 'Back to topic page' button on the content page which can bring the user back"
				  +"To verify that click on the Hot topic title & description to open an article.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 44));
		        lpo.setLogin4();
		        tlp.setBacktoTopicandTopicsSize(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_136() throws Exception{
		  String testName = "To verify that author can manually author up to 4 articles by selecting a content page or a ghost page to populate the component.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setHotTopics4articles(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_137() throws Exception{
		  String testName = "To verify that image, title, description are populated from the page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 9));
		        lpo.setLogin4();
		        tlp.setTopicImageTitleDescription(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_138() throws Exception{
		  String testName = "To verify that the maximum character limit for the quick link title is 54 characters & author is not allowed to enter more than the limit."
				  +"To verify that the maximum character for the quick link description is 75 characters & author is not allowed to enter more than limit.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 33));
		        lpo.setLogin4();
		        ap.setEditQuickLinks();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_139() throws Exception{
		  String testName = "To verify that the quick link description for the first 2 items is mandatory.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 33));
		        lpo.setLogin4();
		        ap.setEditQuickLinks2();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_140() throws Exception{
		  String testName = "To verify that the column 2-4 link titles are sorted by alphabetical order.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setQuickLinksOrder(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_141() throws Exception{
		  String testName = "To verify quick link item opens in a new tab if it's an external page."
				  +"To verify that the quick link item opens in the current window if it's an internal value store page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setQuickLinksInternalExternal(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_142() throws Exception{
		  String testName = "To verify that the play/pause button, seek bar, video timer, speed, volume adjustment & full screen/exit should appear on the control bar.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setVideoPlayerElements(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_143() throws Exception{
		  String testName = "To verify that author can configure the media player on value store content page template."
				  +"To verify that the video will automatically start to play if the 'auto play' option is selected by the author.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 30));
		        lpo.setLogin4();
		        cp.setVideoPlayerEdit(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_144() throws Exception{
		  String testName = "To verify that the top navigation icon is highlighted with a pink outline when rolled hover & clicked it.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setTopNavigationColor(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_145() throws Exception{
		  String testName = "To verify that hover effect on the territory selector.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setTerritoryColor(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_146() throws Exception{
		  String testName = "To verify that when user clicks on the PwC button, It should open in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setPwcButtonNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_147() throws Exception{
		  String testName = "To verify that all value store users can see the Related articles."
				  +"To verify that click on the Related article title to open the content page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setRelatedArticle(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_148() throws Exception{
		  String testName = "To verify that the same Content template & components are used for the MX content that currently exists for the US.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 34));
		        lpo.setLogin4();
		        ap.setContentTemplateMexico();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_149() throws Exception{
		  String testName = "To verify that the same Ghost template is used for the MX content that currently exists for the US.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 34));
		        lpo.setLogin4();
		        ap.setGhostTemplateMexico();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_150() throws Exception{
		  String testName = "To verify that given target possible URLs (such as google drive links, VS content, pdf) should open from the topic landing page key asset bar."
				  +"To verify that click on a link that opens the asset in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 36));
		        lpo.setLogin4();
		        tlp.setKeyAssetTargetURL(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_151() throws Exception{
		  String testName = "To verify that feed is system populated.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 36));
		        lpo.setLogin4();
		        tlp.setTopicFeed(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_152() throws Exception{
		  String testName = "To verify that same functionality should available for MX territory footer.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 43));
		        lpo.setLogin4();
		        cp.setMXFooter(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_153() throws Exception{
		  String testName = "To verify that an image and quote text is defined by the author.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 39));
		        lpo.setLogin4();
		        ap.setMightLikeEdit();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	} 
	@Test
	public void WEB_154() throws Exception{
		  String testName = "To verify that content manager should get report of all the VS pages for a given folder path.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 32));
		        lpo.setLogin4();
		        ap.setGettingReport();
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_155() throws Exception{
		  String testName = "To verify that backup articles should be set up by the system, not manually maintained by the authorr."
				  +"To verify that mandatory image property on the content page, so that it is populated on the Homepage articles";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 4));
		        lpo.setLogin4();
		        cp.setWhatOthersSystemAuthored(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_156() throws Exception{
		  String testName = "To verify that ghost page will have the same look and feel as other Content pages when it is used as target page for Homepage components e.g.Hero, top 9, In case you missed it and highlight.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 42));
		        lpo.setLogin4();
		        hp.setGhostedPageasHomepage(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_157() throws Exception{
		  String testName = "To verify that author can configure up to 4 recommended articles that will display on the page when there are no filter results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 39));
		        lpo.setLogin4();
		        ap.setConfigure4Articles();
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_158() throws Exception{
		  String testName = "To verify that author can configure up to 4 recommended articles that will display on the page when there are no filter results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setArticlesWithNoResult(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_159() throws Exception{
		  String testName = "Verify that, users can use the favorite icon to add or remove their favorite pages"
				  +"To verify that favorites page displays the user's saced favorite contents"
				  +"To verify that favorite pages can be added and removed by clicking on the favorite icon"
				  +"To verify that favorite page icon leads the user to their favorites page"
				  +"To verify that when there is 0 favorite content, display a no favorites page"
				  +"To verify that favorite page icon turns pink to indicate the page has been added to favorites"
				  +"To verify that favorite page icon is highlighted when user is on the favorites page"
				  +"To verify that article tiles displayed on the favorite page follow the same functionality as the homepage Top10 tiles";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setFavContents(test);
		        test.pass("WEB_159 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_160() throws Exception{
		  String testName = "To verify that the flag is removed once the content publish date is beyond 30 days from the calendar date"
				  + "To verify that system looks at the publish date field and applies New flag to content that is 30 day window from the current calendar date"
				  +"To verify that author can enter a new expiration date when they republish an expired page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 30));
		        lpo.setLogin4();
		        cp.setNewLabel(test);
		        test.pass("WEB_160 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_161() throws Exception{
		  String testName = "To verify that users can favorite MX pages and access those favorites on Mexico sites";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setFavContentsMexico(test);
		        test.pass("WEB_161 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_162() throws Exception{
		  String testName = "To verify that user should be able to filter & open the content pages on Mexico sites"
				  +"To verify that searching and filtering results are constrained to the respective territory";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setFilterResultsMexico(test);
		        test.pass("WEB_162 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_163() throws Exception{
		  String testName = "To verify that user can click on the territory selector to open the dropdown"
				  + "To verify that any user can toggle between the US and Mexico";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSelectTerritory(test);
		        test.pass("WEB_163 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_164() throws Exception{
		  String testName = "To verify that there should be consistent page header with the ability to return to the Homepage"
				  +"To verify that this Global footer should be persistent on all pages";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 17));
		        lpo.setLogin4();
		        cp.setHeaderFooter(test);
		        test.pass("WEB_164 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_165() throws Exception{
		  String testName = "To verify that homepage should continue to function as after it's shared & user opens with the pre-filtered results"
				  +"To verify that user who receive the link and opens the link should be brought to the homepage with the pre-filtered results";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSharetheURLwithFilter(test);
		        test.pass("WEB_165 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_166() throws Exception{
		  String testName = "To verify that user will be able to sort the tiles by Oldest to Newest"
				  +"To verify that default sorting of the article tiles is by the most recent published date";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setFavFilter(test);
		        test.pass("WEB_166 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_167() throws Exception{
		  String testName = "To verify that the heart icon gets filled on the mouse hover or after clicking it";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setHeartColor(test);
		        test.pass("WEB_167 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_168() throws Exception{
		  String testName = "To verify that homepage hyperlink and the mailto link should turn rose on Not found pahe when hover on it"
				  +"To verify that user should get 404 not found error when user load VS page and that content does not exist"
				  +"To verify that clicking the 'Value Store home page' hyperlink will bring user to the homepage on Not found page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 45));
		        lpo.setLogin4();
		        cp.setMailtoColor(test);
		        test.pass("WEB_168 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_169() throws Exception{
		  String testName = "To verify that 'Not found' page applies to both US and Mexico sites";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 46));
		        lpo.setLogin4();
		        cp.setMailtoMexico(test);
		        test.pass("WEB_169 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_170() throws Exception{
		  String testName = "To verify that 'NEW' flag translation to Spanish in Mexico site for all components that have applied with the 'NEW' flag";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSpanishTag(test);
		        test.pass("WEB_170 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_171() throws Exception{
		  String testName = "To verify that, Trending term should be based on the local definition & seperate list of terms for the US & MX ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setTrendingSearch(test);
		        test.pass("WEB_171 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_172() throws Exception{
		  String testName = "To verify that the page gets automatically removed from the user's favorites when a content page is expired or unpublished";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setDeletedUnpublishPagefromFavs(test);
		        test.pass("WEB_172 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_173() throws Exception{
		  String testName = "To verify that, Users can click on a recent term to trigger the search directly and will be presented with the search results page"
				  +"To verify that, user's recent searches will be captured regardless of the territory & it will be one list containing user's searches from any site";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setResentSearch(test);
		        test.pass("WEB_173 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_174() throws Exception{
		  String testName = "To verify that, System should remove any search terms that yield no result";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setDeleteNoResult(test);
		        test.pass("WEB_174 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_175() throws Exception{
		  String testName = "To verify that pages should be excluded that are checked with 'Hide page from Site Search";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 49));
		       // lpo.setLogin4();
		        cp.setHideSiteSearch(test);
		        test.pass("WEB_175 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	@Test
	public void WEB_176() throws Exception{
		  String testName = "To verify that the Accordion's first Item(title and text) per Heading Title should expand and be visible by default"
				  +"To verify that author should manually configure content area section";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 30));
		        lpo.setLogin4();
		        cp.setAccordion(test);
		        test.pass("WEB_176 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_177() throws Exception{
		  String testName = "To verify that Global territory is added to the territory selector"
				  +"/ To verify that all users are able to switch between territories using the territory selector"
				  +"/ To verify that Global territory will have no GMO hearts, and no favorite page within Global site"
				  +"/ To verify that Global territory will NOT have favorites option";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setNoFavGlobal(test);
		        test.pass("WEB_177 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_178() throws Exception{
		  String testName = "To verify that author is able to select url from a Value Store pages in the Enablers component";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 30));
		        lpo.setLogin4();
		        cp.setEnablersEditUrl(test);
		        test.pass("WEB_178 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_179() throws Exception{
		  String testName = "To verify that GX content will leverage the topic landing page template & components that currently exists for the US and MX";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 50));
		        lpo.setLogin4();
		        ap.setTopicTemplateGlobal();
		        test.pass("WEB_179 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_180() throws Exception{
		  String testName = "To verify that GX content will leverage the content page template & components that currently exists for the US and MX";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 50));
		        lpo.setLogin4();
		        ap.setContentTemplateGlobal();
		        test.pass("WEB_180 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_181() throws Exception{
		  String testName = "To verify that GX content will leverage the ghost page template & components that currently exists for the US and MX";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 50));
		        lpo.setLogin4();
		        ap.setGhostTemplateGlobal();
		        test.pass("WEB_181 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_182() throws Exception{
		  String testName = "To verify that GX pages can be tagged with master tags or GX supplemental tags";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 51));
		        lpo.setLogin4();
		        cp.setPrimaryTagsForGlobal(test);
		        test.pass("WEB_185 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_185() throws Exception{
		  String testName = "To verify that this helpful asset section should contain links that point to helpful reference material both internal and external to PwC";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setInternalUrl(test);
		        test.pass("WEB_185 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_186() throws Exception{
		  String testName = "To verify that this helpful asset section should contain links that point to helpful reference material both internal and external to PwC";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 31));
		        lpo.setLogin4();
		        cp.setExternalUrl(test);
		        test.pass("WEB_186 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_187() throws Exception{
		  String testName = "To verify that when there are more than 48 articles, display a 'Show More' button";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		       // lpo.setLogin4();
		        hp.setShowMore(test);
		        test.pass("WEB_187 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_188() throws Exception{
		  String testName = "To verify that authors should be able to define External link URL"
				  +"/ To verify that external links description is defined by the authors"
				  +"/ To verify that external link title is defined by the authors";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 50));
		        lpo.setLogin4();
		        cp.setExternalPageAuth(test);
		        test.pass("WEB_187 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test
	public void WEB_189() throws Exception{
		  String testName = "To verify that users can select one or more territories ti view cross territory search results";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setSelectingTerritoriesSearchResult(test);
		        test.pass("WEB_187 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test
	public void WEB_190() throws Exception{
		  String testName = "To verify that external links description will open the link in a new tab";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 10));
		        lpo.setLogin4();
		        hp.setExternalLinkDesc(test);
		        test.pass("WEB_187 passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/******************************************************************************************************************************/
	
	public String takeScreenshot(String screenshotName) throws IOException {
	    WebDriver driver = Driver.getDriver();
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    String destination = "screenshots/" + screenshotName + ".png";
	    File target = new File(destination);
	    FileUtils.copyFile(source, target);
	    return destination;
	}
	public void captureScreenshotAndAddToReport(String testName) throws IOException {
		 String screenshotPath = takeScreenshot(testName);
		 ExtentTest test = extent.createTest(testName).pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}
	@AfterMethod
    public void closeTabs() {
        String currentWindow = Driver.getDriver().getWindowHandle();
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(currentWindow)) {
            	Driver.getDriver().switchTo().window(window);
            	Driver.getDriver().close();
            }
        }
        Driver.getDriver().switchTo().window(currentWindow);
         }
	public void tearDown(ITestResult result) throws IOException {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        // Take screenshot if test method fails
	        String screenshotPath = takeScreenshot(result.getName() + "_failed");
	        test.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    } else if (result.getStatus() == ITestResult.SUCCESS) {
	        // Take screenshot if test method passes
	        String screenshotPath = takeScreenshot(result.getName() + "_passed");
	        test.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    }
	    extent.flush();
	}
      @AfterSuite
	public void closingBrowser() {
		extent.flush();
		//Driver.closeDriver();
	}
	
	


	

}