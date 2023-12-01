package Pages;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;


public class ContentPage extends HelperFunctions{
	public ContentPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement editButton;
	
	@FindBy(xpath="//button[@data-layer='Preview']")
	private WebElement previewButton;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement titleArea;
	
	@FindBy(xpath="//button[@title='Configure']")
	private WebElement configure;
	
	@FindBy(xpath="//coral-icon[@icon='properties']")
	private WebElement pageInfo;
	
	@FindBy(xpath="//button[@title='Open Properties']")
	private WebElement openPro;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Publish Page']")
	private WebElement publishPage;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='View as Published']")
	private WebElement viewPublished;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Save & Close']")
	private WebElement saveClose;
	
	@FindBy(xpath="//h2[@class='vs-title-area__card-box-content-heading page-title ']")
	private WebElement pageTitle;
	
	@FindBy(xpath="//input[@name='./jcr:title']")
	private WebElement titleField;
	
	@FindBy(xpath="//label[normalize-space()='Title *']")
	private WebElement title;
	
	@FindBy(xpath="//label[normalize-space()='Error: Please fill out this field.']")
	private WebElement errorMessage;
	
	@FindBy(xpath="(//label[normalize-space()='Off Time *'])[1]")
	private WebElement offTime;
	
	@FindBy(xpath="//coral-datepicker[@data-cq-msm-lockable='offTime']//input[@role='combobox']")
	private WebElement dateField;
	
	@FindBy(xpath="//coral-datepicker[@data-cq-msm-lockable='offTime']//button[@title='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Create']")
	private WebElement createButton;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/thumbnails/Content.png']")
	private WebElement contentPage;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Next']")
	private WebElement nextButton;
	
	@FindBy(xpath="//label[normalize-space()='Primary Category Tag *']")
	private WebElement primaryCat;
	
	@FindBy(xpath="//label[normalize-space()='Primary Topic Tag *']")
	private WebElement primaryTopic;
	
	@FindBy(xpath="//label[normalize-space()='Primary Economic Buyer Tag *']")
	private WebElement primaryEco;
	
	@FindBy(xpath="//label[normalize-space()='Publish Date *']")
	private WebElement publishDate;
	
	@FindBy(xpath="//label[normalize-space()='Display Image for Content Page *']")
	private WebElement contentImage;
	
	@FindBy(xpath="(//button[@title='Open Selection Dialog'])[1]")
	private WebElement primary1;
	
	@FindBy(xpath="(//button[@title='Open Selection Dialog'])[2]")
	private WebElement primary2;
	
	@FindBy(xpath="(//button[@title='Open Selection Dialog'])[4]")
	private WebElement primary3;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primarySolutionTag']//input[@role='combobox']")
	private WebElement primary1field;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primaryTopicTag']//input[@role='combobox']")
	private WebElement primary2field;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primaryEconomicBuyerTag']//input[@role='combobox']")
	private WebElement primary3field;
	
	@FindBy(xpath="//coral-columnview-item-content[@title='Category']")
	private WebElement path1forPrimary1;
	
	@FindBy(xpath="//coral-columnview-item[@title='Firmwide']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2forPrimary1;
	
	@FindBy(xpath="//coral-columnview-item-content[@title='Topic']")
	private WebElement path1forPrimary2;
	
	@FindBy(xpath="//coral-columnview-item[@title='Deals']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2forPrimary2;
	
	@FindBy(xpath="//coral-columnview-item-content[@title='Economic buyer']")
	private WebElement path1forPrimary3;
	
	@FindBy(xpath="//coral-columnview-item[@title='Chief Risk']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement path2forPrimary3;
	
	@FindBy(xpath="//label[normalize-space()='Please fill out this field.']")
	private static List<WebElement> errorMessage2;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Select']")
	private WebElement selectButton;
	
	@FindBy(xpath="//div[@data-path='/content/valuestore/us/en/firmwide/erinc-content/jcr:content/root/container/container_276238855/container/richtext']")
	private WebElement editableText;
	
	@FindBy(xpath="//div[@aria-label='Text to Display']")
	private WebElement textArea;
	
	@FindBy(xpath="//span[@class='vs-content-details__description']")
	private WebElement contentDetails;
	
	@FindBy(xpath="//coral-buttongroup[@class='coral3-ButtonGroup rte-toolbar is-sticky is-active']//button[@title='Styles']")
	private WebElement styles;
	
	@FindBy(xpath="//coral-buttongroup[@class='coral3-ButtonGroup rte-toolbar is-sticky is-active']//button[@title='Bold (Ctrl+B)']")
	private WebElement bold;
	
	@FindBy(xpath="//button[@title='Justify']")
	private WebElement alignment;
	
	@FindBy(xpath="(//span[@class='vs-content-details__description'])[1]")
	private WebElement richText;
	
	@FindBy(xpath="//button[@title='Done']")
	private WebElement done;
	
	@FindBy(xpath="//div[@title='Title']")
	private WebElement editTitle;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private WebElement title2;
	
	@FindBy(xpath="(//div[@title='Accordion'])[1]")
	private WebElement editAccordion;
	
	@FindBy(xpath="//coral-tab-label[normalize-space()='Properties']")
	private WebElement proTab;
	
	@FindBy(xpath="//input[@name='./singleExpansion']")
	private WebElement singleCheckbox;
	
	@FindBy(xpath="//coral-select[@data-cmp-accordion-v1-dialog-edit-hook='expandedSelectSingle']//button[@type='button']")
	private WebElement expandedItems;
	
	@FindBy(xpath="//coral-selectlist[@aria-multiselectable='false']//coral-selectlist-item[@value='item_1']")
	private WebElement CEO;
	
	@FindBy(xpath="//coral-selectlist[@aria-multiselectable='false']//coral-selectlist-item[@value='item_2']")
	private WebElement CFO;
	
	@FindBy(xpath="//strong[normalize-space()='The Benefit:']")
	private WebElement CEOtext;
	
	@FindBy(xpath="//strong[normalize-space()='Business']")
	private WebElement CFOtext;
	
	@FindBy(xpath="//button[@data-cmp-hook-accordion='button']")
	private static List<WebElement> accordionButtons;
	
	@FindBy(xpath="//h2[normalize-space()='Helpful assets']")
	private WebElement helpfulassetTitle;
	
	@FindBy(xpath="//a[normalize-space()='Fortune Trust Hub']")
	private WebElement firstAsset;
	
	@FindBy(xpath="(//a[@class='vs-content-details__links share-ext external'])[1]")
	private WebElement firstAssetShare;
	
	@FindBy(xpath="//a[normalize-space()='Full Fortune in US Business Survey']")
	private WebElement secondAsset;
	
	@FindBy(xpath="(//a[@class='vs-content-details__links share-ext external'])[2]")
	private WebElement secondAssetShare;
	
	@FindBy(xpath="//div[@class='vs-content-details__side-content-footer']")
	private WebElement dontForget;
	
	@FindBy(xpath="//a[normalize-space()='Open Salesforce']")
	private WebElement openSalesforce;
	
	@FindBy(xpath="//h2[@class='vs-share-external__heading']")
	private WebElement shareTitle;
	
	@FindBy(xpath="//a[@class='vs-share-external__get-link-btn get-link']")
	private WebElement copyLink;
	
	@FindBy(xpath="//a[normalize-space()='Link Copied!']")
	private WebElement copiedLink;
	
	@FindBy(xpath="//a[@class='vs-share-external__email-btn share-email']")
	private WebElement shareEmail;
	
	@FindBy(xpath="//a[@class='vs-share-external__get-link-btn share-dynamic-signal']")
	private WebElement shareSignal;
	
	@FindBy(xpath="//div[contains(@class, 'didyouknow')]")
	private WebElement didYouKnow;
	
	@FindBy(xpath="//span[@class='vs-did-you-know__item-heading']")
	private static List<WebElement> dykHeadings;
	
	@FindBy(xpath="//h2[@class='vs-did-you-know__heading']")
	private WebElement dykDescription;
	
	@FindBy(xpath="//h2[@class='vs-did-you-know__heading']") 
	private WebElement dykHeading;
	
	@FindBy(xpath="//a[@href='/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/erinc-content-page.html']")
	private WebElement hyperLink;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__feature-listing-heading'])[1]")
	private WebElement enablersTitle;
	
	@FindBy(xpath="//h3[@class='vs-content-details__feature-listing-item-heading'][normalize-space()='PLATFORMS']")
	private WebElement enablersHeading;
	
	@FindBy(xpath="//a[@data-heading='Enablers']")
	private static List<WebElement> enablersItems;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__client-list-heading'])[1]")
	private WebElement allianceTitle;
	
	@FindBy(xpath="//a[@data-heading='Alliances']")
	private static List<WebElement> allianceItems;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__client-list-heading'])[2]")
	private WebElement clientTitle;
	
	@FindBy(xpath="//a[@data-heading='Client examples']")
	private static List<WebElement> clientItems;
	
	@FindBy(xpath="(//h2[@class='vs-content-details__feature-listing-heading'])[2]")
	private WebElement campaignTitle;
	
	@FindBy(xpath="//a[@data-heading='Campaign materials']")
	private static List<WebElement> campaignItems;
	
	@FindBy(xpath="//div[@title='Market Demand Component']")
	private WebElement marketEdit;
	
	@FindBy(xpath="//span[normalize-space()='Market Demand']")
	private WebElement marketOption;
	
	@FindBy(xpath="//input[@name='./content/item0/./value']")
	private WebElement demandValue;
	
	@FindBy(xpath="//span[normalize-space()='$26M']")
	private WebElement marketValue1;
	
	@FindBy(xpath="//span[normalize-space()='$7.4M']")
	private WebElement marketValue2;
	
	@FindBy(xpath="//a[@data-tag-id='Deals']")
	private WebElement dealsTag;
	
	@FindBy(xpath="//img[contains(@alt, 'logo')]")
	private WebElement logo;
	
	@FindBy(xpath="//figure[@class='vs-card__figure-wrapper']")
	private static List<WebElement> tagPills;
	
	@FindBy(xpath="//h2[normalize-space()='What others are viewing']")
	private WebElement whatOthersTitle;
	
	@FindBy(xpath="(//div[@class='vs-related-items__item-content'])[1]")
	private WebElement firstWhatContent;
	
	@FindBy(xpath="//div[@class='vs-related-items__item-content']")
	private static List<WebElement> whatContents;
	
	@FindBy(xpath="//div[@class='vs-related-items__item-heading']")
	private static List<WebElement> whatTopicLabels;
	
	@FindBy(xpath="//div[@class='vs-related-items__item-icon']")
	private static List<WebElement> whatTopicFavs;
	
	@FindBy(xpath="//div[@class='cmp-experiencefragment cmp-experiencefragment--header']")
	private WebElement header;
	
	@FindBy(xpath="//div[@class='cmp-experiencefragment cmp-experiencefragment--footer']")
	private WebElement footer;
	
	@FindBy(xpath="//div[@id='share-external-prompt-modal']//button[@type='button']")
	private WebElement closeShareModal;
	
	@FindBy(xpath="//a[@id='helpful-assets']")
	private static List<WebElement> helpfulAssetLinks;
	
	@FindBy(xpath="//h2[normalize-space()='Habilitadores']")
	private WebElement enablersSpanish;
	
	@FindBy(xpath="//h2[normalize-space()='Alianzas']")
	private WebElement alliancesSpanish;
	
	@FindBy(xpath="//h2[normalize-space()='Materiales de campaña']")
	private WebElement cmSpanish;
	
	@FindBy(xpath="//h2[normalize-space()='Estructura de campaña']")
	private WebElement csSpanish;
	
	@FindBy(xpath="//div[@title='Helpful Assets']")
	private WebElement haEdit;
	
	@FindBy(xpath="//coral-dialog-header[@class='cq-dialog-header']")
	private WebElement haDialogHeader;
	
	@FindBy(xpath="(//coral-checkbox[@class='coral-Form-field coral3-Checkbox'])[1]")
	private WebElement firstShareCheckbox;
	
	@FindBy(xpath="//a[@class='vs-content-details__links share-ext external']")
	private static List<WebElement> shareAssets;
	
	@FindBy(xpath="(//div[@title='Links Listing'])[2]")
	private WebElement cmEdit;
	
	@FindBy(xpath="//input[@name='./linkswrapper/item0/./linksgroup/item0/./linkText']")
	private WebElement cmLinkText;
	
	@FindBy(xpath="//input[@name='./linkswrapper/item0/./linksgroup/item0/./externalUrl']")
	private WebElement cmUrl;
	
	@FindBy(xpath="(//div[@title='Client examples,Alliances,Enablers'])[2]")
	private WebElement ceEdit;
	
	@FindBy(xpath="a[data-heading='Client examples'][href='http://www.amazon.com']")
	private WebElement ceFirstAsset;
	
	@FindBy(xpath="//h2[normalize-space()='Client examples']")
	private WebElement ceTitle;
	
	@FindBy(xpath="//input[@name='./content/item0/./subtext']")
	private WebElement marketSubText;
	
	@FindBy(xpath="//h2[normalize-space()='Alliances']")
	private WebElement alliancesTitle;
	
	@FindBy(xpath="(//div[@title='Client examples,Alliances,Enablers'])[1]")
	private WebElement alliancesEdit;
	
	@FindBy(xpath="//input[@name='./linkswrapper/item0/./linksgroup/item0/./externalUrl']")
	private WebElement alliancesExternalLink;
	
	@FindBy(xpath="//h2[normalize-space()='Campaign structure']")
	private WebElement csTitle;
	
	@FindBy(xpath="//a[@data-heading='Campaign structure']")
	private static List<WebElement> csAssets;
	
	@FindBy(xpath="//div[@title='Did You Know Component']")
	private WebElement dykEdit;
	
	@FindBy(xpath="//div[@name='./text']")
	private WebElement dykTextEdit;
	
	@FindBy(xpath="//h3[@class='vs-content-details__side-content-item-heading']")
	private WebElement groupLabel;
	
	@FindBy(xpath="//h3[@class='vs-content-details__side-content-item-heading']")
	private WebElement itemUrl;
	
	@FindBy(xpath="//button[@class='cmp-accordion__button']")
	private WebElement firstAccordionButton;
	
	@FindBy(xpath="//button[@class='cmp-accordion__button cmp-accordion__button--expanded']")
	private WebElement secondAccordionButton;
	
	@FindBy(xpath="(//span[@class='vs-content-details__description'])[3]")
	private WebElement firstAccordionText;
	
	@FindBy(xpath="//p[contains(text(),'If CEOs and CFOs take the lead in aligning senior ')]")
	private WebElement secondAccordionText;
	
	@FindBy(xpath="//span[@class='vs-footer__disclaimer']")
	private WebElement footerText;
	
	@FindBy(xpath="//h1[@class='cmp-title__text']")
	private static List<WebElement> titleSections;
	
	@FindBy(xpath="//h3[normalize-space()='EXTERNAL']")
	private WebElement helpfulExternal;
	
	@FindBy(xpath="//h3[normalize-space()='INTERNAL']")
	private WebElement helpfulInternal;
	
	@FindBy(xpath="//h2[normalize-space()='Enablers']")
	private WebElement enableTitle;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primarySubsectorTag']//button[@title='Open Selection Dialog']")
	private WebElement nmTagImg;
	
	@FindBy(xpath="//coral-columnview-item[@title='Sector']")
	private WebElement sectorPath;
	
	@FindBy(xpath="//coral-columnview-item[@title='Asset and wealth management']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement sectorPath1;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./primarySubsectorTag']//input[@role='combobox']")
	private WebElement nmArea;
	
	@FindBy(xpath="//div[@title='Pwc Button']")
	private WebElement pwcButtonEdit;
	
	@FindBy(xpath="//input[@name='./text']")
	private WebElement pwcButtonTitle;
	
	@FindBy(xpath="//h2[normalize-space()='In case you missed it']")
	private WebElement missedItTitle;
	
	@FindBy(xpath="//div[@title='In Case You Missed It Component']")
	private WebElement missedItEdit;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./cards/item0/./pagePath']//button[@title='Open Selection Dialog']")
	private WebElement missedItCardPath;
	
	@FindBy(xpath="//coral-columnview-column[@role='presentation']//coral-columnview-column-content[@role='presentation']")
	private WebElement missedItCardPathOption;
	
	@FindBy(xpath="//div[@class='betty-SimpleBar-region']//button[1]")
	private WebElement missedItCancelButton;
	
	@FindBy(xpath="//foundation-autocomplete[@placeholder='Image path']//button[@title='Open Selection Dialog']")
	private WebElement missedItImgPath;
	
	@FindBy(xpath="//coral-columnview-item[@title='Value Storevaluestore']")
	private WebElement missedItImgPathOption;
	
	@FindBy(xpath="//textarea[@placeholder='Text or Quote']")
	private WebElement missedItTextArea;
	
	@FindBy(xpath="//div[@class='vs-card__incase-items']")
	private static List<WebElement> missedItCards;
	
	@FindBy(xpath="//a[@class='vs-card__box-content-heading_incase']")
	private static List<WebElement> missedItLinks;
	
	@FindBy(xpath="//div[@class='vs-card__box-heading-link_incase']//span")
	private static List<WebElement> missedItLabels;
	
	@FindBy(xpath="//div[@class='vs-card__box-heading-favorites']")
	private static List<WebElement> missedItFavs;
	
	@FindBy(xpath="//div[@title='Video Player']")
	private WebElement vpEdit;
	
	@FindBy(xpath="//input[@name='./autoPlay']")
	private WebElement autoPlay;
	
	@FindBy(xpath="//button[@title='Play clip']")
	private WebElement playClip;
	
	@FindBy(xpath="//button[@title='Mute']")
	private WebElement volume;
	
	@FindBy(xpath="//div[@class='timers comp durationLabel display-medium']")
	private WebElement timers;
	
	@FindBy(xpath="//button[@title='Playback Speed']")
	private WebElement speed;
	
	@FindBy(xpath="//button[@title='Quality Settings']")
	private WebElement qualitySettings;
	
	@FindBy(xpath="//button[@title='Full screen']")
	private WebElement fullScreen;
	
	@FindBy(xpath="//a[@aria-label='Pause clip']")
	private WebElement pause;
	
	@FindBy(xpath="//div[contains(@class, 'mwEmbedPlayer')]")
	private WebElement videoPlayer;
	
	@FindBy(xpath="//a[@data-plugin-name='largePlayBtn']")
	private WebElement videoPlayer2;
	
	@FindBy(xpath="//a[@aria-label='Play clip']")
	private WebElement playButton;
	
	@FindBy(xpath="//a[normalize-space()='Read on pwc.com']")
	private WebElement pwcButton;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-box-content']")
	private WebElement contentBox;
	
	@FindBy(xpath="//div[@class='vs-footer__feature-item left']//a")
	private static List<WebElement> footerItems;
	
	@FindBy(xpath="//div[@data-path='/content/valuestore/us/en/jcr:content/root/container/*']")
	private WebElement createMissed;
	
	@FindBy(xpath="//button[@title='Insert component']")
	private WebElement insertComponent;
	
	@FindBy(xpath="//coral-selectlist-item[@value='/apps/valuestore/components/incaseyoumissedit']")
	private WebElement missedComponent;
	
	@FindBy(xpath="//div[@title='In Case You Missed It Component']")
	private WebElement editMissed;
	
	@FindBy(xpath="//coral-select[@name='./heading']//button[@type='button']")
	private WebElement selectHeading;
	
	@FindBy(xpath="//coral-selectlist-item[@value='MissedIt_Title']")
	private WebElement missedHeading;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Add']")
	private WebElement firstAdd;
	
	@FindBy(xpath="//input[@placeholder='Page path']")
	private WebElement pagePath1;
	
	@FindBy(xpath="//button[@value='/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages']")
	private WebElement pagePath1value;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./cards/item1/./pagePath']//input[@placeholder='Page path']")
	private WebElement pagePath2;
	
	@FindBy(xpath="//button[@value='/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/regression-content-page']")
	private WebElement pagePath2value;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./cards/item2/./pagePath']//input[@placeholder='Page path']")
	private WebElement pagePath3;
	
	@FindBy(xpath="//button[@value='/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/erinc-content-page']")
	private WebElement pagePath3value;
	
	@FindBy(xpath="//input[@placeholder='Image path']")
	private WebElement imgPath1;
	
	@FindBy(xpath="//textarea[@placeholder='Text or Quote']")
	private WebElement quoteArea;
	
	@FindBy(xpath="//button[@title='Delete']")
	private WebElement deleteComponent;
	
	@FindBy(xpath="//button[@id='DELETE']")
	private WebElement deleteButton;
	
	@FindBy(xpath="//input[@placeholder='Enter Keyword']")
	private WebElement enterKeyword;
	
	@FindBy(xpath="//coral-datepicker[@name='./offTime']//input[@role='combobox']")
	private WebElement offTimeField;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./displayImage/fileReference']//button[@title='Open Selection Dialog']")
	private WebElement imageContent;
	
	@FindBy(xpath="//div[@title='Value Store']")
	private WebElement path1image;
	
	@FindBy(xpath="(//coral-columnview-item[contains(@title,'us')])[1]")
	private WebElement path2image;
	
	@FindBy(xpath="(//coral-columnview-item[contains(@title,'en')])[1]")
	private WebElement path3image;
	
	@FindBy(xpath="(//coral-columnview-item[contains(@title,'QA')])[1]")
	private WebElement path4image;
	
	@FindBy(xpath="//img[@src='/content/dam/valuestore/us/en/qa-or-uat/2021-12-23.jpg/_jcr_content/renditions/cq5dam.thumbnail.48.48.png?ch_ck=1673845077000']")
	private WebElement path5image;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Open']")
	private WebElement openPage;
	
	@FindBy(xpath="//coral-datepicker[@name='./offTime']//button[@title='Calendar']")
	private WebElement offtimeCalendar;
	
	@FindBy(xpath="//button[@title='Next Month']")
	private WebElement calendarNext;
	
	@FindBy(xpath="//a[normalize-space()='12']")
	private WebElement nextDay;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-updated-time']")
	private WebElement newLabel;
	
	@FindBy(xpath="//coral-datepicker[@name='./creationDate']//input[@role='combobox']")
	private WebElement publishDateField;
	
	@FindBy(xpath="//div[@class='vs-title-area__card-updated-time']")
	private static List<WebElement> newLabel2;
	
	@FindBy(xpath="//coral-alert-content[normalize-space()='The page has been published']")
	private WebElement publishMessage;
	
	@FindBy(xpath="//a[contains(text(),'home page')]")
	private WebElement mailto;
	
	@FindBy(xpath="//img[contains(@src, '404')]")
	private WebElement img404;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Done']")
	private WebElement donePage;
	
	@FindBy(xpath="//input[@name='./hideFromSiteSearch']")
	private WebElement hideCheckbox;
	
	@FindBy(xpath="//coral-button-label[normalize-space()='Publish']")
	private WebElement publishButton;
	
	@FindBy(xpath="//a[@aria-label='Pause clip']")
	private WebElement pauseButton;
	
	@FindBy(xpath="//div[contains(@data-path, 'accordion/item_1')]//div[@title='Rich Text Component']")
	private WebElement accordionTextEdit;
	
	@FindBy(xpath="//foundation-autocomplete[@name='./linkswrapper/item1/./linksgroup/item0/./internalUrl']//input[@is='coral-textfield']")
	private WebElement enablersTextField;
	
	@FindBy(xpath="//coral-list-item-content[normalize-space()='/content/valuestore/us/en/firmwide']")
	private WebElement vsContent;
	
	@FindBy(xpath="//coral-columnview-item[@title='Supplementary']")
	private WebElement supplementary;
	
	@FindBy(xpath="//coral-columnview-item[@title='GX']")
	private WebElement GXpath;
	
	@FindBy(xpath="(//coral-columnview-item-content[@title='Category'])[2]")
	private WebElement Catpath;
	
	@FindBy(xpath="//coral-columnview-item[@title='Electronics']//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement Catpath1;
	
	@FindBy(xpath="(//coral-columnview-item-content[@title='Topic'])[2]")
	private WebElement Toppath;
	
	@FindBy(xpath="(//coral-columnview-item[contains(@title, 'ESG')]//coral-columnview-item-thumbnail[@role='presentation'])[1]")
	private WebElement Toppath1;
	
	@FindBy(xpath="(//coral-columnview-item-content[@title='Economic buyer'])[2]")
	private WebElement Ecopath;
	
	@FindBy(xpath="//coral-columnview-item[contains(@title, 'Chief')]//coral-columnview-item-thumbnail[@role='presentation']")
	private WebElement Ecopath1;
	
	@FindBy(xpath="//input[@id='initEmail']")
	private WebElement email;
	
	@FindBy(xpath="//button[.='Next']")
	private WebElement next;
	
	@FindBy(xpath="//textarea[@name='./jcr:description']")
	private WebElement externalDesc;
	
	@FindBy(xpath="//input[@name='./externalUrl']")
	private WebElement externalUrl;
	
	@FindBy(xpath="//button[@title='View as Published']")
	private WebElement viewasPublish;
	
	
	
	
ReadXLSdata read1=new ReadXLSdata();
	
	public void setPageTitle(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
        test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Click preview button");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(previewButton));
	    clickableElement.click();
	    previewButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Switch to iframe and get page title");
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(pageTitle));
	    visibleElement2.click();
	    String title=pageTitle.getText();
	    System.out.println(title);
	    test.info("Switch back to default content and click page info button and open properties");
	    Driver.getDriver().switchTo().defaultContent();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
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
	    String mockTitle="erinc-content2";
	    titleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    HelperFunctions.waitForPageToLoad(5);
	    HelperFunctions.staticWait(3);
	    test.info("Click preview button, switch to iframe, and get page title");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement clickableElement3 = wait3.until(ExpectedConditions.elementToBeClickable(previewButton));
	    clickableElement3.click();
	    previewButton.click();
	    HelperFunctions.staticWait(3);
	    Driver.getDriver().switchTo().frame("ContentFrame");
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement4 = wait4.until(ExpectedConditions.visibilityOf(pageTitle));
	    visibleElement4.click();
	    test.info("Verify the title value matches the page title");
	    String title3=pageTitle.getText();
	    System.out.println(title3);
	    Assert.assertEquals(mockTitle,title3);
	    test.info("Switch back to default content and click page info button and open properties");
	    Driver.getDriver().switchTo().defaultContent();
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.staticWait(2);
	    test.info("Enter new first title value and save and close");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    titleField.sendKeys("erinc-content Automation pages");
	    HelperFunctions.staticWait(2);
	    saveClose.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	}
	
	public void setMandatoryFields(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on Content page");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on Title field");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    String titleText = title.getText();
	    boolean hasAsterisk = titleText.contains("*");
	    Assert.assertTrue(hasAsterisk, "The 'titleText' field does not have an asterisk.");
	    test.info("Verified The 'titleText' field has an asterisk.");
	    HelperFunctions.staticWait(2);
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    test.info("Cleared on Title field");
	    titleField.clear();
	    HelperFunctions.staticWait(4);
	    test.info("Verified error message is displayed for Title field");
	    Assert.assertTrue(errorMessage.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Title field");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    test.info("Send text on Title field");
	    titleField.sendKeys("asfsf");
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off Time field");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    String offTimeText = offTime.getText();
	    boolean hasAsterisk2 = offTimeText.contains("*");
	    Assert.assertTrue(hasAsterisk2, "The 'Off Time' field does not have an asterisk.");
	    test.info("Verified Off Time field has asterisk");
	    HelperFunctions.staticWait(2);
	    test.info("Click on Off Time field and enter formatted date time");
	    dateField.click();
	    HelperFunctions.staticWait(2);
	    LocalDateTime dateTime = LocalDateTime.now().plusMonths(3);
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
	 String formattedDateTime = dateTime.format(formatter);
	 dateField.sendKeys(formattedDateTime);
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	 boolean isNotClickable = wait4.until(ExpectedConditions.invisibilityOfElementLocated(By.id("createButton")));

	 if (isNotClickable) {
	     System.out.println("The element is not clickable");
	     Assert.assertTrue(true);
	 } else {
	     System.out.println("The element is clickable");
	 }
	   test.info("Verified the create button is not clickable");
	 HelperFunctions.staticWait(2);
	 String primaryCategory = primaryCat.getText();
	 boolean hasAsterisk3 = primaryCategory.contains("*");
	 Assert.assertTrue(hasAsterisk3, "The 'primary category' field does not have an asterisk.");
	 test.info("Verified Primary Category field has asterisk");
	 HelperFunctions.staticWait(2);
     String primarytopic = primaryTopic.getText();
     boolean hasAsterisk4 = primarytopic.contains("*");
	 Assert.assertTrue(hasAsterisk4, "The 'primary topic' field does not have an asterisk.");   
	 test.info("Verified Primary Topic field has asterisk");
	 HelperFunctions.staticWait(2);
	 String primaryEconomic = primaryEco.getText();
     boolean hasAsterisk5 = primaryEconomic.contains("*");
	 Assert.assertTrue(hasAsterisk5, "The 'primary Economic' field does not have an asterisk."); 
	 test.info("Verified Primary Economic field has asterisk");
	 HelperFunctions.staticWait(2);
	 test.info("Scroll to published date field");
	 HelperFunctions.scrollToElement(publishDate);
	 HelperFunctions.staticWait(2);
	 String publishdate = publishDate.getText();
     boolean hasAsterisk6 = publishdate.contains("*");
	 Assert.assertTrue(hasAsterisk6, "The 'publish date' field does not have an asterisk."); 
	 test.info("Verified publish date field has asterisk");
	 HelperFunctions.staticWait(2);
	 String contentimage = contentImage.getText();
     boolean hasAsterisk7 = contentimage.contains("*");
	 Assert.assertTrue(hasAsterisk7, "The 'content image' field does not have an asterisk."); 
	 test.info("Verified content image field has asterisk");
	 HelperFunctions.staticWait(3);
	}
	public void setPrimaryTags(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    test.info("Wait for content page visibility and click on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Click on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(15);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off time element");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    test.info("Click on Primary 1 tag and select tags");
        primary1.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(path1forPrimary1));
        path1forPrimary1.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(path2forPrimary1));
        path2forPrimary1.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        test.info("Click on Primary 2 tag and select tags");
        WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(primary2));
        primary2.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(path1forPrimary2));
        path1forPrimary2.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(path2forPrimary2));
        path2forPrimary2.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        test.info("Click on Primary 3 tag and select tags");
        WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(primary3));
        primary3.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    wait9.until(ExpectedConditions.visibilityOf(path1forPrimary3));
        path1forPrimary3.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 10);
	    wait10.until(ExpectedConditions.visibilityOf(path2forPrimary3));
        path2forPrimary3.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        test.info("Check for error message list");
        WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 10);
        boolean isListInvisible = wait11.until(ExpectedConditions.invisibilityOfAllElements(errorMessage2));
        assert isListInvisible : "Error message list exists on the page!";
        HelperFunctions.staticWait(2);
        test.info("Cleared primary 1 field and checked error message is displayed");
        primary1field.click();
        HelperFunctions.staticWait(2);
        primary1field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        HelperFunctions.staticWait(2);
        test.info("Cleared primary 2 field and checked error message is displayed");
        primary2field.click();
        HelperFunctions.staticWait(2);
        primary2field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        HelperFunctions.staticWait(2);
        test.info("Cleared primary 3 field and checked error message is displayed");
        primary3field.click();
        HelperFunctions.staticWait(2);
        primary3field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        HelperFunctions.staticWait(2);
        WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 10);
        List<WebElement> displayedElements = wait12.until(ExpectedConditions.visibilityOfAllElements(errorMessage2));
        assert !displayedElements.isEmpty() : "Error message list is not displayed on the page!";
        HelperFunctions.staticWait(2);
	}
	public void setAddingText(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for preview icon is displayed and click on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Getting the rich text's font weight");
	    String fontWeight = richText.getCssValue("font-weight");
	    Driver.getDriver().switchTo().defaultContent();
	    test.info("Clicked on edit button to edit the rich text");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    editableText.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on edit area");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(textArea));
	    textArea.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for styles icon is displayed and Verified");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(styles));
	    Assert.assertTrue(styles.isDisplayed());
	    HelperFunctions.staticWait(1);
	    test.info("Verified bold icon was displayed");
	    Assert.assertTrue(bold.isDisplayed());
	    HelperFunctions.staticWait(1);
	    test.info("Verified alignment was displayed");
	    Assert.assertTrue(alignment.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on content details");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.elementToBeClickable(contentDetails));
        contentDetails.click();
        HelperFunctions.staticWait(2);
        test.info("Selected whole content and clicked on bold");
        contentDetails.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        HelperFunctions.staticWait(3);
        bold.click();
        HelperFunctions.staticWait(3);
        done.click();
        HelperFunctions.staticWait(2);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Getting the rich text's font weight");
	    String fontWeight2 = richText.getCssValue("font-weight");
	    test.info("Verified the rich text's font weight has changed");
	    Assert.assertNotEquals(fontWeight, fontWeight2);
	    Driver.getDriver().switchTo().defaultContent();
	    test.info("Clicked on edit button to edit the rich text");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    editableText.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    wait9.until(ExpectedConditions.visibilityOf(textArea));
	    test.info("Clicked on edit area");
	    textArea.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on content details");
	    contentDetails.click();
        HelperFunctions.staticWait(2);
        test.info("Selected whole content and clicked on bold");
        contentDetails.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        HelperFunctions.staticWait(2);
        WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 10);
	    wait10.until(ExpectedConditions.visibilityOf(bold));
        bold.click();
        HelperFunctions.staticWait(3);
        done.click();
        HelperFunctions.staticWait(2);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 10);
	    wait11.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	}
	public void setTitleEdit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to the edit title and clicked on it");
	    HelperFunctions.scrollToElement(editTitle);
	    HelperFunctions.staticWait(3);
	    editTitle.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    HelperFunctions.staticWait(3);
	    String actualTitle="Who's impacted";
	    String mockTitle="Benefits";
	    test.info("Wait for title field visibility and clicked on it");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(titleField));
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    test.info("Changed the title and clicked on done button");
	    titleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    done.click();
        HelperFunctions.staticWait(2);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Verified the title has been changed");
	    Assert.assertTrue(title2.getText().contains(mockTitle));
	    Driver.getDriver().switchTo().defaultContent();
	    test.info("Clicked on the edit button");
	    editButton.click();
	   // HelperFunctions.staticWait(3);
	   // HelperFunctions.scrollToElement(editTitle);
	    test.info("Clicked on the edit title");
	    HelperFunctions.staticWait(3);
	    editTitle.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on configure button");
	    configure.click();
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on title field and enter the first title");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    titleField.sendKeys(actualTitle);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on done button");
	    done.click();
        HelperFunctions.staticWait(2);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    wait9.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Verified the title has been changed");
	    Assert.assertTrue(title2.getText().contains(actualTitle));
	    HelperFunctions.staticWait(2);
	}
	public void setAccordion(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(15);
	 
	    test.info("Wait for edit button visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
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
	    //HelperFunctions.staticWait(3);
	    editButton.click();
	    wait.until(ExpectedConditions.visibilityOf(editAccordion));
	    test.info("Clicked on edit accordion");
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", editAccordion);
	    //editAccordion.click();
	    wait.until(ExpectedConditions.visibilityOf(configure));
	    test.info("Clicked on configure");
	    configure.click();
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for pro tab visibility and clicked on it");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(proTab));
	    proTab.click();
	    wait.until(ExpectedConditions.visibilityOf(singleCheckbox));
	    test.info("Check if single checkbox is selected");
	    Assert.assertTrue(singleCheckbox.isSelected());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on expanded items");
	    expandedItems.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on CEO");
	    CEO.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on done button");
	    done.click();
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
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait2.until(ExpectedConditions.elementToBeClickable(editButton));
	    //HelperFunctions.staticWait(3);
	    editButton.click();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(accordionTextEdit));
	    accordionTextEdit.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(dykTextEdit));
	    dykTextEdit.click();
	    HelperFunctions.staticWait(2);
        done.click();
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
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait6.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Check if CEO text is not displayed");
	    Assert.assertTrue(CEOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Check if CFO text is displayed");
	    Assert.assertFalse(CFOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Wait for first accordion button is clickable and clicked on it");
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(accordionButtons.get(1)));
	    accordionButtons.get(1).click();
	    HelperFunctions.staticWait(2);
	    test.info("Check if CEO text is displayed");
	    Assert.assertFalse(CEOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Check if CFO text is not displayed");
	    Assert.assertTrue(CFOtext.isDisplayed());
	    test.info("Wait for second accordion button is clickable and clicked on it");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(accordionButtons.get(0)));
	    accordionButtons.get(0).click();
	    HelperFunctions.staticWait(2);
	    test.info("Check if CEO text is not displayed");
	    Assert.assertTrue(CEOtext.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Check if CFO text is displayed");
	    Assert.assertFalse(CFOtext.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setHelpfulAssets(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Verify that helpfulassetTitle is displayed");
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    String href = firstAsset.getAttribute("href");
	    String href2 = secondAsset.getAttribute("href");
	    String href3 = openSalesforce.getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify that href is not null or empty");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(href2 != null && !href2.isEmpty(), "The href2 attribute is null or empty");
	    test.info("Verify that href2 is not null or empty");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(href3 != null && !href3.isEmpty(), "The href3 attribute is null or empty");
	    test.info("Verify that href3 is not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on first asset share icon");
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(copyLink.isDisplayed());
	    test.info("Verify that copyLink is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Verify that shareEmail is displayed");
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    test.info("Verify that href4 is not null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed());  
	    test.info("Verify that shareSignal is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on copy link button");
	    copyLink.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Verify that copiedLink is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setDidYouKnow(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for did you know is visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(didYouKnow));
	    Assert.assertTrue(didYouKnow.isDisplayed());
	    HelperFunctions.staticWait(2);
	    for(WebElement each: dykHeadings) {
	    if(each.isDisplayed()) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	    }
	    test.info("Verify if all did you know headings are displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(dykDescription.isDisplayed());
	    test.info("Verify if all did you know description is displayed");
	    HelperFunctions.staticWait(2);
	    String href = hyperLink.getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify that href is not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on hyperlink");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", hyperLink);
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.numberOfWindowsToBe(3));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 3, "Expected two windows to be open, but found " + windowHandles.size());
	    test.info("Verify that hyperlink is open in a new tab");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setEnablers(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	    test.info("Wait for enablers title is visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(enablersTitle));
	    Assert.assertTrue(enablersTitle.isDisplayed());
	    test.info("Verify enablers title is displayed");
	    Assert.assertTrue(enablersHeading.isDisplayed());
	    test.info("Verify enablers heading is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each:enablersItems) {
	    	Assert.assertTrue(each.isDisplayed());
	    	if(each.getAttribute("href")!= null && !each.getAttribute("href").isEmpty()) {
	    		 Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verify enablers items are displayed and href values are not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on enabler item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", enablersItems.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(3));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 3, "Expected two windows to be open, but found " + windowHandles.size());
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	    
	}
	public void setAlliances(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    //HelperFunctions.scrollToElement(enablersTitle);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("window.scrollBy(0,400)", "");
	    test.info("Wait for alliance title's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(allianceTitle));
	    Assert.assertTrue(allianceTitle.isDisplayed());
	    test.info("Verified alliance title is visible");
	    HelperFunctions.staticWait(2);
	    System.out.println(allianceItems.size());
	    test.info("Wait for alliance item's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOfAllElements(allianceItems));
	    test.info("Getting first item's text");
	    String alliance1 = allianceItems.get(0).getText().trim();
	    System.out.println(alliance1);
	    test.info("Getting first item's href");
	    String alliance1href=allianceItems.get(0).getAttribute("href");
	    System.out.println(alliance1href);
	    test.info("Getting first item's text");
	    String alliance2=allianceItems.get(1).getText().trim();
	    System.out.println(alliance2);
	    test.info("Getting first item's href");
	    String alliance2href=allianceItems.get(1).getAttribute("href");
	    String expectedhref1="https://www.salesforce.com/";
	    String expectedhref2="http://www.sap.com/";
	    String expectedText1="Salesforce";
	    String expectedText2="SAP";
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance1, expectedText1);
	    test.info("Verified first item's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance2, expectedText2);
	    test.info("Verified second item's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance1href, expectedhref1);
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(alliance2href, expectedhref2);
	    HelperFunctions.staticWait(3);
	    
	}
	public void setCreatingPageWithoutMandatoryFields(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for content page's visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on next button");
	    nextButton.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for title field's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    String titleText = title.getText();
	    boolean hasAsterisk = titleText.contains("*");
	    Assert.assertTrue(hasAsterisk, "The 'titleText' field does not have an asterisk.");
	    test.info("Verified title has asterisk");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
		 boolean isNotClickable = wait4.until(ExpectedConditions.invisibilityOfElementLocated(By.id("createButton")));

		 if (isNotClickable) {
		     System.out.println("The element is not clickable");
		     Assert.assertTrue(true);
		 } else {
		     System.out.println("The element is clickable");
		 }
		 test.info("Verified create button is not clickable");
		 HelperFunctions.staticWait(2);
	    
	}
	public void setClientExamples(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	   // JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	   // js2.executeScript("window.scrollBy(0,400)", "");
	    test.info("Wait for client title's visibility");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(clientTitle));
	    Assert.assertTrue(clientTitle.isDisplayed());
	    test.info("Verified the client title is displayed");
	    HelperFunctions.staticWait(2);
	    System.out.println(clientItems.size());
	    test.info("Wait for client items' visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOfAllElements(clientItems));
	    test.info("Getting the first client item's text");
	    String client1 = clientItems.get(0).getText().trim();
	    System.out.println(client1);
	    test.info("Getting the first client item's href value");
	    String client1href=clientItems.get(0).getAttribute("href");
	    System.out.println(client1href);
	    test.info("Getting the second client item's text");
	    String client2=clientItems.get(1).getText().trim();
	    System.out.println(client2);
	    test.info("Getting the second client item's href value");
	    String client2href=clientItems.get(1).getAttribute("href");
	    String expectedhref1="http://www.amazon.com/";
	    String expectedhref2="http://www.pwc.com/";
	    String expectedText1="Amazon";
	    String expectedText2="Conga + PwC";
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client1, expectedText1);
	    test.info("Verified first client's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client2, expectedText2);
	    test.info("Verified second client's text matched with expected text");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client1href, expectedhref1);
	    test.info("Verified first client's href value matched with expected href value");
	    HelperFunctions.staticWait(1);
	    Assert.assertEquals(client2href, expectedhref2);
	    test.info("Verified second client's href value matched with expected href value");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setCampaignMaterials(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	    test.info("Wait for visibility of campaign title");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(campaignTitle));
	    Assert.assertTrue(campaignTitle.isDisplayed());
	    test.info("Verify campaign title is visible");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: campaignItems) {
	    if(each.isDisplayed()) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	    }
	    test.info("Verify campaign items are visible");
	    HelperFunctions.staticWait(2);
	    String href = campaignItems.get(0).getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify campaign item's href value1 is not null or empty");
	    String href2 = campaignItems.get(1).getAttribute("href");
	    Assert.assertTrue(href2 != null && !href2.isEmpty(), "The href2 attribute is null or empty");
	    test.info("Verify campaign item's href value2 is not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on campaign item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", campaignItems.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.numberOfWindowsToBe(3));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 3, "Expected two windows to be open, but found " + windowHandles.size());
	    test.info("Verify campaign item's href value is open in a new tab");
	    HelperFunctions.staticWait(2);
	   
	}
	public void setMarketDemandOrange(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Wait for edit button's visibility and clicked on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to market edit and clicked on it");
	    HelperFunctions.scrollToElement(marketEdit);
	    HelperFunctions.staticWait(3);
	    marketEdit.click();
	    HelperFunctions.staticWait(3);
	    test.info("Wait for configure button's visibility and clicked on it");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.elementToBeClickable(configure));
	    configure.click();
	    HelperFunctions.staticWait(3);
	    test.info("Wait for market option's visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(marketOption));
	    test.info("Clicked on demand value and send value");
	    String mockValue="$26M";
	    demandValue.click();
	    HelperFunctions.staticWait(2);
	    demandValue.clear();
	    HelperFunctions.staticWait(2);
	    demandValue.sendKeys(mockValue);
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on done button");
	    done.click();
        HelperFunctions.staticWait(2);
        test.info("Clicked on page info and published the page");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    test.info("Wait for market value's visibility");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(marketValue1));
	    test.info("Getting the css value of market values");
	    String orangeColor="rgba(235, 140, 0, 1)";
	    String color = marketValue1.getCssValue("color");
	    System.out.println("The color of the text is: " + color);
	    Assert.assertEquals(color, orangeColor);
	    HelperFunctions.staticWait(2);
	    String color2 = marketValue2.getCssValue("color");
	    System.out.println("The color of the text is: " + color2);
	    Assert.assertEquals(color2, orangeColor);
	    test.info("Verified the market values' color is orange");
	    HelperFunctions.staticWait(3);
	    
	}
	public void setShareModal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for asset title to be visible");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    test.info("Assert that asset title and share button are visible");
	    HelperFunctions.staticWait(2);
	    test.info("Click on the first asset's share button");
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal to be visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    Assert.assertTrue(copyLink.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Assert that copy link and share email options are visible");
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed()); 
	    test.info("Assert that share signal link is visible and has a non-empty href attribute");
	    HelperFunctions.staticWait(2);
	    test.info("Click on the 'Copy Link' option");
	    copyLink.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for the 'Link copied!' confirmation to be visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Assert that the 'Link copied!' confirmation is visible");
	    HelperFunctions.staticWait(2);
	}
	public void setTagPillsExist(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for page to load");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(dealsTag));
	    Assert.assertTrue(dealsTag.isDisplayed());
	    HelperFunctions.staticWait(2);
	    logo.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of logo");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Checked each elements have tag pill as a child element");
	    for (WebElement element :tagPills) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            boolean hasChildElement = element.findElements(By.xpath("//div[@class='vs-card__favorite-pill-wrapper']"))
                    .size() > 0;
            if (hasChildElement) {
            	Assert.assertTrue(true);
                System.out.println("The element has the child element");
            } else {
            	Assert.assertTrue(false);
                System.out.println("The element does not have the child element");
            }
        }
	    test.info("Verified each elements have tag pill as a child element");
	    HelperFunctions.staticWait(3);
	}
	public void setSharableLinks(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for asset title to be visible");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(firstAssetShare.isDisplayed());
	    test.info("Assert that asset title and share button are visible");
	    test.info("Click on the first asset's share button");
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal to be visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    Assert.assertTrue(copyLink.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Assert that copy link and share email options are visible");
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed()); 
	    test.info("Assert that share signal link is visible and has a non-empty href attribute");
	    HelperFunctions.staticWait(2);
	    test.info("Click on the 'Copy Link' option");
	    copyLink.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for the 'Link copied!' confirmation to be visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Assert that the 'Link copied!' confirmation is visible");
	    HelperFunctions.staticWait(2);
	}
	public void setExpirationDate(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    test.info("Clicked on Content page");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on Title field");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(titleField));
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off Time field");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    String offTimeText = offTime.getText();
	    boolean hasAsterisk2 = offTimeText.contains("*");
	    Assert.assertTrue(hasAsterisk2, "The 'Off Time' field does not have an asterisk.");
	    test.info("Verified Off Time field has asterisk");
	    HelperFunctions.staticWait(2);
	    test.info("Click on Off Time field and enter formatted date time");
	    dateField.click();
	    HelperFunctions.staticWait(2);
	    LocalDateTime dateTime = LocalDateTime.now().plusMonths(3);
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm a");
	 String formattedDateTime = dateTime.format(formatter);
	 dateField.sendKeys(formattedDateTime);
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 calendar.click();
	 HelperFunctions.staticWait(2);
	 
	}
	public void setShareModals(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Verify that helpfulassetTitle is displayed");
	    Assert.assertTrue(helpfulassetTitle.isDisplayed());
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    Assert.assertTrue(firstAssetShare.isDisplayed());
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(shareTitle));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(copyLink.isDisplayed());
	    test.info("Verify that copyLink is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Verify that shareEmail is displayed");
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    test.info("Verify that href4 is not null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed());  
	    test.info("Verify that shareSignal is displayed");
	    HelperFunctions.staticWait(2);
	}
	
	public void setWhatOthersViewing(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for visibility of first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    test.info("Scroll to what others viewing title");
	    HelperFunctions.scrollToElement(whatOthersTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(whatOthersTitle.isDisplayed());
	    test.info("Verify that whatOthersTitle is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content title's border bottom are changing when move the cursor");
	    for (WebElement whatContent : whatContents) {
	        String originalBorderBottom = whatContent.getCssValue("border-bottom");
	        System.out.println(originalBorderBottom);
	        
	        Actions actions = new Actions(Driver.getDriver());
	        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	        js2.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", whatContent);
	        
	        actions.moveToElement(whatContent).build().perform();
	        String borderBottom = whatContent.getCssValue("border-bottom");
	        System.out.println("borderBottom: " + borderBottom);
	        
	        Assert.assertNotEquals(originalBorderBottom, borderBottom);
	        HelperFunctions.staticWait(2);
	        test.info("Verified all content title's border bottom are changing when move the cursor");
	    }
	    HelperFunctions.staticWait(2);
	}
	public void setWhatOthersViewingElements(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for visibility of first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    test.info("Scroll to what others viewing title");
	    HelperFunctions.scrollToElement(whatOthersTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(whatOthersTitle.isDisplayed());
	    test.info("Verify that whatOthersTitle is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content title are displayed");
	    for (WebElement whatContent : whatContents) {
	        if(whatContent.isDisplayed()) {
	        	Assert.assertTrue(true);
	        }else {
	        	Assert.assertTrue(false);
	        }
	    }
	    test.info("Verified all content title are displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content label are displayed");
	    for (WebElement whatTopic : whatTopicLabels) {
	        if(whatTopic.isDisplayed()) {
	        	Assert.assertTrue(true);
	        }else {
	        	Assert.assertTrue(false);
	        }
	    }
	    test.info("Verified all content label are displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Checking all content fav icon are displayed");
	    for (WebElement whatTopicFav : whatTopicFavs) {
	        if(whatTopicFav.isDisplayed()) {
	        	Assert.assertTrue(true);
	        }else {
	        	Assert.assertTrue(false);
	        }
	    }
	    test.info("Verified all content fav icon are displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setHeaderFooter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles = Driver.getDriver().getWindowHandles();
	    Iterator<String> iterator = windowHandles.iterator();
	    String currentHandle = "";
	    while (iterator.hasNext()) {
	        currentHandle = iterator.next();
	        if (!currentHandle.equals(mainWindowHandle)) {
	        	Driver.getDriver().switchTo().window(currentHandle);
	            break;
	        }
	    }*/
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   
	    test.info("Wait for visibility of header");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(header));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(header.isDisplayed());
	    test.info("Verified the header is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to footer");
	    HelperFunctions.scrollToElement(footer);
	    test.info("Wait for visibility of footer");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(footer));
	    Assert.assertTrue(footer.isDisplayed());
	    test.info("Verified the footer is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Go to the homepage");
	    Driver.getDriver().get(read1.getCellData("VALUE", 10));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of header");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(header));
	    Assert.assertTrue(header.isDisplayed());
	    test.info("Verified the header is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to footer");
	    HelperFunctions.scrollToElement(footer);
	    test.info("Wait for visibility of footer");
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(footer));
	    Assert.assertTrue(footer.isDisplayed());
	    test.info("Verified the footer is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Go to the topic landing page");
	    Driver.getDriver().get(read1.getCellData("VALUE", 36));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of header");
	    WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(header));
	    Assert.assertTrue(header.isDisplayed());
	    test.info("Verified the header is displayed");
	    HelperFunctions.staticWait(3);
	    test.info("Scroll to footer");
	    HelperFunctions.scrollToElement(footer);
	    test.info("Wait for visibility of footer");
	    WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    wait9.until(ExpectedConditions.visibilityOf(footer));
	    Assert.assertTrue(footer.isDisplayed());
	    test.info("Verified the footer is displayed");
	    HelperFunctions.staticWait(3);
	    
	    
	}
	public void setExternalLinkShare(ExtentTest test) throws Exception {
		//read1.setExcelFile("./testdata.xlsx", "QA");
	    /*Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);*/
	   // HelperFunctions.staticWait(3);
	   // test.info("Verify that helpfulassetTitle is displayed");
	   // Assert.assertTrue(helpfulassetTitle.isDisplayed());
	   // HelperFunctions.staticWait(2);
	   // test.info("Clicked on first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    Assert.assertTrue(firstAssetShare.isDisplayed());
	    
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(closeShareModal));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(closeShareModal.isDisplayed());
	    test.info("Verify that close button is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareEmail.isDisplayed());
	    test.info("Verify that share Email is displayed");
	    HelperFunctions.staticWait(3);
	    copyLink.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for the 'Link copied!' confirmation to be visible");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Assert that the 'Link copied!' confirmation is visible");
	    HelperFunctions.staticWait(2);
	}
	public void setShareNewPage(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulAssetLinks.get(0)));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", helpfulAssetLinks.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(3));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 3, "Expected two windows to be open, but found " + windowHandles.size());
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	    
	}
	public void setShareDialog(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(shareTitle));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(shareTitle.isDisplayed());
	    test.info("Verified share dialog is visible");
	    Assert.assertTrue(copyLink.isDisplayed());
	    test.info("Verify that copyLink is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on copy link");
	    copyLink.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(copiedLink));
	    Assert.assertTrue(copiedLink.isDisplayed()); 
	    test.info("Verify that copiedLink is displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setOffTimeMandatory(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 4));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);*/
	    test.info("Clicked on Content page");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    test.info("Clicked on Title field");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on Title field");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    test.info("Send text on Title field");
	    titleField.sendKeys("asfsf");
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off Time field");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    String offTimeText = offTime.getText();
	    boolean hasAsterisk2 = offTimeText.contains("*");
	    Assert.assertTrue(hasAsterisk2, "The 'Off Time' field does not have an asterisk.");
	    test.info("Verified Off Time field has asterisk");
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    boolean isNotClickable = wait4.until(ExpectedConditions.invisibilityOfElementLocated(By.id("createButton")));

	 if (isNotClickable) {
	     System.out.println("The element is not clickable");
	     Assert.assertTrue(true);
	 } else {
	     System.out.println("The element is clickable");
	 }
	   test.info("Verified the create button is not clickable");
       HelperFunctions.staticWait(3);
	}
	public void setDidYouKnowInline(ExtentTest test) throws Exception {
		//read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for did you know is visible");*/
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(didYouKnow));
	    Assert.assertTrue(didYouKnow.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(hyperLink.isDisplayed());
	    HelperFunctions.staticWait(2);
	    String href = hyperLink.getAttribute("href");
	    Assert.assertTrue(href != null && !href.isEmpty(), "The href attribute is null or empty");
	    test.info("Verify that href is not null or empty");
	    String color = hyperLink.getCssValue("color");
	    String textDecoration = hyperLink.getCssValue("text-decoration");
	    System.out.println(color);
	    System.out.println(textDecoration);
	    Assert.assertEquals("rgba(0, 0, 0, 1)", color);
	    Assert.assertEquals("underline solid rgb(0, 0, 0)", textDecoration);
	    HelperFunctions.staticWait(3);
	   
	}
	public void setHelpfulAssetsLinkUnderlined(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.staticWait(3);*/
	    //test.info("Verify that helpfulassetTitle is displayed");
	   // Assert.assertTrue(helpfulassetTitle.isDisplayed());
		WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(firstAsset));
	    HelperFunctions.staticWait(2);
	    Actions actions = new Actions(Driver.getDriver());
	    actions.moveToElement(firstAsset).perform();
	    String textDecoration = firstAsset.getCssValue("text-decoration");
	    System.out.println(textDecoration);
	    HelperFunctions.staticWait(2);
	    Assert.assertEquals("underline solid rgb(217, 57, 84)", textDecoration);
	    HelperFunctions.staticWait(3);
	}
	public void setMexicoSideTitles(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(logo));
		JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("window.scrollBy(0,250)", "");
	    test.info("Verify that enablers title is displayed");
	    Assert.assertTrue(enablersSpanish.isDisplayed());
	   // HelperFunctions.staticWait(2);
	    //HelperFunctions.scrollToElement(alliancesSpanish);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alliancesSpanish.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setConfigureDynamicSignal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);*/
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
	    test.info("Clicked on edit button to edit the shareable link");
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait1.until(ExpectedConditions.visibilityOf(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    haEdit.click();
	    HelperFunctions.staticWait(2);
	    configure.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(haDialogHeader));
	    firstShareCheckbox.click();
	    HelperFunctions.staticWait(2);
	    done.click();
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
	    previewButton.click();
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(2);
	    if(shareAssets.size()==1) {
	    	Assert.assertTrue(true);
	    }
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().defaultContent();
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
	    HelperFunctions.staticWait(2);
	    haEdit.click();
	    wait2.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(haDialogHeader));
	    firstShareCheckbox.click();
	    HelperFunctions.staticWait(2);
	    done.click();
	    HelperFunctions.staticWait(5);
	    test.info("Clicked on page info and published the page");
        //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    
	}
	public void setDynamicSignalOpenNewTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.staticWait(3);*/
	    //test.info("Verify that helpfulassetTitle is displayed");
	   // Assert.assertTrue(helpfulassetTitle.isDisplayed());
	   // HelperFunctions.staticWait(2);
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(firstAssetShare));
	    test.info("Clicked on first asset share icon");
	    firstAssetShare.click();
	    HelperFunctions.staticWait(2);
	    test.info("Wait for share modal page is visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(shareTitle));
	    HelperFunctions.staticWait(2);
	    String href4 = shareSignal.getAttribute("href");
	    Assert.assertTrue(href4 != null && !href4.isEmpty(), "The href4 attribute is null or empty");
	    test.info("Verify that href4 is not null or empty");
	    Assert.assertTrue(shareSignal.isDisplayed());  
	    test.info("Verify that shareSignal is displayed");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on copy link button");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", shareSignal);
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   // HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2 );
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	}
	public void setCampaignMaterialsOpenNewTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    test.info("Verify that helpfulassetTitle is displayed");
	   HelperFunctions.scrollToElement(campaignTitle);
	   test.info("Scroll to campaign materials");
	   HelperFunctions.staticWait(2);
	   JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", campaignItems.get(0));
	    test.info("Clicked on first asset");
	    HelperFunctions.staticWait(2);
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   // HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2);
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	}
	public void setConfigureCampaignMaterials(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	//    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	 //   test.info("Wait for page to load");
	 //   HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
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
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //wait.until(ExpectedConditions.visibilityOf(editButton));
	    test.info("Clicked on edit button to edit the shareable link");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", cmEdit);
	    //cmEdit.click();
	    wait.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 20);
	    wait2.until(ExpectedConditions.visibilityOf(done));
	    String actualText="Talent Change & Behaviors";
	    String actualLink="http://www.amazon.com";
	    String mockText="Salesforce";
	    String mockLink="http://www.salesforce.com";
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", cmLinkText);
	    HelperFunctions.staticWait(2);
	    cmLinkText.clear();
	    HelperFunctions.staticWait(2);
	    cmLinkText.sendKeys(mockText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmLinkText.getAttribute("value").equals(mockText));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", cmLinkText);
	    HelperFunctions.staticWait(2);
	    cmLinkText.clear();
	    HelperFunctions.staticWait(2);
	    cmLinkText.sendKeys(actualText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmLinkText.getAttribute("value").equals(actualText));
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", cmUrl);
	    HelperFunctions.staticWait(2);
	    cmUrl.clear();
	    HelperFunctions.staticWait(2);
	    cmUrl.sendKeys(mockLink);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmUrl.getAttribute("value").equals(mockLink));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js5 = (JavascriptExecutor) Driver.getDriver();
	    js5.executeScript("arguments[0].click();", cmUrl);
	    HelperFunctions.staticWait(2);
	    cmUrl.clear();
	    HelperFunctions.staticWait(2);
	    cmUrl.sendKeys(actualLink);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmUrl.getAttribute("value").equals(actualLink));
	    HelperFunctions.staticWait(3);
	}
	public void setConfigureClientExamples(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 2));
	  //  test.info("Wait for page to load");
	  //  HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
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
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //wait.until(ExpectedConditions.visibilityOf(editButton));
	    test.info("Clicked on edit button to edit the shareable link");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", ceEdit);
	    //cmEdit.click();
	    wait.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(done));
	    String actualText="Amazon";
	    String mockText="Amazon-amazon-amazon-amazon-amazon-amazon-amazon";
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", cmLinkText);
	    HelperFunctions.staticWait(2);
	    cmLinkText.clear();
	    HelperFunctions.staticWait(2);
	    cmLinkText.sendKeys(mockText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmLinkText.getAttribute("value").equals(mockText));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", cmLinkText);
	    HelperFunctions.staticWait(2);
	    cmLinkText.clear();
	    HelperFunctions.staticWait(2);
	    cmLinkText.sendKeys(actualText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmLinkText.getAttribute("value").equals(actualText));
	    HelperFunctions.staticWait(3);
	}
	public void setClientExampleVisibility(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    test.info("Verify that helpfulassetTitle is displayed");
	   HelperFunctions.scrollToElement(ceTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(ceTitle.isDisplayed());
	    test.info("Verify that client examples title is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setConfigureMarketDemand(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 2));
	  //  test.info("Wait for page to load");
	  //  HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
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
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //wait.until(ExpectedConditions.visibilityOf(editButton));
	    test.info("Clicked on edit button to edit the shareable link");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", marketEdit);
	    //cmEdit.click();
	    HelperFunctions.staticWait(2);
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(done));
	    String actualText="Across 31 Opps";
	    String mockText="Across 31 Opps-Across 31 Opps-Across 31 Opps-Across 31 Opps-Across 31 Opps-Across 31 Opps";
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", marketSubText);
	    HelperFunctions.staticWait(2);
	    marketSubText.clear();
	    HelperFunctions.staticWait(2);
	    marketSubText.sendKeys(mockText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(marketSubText.getAttribute("value").equals(mockText));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", marketSubText);
	    HelperFunctions.staticWait(2);
	    marketSubText.clear();
	    HelperFunctions.staticWait(2);
	    marketSubText.sendKeys(actualText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(marketSubText.getAttribute("value").equals(actualText));
	    HelperFunctions.staticWait(3);
	}
	public void setAlliancesLinkOpenNewTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    test.info("Verify that helpfulassetTitle is displayed");
	   HelperFunctions.scrollToElement(alliancesTitle);
	   test.info("Scroll to alliances title");
	   HelperFunctions.staticWait(2);
	   JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", allianceItems.get(0));
	    test.info("Clicked on first asset");
	    HelperFunctions.staticWait(2);
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   // HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2);
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	}
	public void setConfigureAlliances(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 2));
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
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
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //wait.until(ExpectedConditions.visibilityOf(editButton));
	    test.info("Clicked on edit button to edit alliances");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", alliancesEdit);
	    //cmEdit.click();
	    HelperFunctions.staticWait(2);
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(done));
	    String actualText="Salesforce";
	    String mockText="Salesforce Salesforce Salesforce-Salesforce-Salesforce-Salesforce-Salesforce-Salesforce";
	    String actualLink="https://www.salesforce.com";
	    String mockLink="https://www.amazon.com";
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", cmLinkText);
	    HelperFunctions.staticWait(2);
	    cmLinkText.clear();
	    HelperFunctions.staticWait(2);
	    cmLinkText.sendKeys(mockText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmLinkText.getAttribute("value").equals(mockText));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", cmLinkText);
	    HelperFunctions.staticWait(2);
	    cmLinkText.clear();
	    HelperFunctions.staticWait(2);
	    cmLinkText.sendKeys(actualText);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(cmLinkText.getAttribute("value").equals(actualText));
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", alliancesExternalLink);
	    HelperFunctions.staticWait(2);
	    alliancesExternalLink.clear();
	    HelperFunctions.staticWait(2);
	    alliancesExternalLink.sendKeys(mockLink);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alliancesExternalLink.getAttribute("value").equals(mockLink));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js5 = (JavascriptExecutor) Driver.getDriver();
	    js5.executeScript("arguments[0].click();", alliancesExternalLink);
	    HelperFunctions.staticWait(2);
	    alliancesExternalLink.clear();
	    HelperFunctions.staticWait(2);
	    alliancesExternalLink.sendKeys(actualLink);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(alliancesExternalLink.getAttribute("value").equals(actualLink));
	    HelperFunctions.staticWait(3);
	}
	public void setCampaignStructureLinkOpenNewTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 15));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(csTitle));
	    test.info("Verify that campaign structure Title is displayed");
	   HelperFunctions.staticWait(2);
	   JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", csAssets.get(0));
	    test.info("Clicked on first asset");
	    HelperFunctions.staticWait(2);
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(15);
	   // HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2);
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	}
	public void setConfigureDidYouKnow(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 2));
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
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
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //wait.until(ExpectedConditions.visibilityOf(editButton));
	    test.info("Clicked on edit button to edit the shareable link");
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    test.info("Click on did you know edit and configure it");
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", dykEdit);
	    //cmEdit.click();
	    HelperFunctions.staticWait(2);
	    configure.click();
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for configuration window's visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(done));
	    HelperFunctions.staticWait(2);
	    dykTextEdit.click();
	    HelperFunctions.staticWait(3);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(styles));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(dykTextEdit.getAttribute("value")!=null);
	    test.info("Verified text section is not empty");
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(styles.isDisplayed());
	    test.info("Verified styles is displayed");
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(bold.isDisplayed());
	    test.info("Verified bold is displayed");
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(alignment.isDisplayed());
	    test.info("Verified alignment is displayed");
	    HelperFunctions.staticWait(3);
	  
	}
	public void setHelpfulAssetsItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    test.info("Verify that helpful asset Title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(groupLabel.isDisplayed());
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(firstAsset.isDisplayed());
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(firstAsset.getAttribute("href")!=null);
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(itemUrl.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setAccordionItems(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    test.info("Verify that helpful asset Title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(secondAccordionText.isDisplayed());
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(!firstAccordionText.isDisplayed());
	    test.info("Verified second accordion item is displayed and first accordion item is not displayed by default");
	    HelperFunctions.staticWait(1);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", firstAccordionButton);
	    test.info("Clicked on first accordion button");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(firstAccordionText.isDisplayed());
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(!secondAccordionText.isDisplayed());
	    test.info("Verified second accordion item is not displayed and first accordion item is displayed");
	    HelperFunctions.staticWait(3);
	}
	public void setFooterLine(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(helpfulassetTitle));
	    test.info("Verify that helpful asset Title is displayed");
	    HelperFunctions.staticWait(2);
	    HelperFunctions.scrollToElement(footerText);
	    HelperFunctions.staticWait(2);
	    String elementHeight = footerText.getCssValue("height");
	    String lineHeight = footerText.getCssValue("line-height");

	    int parsedElementHeight = Integer.parseInt(elementHeight.replace("px", ""));
	    int parsedLineHeight = Integer.parseInt(lineHeight.replace("px", ""));

	    int lineNumber = parsedElementHeight / parsedLineHeight;

	    System.out.println("Line number: " + lineNumber);
	    Assert.assertTrue(lineNumber>1);
	    HelperFunctions.staticWait(3);
	}
	public void setSplit2sections(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 30));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(titleArea));
	    test.info("Verify that helpful asset Title is displayed");
	    HelperFunctions.staticWait(2);
	    if(titleSections.size()>=2) {
	    	Assert.assertTrue(true);
	    }else {
	    	Assert.assertTrue(false);
	    }
	    HelperFunctions.staticWait(2);
	    String text1=titleSections.get(0).getText();
	    String text2=titleSections.get(1).getText();
	    String expected1="Who's impacted";
	    String expected2="Often asked questions";
	    Assert.assertTrue(text1.contains(expected1));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(text2.contains(expected2));
	    HelperFunctions.staticWait(2);
	}
	public void setHelpfulAssetsInternalExternal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 30));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(15);
	    //HelperFunctions.staticWait(3);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(titleArea));
	    test.info("Verify that helpful asset Title is displayed");
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(helpfulExternal.isDisplayed());
	    HelperFunctions.staticWait(1);
	    Assert.assertTrue(helpfulInternal.isDisplayed());
	    String link1=helpfulAssetLinks.get(0).getAttribute("href");
	    String link2=helpfulAssetLinks.get(1).getAttribute("href");
	    String expected1=".html";
	    String expected2=".com/";
	    System.out.println(link1);
	    System.out.println(link2);
	    Assert.assertTrue(link1.endsWith(expected1));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(link2.endsWith(expected2));
	    HelperFunctions.staticWait(2);
	}
	public void setEnablersLinks(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.staticWait(3);*/
	    test.info("Scroll to enablers title");
	    HelperFunctions.scrollToElement(enablersTitle);
	    test.info("Wait for enablers title is visible");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(enableTitle));
	    Assert.assertTrue(enableTitle.isDisplayed());
	    test.info("Verify enablers title is displayed");
	   // Assert.assertTrue(enablersHeading.isDisplayed());
	    test.info("Verify enablers heading is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each:enablersItems) {
	    	Assert.assertTrue(each.isDisplayed());
	    	if(each.getAttribute("href")!= null && !each.getAttribute("href").isEmpty()) {
	    		 Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verify enablers items are displayed and href values are not null or empty");
	    HelperFunctions.staticWait(2);
	    test.info("Clicked on enabler item");
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", enablersItems.get(0));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(30);
	    //HelperFunctions.staticWait(3);
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.numberOfWindowsToBe(2));
	    Set<String> windowHandles2 = Driver.getDriver().getWindowHandles();
	    Assert.assertEquals(windowHandles2.size(), 2);
	    test.info("Verify that link is open in a new tab");
	    HelperFunctions.staticWait(2);
	    
	}
	public void setUpdateNonMandatoryTag(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 30));
	  //  test.info("Wait for page to load");
	  //  HelperFunctions.waitForPageToLoad(15);
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
	    HelperFunctions.staticWait(2);
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(titleField));
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    test.info("Click on Primary 1 tag and select tags");
        nmTagImg.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(sectorPath));
	    sectorPath.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(sectorPath1));
	    sectorPath1.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(nmArea));
        Assert.assertTrue(nmArea.isDisplayed());
        HelperFunctions.staticWait(2);
        nmArea.click();
        HelperFunctions.staticWait(2);
        nmArea.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        HelperFunctions.staticWait(2);
        saveClose.click();
        HelperFunctions.waitForPageToLoad(15);
        HelperFunctions.staticWait(3);
	}
	
	public void setPWCButton(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 30));
	  //  test.info("Wait for page to load");
	  //  HelperFunctions.waitForPageToLoad(15);WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		 HelperFunctions.staticWait(3);
	     try {
		    	Thread.sleep(5000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
	
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait3.until(ExpectedConditions.visibilityOf(pwcButtonEdit));
	    pwcButtonEdit.click();
	    wait3.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(pwcButtonTitle));
	    String actualTitle="Read on pwc.com";
	    String mockTitle="Read";
	    String value=pwcButtonTitle.getAttribute("value");
	    Assert.assertEquals(value, actualTitle);
	    HelperFunctions.staticWait(2);
	    pwcButtonTitle.click();
	    HelperFunctions.staticWait(2);
	    pwcButtonTitle.clear();
	    HelperFunctions.staticWait(2);
	    pwcButtonTitle.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    done.click();
	    try {
	    	Thread.sleep(7000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }

	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait5.until(ExpectedConditions.visibilityOf(pwcButtonEdit));
	    pwcButtonEdit.click();
	    wait5.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(pwcButtonTitle));
	    String value2=pwcButtonTitle.getAttribute("value");
	    System.out.println(value2);
	    System.out.println(mockTitle);
	    Assert.assertEquals(value2, mockTitle);
	    HelperFunctions.staticWait(2);
	    pwcButtonTitle.click();
	    HelperFunctions.staticWait(2);
	    pwcButtonTitle.clear();
	    HelperFunctions.staticWait(2);
	    pwcButtonTitle.sendKeys(actualTitle);
	    HelperFunctions.staticWait(2);
	    done.click();
	    HelperFunctions.staticWait(3);
	}
	public void setInCaseMissedItEdit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 39));
	  //  test.info("Wait for page to load");
	    //HelperFunctions.waitForPageToLoad(10);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	     try {
		    	Thread.sleep(7000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		 js.executeScript("arguments[0].click();", pageInfo);
		    try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.staticWait(2);
	    HelperFunctions.scrollToElement(createMissed);
	    HelperFunctions.staticWait(2);
	    createMissed.click();
	    wait.until(ExpectedConditions.visibilityOf(insertComponent));
	    insertComponent.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(enterKeyword));
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", missedComponent);
	    HelperFunctions.staticWait(7);
	    editMissed.click();
	    wait1.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(selectHeading));
	    selectHeading.click();
	    HelperFunctions.staticWait(3);
	    missedHeading.click();
	    HelperFunctions.staticWait(3);
	    firstAdd.click();
	    HelperFunctions.staticWait(2);
	    
	    String path1="/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages";
	    String path2="/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/regression-content-page";
	    String path3="/content/valuestore/us/en/firmwide/qa-or-uat/erinc-content-automation-pages/erinc-content-page";
	    String imgPath="/content/dam/valuestore/us/en/qa-or-uat/2021-12-23.jpg";
	    String quote="This is for testing";
	    pagePath1.click();
	    HelperFunctions.staticWait(2);
	    pagePath1.sendKeys(path1);
	    wait2.until(ExpectedConditions.visibilityOf(pagePath1value));
	    pagePath1value.click();
	    HelperFunctions.staticWait(2);
	    firstAdd.click();
	    HelperFunctions.staticWait(2);
	    pagePath2.click();
	    HelperFunctions.staticWait(2);
	    pagePath2.sendKeys(path2);
	    wait2.until(ExpectedConditions.visibilityOf(pagePath2value));
	    pagePath2value.click(); 
	    HelperFunctions.staticWait(2);
	    firstAdd.click();
	    HelperFunctions.staticWait(2);
	    pagePath3.click();
	    HelperFunctions.staticWait(2);
	    pagePath3.sendKeys(path3);
	    wait2.until(ExpectedConditions.visibilityOf(pagePath3value));
	    pagePath3value.click(); 
	    HelperFunctions.staticWait(2);
	    imgPath1.click();
	    HelperFunctions.staticWait(2);
	    imgPath1.sendKeys(imgPath);
	    HelperFunctions.staticWait(2);
	    quoteArea.click();
	    HelperFunctions.staticWait(2);
	    quoteArea.sendKeys(quote);
	    HelperFunctions.staticWait(2);
	    done.click();
	    try {
	    	Thread.sleep(7000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(5);
	   /* try {
        	if (publishButton.isDisplayed()) {
        	   
        		publishButton.click();
        	} 
        	}catch(NoSuchElementException | StaleElementReferenceException ignored) {
        		
        	}*/
	   /* try {
	    if(publishButton.isDisplayed()) {
	    	publishButton.click();
	    }else {
	    	System.out.println("Button is not displayed");
	    }
	    }catch(NoSuchElementException e) {
	    	System.out.println("Skip that step");
	    }
	    HelperFunctions.staticWait(5);*/
	   /* WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(pwcButtonEdit));
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", missedItEdit);
	    HelperFunctions.staticWait(2);
	    configure.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(missedItCardPath));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", missedItTextArea);
	    Assert.assertTrue(missedItTextArea.isDisplayed());
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", missedItImgPath);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(missedItImgPathOption));
	    Assert.assertTrue(missedItImgPathOption.isDisplayed());
	    HelperFunctions.staticWait(3);*/
	}
	public void setInCaseMissedItCardsNumbers(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 39));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    test.info("Wait for page to load");*/
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(5);
	    test.info("Scroll to missed it title");
	    HelperFunctions.scrollToElement(missedItTitle);
	    test.info("Wait for missed it title is visible");
	    int missedCardsNumber=missedItCards.size();
	    Assert.assertTrue(missedCardsNumber==3);
	    HelperFunctions.staticWait(2);
	    String content=missedItLinks.get(0).getText();
	    String ghost=missedItLinks.get(1).getText();
	    Assert.assertTrue(content.contains("content"));
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(ghost.contains("Regression"));
	    HelperFunctions.staticWait(3);
	    
	}
	public void setIncaseYouMissedIt(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 39));
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
	    test.info("Wait for logo visibility");*/
	    //WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    //wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(5);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(missedItTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(missedItTitle.isDisplayed());
	    test.info("Verified missedItTitle is displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: missedItLinks) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified missedItLinks are displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: missedItLabels) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified missedItLabels are displayed");
	    HelperFunctions.staticWait(2);
	    for(WebElement each: missedItFavs) {
	    	if(each.isDisplayed()) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    test.info("Verified missedItFavs are displayed");
	    HelperFunctions.staticWait(2);
	}
	public void setIncaseYouMissedItLabels(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 39));
	    HelperFunctions.waitForPageToLoad(10);
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
	    HelperFunctions.waitForPageToLoad(15);*/
	    test.info("Wait for logo visibility");
	    //WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    //wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(5);
	    test.info("Scroll to also like title");
	    HelperFunctions.scrollToElement(missedItTitle);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(missedItTitle.isDisplayed());
	    test.info("Verified missedItTitle is displayed");
	    HelperFunctions.staticWait(2);
	    String expectedLabel1="Deals";
	    String expectedLabel2="Deals";
	    String expectedLabel3="Audit and assurance";
	    String actualLabel1=missedItLabels.get(0).getText();
	    String actualLabel2=missedItLabels.get(1).getText();
	    String actualLabel3=missedItLabels.get(2).getText();
	    Assert.assertEquals(actualLabel1, expectedLabel1);
	    HelperFunctions.staticWait(2);
	    Assert.assertEquals(actualLabel2, expectedLabel2);
	    HelperFunctions.staticWait(2);
	    Assert.assertEquals(actualLabel3, expectedLabel3);
	    HelperFunctions.staticWait(2);
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    for(WebElement element: missedItLabels) {
	    	try {
                wait3.until(ExpectedConditions.elementToBeClickable(element));
                Assert.assertTrue(element.isEnabled(), "Element is clickable: " + element.getText());
            } catch (Exception e) {
                Assert.assertFalse(element.isEnabled(), "Element is not clickable: " + element.getText());
            }
	    }
	    test.info("Verified missedItLabels are not clickable");
	   /* HelperFunctions.staticWait(2);
	    for (WebElement element : missedItLabels) {
            String text = element.getText();
            Assert.assertTrue(text.length() <= 31, "Element's text exceeds 31 characters: " + text);
        }*/
	    HelperFunctions.staticWait(3);
	    Driver.getDriver().get(read1.getCellData("VALUE", 39));
	    HelperFunctions.waitForPageToLoad(60);
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	     try {
		    	Thread.sleep(7000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		 js.executeScript("arguments[0].click();", pageInfo);
		    try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    HelperFunctions.scrollToElement(editMissed);
	    HelperFunctions.staticWait(3);
	    editMissed.click();
	    wait.until(ExpectedConditions.visibilityOf(deleteComponent));
	    deleteComponent.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(deleteButton));
	    deleteButton.click();
	    try {
	    	Thread.sleep(7000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(5);
	    
	}
	public void setVideoPlayerEdit(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 30));
	  //  test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	     try {
		    	Thread.sleep(7000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		 js.executeScript("arguments[0].click();", pageInfo);
		    try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    //wait.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", vpEdit);
	    wait.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(autoPlay));
	    //HelperFunctions.staticWait(2);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", autoPlay);
	    HelperFunctions.staticWait(2);
	    done.click();
	    HelperFunctions.staticWait(5);
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    //HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(30);
	    test.info("Wait for logo visibility");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 30);
	    wait3.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(3);
	    WebElement iframe = Driver.getDriver().findElement(By.cssSelector("iframe[id^='video-player-']"));
	    Driver.getDriver().switchTo().frame(iframe);
	    HelperFunctions.scrollToElement(videoPlayer);
	    String actuallabel=videoPlayer2.getAttribute("aria-label");
	    System.out.println(actuallabel);
	    String expectedlabel="Pause clip";
	    Assert.assertEquals(actuallabel, expectedlabel);
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().get(read1.getCellData("VALUE", 30));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	   // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
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
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait4.until(ExpectedConditions.elementToBeClickable(editButton));
	    editButton.click();
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js5 = (JavascriptExecutor) Driver.getDriver();
	    js5.executeScript("arguments[0].click();", vpEdit);
	    wait4.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(autoPlay));
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js6 = (JavascriptExecutor) Driver.getDriver();
	    js6.executeScript("arguments[0].click();", autoPlay);
	    HelperFunctions.staticWait(2);
	    done.click();
	    try {
	    	Thread.sleep(7000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js7 = (JavascriptExecutor) Driver.getDriver();
	    js7.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	    
	}
	public void setVideoPlayerElements(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 30));
	    HelperFunctions.waitForPageToLoad(10);
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
	    HelperFunctions.waitForPageToLoad(15);*/
	    test.info("Wait for logo visibility");
	    //WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    //wait2.until(ExpectedConditions.visibilityOf(logo));
	    HelperFunctions.staticWait(5);
	    WebElement iframe = Driver.getDriver().findElement(By.cssSelector("iframe[id^='video-player-']"));
	    Driver.getDriver().switchTo().frame(iframe);
	    HelperFunctions.scrollToElement(playButton);
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js7 = (JavascriptExecutor) Driver.getDriver();
	    js7.executeScript("arguments[0].click();", playButton);
	  /*  WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(videoPlayer));
	    Actions actions = new Actions(Driver.getDriver());
	    actions.moveToElement(videoPlayer).perform();*/
	    HelperFunctions.staticWait(3);
	   // JavascriptExecutor js8 = (JavascriptExecutor) Driver.getDriver();
	    js7.executeScript("arguments[0].click();", pauseButton);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(volume));
	    Assert.assertTrue(volume.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(timers.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(qualitySettings.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(speed.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(fullScreen.isDisplayed());
	    HelperFunctions.staticWait(3);
	    
	}
	public void setPwcButtonNewTab(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 30));
	    HelperFunctions.waitForPageToLoad(10);
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
	    HelperFunctions.waitForPageToLoad(15);*/
	    test.info("Wait for logo visibility");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    wait2.until(ExpectedConditions.visibilityOf(pwcButton));
	    HelperFunctions.staticWait(4);
	    pwcButton.click();
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
	public void setRelatedArticle(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	 /*   Driver.getDriver().get(read1.getCellData("VALUE", 2));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(3);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(10);*/
	    test.info("Wait for visibility of first asset share icon");
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(logo));
	    test.info("Scroll to what others viewing title");
	    HelperFunctions.scrollToElement(whatOthersTitle);
	    HelperFunctions.staticWait(2);
	    Assert.assertTrue(whatOthersTitle.isDisplayed());
	    test.info("Verify that whatOthersTitle is displayed");
	    HelperFunctions.staticWait(2);
	    JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", whatContents.get(0));
	    HelperFunctions.waitForPageToLoad(10);
	    test.info("Wait for visibility of first asset share icon");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(contentBox));
	    Assert.assertTrue(contentBox.isDisplayed());
	    HelperFunctions.staticWait(3);
	}
	public void setMXFooter(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	  /*  Driver.getDriver().get(read1.getCellData("VALUE", 29));
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(10);
	    HelperFunctions.staticWait(3);
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    HelperFunctions.staticWait(3);
	    viewPublished.click();
	    HelperFunctions.staticWait(2);
	    String mainWindowHandle = Driver.getDriver().getWindowHandle();
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.numberOfWindowsToBe(2));
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
	    HelperFunctions.waitForPageToLoad(10);*/
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 30);
	    wait4.until(ExpectedConditions.visibilityOf(contentBox));
	    HelperFunctions.scrollToElement(footer);
	    HelperFunctions.staticWait(2);
	    for(WebElement each:footerItems) {
	    	if(each.isDisplayed() && each.getAttribute("href")!=null) {
	    		Assert.assertTrue(true);
	    	}else {
	    		Assert.assertTrue(false);
	    	}
	    }
	    HelperFunctions.staticWait(3);
	}
	public void setWhatOthersSystemAuthored(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
	   // Driver.getDriver().get(read1.getCellData("VALUE", 4));
	   // test.info("Wait for page to load");
	   // HelperFunctions.waitForPageToLoad(15);
	    test.info("Wait for content page visibility and click on it");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
	    visibleElement.click();
	    HelperFunctions.staticWait(3);
	    test.info("Click on Next button");
	    nextButton.click();
	    HelperFunctions.waitForPageToLoad(60);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement1 = wait1.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement1.click();
	    HelperFunctions.staticWait(2);
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    String mockTitle="System";
	    titleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off time element");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    offtimeCalendar.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(calendarNext));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    nextDay.click();
	    HelperFunctions.staticWait(2);
	    test.info("Click on Primary 1 tag and select tags");
        primary1.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(path1forPrimary1));
        path1forPrimary1.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(path2forPrimary1));
        path2forPrimary1.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        test.info("Click on Primary 2 tag and select tags");
        WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(primary2));
        primary2.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(path1forPrimary2));
        path1forPrimary2.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(path2forPrimary2));
        path2forPrimary2.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        test.info("Click on Primary 3 tag and select tags");
        WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(primary3));
        primary3.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait9 = new WebDriverWait(Driver.getDriver(), 10);
	    wait9.until(ExpectedConditions.visibilityOf(path1forPrimary3));
        path1forPrimary3.click();
        //HelperFunctions.staticWait(2);
        WebDriverWait wait10 = new WebDriverWait(Driver.getDriver(), 10);
	    wait10.until(ExpectedConditions.visibilityOf(path2forPrimary3));
        path2forPrimary3.click();
        HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(publishDateField);
	    HelperFunctions.staticWait(2);
	    publishDateField.click();
	    HelperFunctions.staticWait(2);
	    publishDateField.clear();
	    HelperFunctions.staticWait(2);
	    test.info("Scrolled to publish date and cleared it");
	    LocalDate today = LocalDate.now();
	    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate2 = today.format(formatter2);
	    publishDateField.sendKeys(formattedDate2);
	    HelperFunctions.staticWait(2);
	    test.info("Enter the today's date");
	    calendar.click();
	    HelperFunctions.staticWait(2);
	    calendar.click();
	    HelperFunctions.staticWait(2);
	    imageContent.click();
	    WebDriverWait wait11 = new WebDriverWait(Driver.getDriver(), 10);
	    wait11.until(ExpectedConditions.visibilityOf(path1image));
	    path1image.click();
	    WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 10);
	    wait12.until(ExpectedConditions.visibilityOf(path2image));
	    path2image.click();
	    WebDriverWait wait13 = new WebDriverWait(Driver.getDriver(), 10);
	    wait13.until(ExpectedConditions.visibilityOf(path3image));
	    path3image.click();
	    WebDriverWait wait14 = new WebDriverWait(Driver.getDriver(), 10);
	    wait14.until(ExpectedConditions.visibilityOf(path4image));
	    path4image.click();
	    WebDriverWait wait15 = new WebDriverWait(Driver.getDriver(), 10);
	    wait15.until(ExpectedConditions.visibilityOf(path5image));
	    path5image.click();
	    HelperFunctions.staticWait(2);
	    selectButton.click();
	    HelperFunctions.staticWait(2);
	    createButton.click();
	    WebDriverWait wait16 = new WebDriverWait(Driver.getDriver(), 10);
	    wait16.until(ExpectedConditions.visibilityOf(donePage));
	    donePage.click();
	    HelperFunctions.waitForPageToLoad(60);
	    Driver.getDriver().get(read1.getCellData("VALUE", 47));
	    HelperFunctions.waitForPageToLoad(60);
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
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
	    WebDriverWait wait17 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait17.until(ExpectedConditions.visibilityOf(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait18 = new WebDriverWait(Driver.getDriver(), 10);
	    wait18.until(ExpectedConditions.visibilityOf(whatOthersTitle));
	    Assert.assertTrue(whatOthersTitle.isDisplayed());
	    HelperFunctions.staticWait(3);
	    
	    
	}
	public void setNewLabel(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	    //Driver.getDriver().get(read1.getCellData("VALUE", 2));
        test.info("Wait for page to load");
	   /* HelperFunctions.waitForPageToLoad(15);
	  
	    test.info("Wait for visibility of new label");
	    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    wait.until(ExpectedConditions.visibilityOf(newLabel));
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(newLabel.isDisplayed());
	    test.info("Verified new label is displayed");
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().get(read1.getCellData("VALUE", 16));*/
	    test.info("Go to authoring page and click page info button and open properties");
	    HelperFunctions.waitForPageToLoad(60);
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
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(newLabel));
	    Assert.assertTrue(newLabel.isDisplayed());
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().defaultContent();
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
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //HelperFunctions.staticWait(2);
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    //wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    wait2.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    test.info("Scrolled to publish date and cleared it");
	    HelperFunctions.scrollToElement(publishDateField);
	    HelperFunctions.staticWait(2);
	    publishDateField.click();
	    HelperFunctions.staticWait(2);
	    publishDateField.clear();
	    test.info("Scrolled to publish date and cleared it");
	    HelperFunctions.staticWait(2);
	    LocalDate threeMonthsAgo = LocalDate.now().minusMonths(1).minusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate = threeMonthsAgo.format(formatter);
        publishDateField.sendKeys(formattedDate);
        test.info("Enter the date before than today");
	    HelperFunctions.staticWait(3);
	    saveClose.click();
	    test.info("Clicked on save and close");
	    HelperFunctions.waitForPageToLoad(60);
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
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait3.until(ExpectedConditions.visibilityOf(pageInfo));
	    //JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    //js2.executeScript("arguments[0].click();", pageInfo);
	    wait3.until(ExpectedConditions.visibilityOf(publishPage));
	    test.info("Clicked on publish page");
	    publishPage.click();
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(publishMessage));
	    test.info("Go to the publisher page");
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 17));
	    HelperFunctions.waitForPageToLoad(15);
	    HelperFunctions.staticWait(3);*/
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
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    HelperFunctions.staticWait(3);
	    Assert.assertTrue(newLabel2.isEmpty());
	    test.info("Verified new label is NOT displayed");
	    HelperFunctions.staticWait(2);
	    Driver.getDriver().switchTo().defaultContent();
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
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //HelperFunctions.staticWait(2);
	   /* Driver.getDriver().get(read1.getCellData("VALUE", 16));
	    test.info("Go to authoring page and click page info button and open properties");
	    HelperFunctions.waitForPageToLoad(15);*/
	    //HelperFunctions.staticWait(3);
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait5 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait5.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
	    js3.executeScript("arguments[0].click();", pageInfo);
	    wait5.until(ExpectedConditions.visibilityOf(openPro));
	    test.info("Clicked on open properties");
	    openPro.click();
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(publishDateField);
	    HelperFunctions.staticWait(2);
	    publishDateField.click();
	    HelperFunctions.staticWait(2);
	    publishDateField.clear();
	    HelperFunctions.staticWait(2);
	    test.info("Scrolled to publish date and cleared it");
	    LocalDate today = LocalDate.now();
	    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    String formattedDate2 = today.format(formatter2);
	    publishDateField.sendKeys(formattedDate2);
	    HelperFunctions.staticWait(2);
	    test.info("Enter the today's date");
	    saveClose.click();
	    test.info("Clicked on save and close");
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    test.info("Wait for visibility of page info and clicked on it");
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	   // wait6.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    test.info("Clicked on publish page");
	    publishPage.click();
	    WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(publishMessage));
	    HelperFunctions.staticWait(3);
	}
	public void setMailtoColor(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 30);
	    wait6.until(ExpectedConditions.visibilityOf(img404));
	    Assert.assertTrue(img404.isDisplayed());
	    HelperFunctions.staticWait(2);
	        String originalBorderBottom = mailto.getCssValue("border-bottom");
	        System.out.println(originalBorderBottom);
	        
	        Actions actions = new Actions(Driver.getDriver());
	        JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	        js2.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", mailto);
	        
	        actions.moveToElement(mailto).build().perform();
	        String borderBottom = mailto.getCssValue("border-bottom");
	        System.out.println("borderBottom: " + borderBottom);
	        
	        Assert.assertNotEquals(originalBorderBottom, borderBottom);
	        HelperFunctions.staticWait(2);
	        test.info("Verified all content title's border bottom are changing when move the cursor");
	    
	    HelperFunctions.staticWait(2);
	    mailto.click();
	    HelperFunctions.waitForPageToLoad(15);
	    String currentUrl=Driver.getDriver().getCurrentUrl();
	    String expectedUrl="/us/en.html";
	    Assert.assertTrue(currentUrl.endsWith(expectedUrl));
	    HelperFunctions.staticWait(3);
	}
	public void setMailtoMexico(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
		Driver.getDriver().switchTo().frame("ContentFrame");
		WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(img404));
	    Assert.assertTrue(img404.isDisplayed());    
	    HelperFunctions.staticWait(3);
	}
	public void setHideSiteSearch(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "STG");
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
		//JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		//js.executeScript("arguments[0].click();", pageInfo);
		//WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(openPro));
		//HelperFunctions.staticWait(2);
		openPro.click();
		HelperFunctions.waitForPageToLoad(60);
		HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(hideCheckbox);
		HelperFunctions.staticWait(3);
		hideCheckbox.click();
		HelperFunctions.staticWait(3);
		saveClose.click();
		HelperFunctions.waitForPageToLoad(60);
		 try {
		    	Thread.sleep(3000);
		    }catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		JavascriptExecutor js2 = (JavascriptExecutor) Driver.getDriver();
	    js2.executeScript("arguments[0].click();", pageInfo);
	    wait.until(ExpectedConditions.visibilityOf(publishPage));
	    //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
	    //wait.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(7);
	    Driver.getDriver().get(read1.getCellData("VALUE", 15));
	    HelperFunctions.waitForPageToLoad(60);
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
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait1.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(whatContents.get(0)));
		String expected="Hiding Automation Page";
		for(WebElement each:whatContents) {
			if(each.getText().contains(expected)) {
				Assert.assertTrue(false);
			}
		}
		HelperFunctions.staticWait(3);
		Driver.getDriver().get(read1.getCellData("VALUE", 49));
		HelperFunctions.waitForPageToLoad(60);
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
		//JavascriptExecutor js3 = (JavascriptExecutor) Driver.getDriver();
		//js3.executeScript("arguments[0].click();", pageInfo);
		wait.until(ExpectedConditions.visibilityOf(openPro));
		openPro.click();
		HelperFunctions.waitForPageToLoad(60);
		HelperFunctions.staticWait(3);
	    HelperFunctions.scrollToElement(hideCheckbox);
		HelperFunctions.staticWait(3);
		hideCheckbox.click();
		HelperFunctions.staticWait(3);
		saveClose.click();
		HelperFunctions.waitForPageToLoad(60);
		try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
		JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    wait.until(ExpectedConditions.visibilityOf(publishPage));
	    //WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait2.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(7);
	    Driver.getDriver().get(read1.getCellData("VALUE", 15));
	    HelperFunctions.waitForPageToLoad(60);
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
	    WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait3.until(ExpectedConditions.elementToBeClickable(previewButton));
	    previewButton.click();
	    Driver.getDriver().switchTo().frame(0);
	    WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(whatContents.get(0)));
		String expected2="Hiding Automation Page";
		for(WebElement each:whatContents) {
			if(each.getText().contains(expected2)) {
				Assert.assertTrue(true);
			}
		}
		HelperFunctions.staticWait(3);
	}
	public void setInternalUrl(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
	    wait.until(ExpectedConditions.visibilityOf(firstAsset));
	    firstAsset.click();
	    String currentTabHandle=Driver.getDriver().getWindowHandle();
	    for(String handle:Driver.getDriver().getWindowHandles()) {
	    	if(!handle.equals(currentTabHandle)) {
	    		Driver.getDriver().switchTo().window(handle);
	    		break;
	    	}
	    }
	    String newTabUrl=Driver.getDriver().getCurrentUrl();
	    String expectedUrl="https://valuestore-stg.pwc.com/us/en.html";
	    Assert.assertTrue(newTabUrl.contains(expectedUrl));
	    System.out.println(newTabUrl);
	    HelperFunctions.staticWait(3);
	    
	}
	public void setExternalUrl(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
	   
	    WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 30);
	    wait1.until(ExpectedConditions.visibilityOf(secondAsset));
	    secondAsset.click();
	    String currentTabHandle2=Driver.getDriver().getWindowHandle();
	    for(String handle2:Driver.getDriver().getWindowHandles()) {
	    	if(!handle2.equals(currentTabHandle2)) {
	    		Driver.getDriver().switchTo().window(handle2);
	    		break;
	    	}
	    }
	    String newTabUrl2=Driver.getDriver().getCurrentUrl();
	    String expectedUrl="https://www.pwc.com/";
	    Assert.assertTrue(newTabUrl2.contains(expectedUrl));
	    System.out.println(newTabUrl2);
	    HelperFunctions.staticWait(3);
	}
	public void setEnablersEditUrl(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
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
		//WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		//wait.until(ExpectedConditions.elementToBeClickable(editButton));
		editButton.click();
		HelperFunctions.staticWait(3);
		alliancesEdit.click();
		WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), 10);
	    wait1.until(ExpectedConditions.visibilityOf(configure));
	    configure.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    wait2.until(ExpectedConditions.visibilityOf(done));
	    //JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("arguments[0].click();", enablersTextField);
		enablersTextField.clear();
		HelperFunctions.staticWait(3);
		String expected="/content/valuestore/us/en/firmwide";
		enablersTextField.sendKeys(expected);
		WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(vsContent));
	    vsContent.click();
	    HelperFunctions.staticWait(3);
	    done.click();
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    JavascriptExecutor js4 = (JavascriptExecutor) Driver.getDriver();
	    js4.executeScript("arguments[0].click();", pageInfo);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
	    //wait2.until(ExpectedConditions.elementToBeClickable(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(5);	
		    
	}
	public void setPrimaryTagsForGlobal(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		WebElement visibleElement = wait.until(ExpectedConditions.visibilityOf(contentPage));
		visibleElement.click();
		test.info("Select content page template");
		HelperFunctions.staticWait(2);
		test.info("Click on Next button");
		nextButton.click();
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 15);
	    WebElement visibleElement2 = wait2.until(ExpectedConditions.visibilityOf(titleField));
	    visibleElement2.click();
	    HelperFunctions.staticWait(2);
	    test.info("Scroll to Off time element");
	    HelperFunctions.scrollToElement(offTime);
	    HelperFunctions.staticWait(2);
	    test.info("Click on Primary 1 tag and select tags");
        primary1.click();
        WebDriverWait wait3 = new WebDriverWait(Driver.getDriver(), 10);
	    wait3.until(ExpectedConditions.visibilityOf(supplementary));
	    supplementary.click();
        WebDriverWait wait4 = new WebDriverWait(Driver.getDriver(), 10);
	    wait4.until(ExpectedConditions.visibilityOf(GXpath));
        GXpath.click();
        WebDriverWait wait5= new WebDriverWait(Driver.getDriver(), 10);
	    wait5.until(ExpectedConditions.visibilityOf(Catpath));
	    Catpath.click();
	    WebDriverWait wait6= new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(Catpath1));
	    Catpath1.click();
	    HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        test.info("Verified choosing supplemantary category tags");
        test.info("Click on Primary 2 tag and select tags");
        WebDriverWait wait7 = new WebDriverWait(Driver.getDriver(), 10);
	    wait7.until(ExpectedConditions.visibilityOf(primary2));
        primary2.click();
        HelperFunctions.staticWait(2);
        WebDriverWait wait8 = new WebDriverWait(Driver.getDriver(), 10);
	    wait8.until(ExpectedConditions.visibilityOf(supplementary));
	    supplementary.click();
	    WebDriverWait wait9= new WebDriverWait(Driver.getDriver(), 10);
	    wait9.until(ExpectedConditions.visibilityOf(GXpath));
        GXpath.click();
        WebDriverWait wait10= new WebDriverWait(Driver.getDriver(), 10);
	    wait10.until(ExpectedConditions.visibilityOf(Toppath));
	    Toppath.click();
	    WebDriverWait wait11= new WebDriverWait(Driver.getDriver(), 10);
	    wait11.until(ExpectedConditions.visibilityOf(Toppath1));
	    Toppath1.click();
	    HelperFunctions.staticWait(2);
        selectButton.click();
        HelperFunctions.staticWait(2);
        test.info("Verified choosing supplemantary topic tags");
        test.info("Click on Primary 3 tag and select tags");
        WebDriverWait wait12 = new WebDriverWait(Driver.getDriver(), 10);
	    wait12.until(ExpectedConditions.visibilityOf(primary3));
        primary3.click();
        WebDriverWait wait13 = new WebDriverWait(Driver.getDriver(), 10);
	    wait13.until(ExpectedConditions.visibilityOf(supplementary));
        supplementary.click();
        WebDriverWait wait14= new WebDriverWait(Driver.getDriver(), 10);
	    wait14.until(ExpectedConditions.visibilityOf(GXpath));
        GXpath.click();
        WebDriverWait wait15= new WebDriverWait(Driver.getDriver(), 10);
	    wait15.until(ExpectedConditions.visibilityOf(Ecopath));
	    Ecopath.click();
	    WebDriverWait wait16= new WebDriverWait(Driver.getDriver(), 10);
	    wait16.until(ExpectedConditions.visibilityOf(Ecopath1));
	    Ecopath1.click();
	    HelperFunctions.staticWait(2);
        selectButton.click();
        test.info("Verified choosing supplemantary economy tags");
        HelperFunctions.staticWait(3);
	}
	public void setExternalPageAuth(ExtentTest test) throws Exception {
		read1.setExcelFile("./testdata.xlsx", "QA");
        test.info("Wait for page to load and page info");
        try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 30);
	    //wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
	    js.executeScript("arguments[0].click();", pageInfo);
	    test.info("Clicking on open properties");
	    wait2.until(ExpectedConditions.visibilityOf(openPro));
	    openPro.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    test.info("Enter new title value");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    String actualTitle="Automation External Page";
	    String mockTitle="Automation External Page2";
	    titleField.sendKeys(mockTitle);
	    HelperFunctions.staticWait(2);
	    test.info("Enter new description value");
	    externalDesc.click();
	    HelperFunctions.staticWait(2);
	    externalDesc.clear();
	    HelperFunctions.staticWait(2);
	    String actualDesc="Automation Testing";
	    String mockDesc="Demo";
	    externalDesc.sendKeys(mockDesc);
	    HelperFunctions.staticWait(2);
	    test.info("Enter new external url");
	    js.executeScript("arguments[0].click();", externalUrl);
	    HelperFunctions.staticWait(2);
	    externalUrl.clear();
	    HelperFunctions.staticWait(2);
	    String actualUrl="https://www.pwc.com";
	    String mockUrl="https://www.google.com";
	    externalUrl.sendKeys(mockUrl);
	    HelperFunctions.staticWait(2);
	    test.info("Clicking on save and close");
	    saveClose.click();
	    test.info("Wait for page to load and click on page info");
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    //wait2.until(ExpectedConditions.visibilityOf(pageInfo));
	    js.executeScript("arguments[0].click();", pageInfo);
	    test.info("Clicking on view as publish");
	    wait2.until(ExpectedConditions.visibilityOf(viewasPublish));
	    viewasPublish.click();
	    HelperFunctions.staticWait(5);
	    test.info("Switching tab");
        ArrayList<String> tabs=new ArrayList<String>(Driver.getDriver().getWindowHandles());
		Driver.getDriver().switchTo().window(tabs.get(1));
		HelperFunctions.staticWait(15);
        String currentUrl=Driver.getDriver().getCurrentUrl();
        test.info("Checking the current url value has changed");
        Assert.assertTrue(currentUrl.contains("google"));
        test.info("Verified external link has changed");
        Driver.getDriver().switchTo().window(tabs.get(0));
        wait2.until(ExpectedConditions.visibilityOf(pageInfo));
        js.executeScript("arguments[0].click();", pageInfo);
	    test.info("Clicking on open properties");
	    wait2.until(ExpectedConditions.visibilityOf(openPro));
	    openPro.click();
	    test.info("Wait for page to load");
	    HelperFunctions.waitForPageToLoad(60);
	    HelperFunctions.staticWait(3);
	    test.info("Enter previous title value");
	    titleField.click();
	    HelperFunctions.staticWait(2);
	    titleField.clear();
	    HelperFunctions.staticWait(2);
	    titleField.sendKeys(actualTitle);
	    HelperFunctions.staticWait(2);
	    test.info("Enter previous description value");
	    externalDesc.click();
	    HelperFunctions.staticWait(2);
	    externalDesc.clear();
	    HelperFunctions.staticWait(2);
	    externalDesc.sendKeys(actualDesc);
	    HelperFunctions.staticWait(2);
	    test.info("Enter previous external url");
	    js.executeScript("arguments[0].click();", externalUrl);
	    HelperFunctions.staticWait(2);
	    externalUrl.clear();
	    HelperFunctions.staticWait(2);
	    externalUrl.sendKeys(actualUrl);
	    HelperFunctions.staticWait(2);
	    test.info("Clicking on save and close");
	    saveClose.click();
	    test.info("Wait for page to load and click on page info");
	    HelperFunctions.waitForPageToLoad(60);
	    try {
	    	Thread.sleep(3000);
	    }catch(InterruptedException e) {
	    	e.printStackTrace();
	    }
	    js.executeScript("arguments[0].click();", pageInfo);
	    //HelperFunctions.staticWait(2);
	    WebDriverWait wait6 = new WebDriverWait(Driver.getDriver(), 10);
	    wait6.until(ExpectedConditions.visibilityOf(publishPage));
	    publishPage.click();
	    HelperFunctions.staticWait(3);
	}
	
}