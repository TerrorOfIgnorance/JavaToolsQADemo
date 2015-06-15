package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Datepicker page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Datepicker {

	/**
	 * The main droppable menu in center of page (4 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab1;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement animations;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement displayMonthAndYear;// tab3

	@FindBy(id = "ui-id-4")
	protected static WebElement formatDate;// tab4

	/**
	 * Default Functionality tab's elements
	 */

	@FindBy(id = "datepicker1")
	protected static WebElement datepickerInputTab1;

	@FindBy(id = "ui-datepicker-div")
	protected static WebElement datepickerTab1;
	
	/**
	 * Animations tab's elements
	 */

	@FindBy(id = "datepicker2")
	protected static WebElement datepickerInput2;

	@FindBy(id = "anim")
	protected static WebElement animationsSelect;

	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")
	protected static WebElement sixteenthOfAMonth;

	/**
	 * Display month and year tab's elements
	 */

	@FindBy(id = "datepicker3")
	protected static WebElement datepickerTab3;
	
	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")
	protected static WebElement seventeenthOfAMonth;

	/**
	 * Format date tab's elements
	 */

	@FindBy(id = "datepicker4")
	protected static WebElement datepickerTab4;

	@FindBy(id = "format")
	protected static WebElement formatSelect;
	
	@FindBy(xpath =".//*[@id='format']/option[6]")
	protected static WebElement fullTextDate;
	
	@FindBy(xpath =".//*[@id='format']/option[4]")
	protected static WebElement mediumDate;
	
	@FindBy(xpath = ".//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")
	protected static WebElement tenthOfAMonth;

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

	@FindBy(xpath = ".//*[@id='breadcrumbs']/li[1]/a")
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
