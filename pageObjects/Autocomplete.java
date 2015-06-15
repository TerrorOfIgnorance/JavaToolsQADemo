package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Autocomplete page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Autocomplete {

	/**
	 * The main autocomplete menu in center of page (5 tabs)
	 */

	@FindBy(id = "ui-id-4")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-5")
	protected static WebElement multipleValuesTab;// tab2

	@FindBy(id = "ui-id-6")
	protected static WebElement categoriesTab;// tab3
	
	/**
	 * Default functionality tab's elements
	 */
	
	@FindBy(id = "tagss")
	protected static WebElement tagsInput;
	
	@FindBy(xpath =".//*[@id='ui-id-1']/li[contains(.,'ActionScript')]")
	protected static WebElement dropDownActionScript;
	
	@FindBy(xpath =".//*[@id='ui-id-1']/li[contains(.,'AppleScript')]")
	protected static WebElement dropDownAppleScript;
	
	/**
	 * Multiple Values tab's elements
	 */
	
	@FindBy(id = "tagsss")
	protected static WebElement tagProgrammingLanguagesInput;
	
	@FindBy(xpath =".//*[@id='ui-id-2']/li[contains(.,'ColdFusion')]")
	protected static WebElement dropDownColdFusion;
	
	@FindBy(xpath =".//*[@id='ui-id-2']/li[contains(.,'Haskell')]")
	protected static WebElement dropDownHaskell;
	
	/**
	 * Categories tab's elements
	 */
	
	@FindBy(id = "searcha")
	protected static WebElement categoriesSearchInput;
	
	@FindBy(xpath=".//*[@id='ui-id-3']/li[contains(.,'annhhx10')]")
	protected static WebElement dropDownAnnhhx10;

	/**
	 * Top menu links and tabs MAIN MENU
	 */

	@FindBy(className = "site-anchor")
	protected static WebElement demoqaLink;

	@FindBy(css = "a[href*='http://demoqa.com/']")
	protected static WebElement HomeLink;

	@FindBy(css = "a[href*='http://demoqa.com/about-us/']")
	protected static WebElement aboutUsLink;

	@FindBy(css = "a[href*='http://demoqa.com/services/']")
	protected static WebElement servicesLink;

	@FindBy(className = "dropdown-toggle")
	protected static WebElement demoTab;

	@FindBy(css = "a[href*='http://demoqa.com/blog/']")
	protected static WebElement blogLink;

	@FindBy(css = "a[href*='http://demoqa.com/contact/']")
	protected static WebElement contactTab;
	
	@FindBy(xpath =".//*[@id='breadcrumbs']/li[1]/a")
	protected static WebElement smallHomeLink;

	/**
	 * The two options from the demo dropdown
	 */

	@FindBy(xpath = ".//*[@id='menu-item-73']/a")
	protected static WebElement draggableLinkFromDemoTab;

	@FindBy(xpath = ".//*[@id='menu-item-153']/a")
	protected static WebElement tabsLinkFromDemoTab;

	/**
	 * Top right menu links TOP RIGHT MENU
	 */

	@FindBy(css = "a[href*='http://demoqa.com/registration/']")
	protected static WebElement registrationLink;

	@FindBy(xpath = ".//*[@id='menu-item-140']/a")
	protected static WebElement draggableLink;

	@FindBy(css = "a[href*='http://demoqa.com/droppable/']")
	protected static WebElement droppableLink;

	@FindBy(css = "a[href*='http://demoqa.com/resizable/']")
	protected static WebElement resizableLink;

	@FindBy(css = "a[href*='http://demoqa.com/selectable/']")
	protected static WebElement selectableLink;

	@FindBy(css = "a[href*='http://demoqa.com/sortable/']")
	protected static WebElement sortableLink;

	/**
	 * the Widget menu links WIDGET MENU
	 */

	@FindBy(css = "a[href*='http://demoqa.com/accordion/']")
	protected static WebElement accordionWidgetLink;

	@FindBy(css = "a[href*='http://demoqa.com/autocomplete/']")
	protected static WebElement autoCompleteWidgetLink;

	@FindBy(css = "a[href*='http://demoqa.com/datepicker/']")
	protected static WebElement datepickerWidgetLink;

	@FindBy(css = "a[href*='http://demoqa.com/menu/']")
	protected static WebElement menuWidgetLink;

	@FindBy(css = "a[href*='http://demoqa.com/slider/']")
	protected static WebElement sliderWidgetLink;

	@FindBy(xpath = ".//*[@id='menu-item-98']/a")
	protected static WebElement tabsWidgetLink;

	@FindBy(css = "a[href*='http://demoqa.com/tooltip/']")
	protected static WebElement tooltipWidgetLink;

	/**
	 * Frames and windows menu link
	 */

	@FindBy(css = "a[href*='http://demoqa.com/frames-and-windows/']")
	protected static WebElement framesAndWindowsLink;

	/**
	 * Social networking links
	 */

	@FindBy(className = "facebook")
	protected static WebElement facebookLink;

	@FindBy(className = "twitter")
	protected static WebElement twitterLink;

	@FindBy(className = "gplus")
	protected static WebElement gplusLink;

	/**
	 * The about box footer at bottom of page
	 */

	@FindBy(id = "footer-widget-1")
	protected static WebElement aboutUsFooter;

	/**
	 * The designer and generator links at bottom of page
	 */

	@FindBy(css = "a[href*='http://toolsqa.com/']")
	protected static WebElement designerLink;

	@FindBy(css = "a[href*='http://oneiricindia.com/']")
	protected static WebElement generatorLink;
}

