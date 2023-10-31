package Pages;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;


public class HomePage extends HelperFunctions {
	public HomePage() {
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
	
	@FindBy(xpath="//img[contains(@alt, 'logo')]")
	private WebElement logo;
	
	@FindBy(xpath="//figure[@class='vs-card__figure-wrapper']")
	private static List<WebElement> tagPills;
	
	@FindBy(xpath="//span[normalize-space()='Topic']")
	private WebElement selectTopic;
	
	@FindBy(xpath="(//label[@for='value-store:topic/deals'])[2]")
	private WebElement dealsCheckbox;
	
	@FindBy(xpath="//a[contains(text(),'erinc-content')]")
	private WebElement automationContentPage;
	
	@FindBy(xpath="//li[@class='userprofile']")
	private WebElement userIcon;
	
	@FindBy(xpath="//div[@class='vs-filter__selected vs-filter__desktop-selected']//button[1]")
	private WebElement selectedFilter;
	
	@FindBy(xpath="//div[@class='vs-filter__selected vs-filter__desktop-selected']//button[@class='vs-filter__selected-pill vs-filter__selected-pill--transparent'][normalize-space()='Clear filters']")
	private WebElement clearFilter;
	
	@FindBy(xpath="//h2[@class='vs-filter__title']")
	private WebElement filterTitle;
	
	@FindBy(xpath="//h2[@class='vs-filter__title']")
	private static List<WebElement> filterTitle2;
	
	@FindBy(xpath="//span[@class='vs-header__logo-title']")
	private WebElement valueStore;
	
	@FindBy(xpath="//button[@class='vs-card__cta-load-more']")
	private WebElement loadMore;
	
	@FindBy(xpath="//div[@class='vs-card__favorite-pill-wrapper']")
	private static List<WebElement> assets;
	
	@FindBy(xpath="(//a[@class='vs-feature-card__figure-heading'])[1]")
	private WebElement firstAssetHomepage;
	
	@FindBy(xpath="//a[@class='vs-feature-card__figure-heading']")
	private static List<WebElement> firstAssetsHomepage;
	
	@FindBy(xpath="(//div[@class='vs-card__favorite-pill-wrapper'])[1]")
	private WebElement firstAssetFilter;
	
	@FindBy(xpath="//link[@rel='shortcut icon']")
	private WebElement faviconLink;
	
	@FindBy(xpath="//a[@class='vs-card__figure-heading']")
	private static List<WebElement> articleTitles;
	
	@FindBy(xpath="//img[@class='vs-card__figure-img']")
	private static List<WebElement> articleImages;
	
	@FindBy(xpath="//p[@class='vs-card__figure-description']")
	private static List<WebElement> articleDescriptions;
	
	@FindBy(xpath="(//a[@class='vs-card__figure-heading'])[1]")
	private WebElement firstArticleTitle;
	
	
	@FindBy(xpath="(//p[@class='vs-card__figure-description'])[1]//a")
	private WebElement firstArticleDescription;
	
	@FindBy(xpath="(//img[@class='vs-card__figure-img'])[1]")
	private WebElement firstArticleImg;
	
	@FindBy(xpath="//h3[@class='vs-topic__heading']")
	private WebElement moretoExplore;
	
	@FindBy(xpath="//span[@class='vs-topic__subheading']")
	private WebElement moretoExploreSub;
	
	@FindBy(xpath="//div[@class='vs-topic__more-explorer-item']//a")
	private static List<WebElement> exploreItemsLink;
	
	@FindBy(xpath="//div[@class='vs-topic__more-explorer-item']")
	private static List<WebElement> exploreItems;
	
	@FindBy(xpath="//div[@class='vs-topic__more-explorer-item']//label")
	private static List<WebElement> exploreItemsLabel;
	
	@FindBy(xpath="//div[@class='vs-topic__more-explorer-item']//img")
	private static List<WebElement> exploreItemsLogo;
	
	@FindBy(xpath="//span[@class='vs-header__search-btn']")
	private WebElement searchButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search')]")
	private WebElement searchField;
	
	@FindBy(xpath="//span[@class='vs-search__result-not-found-heading']")
	private WebElement noSearchResult;
	
	@FindBy(xpath="//div[@class='vs-content__you-might-also-like-wrapper']//h2")
	private WebElement alsoLikeTitle;
	
	@FindBy(xpath="//div[@class='vs-card__box-heading_youmightalsolike']")
	private static List<WebElement> alsoLikeLabels;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-box-content']")
	private static List<WebElement> alsoLikeTitles;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-box-content']//a")
	private static List<WebElement> alsoLikeTitles2;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-favorites']")
	private static List<WebElement> alsoLikeFavIcon;
	
	@FindBy(xpath="//div[@class='vs-card__youmightalsolike-highlight-item']")
	private WebElement alsoLikeImage;
	
	@FindBy(xpath="//a[@class='vs-header__quicklinks-img']//span")
	private WebElement quickLinksIcon;
	
	@FindBy(xpath="//div[@class='vs-header__td-menu-item-wrapper']")
	private static List<WebElement> tdMenuItems;
	
	@FindBy(xpath="//div[@class='vs-header__wt-menu-item-wrapper']")
	private static List<WebElement> wtMenuItems;
	
	@FindBy(xpath="//span[@class='vs-header__desktop-close-icon']")
	private WebElement closeQuickLinks;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']")
	private WebElement terriMenu;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='MX_Title']")
	private WebElement mexico;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='Global']")
	private WebElement global;
	
	@FindBy(xpath="//li[@class='navigation vs-header__sub-menu']//a[@title='US_Title']")
	private WebElement US;
	
	@FindBy(xpath="//li[@data-suggestedterm-keyword='firmwide']")
	private WebElement suggestedKeyword;
	
	@FindBy(xpath="//li[@data-suggestedterm-keyword='Deals']")
	private WebElement suggestedKeyword2;
	
	@FindBy(xpath="(//div[@class='vs-search__items']//a)[1]")
	private WebElement searchItem;
	
	@FindBy(xpath="(//div[@class='vs-search__explorer-image-wrapper'])[1]")
	private WebElement searchItemIcon;
	
	@FindBy(xpath="//div[@class='trending-search']//span[@class='vs-header__search-analytics-heading']")
	private WebElement trendingSearch;
	
	@FindBy(xpath="//div[@class='recent-searches']")
	private WebElement recentSearch;
	
	@FindBy(xpath="//ul[@class='vs-header__search-key-suggestion']//li")
	private static List<WebElement> trendingSuggestions;
	
	@FindBy(xpath="//div[@class='vs-filter__selected vs-filter__desktop-selected']//button[normalize-space()='Deals']")
	private WebElement dealsSearch;
	
	@FindBy(xpath="//h2[@class='vs-title-area__card-box-content-heading page-title ']")
	private WebElement contentTitle;
	
	@FindBy(xpath="//ul[@class='vs-header__search-key-suggestion']")
	private WebElement keySuggestion;
	
	@FindBy(xpath="//div[@class='vs-card__wrapper']")
	private WebElement wrapper;
	
	@FindBy(xpath="//span[@class='vs-header__search-close']")
	private WebElement closeSearch;
	
	@FindBy(css=".vs-card__figure-description")
	private static List<WebElement> tileDescriptions;
	
	@FindBy(css=".vs-card__figure-heading")
	private static List<WebElement> tileHeading;
	
	@FindBy(xpath="//div[@class='vs-search__suggestion-text-wrapper']")
	private WebElement didYouMean;
	
	@FindBy(xpath="//span[@class='vs-search__suggestion-text']")
	private WebElement didYouMeanText;
	
	@FindBy(xpath="//div[@class='vs-search__showing-result']//p")
	private WebElement suggestedHeading;
	
	@FindBy(xpath="//span[@class='vs-search__showing-result-topic']")
	private WebElement suggestedText;
	
	@FindBy(xpath="//ul[@class='vs-search__pagination-wrapper']")
	private WebElement pagination;
	
	@FindBy(xpath="//li[contains(@class, 'page__numbers') and text()='2']")
	private WebElement secondSearchPage;
	
	@FindBy(xpath="//li[@class='page__btn']")
	private WebElement nextPage;
	
	@FindBy(xpath="//div[@class='vs-search__items']")
	private static List<WebElement> searchItems1;
	
	@FindBy(xpath="//div[@class='vs-search__more-explorer-item']")
	private static List<WebElement> searchItems2;
	
	@FindBy(xpath="//div[@class='vs-search__showing-result']//span")
	private WebElement resultCountElement;
	
	@FindBy(xpath="//span[@class='vs-search__input-clear']")
	private WebElement clearSearch;
	
	@FindBy(xpath="//button[@class='search-disabled']")
	private WebElement disabledSearch;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//div[@class='vs-filter__dropdown-listing']")
	private WebElement filterList;
	
	@FindBy(xpath="//a[@data-classid='topic-tagpill']")
	private WebElement tagLabel;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement contentBox;
	
	@FindBy(xpath="//span[normalize-space()='Sector']")
	private WebElement sectorButton;
	
	@FindBy(xpath="//span[normalize-space()='Economic buyer']")
	private WebElement ecoBuyerButton;
	
	@FindBy(xpath="//span[normalize-space()='Topic']")
	private WebElement topicButton;
	
	@FindBy(xpath="//li[@class='vs-filter__listing-item selected']//span")
	private WebElement selectedDropdown;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']")
	private WebElement dropdownMenu;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//input[@id='value-store:subsector/asset-and-wealth-management']")
	private WebElement sectorFilter1;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//input[@id='value-store:subsector/health-industries']")
	private WebElement sectorFilter2;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//input[@id='value-store:economic-buyer/business-development-m&a']")
	private WebElement ecoFilter1;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//input[@id='value-store:economic-buyer/chief-risk']")
	private WebElement ecoFilter2;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//input[@id='value-store:topic/cloud-and-digital']")
	private WebElement topicFilter1;
	
	@FindBy(xpath="//div[@class='vs-filter__dropdown vs-filter__dropdown--desktop']//input[@id='value-store:topic/deals']")
	private WebElement topicFilter2;
	
	@FindBy(xpath="//div[@class='vs-filter__spinner']")
	private WebElement spinner;
	
	@FindBy(xpath="//div[@class='vs-card__filter-result-card']")
	private static List<WebElement> articleCards;
	
	@FindBy(xpath="//div[@class='vs-header__wt-menu-item-wrapper']//a")
	private static List<WebElement> quickLinks;
	
	@FindBy(xpath="(//a[@class='vs-header__menu-link-title external'])[1]")
	private WebElement firstExternal;
	
	@FindBy(xpath="(//a[@class='vs-header__menu-link-title '])[1]")
	private WebElement firstInternal;
	
	@FindBy(xpath="//a[@class='vs-header__favorites-empty-img']//span[contains(text(),'Favorites')]")
	private WebElement favNavigation;
	
	@FindBy(xpath="(//span[contains(text(),'Risk and')])[2]")
	private WebElement riskCheckbox;
	
	@FindBy(xpath="//div[@id='trending']")
	private WebElement trendingSearch2;
	
	@FindBy(xpath="//input[contains(@placeholder,'Buscar')]")
	private WebElement searchField2;
	
	@FindBy(xpath="//span[@class='vs-header__favorites']")
	private WebElement favIcon;
	
	@FindBy(xpath="//span[@class='vs-header__favorites']//a")
	private WebElement favIconLink;
	
	@FindBy(xpath="//span[@class='vs-card__favorites-btn topten_favorites-btn']")
	private static List<WebElement> articleFavIcons;
	
	@FindBy(xpath="//span[@class='vs-feature-card__favorites-btn']")
	private static List<WebElement> articleFavIcons2;
	
	@FindBy(xpath="//div[@class='vs-favorites__header']")
	private WebElement favHeader;
	
	@FindBy(xpath="//div[@class='vs-favorites__no-result-heading']")
	private WebElement noResultHeading;
	
	@FindBy(xpath="//span[@class='vs-card__favorites-btn fill-heart']")
	private static List<WebElement> favIconsFav;
	
	@FindBy(xpath="//span[@class='vs-card__favorites-btn fill-heart']")
	private WebElement favIconFav;
	
	@FindBy(xpath="//span[normalize-space()='Tema']")
	private WebElement selectTopicMX;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement favFilter;
	
	@FindBy(xpath="//li[normalize-space()='Oldest to Newest']")
	private WebElement oToN;
	
	@FindBy(xpath="//span[@class='vs-card__tag-pill']")
	private static List<WebElement> spanishTags;
	
	@FindBy(xpath="//div[@class='vs-search__items-wrapper']")
	private WebElement itemsWrapper;
	
	@FindBy(xpath="//div[contains(@class, 'image_description')]")
	private WebElement retiredMessage;
	
	@FindBy(xpath="//span[normalize-space()='Trending searches']")
	private WebElement usTrending;
	
	@FindBy(xpath="//span[normalize-space()='Tendencias de búsqueda']")
	private WebElement mxTrending;
	
	@FindBy(xpath="//a[@class='vs-search__figure-heading']")
	private WebElement favLinkSearch;
	
	@FindBy(xpath="//a[contains(@class, 'fav-icon')]")
	private WebElement favPageIcon;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Unpublish Page']")
	private WebElement unpublishPage;
	
	@FindBy(xpath="(//coral-button-label[normalize-space()='Confirm'])[2]")
	private WebElement confirm;
	
	@FindBy(xpath="//div[@class='vs-filter__container']")
	private WebElement filterContainer;
	
	@FindBy(xpath="//div[@class='recent-searches']//li")
	private static List<WebElement> recentList;
	
	@FindBy(xpath="//button[contains(@class, 'show-more')]")
	private WebElement showMore;
	
	@FindBy(xpath="//a[normalize-space()='Fav Automation']")
	private static List<WebElement> favAutomation;
	
	@FindBy(xpath="//span[@class='vs-header__favorites']")
	private static List<WebElement> favIcon2;
	
	@FindBy(xpath="//a[contains(@class, 'vs-search__figure-heading')]")
	private static List<WebElement> searchItems3;
	
	@FindBy(xpath="//input[@id='t_Mexico']")
	private WebElement mexicoCheckbox;
	
	@FindBy(xpath="//input[@id='t_Global']")
	private WebElement globalCheckbox;
	
	@FindBy(xpath="//input[@id='t_Estados Unidos']")
	private WebElement usCheckbox;
	
	@FindBy(xpath="//input[@id='t_US']")
	private WebElement usGlobalCheckbox;
	
	@FindBy(xpath="//span[@class='vs-search__applied-territory']")
	private static List<WebElement> terriLabels;
	
	@FindBy(xpath="//p[@class='vs-search__figure-description']//a[contains(text(),'Testing')]")
	private WebElement externalDesc;
	
	
	ReadXLSdata read1=new ReadXLSdata();
	
	public void setAccesingHomepage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(tagPills.get(0).isDisplayed());
	    test.info("Verified tag pill is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(userIcon.isDisplayed());
	    HelperFunctions.staticWait(2);
	}
	
	public void setFilterContentpage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", automationContentPage);
	    test.info("Scroll to automation content page");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(automationContentPage.isDisplayed());
	    test.info("Verified automation content page is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setCheckboxColor(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and move the cursor on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	   // String checkboxColor = dealsCheckbox.getCssValue("style");
	   // System.out.println(checkboxColor);
	    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor = (String) executor.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('background-color');", dealsCheckbox);
	    System.out.println(backgroundColor);
	    Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dealsCheckbox).perform();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor2 = (String) executor2.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('background-color');", dealsCheckbox);
	    System.out.println(backgroundColor2);
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(backgroundColor, backgroundColor2);
	    test.info("Verified the color of the checkbox has changed after moving the cursor on it");
	    HelperFunctions.staticWait(2);
	}
    
	public void setClearFilters(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(selectedFilter.isDisplayed());
	    test.info("Verified selected filter is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(clearFilter.isDisplayed());
	    test.info("Verified clear filter the filter title is displayed");
	    clearFilter.click();
        test.info("Clicked on clear filter");
        HelperFunctions.staticWait(5);
        Assert.assertTrue(filterTitle.isDisplayed());
        test.info("Verified the filter title is displayed");
        HelperFunctions.staticWait(3);
        
	}
	public void setVSHomepage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on value store");
	    valueStore.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for filter title visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(filterTitle));
	    HelperFunctions.staticWait(2);
        Assert.assertTrue(filterTitle.isDisplayed());
        test.info("Verified the filter title is displayed");
        HelperFunctions.staticWait(3);
	}
	
	public void setLoadMoreButton(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    test.info("Getting the initial asset size");
	    int initialSize = assets.size();
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to load more button");
	    HelperFunctions.scrollToElement(loadMore);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on load more");
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", loadMore);
	    //loadMore.click();
	    HelperFunctions.staticWait(2);
	    test.info("Getting the new asset size");
	    int newSize = assets.size();
	    if (newSize > initialSize) {
	    	Assert.assertTrue(true);
	        System.out.println("New assets were loaded successfully");
	    } else {
	    	Assert.assertTrue(false);
	        System.out.println("No new assets were loaded");
	    }
	    HelperFunctions.staticWait(3);
	    test.info("Verified new assets were loaded successfully");
	}
	
	public void setNoSubmitNeeded(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to first asset");
	    ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", firstAssetFilter);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(firstAssetFilter.isDisplayed());
	    test.info("Verified the first asset after filtering is displayed");
	    HelperFunctions.staticWait(2);
	}
	
	public void setSharetheURL(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on it");
	    firstAssetHomepage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Getting the current url and copy-paste it");
	    String url = Driver.getDriver().getCurrentUrl();
        StringSelection selection = new StringSelection(url);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        Driver.getDriver().switchTo().defaultContent();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        HelperFunctions.staticWait(5);
        String newUrl = Driver.getDriver().getCurrentUrl();
        if (url.equals(newUrl)) {
        	Assert.assertTrue(true);
            System.out.println("Copy-paste successful!");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Copy-paste failed!");
        }
        test.info("Verified Copy-paste action was successful");
        HelperFunctions.staticWait(3);
	}
	
	public void setFavicon(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed on homapage");
	    test.info("Getting the favicon link");
	    String faviconUrl = faviconLink.getAttribute("href");
	 if (faviconUrl != null && faviconUrl.contains("favicon.ico")) {
		 Assert.assertTrue(true);
	     System.out.println("Favicon found!");	
	 } else {
		 Assert.assertTrue(false);
	     System.out.println("Favicon not found.");
	 }
	 test.info("Verified the favicon is displayed");
	 HelperFunctions.staticWait(2);
	}
	public void setTop10ArticleElementsClickable(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Getting the current url");
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    test.info("Clicked on first article title");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", firstArticleTitle);
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Getting the current url");
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	    test.info("Verified the url values are different");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on logo");
	    logo.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for filter title visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(filterTitle));
	    HelperFunctions.staticWait(3); 
	    test.info("Clicked on first article description");
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", firstArticleDescription);
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(logo));
	    String currentUrl3=Driver.getDriver().getCurrentUrl();
	    Assert.assertNotEquals(currentUrl, currentUrl3);
	    test.info("Verified the url values are different");
	    HelperFunctions.staticWait(3);
	}
	public void setMoretoExplore(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to more to explore");
	    HelperFunctions.scrollToElement(moretoExplore);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(moretoExplore.isDisplayed());
	    test.info("Verified more to explore title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(moretoExploreSub.isDisplayed());
	    test.info("Verified more to explore subtitle is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: exploreItems) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified more to explore items are displayed");
	    HelperFunctions.staticWait(2);
	    for (WebElement element : exploreItems) {
	        List<WebElement> imgs = element.findElements(By.tagName("img"));
	        if (!imgs.isEmpty()) {
	        	Assert.assertTrue(true);
	            System.out.println("Element contains img tag: " + element.getText());
	        }
	    }
	    test.info("Verified each more to explore items have an img tag");
	    HelperFunctions.staticWait(2);
	    
	}
	public void setMoretoExploreItemNavigation(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to more to explore");
	    HelperFunctions.scrollToElement(moretoExplore);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(moretoExplore.isDisplayed());
	    test.info("Verified more to explore title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(moretoExploreSub.isDisplayed());
	    test.info("Verified more to explore subtitle is displayed");
	    HelperFunctions.staticWait(2);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    for (WebElement element : exploreItems) {
	        List<WebElement> tags = element.findElements(By.tagName("a"));
	        if (!tags.isEmpty()) {
	        	Assert.assertTrue(true);
	            System.out.println("Element contains a tag: " + element.getText());
	        }
	    }
	    test.info("Verified each more to explore items have a tag");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on more to explore item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", exploreItems.get(0));
	   // exploreItems.get(0).click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	    test.info("Verified more to explore item tag is landing to another url");
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setNoSearchResult(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and perform enter");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(trendingSearch2.isDisplayed());
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setMightAlsoLikeItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeLabels) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeLabels are displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeTitles) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeTitles are displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeFavIcon) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeFavIcons are displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setMightAlsoLikeItems2(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Verified logo is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll down to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alsoLikeFavIcon.size()==3);
	    test.info("Verified also like fav icon size is 3");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alsoLikeImage.isDisplayed());
	    WebElement img = alsoLikeImage.findElement(By.tagName("img"));
	    if (img != null) {
	    	Assert.assertTrue(true);
	        System.out.println("Element has img tag: " + alsoLikeImage.getText());
	    }else {
	    	Assert.assertTrue(false);
	    }
	    test.info("Verified also like image is displayed and has image tag");
	    test.info("Verified total element's size is 4");
	    HelperFunctions.staticWait(2);
	}
	
	public void setQuickLinksIconVisibility(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setQuickLinksIconOpensItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    Assert.assertTrue(closeQuickLinks.isDisplayed());
	    test.info("Verified close button is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(tdMenuItems.get(0).isDisplayed());
	    test.info("Verified tdMenuItem is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(wtMenuItems.get(0).isDisplayed());
	    test.info("Verified wtMenuItem is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setQuickLinksIconCloseMegaMenu(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    test.info("Wait for close button");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    Assert.assertTrue(closeQuickLinks.isDisplayed());
	    test.info("Verified close button is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(!closeQuickLinks.isDisplayed());
	    test.info("Verified close button is not displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setSearchResultsBasedonKeyword(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Firmwide";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(5);
	    test.info("Wait for suggested keyword visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(suggestedKeyword));
	    Assert.assertTrue(suggestedKeyword.isDisplayed());
	    test.info("Verified suggested keyword is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    test.info("Wait for search item visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(searchItem));
	    Assert.assertTrue(searchItem.isDisplayed());
	    test.info("Verified search item is displayed");
	    HelperFunctions.staticWait(2);
	    
	    
	}
	public void setTrendingSearch(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait search button's visibility");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait.until(ExpectedConditions.visibilityOf(searchField));
	    searchField.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for trending search visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(trendingSearch));
	    Assert.assertTrue(trendingSearch.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(usTrending.isDisplayed());
	    HelperFunctions.staticWait(2);
	    closeSearch.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(terriMenu));
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(mexicoLink));
	    mexicoLink.click();
	    test.info("Clicked on Mexico");
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of search button");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
	    wait5.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    //wait5.until(ExpectedConditions.visibilityOf(searchField2));
	    //searchField2.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for trending search visibility");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(trendingSearch));
	    Assert.assertTrue(trendingSearch.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(mxTrending.isDisplayed());
	    test.info("Verified trending search is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Verified first trending suggestion");
	    Assert.assertTrue(trendingSuggestions.get(0).isDisplayed());
	    HelperFunctions.staticWait(3);
	    
	}
	public void setSearchResultsTopicTitleIcon(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
		 test.info("Wait for page to load");
		    //HelperFunctions.waitForPageToLoad(15);
		   
		    test.info("Wait logo visibility");
		    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
		    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
		    HelperFunctions.staticWait(3);
		    terriMenu.click();
		    test.info("Clicked on territory menu");
		    //HelperFunctions.staticWait(3);
		    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
		    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
		    wait3.until(ExpectedConditions.visibilityOf(mexicoLink));
		    mexicoLink.click();
		    test.info("Clicked on Mexico");
		    HelperFunctions.waitForPageToLoad(60);
		    //HelperFunctions.staticWait(3);
		    test.info("Wait for visibility of territory menu");
		    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		    wait4.until(ExpectedConditions.visibilityOf(terriMenu));
		    test.info("Clicked on search button");
		    searchButton.click();
		    wait4.until(ExpectedConditions.visibilityOf(searchField2));
		    test.info("Clicked on search field and send text");
		    searchField2.click();
		    HelperFunctions.staticWait(2);
		    String mockContent="Firmwide";
		    searchField2.sendKeys(mockContent);
		    //HelperFunctions.staticWait(5);
		    test.info("Wait for suggested keyword's visibility");
		    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
		    wait5.until(ExpectedConditions.visibilityOf(suggestedKeyword));
		    Assert.assertTrue(suggestedKeyword.isDisplayed());
		    test.info("Verified suggested keyword is displayed");
		    HelperFunctions.staticWait(2);
		    test.info("Clicked on enter");
		    Actions actions = new Actions(Driver.getDriver());
		    actions.sendKeys(Keys.ENTER).build().perform();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(60);
		   // HelperFunctions.staticWait(3);
		    test.info("Wait search item's visibility");
		    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
		    wait6.until(ExpectedConditions.visibilityOf(searchItem));
		    Assert.assertTrue(searchItem.isDisplayed());
		    test.info("Verified search item is displayed");
		    HelperFunctions.staticWait(2);
		    //Assert.assertTrue(searchItemIcon.isDisplayed());
		   // test.info("Verified search icon is displayed");
		    //HelperFunctions.staticWait(2);
		    test.info("Clicked on search item");
		    searchItem.click();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(60);
		    HelperFunctions.staticWait(3);
		    Set<String> handles = Driver.getDriver().getWindowHandles();
		    if (handles.size() == 1) {
		    	Assert.assertTrue(true);
		     System.out.println("Element opened the same tab");
		 }else {
				Assert.assertTrue(false);
		 }
		    test.info("Verified element opened the same tab");
		    HelperFunctions.staticWait(3);
	    
	}
	public void setSharetheURLwithFilter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(firstAssetHomepage.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on it");
	    selectTopic.click();
        HelperFunctions.staticWait(3);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    //firstAssetHomepage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Getting the current url and copy-paste it");
	    String url = Driver.getDriver().getCurrentUrl();
        StringSelection selection = new StringSelection(url);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        Driver.getDriver().switchTo().defaultContent();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        HelperFunctions.staticWait(5);
        String newUrl = Driver.getDriver().getCurrentUrl();
        if (url.equals(newUrl)) {
        	Assert.assertTrue(true);
            System.out.println("Copy-paste successful!");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Copy-paste failed!");
        }
        test.info("Verified Copy-paste action was successful");
        HelperFunctions.staticWait(3);
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(dealsSearch));
        Assert.assertTrue(dealsSearch.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setSelectTerritory(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(terriMenu.isDisplayed());
	    test.info("Verified territory menu is displayed");
	    HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(mexicoLink));
	    mexicoLink.click();
	    test.info("Clicked on Mexico");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(terriMenu));
	    WebElement selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("Mexico")) {
	    	Assert.assertTrue(true);
	        System.out.println("Mexico is selected");
	    } else {
	        System.out.println("Mexico is not selected");
	    }
	    HelperFunctions.staticWait(2);
	    test.info("Verified Mexico is selected");
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(terriMenu));
	    selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("Global")) {
	    	Assert.assertTrue(true);
	        System.out.println("Global is selected");
	    } else {
	        System.out.println("Global is not selected");
	    }
	    HelperFunctions.staticWait(2);
	    test.info("Verified Global is selected");
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    HelperFunctions.staticWait(3);
	    WebElement usLink = Driver.getDriver().findElement(By.linkText("US"));
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(usLink));
	    usLink.click();
	    test.info("Clicked on US");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of territory menu");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(terriMenu));
	    selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("United States")) {
	    	Assert.assertTrue(true);
	        System.out.println("United States is selected");
	    } else {
	        System.out.println("United States is not selected");
	    }
	    test.info("Verified United States is selected");
	    HelperFunctions.staticWait(3);
	}
	public void setTerritoryDropdown(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(terriMenu.isDisplayed());
	    test.info("Verified territory menu is displayed");
	    HelperFunctions.staticWait(2);
	    terriMenu.click();
	    HelperFunctions.staticWait(3);
	    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(mexicoLink));
	    mexicoLink.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(terriMenu));
	    WebElement selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("Mexico")) {
	    	Assert.assertTrue(true);
	        System.out.println("Mexico is selected");
	    } else {
	        System.out.println("Mexico is not selected");
	    }
	    WebElement mexicoListItem = Driver.getDriver().findElement(By.cssSelector(".cmp-navigation__item--active"));
	    if (mexicoListItem.getAttribute("class").contains("cmp-navigation__item--active")
	            && !US.getAttribute("class").contains("cmp-navigation__item--active")
	            && !global.getAttribute("class").contains("cmp-navigation__item--active")) {
	    	Assert.assertTrue(true);
	          System.out.println("Mexico is selected and United States/Global are not selected");
	        } else {
	          System.out.println("Mexico is not selected or United States/Global are selected");
	        }
	    terriMenu.click();
	    HelperFunctions.staticWait(3);
	    WebElement usLink = Driver.getDriver().findElement(By.linkText("United States"));
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(usLink));
	    usLink.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(terriMenu));
	    selectedCountry = Driver.getDriver().findElement(By.cssSelector(".selected-value"));
	    if (selectedCountry.getText().equals("United States")) {
	    	Assert.assertTrue(true);
	        System.out.println("United States is selected");
	    } else {
	        System.out.println("United States is not selected");
	    }
	    HelperFunctions.staticWait(3);
	}
	public void setMightAlsoLikeTitle(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on also like title");
	    alsoLikeTitles.get(0).click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(contentTitle));
	    Assert.assertTrue(contentTitle.isDisplayed());
	    test.info("Verified content title is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setSuggestedTags(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="audit";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(5);
	    test.info("Wait for suggested keyword's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(keySuggestion));
	    Assert.assertTrue(keySuggestion.isDisplayed());
	    test.info("Verified suggested keyword is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setUserIconandLogo(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(logo.isDisplayed());
	    test.info("Verified logo is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(userIcon.isDisplayed());
	    test.info("Verified user icon is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setSearchResultsBasedonKeywordChar(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Fi";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(5);
	    Assert.assertTrue(trendingSuggestions.size()==0);
	    test.info("Verified suggestion field is empty with 2nd char");
	    HelperFunctions.staticWait(2);
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    searchField.clear();
	    String mockContent2="Fir";
	    searchField.sendKeys(mockContent2);
	    //HelperFunctions.staticWait(5);  
	    test.info("Wait for suggested keyword visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(suggestedKeyword));
	    Assert.assertTrue(suggestedKeyword.isDisplayed());
	    test.info("Verified suggested keyword is displayed");
	    HelperFunctions.staticWait(3);
	    
	    
	}
	public void setClickingOutsideSearchOverlay(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait search button's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(searchField));
	    Assert.assertTrue(searchField.isDisplayed());
	    test.info("Verified search field is displayed"); 
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(closeSearch.isDisplayed());
	    test.info("Verified close search button is displayed"); 
	    WebDriverWait wait4=new WebDriverWait(Driver.getDriver(),15);
	    ExpectedCondition<WebElement> condition=ExpectedConditions.elementToBeClickable(wrapper);
	    wait4.until(condition);
	    test.info("Clicking on wrapper");
	    wrapper.click();
	    test.info("Clicked on outside of search overlay");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(!searchField.isDisplayed());
	    test.info("Verified search item is not displayed");
	    HelperFunctions.staticWait(3);  
	    
	}
	public void setLeaveKeySuggestion(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait search button's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(searchField));
	    Assert.assertTrue(searchField.isDisplayed());
	    test.info("Verified search field is displayed"); 
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send value");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    searchField.sendKeys("Covid");
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on close search button");
	    closeSearch.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(5);
	    Assert.assertTrue(!trendingSuggestions.isEmpty());
	    test.info("Verified the suggestions are not empty");
	    HelperFunctions.staticWait(3);  
	    
	}
	public void setSearchIconColor(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait search button visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	    String Color = (String) executor.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", searchButton);
	    System.out.println(Color);
	    Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(searchButton).perform();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
	    String Color2 = (String) executor2.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", searchButton);
	    System.out.println(Color2);
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(Color, Color2);
	    HelperFunctions.staticWait(2);
	    
	}
	public void setCardDescriptionChar(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait search button visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Checking all descriptions' charachter length");
	    for (WebElement tileDescription : tileDescriptions) {

	        String currentText = tileDescription.getText();
	        assert currentText.length() <= 185 : "Current text length is greater than 185";
	    }
	    test.info("Verified current text length is not greater than 185");
	    HelperFunctions.staticWait(3);
	}
	public void setCardHeadingChar(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait search button visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Checking all heading' charachter length");
	    for (WebElement tileHeadingElement : tileHeading) {

	        String currentText = tileHeadingElement.getText();
	        assert currentText.length() <= 105 : "Current text length is greater than 105";
	    }
	    test.info("Verified current text length is not greater than 105");
	    HelperFunctions.staticWait(3);
	}
	public void setTrendingandRecentSearches(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait search button's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait trending search's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(trendingSearch));
	    Assert.assertTrue(trendingSearch.isDisplayed());
	    test.info("Verified trending Search is displayed"); 
	   // HelperFunctions.staticWait(2);
	   // Assert.assertTrue(recentSearch.isDisplayed());
	   // test.info("Verified recent Search is displayed"); 
	    HelperFunctions.staticWait(3);  
	    
	}
	public void setDidYouMean(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait searchButton's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Tay";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait did you mean text's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(didYouMean));
	    Assert.assertTrue(didYouMean.isDisplayed());
	    test.info("Verified didYouMean is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(didYouMeanText.isDisplayed());
	    test.info("Verified didYouMeanText is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on didYouMeanText item");
	    didYouMeanText.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait suggestedHeading's visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(suggestedHeading));
	    String message="Showing";
	    Assert.assertTrue(suggestedHeading.getText().contains(message));
	    test.info("Verified suggestedHeading contains required message");
	    HelperFunctions.staticWait(2);
	    String message2="tax";
	    Assert.assertTrue(suggestedText.getText().contains(message2));
	    test.info("Verified suggestedText contains required keyword");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setSearchPagination(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait searchButton's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Tax";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(pagination);
	    test.info("Scroll to pagination");
	    HelperFunctions.staticWait(3);
	    secondSearchPage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(pagination);
	    test.info("Scroll to pagination");
	    HelperFunctions.staticWait(3);
	    String newClassValue = secondSearchPage.getAttribute("class");
	    assert newClassValue.contains("active") : "Class attribute value does not contain 'active'";
	    test.info("Verified Class attribute value contains 'active");
	    HelperFunctions.staticWait(3);
	      
	}
	public void setNextPage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait searchButton's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Tax";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(pagination);
	    test.info("Scroll to pagination");
	    HelperFunctions.staticWait(3);
	    nextPage.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(pagination);
	    test.info("Scroll to pagination");
	    HelperFunctions.staticWait(3);
	    String newClassValue = secondSearchPage.getAttribute("class");
	    assert newClassValue.contains("active") : "Class attribute value does not contain 'active'";
	    test.info("Verified Class attribute value contains 'active");
	    HelperFunctions.staticWait(3);
	      
	}
	public void setTotalSearchItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(3);
		    HelperFunctions.staticWait(3);
		    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
		    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
		    Assert.assertTrue(dealsTag.isDisplayed());
		    HelperFunctions.staticWait(2);
		    logo.click();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(3);
		    HelperFunctions.staticWait(3);*/
		    test.info("Wait searchButton's visibility");
		    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
		    wait2.until(ExpectedConditions.visibilityOf(searchButton));
		    HelperFunctions.staticWait(3);
		    test.info("Clicked on search button");
		    searchButton.click();
		    HelperFunctions.staticWait(2);
		    test.info("Clicked on search field and send text");
		    searchField.click();
		    HelperFunctions.staticWait(2);
		    String mockContent="Tax";
		    searchField.sendKeys(mockContent);
		    HelperFunctions.staticWait(3);
		    test.info("Clicked on enter");
		    Actions actions = new Actions(Driver.getDriver());
		    actions.sendKeys(Keys.ENTER).build().perform();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(30);
		    HelperFunctions.staticWait(3);
		    test.info("Getting search item's size");
		    int moreExplorerItemsSize = searchItems2.size();
		    int searchItemsSize = searchItems3.size();
		    int totalSize = moreExplorerItemsSize + searchItemsSize;
		    assert totalSize == 15 : "Total number of elements is not equal to 15";
		    test.info("Verified Total number of elements is equal to 15");
		    HelperFunctions.staticWait(3);
		    HelperFunctions.scrollToElement(pagination);
		    test.info("Scroll to pagination");
		    HelperFunctions.staticWait(3);
		    nextPage.click();
		    test.info("Wait for page to load");
		    HelperFunctions.waitForPageToLoad(30);
		    assert totalSize == 15 : "Total number of elements is not equal to 15";
		    test.info("Verified Total number of elements is equal to 15 on second page");
		    HelperFunctions.staticWait(3);
	}
	public void setResultCount(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait searchButton's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Tax";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for result count text and stored it");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(resultCountElement));
	    String resultCountText = resultCountElement.getText();
	    Pattern pattern = Pattern.compile("Showing (\\d+)-(\\d+) of (\\d+) results");
	    Matcher matcher = pattern.matcher(resultCountText);
	    test.info("Getting the result count text's pattern and compared it with required pattern");
	    if (matcher.matches()) {
	     int resultNumberStart = Integer.parseInt(matcher.group(1));
	     int resultNumberEnd = Integer.parseInt(matcher.group(2));
	     int resultCount = Integer.parseInt(matcher.group(3));

	     if (resultNumberStart == 1 && resultNumberEnd <= 10 && resultCount == 92) {
	    	 Assert.assertTrue(true);
	         System.out.println("Element text matches expected pattern: " + resultCountText);
	     } else {
	         System.out.println("Element text does not match expected pattern: " + resultCountText);
	     }
	 } else {
	     System.out.println("Element text does not match expected pattern: " + resultCountText);
	 }
	    test.info("Verified Element text matches expected pattern");
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on clear search");
	    clearSearch.click();
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(disabledSearch.isDisplayed());
	    test.info("Verified disabled search is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setSharetheURLwithSearchResults(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait searchButton's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="Tax";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    test.info("Getting the current url and copy-paste it");
	    String url = Driver.getDriver().getCurrentUrl();
        StringSelection selection = new StringSelection(url);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        Driver.getDriver().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        Driver.getDriver().switchTo().defaultContent();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        HelperFunctions.staticWait(5);
        String newUrl = Driver.getDriver().getCurrentUrl();
        if (url.equals(newUrl)) {
        	Assert.assertTrue(true);
            System.out.println("Copy-paste successful!");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Copy-paste failed!");
        }
        test.info("Verified Copy-paste action was successful");
        HelperFunctions.staticWait(3);
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(resultCountElement));
        Assert.assertTrue(resultCountElement.isDisplayed());
	    HelperFunctions.staticWait(2);
	    HelperFunctions.scrollToElement(pagination);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(pagination.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setExpandedFilterItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	  //wait2.until(ExpectedConditions.visibilityOf(selectTopic));
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Clicked on select topic");
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", selectTopic);
        test.info("Wait for filter list's visibility");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(filterList));
	    Assert.assertTrue(filterList.isDisplayed());
	    test.info("Verified filter is expanded");
	    HelperFunctions.staticWait(3);
	}
	public void setNotContainsShareIcon(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleTitles.get(0));
	    WebElement vsContainer = Driver.getDriver().findElement(By.className("vs-container"));
	    List<WebElement> childElements = vsContainer.findElements(By.xpath("./*[not(descendant::a)]"));
	    Assert.assertTrue(childElements.size() > 0);
	    HelperFunctions.staticWait(3);
	    
	    
	    
	}
	public void setMoretoExploreItemCurrentTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to more to explore");
	    HelperFunctions.scrollToElement(moretoExplore);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(moretoExplore.isDisplayed());
	    test.info("Verified more to explore title is displayed");
	    HelperFunctions.staticWait(2);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on more to explore item title");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", exploreItemsLabel.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	    test.info("Verified more to explore item tag is landing to another url");
	    HelperFunctions.staticWait(3);
	    Driver.getDriver().navigate().back();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on more to explore item logo");
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", exploreItemsLogo.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    String currentUrl3=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(currentUrl, currentUrl3);
	    test.info("Verified more to explore item tag is landing to another url");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setTop10Visibility(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(filterTitle.isDisplayed());
	    test.info("Verified the first asset is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    HelperFunctions.staticWait(2);
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(filterTitle2.isEmpty());
	    HelperFunctions.staticWait(2);
	}
	public void setRoseTagLabel(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on first article title");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", firstArticleTitle);
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(logo));
	    String color=tagLabel.getCssValue("background-color");
	    System.out.println(color);
	    String expectedColor="rgba(219, 83, 106, 1)";
	    Assert.assertTrue(color.equals(expectedColor));
	    HelperFunctions.staticWait(3);
	}
	
	public void setFirst2Article(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(firstAssetsHomepage.size()==2);
	    HelperFunctions.staticWait(2);
	    for(int i = 0; i < firstAssetsHomepage.size(); i++) {
	    	String fontSize1 = firstAssetsHomepage.get(i).getCssValue("font-size");
            String fontSize2 = articleTitles.get(i).getCssValue("font-size");
            if (fontSize1.compareTo(fontSize2) <= 0) {
            	Assert.assertTrue(false);
            }else {
            	Assert.assertTrue(true);
            }
	    }
	    HelperFunctions.staticWait(2);
	}
	public void setMightAlsoLikeHoverEffect(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	/*    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeLabels) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified alsoLikeLabels are displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: alsoLikeTitles) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content title's border bottom are changing when move the cursor");
	    for (WebElement titles : alsoLikeTitles) {
	        String originalBorderBottom = titles.getCssValue("border-bottom");
	        System.out.println(originalBorderBottom);
	        
	        Actions actions = new Actions(Driver.getDriver());
	        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	        js2.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", titles);
	        
	        actions.moveToElement(titles).build().perform();
	        String borderBottom = titles.getCssValue("border-bottom");
	        System.out.println("borderBottom: " + borderBottom);
	        
	        Assert.assertNotEquals(originalBorderBottom, borderBottom);
	        HelperFunctions.staticWait(2);
	        test.info("Verified all content title's border bottom are changing when move the cursor");
	    }
	    HelperFunctions.staticWait(2);
	    String actualMessage=retiredMessage.getText();
	    String expected="Let me introduce";
	    Assert.assertTrue(actualMessage.contains(expected));
	    HelperFunctions.staticWait(3);
	}
	public void setMightLikeItemCurrentTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to might also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified might also like title is displayed");
	    HelperFunctions.staticWait(2);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on might also like item title");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", alsoLikeTitles2.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(currentUrl, currentUrl2);
	    test.info("Verified might also like item tag is landing to another url in same window");
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(contentBox));
	    Assert.assertTrue(contentBox.isDisplayed());
	    test.info("Verified might also like item is landing to the content page");
	    HelperFunctions.staticWait(3);
	    test.info("Navigate back");
	    Driver.getDriver().navigate().back();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    String currentUrl3=Driver.getDriver().getCurrentUrl();
	    Assert.assertEquals(currentUrl, currentUrl3);
	    HelperFunctions.staticWait(3);
	    
	}
	public void setLoadMore3rows(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on select topic");
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", selectTopic);
        //selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Clicked on select topic");
	    js.executeScript("arguments[0].click();", selectTopic);
	    test.info("Getting the initial asset size");
	    int initialSize = assets.size();
	    System.out.println(initialSize);
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to load more button");
	    HelperFunctions.scrollToElement(loadMore);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on load more");
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", loadMore);
	    //loadMore.click();
	    HelperFunctions.staticWait(3);
	    test.info("Getting the new asset size");
	    int newSize = assets.size();
	    System.out.println(newSize);
	    int expectedValue=initialSize*2;
	    Assert.assertEquals(newSize, expectedValue);
	    test.info("Verified new 3 rows assets were loaded successfully");
	    HelperFunctions.staticWait(3);
	}
	public void setSelectedDropdown(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	/*    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(sectorButton.isDisplayed());
	    test.info("Verified sector filter");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(ecoBuyerButton.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Verified economic buyer filter");
	    Assert.assertTrue(topicButton.isDisplayed());
	    test.info("Verified topic filter");
	    HelperFunctions.staticWait(2);
        sectorButton.click();
        test.info("Clicked on select filter");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    String expected1="Sector";
	    String actual1=selectedDropdown.getText();
	    Assert.assertEquals(actual1, expected1);
	    HelperFunctions.staticWait(2);
	    sectorFilter1.click();
	    test.info("Selected first filter value on select filter");
	    HelperFunctions.staticWait(2);
	    sectorFilter2.click();
	    test.info("Selected second filter value on select filter");
	    HelperFunctions.staticWait(2);
	    ecoBuyerButton.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    String expected2="Economic buyer";
	    String actual2=selectedDropdown.getText();
	    Assert.assertEquals(actual2, expected2);
	    HelperFunctions.staticWait(2);
	    ecoFilter1.click();
	    test.info("Selected first filter value on eco filter");
	    HelperFunctions.staticWait(2);
	    ecoFilter2.click();
	    test.info("Selected second filter value on eco filter");
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    String expected3="Topic";
	    String actual3=selectedDropdown.getText();
	    Assert.assertEquals(actual3, expected3);
	    HelperFunctions.staticWait(2);
	    topicFilter1.click();
	    test.info("Selected first filter value on topic filter");
	    HelperFunctions.staticWait(2);
	    topicFilter2.click();
	    test.info("Selected second filter value on topic filter");
	    HelperFunctions.staticWait(3);
	}
	public void setSpinner(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(sectorButton.isDisplayed());
	    test.info("Verified sector filter");
	    HelperFunctions.staticWait(2);
        sectorButton.click();
        test.info("Clicked on select filter");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    HelperFunctions.staticWait(2);
	    sectorFilter1.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(spinner));
	    Assert.assertTrue(spinner.isDisplayed());
	    test.info("Verified spinner is displayed");
	    test.info("Selected first filter value on select filter");
	    HelperFunctions.staticWait(2);
	    sectorFilter2.click();
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(spinner));
	    Assert.assertTrue(spinner.isDisplayed());
	    test.info("Verified spinner is displayed");
	    test.info("Selected second filter value on select filter");
	    HelperFunctions.staticWait(3);
	
	}
	public void setBrowserBackButton(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	/*    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(sectorButton.isDisplayed());
	    test.info("Verified sector filter");
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    HelperFunctions.staticWait(2);
	    dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    HelperFunctions.staticWait(2);
	    for(WebElement each:articleTitles) {
	    	if(each.getText().contains("content")) {
	    		each.click();
	    		break;
	    	}
	    }
	    //articleTitles.get(1).click();
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(contentBox));
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().navigate().back();
	    HelperFunctions.waitForPageToLoad(10);   
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(articleTitles.get(1)));
	    Assert.assertTrue(articleTitles.get(1).isDisplayed());
	    HelperFunctions.staticWait(3);
	
	}
	public void setArticleImagesTitleDescription(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    int titlesNumber=articleTitles.size();
	    int descriptionNumber=articleDescriptions.size();
	    int imageNumber=articleImages.size();
	    if (titlesNumber == descriptionNumber && descriptionNumber == imageNumber && titlesNumber > 1) {
	    	Assert.assertTrue(true);
            System.out.println("All counts are equal and greater than 1.");
        } else {
        	Assert.assertTrue(false);
            System.out.println("Counts are not equal or not greater than 1.");
        }
	    HelperFunctions.staticWait(3);
	    
	   
	
	}
	public void setNewTabGhostPage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(sectorButton.isDisplayed());
	    test.info("Verified sector filter");
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    HelperFunctions.staticWait(2);
	    topicFilter1.click();
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    HelperFunctions.staticWait(2);
	    for (WebElement element : articleTitles) {
           
            if (element.getText().contains("ghost")) {
                element.click();
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
	    test.info("Verified element opened the same tab");
	    HelperFunctions.staticWait(3);
	}
	public void setCardsSize(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    for (WebElement card : articleCards) {
            Dimension cardSize = card.getSize();
            int cardHeight = cardSize.getHeight();
            int minHeightThreshold = 350; 
            System.out.println(cardHeight);
            if (cardHeight > minHeightThreshold) {
            	Assert.assertTrue(true);
                System.out.println("Card height is dynamically adjusted: " + cardHeight + " pixels");
            } else {
                System.out.println("Card height is not dynamically adjusted: " + cardHeight + " pixels");
            }
	    }
	    HelperFunctions.staticWait(3);
	}
	public void setQuickLinksOrder(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	/*    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    List<String> texts = new ArrayList<>();
        for (WebElement element : quickLinks) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                texts.add(text);
            }
        }

        boolean isAlphabeticalOrder = true;
        for (int i = 0; i < texts.size() - 1; i++) {
            if (texts.get(i).compareToIgnoreCase(texts.get(i + 1)) > 0) {
                isAlphabeticalOrder = false;
                break;
            }
        }

        Assert.assertTrue(isAlphabeticalOrder, "The list is not in alphabetical order.");
        HelperFunctions.staticWait(3);
	    
	}
	public void setQuickLinksInternalExternal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	/*    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(10);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for quick links icon visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(quickLinksIcon.isDisplayed());
	    test.info("Verified quick links icon is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    HelperFunctions.staticWait(2);
	    /*firstInternal.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(contentBox));
	    Assert.assertTrue(contentBox.isDisplayed());
	    HelperFunctions.staticWait(3);
	    //Driver.getDriver().navigate().back();
	   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait5.until(ExpectedConditions.visibilityOf(quickLinksIcon));
	   // HelperFunctions.staticWait(2);
	    test.info("Clicked on quick links icon");
	    quickLinksIcon.click();
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(closeQuickLinks));
	    HelperFunctions.staticWait(2);*/
	    firstExternal.click();
	    HelperFunctions.staticWait(3);
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
	public void setTopNavigationColor(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for fav navigation visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(favNavigation));
	    Actions actions = new Actions(Driver.getDriver());
	    actions.moveToElement(favNavigation).perform();
	    String textDecoration = favNavigation.getCssValue("text-decoration");
	    System.out.println(textDecoration);
	    HelperFunctions.staticWait(2);
	    Assert.assertEquals("none solid rgb(217, 57, 84)", textDecoration);
	    HelperFunctions.staticWait(3);
	}
	public void setTerritoryColor(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(15);
	   // HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);*/
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for fav navigation visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
	    Actions actions = new Actions(Driver.getDriver());
	    actions.moveToElement(terriMenu).perform();
	    String textDecoration = terriMenu.getCssValue("text-decoration");
	    System.out.println(textDecoration);
	    HelperFunctions.staticWait(2);
	    Assert.assertEquals("none solid rgb(33, 37, 41)", textDecoration);
	    HelperFunctions.staticWait(3);
	}
	public void setGhostedPageasHomepage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(filterTitle));
	    Assert.assertTrue(filterTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    HelperFunctions.scrollToElement(moretoExplore);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(moretoExplore.isDisplayed());*/
		String actualUrl=Driver.getDriver().getCurrentUrl();
		String expectedUrl="pwc.com";
		Assert.assertTrue(actualUrl.contains(expectedUrl));
	    HelperFunctions.staticWait(2);
	}
	public void setArticlesWithNoResult(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);*/
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Clicked on select topic");
        selectTopic.click();
        HelperFunctions.staticWait(2);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(riskCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", riskCheckbox);
	   // dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopic.click();
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(articleCards.size()==4);
	    HelperFunctions.staticWait(3);
	}public void setFavContents(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3);  
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleFavIcons2.get(0));
	    //articleFavIcons.get(0).click();
	    test.info("Added 2 elements to the favorites");
	    HelperFunctions.staticWait(7);
	    test.info("Clicked on fav icon link");
	    String firstColor=favIconLink.getCssValue("color");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    Assert.assertTrue(favHeader.isDisplayed());
	    HelperFunctions.staticWait(2); 
	    String secondColor=favIconLink.getCssValue("color");
	    Assert.assertNotEquals(firstColor, secondColor);
	    HelperFunctions.staticWait(2); 
	    test.info("Verified fav header's visibility");
	    boolean allTextsFound = true;
	    for (WebElement firstElement : articleTitles) {
	        boolean foundText = false;
	        String firstText = firstElement.getText();
	        for (WebElement secondElement : articleTitles) {
	            String secondText = secondElement.getText();
	            if (secondText.contains(firstText)) {
	                foundText = true;
	                break;
	            }
	        }
	        if (!foundText) {
	            allTextsFound = false;
	            break;
	        }
	    }

	    if (allTextsFound) {
	    	Assert.assertTrue(true);
	        System.out.println("All text values found in second list.");
	    } else {
	        System.out.println("Not all text values found in second list.");
	    }
	    test.info("Verified All text values found in second list.");
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor3 = (String) executor3.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", favIconsFav.get(0));
	    System.out.println(backgroundColor3);
	    String expectedColor="rgb(33, 37, 41)";
	    Assert.assertEquals(backgroundColor3,expectedColor);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
	    for(WebElement each: favIconsFav) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    //js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    HelperFunctions.staticWait(3);
	   // JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
	    test.info("Removed all favs on favs page");
	    Assert.assertTrue(noResultHeading.isDisplayed());
	    test.info("Verified no result heading is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setFavContentsMexico(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for territory menu's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);  
	    //Assert.assertTrue(favIcon.isDisplayed());
	    //test.info("Verified fav icon is displayed");
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait3.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3); 
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleFavIcons2.get(0));
	    //articleFavIcons.get(0).click();
	    test.info("Added 2 elements to the favorites");
	    HelperFunctions.staticWait(7);
	    test.info("Clicked on fav icon link");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 60);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    Assert.assertTrue(favHeader.isDisplayed());
	    test.info("Verified fav header's visibility");
	    boolean allTextsFound = true;
	    for (WebElement firstElement : articleTitles) {
	        boolean foundText = false;
	        String firstText = firstElement.getText();
	        for (WebElement secondElement : articleTitles) {
	            String secondText = secondElement.getText();
	            if (secondText.contains(firstText)) {
	                foundText = true;
	                break;
	            }
	        }
	        if (!foundText) {
	            allTextsFound = false;
	            break;
	        }
	    }

	    if (allTextsFound) {
	    	Assert.assertTrue(true);
	        System.out.println("All text values found in second list.");
	    } else {
	        System.out.println("Not all text values found in second list.");
	    }
	    test.info("Verified All text values found in second list.");
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
	    for(WebElement each: favIconsFav) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	   // js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    HelperFunctions.staticWait(3);
	   // JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
	    test.info("Removed all favs on favs page");
	    Assert.assertTrue(noResultHeading.isDisplayed());
	    HelperFunctions.staticWait(3);
	    test.info("Verified no result heading is displayed");
	}
	public void setFilterResultsMexico(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	    
	    test.info("Wait for territory menu's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait2.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3); 
	    test.info("Clicked on select topic");
        selectTopicMX.click();
        //HelperFunctions.staticWait(3);
        test.info("Wait for deals checkbox visibility and clicked on it");
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(dealsCheckbox));
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", dealsCheckbox);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on select topic");
	    selectTopicMX.click();
	    HelperFunctions.staticWait(3);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    test.info("Clicked on article title");
	    for(WebElement each:articleTitles) {
	    	if(each.getAttribute("href").contains("mx/es")) {
	    		each.click();
	    		break;
	    	}
	    }
	   // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	  //  js.executeScript("arguments[0].click();", articleTitles.get(2));
	   // test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	   // test.info("Wait for content box's visibility");
	   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait5.until(ExpectedConditions.visibilityOf(contentBox));
	    String currentUrl2=Driver.getDriver().getCurrentUrl();
	    Assert.assertTrue(currentUrl2.contains("mx/es"));
	   // HelperFunctions.staticWait(2);
	   // Assert.assertNotEquals(currentUrl, currentUrl2);
	    HelperFunctions.staticWait(3);
	}
	public void setFavFilter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for fav icon's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(favIcon));
	    HelperFunctions.staticWait(3); 
	    Assert.assertTrue(favIcon.isDisplayed());
	    test.info("Verified fav icon is displayed");
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", articleFavIcons.get(0));
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", articleFavIcons2.get(0));
	    //articleFavIcons.get(0).click();
	    test.info("Added 2 elements to the favorites");
	    HelperFunctions.staticWait(7);
	    test.info("Clicked on fav icon link");
	    favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 60);
	    wait4.until(ExpectedConditions.visibilityOf(favHeader));
	    Assert.assertTrue(favHeader.isDisplayed());
	    test.info("Verified fav header's visibility");
	    List<String> originalOrder=new ArrayList<>();
	    for(WebElement element:articleTitles) {
	    	originalOrder.add(element.getText());
	    }
	    test.info("Stored original order");
	    HelperFunctions.staticWait(2);
	    favFilter.click();
	    test.info("Clicked on filter dropdown");
	    HelperFunctions.staticWait(2);
	    oToN.click();
	    test.info("Clicked on oldest to newest");
	    HelperFunctions.staticWait(5);
	    List<String> newOrder=new ArrayList<>();
	    for(WebElement element:articleTitles) {
	    	newOrder.add(element.getText());
	    }
	    test.info("Stored new order");
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(originalOrder, newOrder);
	    test.info("Verified order has changed");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
	    for(WebElement each: favIconsFav) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    //JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	   // js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    HelperFunctions.staticWait(3);
	    //JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
	    test.info("Removed all favs on favs page");
	    Assert.assertTrue(noResultHeading.isDisplayed());
	    test.info("Verified no result heading is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setHeartColor(ExtentTest test) throws Exception {
		/*read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
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
	    wait1.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();*/
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 60);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    //test.info("Clicked on select topic");
        HelperFunctions.scrollToElement(articleFavIcons.get(0));
        HelperFunctions.staticWait(2);

	   // String checkboxColor = dealsCheckbox.getCssValue("style");
	   // System.out.println(checkboxColor);
	    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor = (String) executor.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", articleFavIcons.get(0));
	    System.out.println(backgroundColor);
	    Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(articleFavIcons.get(0)).perform();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor executor2 = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor2 = (String) executor2.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", articleFavIcons.get(0));
	    System.out.println(backgroundColor2);
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(backgroundColor, backgroundColor2);
	    test.info("Verified the color of the checkbox has changed after moving the cursor on it");
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor executor3 = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor3 = (String) executor3.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", articleFavIcons.get(0));
	    System.out.println(backgroundColor3);
	    articleFavIcons.get(0).click();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor executor4 = (JavascriptExecutor) Driver.getDriver();
	    String backgroundColor4 = (String) executor4.executeScript("return window.getComputedStyle(arguments[0], ':before').getPropertyValue('color');", articleFavIcons.get(0));
	    System.out.println(backgroundColor4);
	    HelperFunctions.staticWait(2);
	    Assert.assertNotEquals(backgroundColor3, backgroundColor4);
	    test.info("Verified the color of the checkbox has changed after clicking on it");
	    HelperFunctions.staticWait(2);
	}
	public void setSpanishTag(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for territory menu's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 60);
	    wait3.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);  
	    //Assert.assertTrue(favIcon.isDisplayed());
	    //test.info("Verified fav icon is displayed");
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait3.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3); 
	    List<WebElement> tags=Driver.getDriver().findElements(By.tagName("a"));
	    for(WebElement each:tags) {
	    	if(each.getAttribute("data-newlabel")!=null) {
	    		String newLabel=each.getAttribute("data-newlabel");
	    		if(newLabel.equals("Nuevo")) {
	    			Assert.assertTrue(true);
	    		}
	    	}
	    	
	    }
	    HelperFunctions.staticWait(3);
	}

	public void setDeletedUnpublishPagefromFavs(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 60);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and perform enter");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String favPage="Fav Automation";
	    searchField.sendKeys(favPage);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(favLinkSearch));
	    HelperFunctions.staticWait(2);
	    favLinkSearch.click();
	    HelperFunctions.waitForPageToLoad(60);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(favPageIcon));
	    favPageIcon.click();
	    HelperFunctions.staticWait(3);
	    favIconLink.click();
	    test.info("Wait for fav automation's visibility");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 60);
	    wait5.until(ExpectedConditions.visibilityOf(firstArticleTitle));
	    Assert.assertTrue(firstArticleTitle.isDisplayed());
	    HelperFunctions.staticWait(3);
	    Driver.getDriver().get(read1.getCellData("VALUE", 48));
	    HelperFunctions.waitForPageToLoad(60);
	    test.info("Clicked on page info and unpublished the page");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(unpublishPage));
	    unpublishPage.click();
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(confirm));
	    confirm.click();
	    HelperFunctions.staticWait(10);
	    Driver.getDriver().get(read1.getCellData("VALUE", 10));
	    HelperFunctions.waitForPageToLoad(60);
	    favIconLink.click();
	    HelperFunctions.waitForPageToLoad(60);
	    Assert.assertTrue(favAutomation.size()==0);
	    HelperFunctions.staticWait(3);
	    Driver.getDriver().get(read1.getCellData("VALUE", 48));
	    HelperFunctions.waitForPageToLoad(60);
	    test.info("Clicked on page info and unpublished the page");
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(10);
	    Driver.getDriver().get(read1.getCellData("VALUE", 10));
	    HelperFunctions.waitForPageToLoad(60);
	    favIconLink.click();
	    HelperFunctions.waitForPageToLoad(60);    
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement each: favIconsFav) {
	    	wait9.until(ExpectedConditions.elementToBeClickable(each)).click();
	    }
	    HelperFunctions.staticWait(5);
	}
	public void setGhostPageAsHomepage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(filterContainer.isDisplayed());
	    test.info("Verified filterContainer is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(alsoLikeTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(alsoLikeTitle.isDisplayed());
	    test.info("Verified also like title is displayed");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setResentSearch(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for logo visibility");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait.until(ExpectedConditions.visibilityOf(searchField));
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockPage="Tax";
	    searchField.sendKeys(mockPage);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    Driver.getDriver().navigate().refresh();
	    HelperFunctions.waitForPageToLoad(60);
	    wait.until(ExpectedConditions.visibilityOf(searchButton));
	    searchButton.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(recentSearch));
	    recentList.get(0).click();
	    HelperFunctions.waitForPageToLoad(60);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(searchItems1.get(0)));
	    Assert.assertTrue(searchItems1.get(0).isDisplayed());
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(terriMenu));
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement mexicoLink = Driver.getDriver().findElement(By.linkText("Mexico"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(mexicoLink));
	    mexicoLink.click();
	    test.info("Clicked on Mexico");
	    HelperFunctions.waitForPageToLoad(60);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of search button");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 30);
	    wait7.until(ExpectedConditions.visibilityOf(recentSearch));
	    Assert.assertTrue(recentSearch.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setDeleteNoResult(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for logo visibility");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(searchButton));
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait.until(ExpectedConditions.visibilityOf(searchField));
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockPage="Tax";
	    searchField.sendKeys(mockPage);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    Driver.getDriver().navigate().refresh();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait.until(ExpectedConditions.visibilityOf(searchField));
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String noPage="noresult";
	    searchField.sendKeys(noPage);
	    Actions actions2 = new Actions(Driver.getDriver());
	    actions2.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    Driver.getDriver().navigate().refresh();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    searchButton.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(recentSearch));
	    for(WebElement each:searchItems1) {
	    	if(each.getText().contains(noPage)) {
	    		Assert.assertTrue(false);
	    	}else {
	    		Assert.assertTrue(true);
	    	}
	    }
	    HelperFunctions.staticWait(3);
	}
	public void setShowMore(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    Assert.assertTrue(sectorButton.isDisplayed());
	    test.info("Verified sector filter");
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(dropdownMenu));
	    HelperFunctions.staticWait(2);
	    topicFilter1.click();
	    HelperFunctions.staticWait(2);
	    dealsCheckbox.click();
	    HelperFunctions.staticWait(2);
	    topicButton.click();
	    HelperFunctions.staticWait(2);
	    WebElement element=Driver.getDriver().findElement(By.xpath("//button[contains(@class, 'load-more')]"));
	   /* boolean elementVisible=true;
	    while(elementVisible) {
	    	try {
	    		WebElement element=Driver.getDriver().findElement(By.xpath("//button[@class='vs-card__cta-load-more']"));
	    		element.click();
	    	}catch(NoSuchElementException e) {
	    		elementVisible=false;
	    	}
	    	JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
	    	js.executeScript("window.scrollBy(0, 300);");
	    	HelperFunctions.staticWait(2);
	    	
	    }*/
	   // HelperFunctions.staticWait(2);
	   // HelperFunctions.scrollToElement(articleFavIcons.get(0));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js2=(JavascriptExecutor)Driver.getDriver();
	   // int numElements=Math.min(3, articleFavIcons.size());
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: articleFavIcons) {
	    	wait4.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js2.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js3=(JavascriptExecutor)Driver.getDriver();
    	js3.executeScript("arguments[0].click();", element);
    	HelperFunctions.staticWait(4);
	    JavascriptExecutor js4=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: articleFavIcons) {
	    	wait5.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js4.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js5=(JavascriptExecutor)Driver.getDriver();
    	js5.executeScript("arguments[0].click();", element);
    	HelperFunctions.staticWait(4);
	    JavascriptExecutor js6=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: articleFavIcons) {
	    	wait6.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js6.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js7=(JavascriptExecutor)Driver.getDriver();
    	js7.executeScript("arguments[0].click();", element);
    	HelperFunctions.staticWait(4);
	    JavascriptExecutor js8=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: articleFavIcons) {
	    	wait7.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js8.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
    	HelperFunctions.staticWait(2);
 	    JavascriptExecutor js9=(JavascriptExecutor)Driver.getDriver();
     	js9.executeScript("arguments[0].click();", element);
     	HelperFunctions.staticWait(4);
 	    JavascriptExecutor js10=(JavascriptExecutor)Driver.getDriver();
 	   WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: articleFavIcons) {
	    	wait8.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js10.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
     	HelperFunctions.staticWait(2);
  	    JavascriptExecutor js11=(JavascriptExecutor)Driver.getDriver();
      	js11.executeScript("arguments[0].click();", element);
      	HelperFunctions.staticWait(4);
  	    JavascriptExecutor js12=(JavascriptExecutor)Driver.getDriver();
  	  WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: articleFavIcons) {
	    	wait9.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js12.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
      	HelperFunctions.staticWait(2);
      	favIconLink.click();
	    test.info("Wait for fav header's visibility");
	    WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 20);
	    wait10.until(ExpectedConditions.visibilityOf(favHeader));
	    HelperFunctions.scrollToElement(showMore);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(showMore.isDisplayed());
	    HelperFunctions.staticWait(2);
	   /* showMore.click();
	    HelperFunctions.staticWait(3);
	   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
	    JavascriptExecutor js13=(JavascriptExecutor)Driver.getDriver();
	    
	    WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: favIconsFav) {
	    	wait11.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js13.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js14=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: favIconsFav) {
	    	wait12.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js14.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js15=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait13 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: favIconsFav) {
	    	wait13.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js15.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js16=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait14 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: favIconsFav) {
	    	wait14.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js16.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js17=(JavascriptExecutor)Driver.getDriver();
	    WebDriverWait wait15 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement ele: favIconsFav) {
	    	wait15.until(ExpectedConditions.elementToBeClickable(ele));
	    	HelperFunctions.staticWait(2);
	    	js17.executeScript("arguments[0].click();", ele);
	    	HelperFunctions.staticWait(2);
	    }
	    HelperFunctions.staticWait(2);*/
		/*   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
		    JavascriptExecutor js14=(JavascriptExecutor)Driver.getDriver();
		    for(int i=0;i<favIconsFav.size();i++) {
	  	    	WebElement ele=favIconsFav.get(i); 	
	  	    	HelperFunctions.staticWait(2);
	  	    	js14.executeScript("arguments[0].click();", ele);
	  	    	HelperFunctions.staticWait(3);
	  	    }
		    HelperFunctions.staticWait(2);
			   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
			    JavascriptExecutor js15=(JavascriptExecutor)Driver.getDriver();
			    for(int i=0;i<favIconsFav.size();i++) {
		  	    	WebElement ele=favIconsFav.get(i); 	
		  	    	HelperFunctions.staticWait(2);
		  	    	js15.executeScript("arguments[0].click();", ele);
		  	    	HelperFunctions.staticWait(3);
		  	    }
			    HelperFunctions.staticWait(2);
				   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
				    JavascriptExecutor js16=(JavascriptExecutor)Driver.getDriver();
				    for(int i=0;i<favIconsFav.size();i++) {
			  	    	WebElement ele=favIconsFav.get(i); 	
			  	    	HelperFunctions.staticWait(2);
			  	    	js16.executeScript("arguments[0].click();", ele);
			  	    	HelperFunctions.staticWait(3);
			  	    }
				    HelperFunctions.staticWait(2);
					   // WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 20);
					    JavascriptExecutor js17=(JavascriptExecutor)Driver.getDriver();
					    for(int i=0;i<favIconsFav.size();i++) {
				  	    	WebElement ele=favIconsFav.get(i); 	
				  	    	HelperFunctions.staticWait(2);
				  	    	js17.executeScript("arguments[0].click();", ele);
				  	    	HelperFunctions.staticWait(3);
				  	    }
					    HelperFunctions.staticWait(2);
	    JavascriptExecutor js18 = (JavascriptExecutor) Driver.getDriver();
	   // js3.executeScript("arguments[0].click();", favIconsFav.get(0));
	    WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 20);
	    HelperFunctions.staticWait(3);
	    for(WebElement each: favIconsFav) {
	    	wait11.until(ExpectedConditions.elementToBeClickable(each));
	    	js18.executeScript("arguments[0].click();", each);
	    	HelperFunctions.staticWait(2);
	    }
	   // JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	   // js4.executeScript("arguments[0].click();", favIconFav);   
		    HelperFunctions.staticWait(2);
	    test.info("Removed all favs on favs page");*/
	    
	}
	public void setNoFavGlobal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(terriMenu));
	    //HelperFunctions.staticWait(3);
	    //Assert.assertTrue(terriMenu.isDisplayed());
	    //test.info("Verified territory menu is displayed");
	    //HelperFunctions.staticWait(2);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    Assert.assertTrue(globalLink.isDisplayed());
	    test.info("Verified global is displayed");
	    HelperFunctions.staticWait(2);
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(favIcon2.size()==0);
	    test.info("Verified no fav header is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(articleFavIcons.size()==0);
	    test.info("Verified no fav icon is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setSelectingTerritoriesSearchResult(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for page to load");
	   
	    test.info("Wait search button's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="esg";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicking on Enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", mexicoCheckbox);
	    test.info("Clicked on mexico checkbox");
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", globalCheckbox);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(mexicoCheckbox.isSelected());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(globalCheckbox.isSelected());
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on territory menu");
	    terriMenu.click();
	    wait2.until(ExpectedConditions.visibilityOf(mexico));
	    test.info("Clicked on mexico");
	    mexico.click();
	    HelperFunctions.waitForPageToLoad(60);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField2));
	    test.info("Clicked on search field and send text");
	    searchField2.click();
	    HelperFunctions.staticWait(2);
	    searchField2.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicking on Enter");
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(4000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", usCheckbox);
	    test.info("Clicked on us checkbox");
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", globalCheckbox);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(usCheckbox.isSelected());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(globalCheckbox.isSelected());
	    HelperFunctions.staticWait(3);
	    terriMenu.click();
	    test.info("Clicked on territory menu");
	    //HelperFunctions.staticWait(3);
	    WebElement globalLink = Driver.getDriver().findElement(By.linkText("Global"));
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 30);
	    wait5.until(ExpectedConditions.visibilityOf(globalLink));
	    globalLink.click();
	    test.info("Clicked on Global");
	    HelperFunctions.waitForPageToLoad(60);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicking on Enter");
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(4000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", mexicoCheckbox);
	    test.info("Clicked on mexico checkbox");
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", usGlobalCheckbox);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(usGlobalCheckbox.isSelected());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(mexicoCheckbox.isSelected());
	    HelperFunctions.staticWait(3);
	}
	public void setExternalLinkDesc(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    test.info("Wait for page to load");
	   
	    test.info("Wait search button's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(searchButton));
	    test.info("Clicked on search button");
	    searchButton.click();
	    wait2.until(ExpectedConditions.visibilityOf(searchField));
	    test.info("Clicked on search field and send text");
	    searchField.click();
	    HelperFunctions.staticWait(2);
	    String mockContent="automation external page";
	    searchField.sendKeys(mockContent);
	    HelperFunctions.staticWait(3);
	    test.info("Clicking on Enter");
	    Actions actions = new Actions(Driver.getDriver());
	    actions.sendKeys(Keys.ENTER).build().perform();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    test.info("Clicking on external link description");
	    wait2.until(ExpectedConditions.visibilityOf(externalDesc));
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", externalDesc);
	    test.info("Switching to new tab");
	    ArrayList<String> tabs=new ArrayList<String>(Driver.getDriver().getWindowHandles());
		Driver.getDriver().switchTo().window(tabs.get(1));
		HelperFunctions.staticWait(15);
        String currentUrl=Driver.getDriver().getCurrentUrl();
        test.info("Checking the current url value");
        Assert.assertTrue(currentUrl.contains("pwc"));
        test.info("Verified open url on new tab");
        HelperFunctions.staticWait(3);
	    
	}
}
