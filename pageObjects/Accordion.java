package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * The page object for the Accordian Widget page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */
public class Accordion {

	/**
	 * The main accordion menu in center of page (3 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement customizeIconsTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement fillSpaceTab;// tab3
	
	/**
	 * Default Functionality tab's elements
	 */
	
	@FindBy(id = "ui-accordion-accordion-header-0")
	protected static WebElement section1headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-0")
	protected static WebElement section1panelTab1;
	
	@FindBy(id = "ui-accordion-accordion-header-1")
	protected static WebElement section2headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-1")
	protected static WebElement section2panelTab1;
	
	@FindBy(id = "ui-accordion-accordion-header-2")
	protected static WebElement section3headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-2")
	protected static WebElement section3panelTab1;
	
	@FindBy(id = "ui-accordion-accordion-header-3")
	protected static WebElement section4headerTab1;
	
	@FindBy(id = "ui-accordion-accordion-panel-3")
	protected static WebElement section4panelTab1;
	
	/**
	 * Custom Icons tab's elements
	 */
	
	@FindBy(id = "ui-accordion-accordion_icons-header-0")
	protected static WebElement section1headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-0']/span")
	protected static WebElement section1Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-0")
	protected static WebElement section1panelTab2;
	
	@FindBy(id = "ui-accordion-accordion_icons-header-1")
	protected static WebElement section2headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-1']/span")
	protected static WebElement section2Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-1")
	protected static WebElement section2panelTab2;
	
	@FindBy(id = "ui-accordion-accordion_icons-header-2")
	protected static WebElement section3headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-2']/span")
	protected static WebElement section3Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-2")
	protected static WebElement section3panelTab2;
	
	@FindBy(id = "ui-accordion-accordion_icons-header-3")
	protected static WebElement section4headerTab2;
	
	@FindBy(xpath=".//*[@id='ui-accordion-accordion_icons-header-3']/span")
	protected static WebElement section4Arrow;
	
	@FindBy(id = "ui-accordion-accordion_icons-panel-3")
	protected static WebElement section4panelTab2;
	
	@FindBy(id = "toggle")
	protected static WebElement toggleButton;
	
	/**
	 * Fill Space tab's elements
	 */
	
	@FindBy(id = "ui-accordion-accordion_fill-header-0")
	protected static WebElement section1headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-0")
	protected static WebElement section1panelTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-header-1")
	protected static WebElement section2headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-1")
	protected static WebElement section2panelTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-header-2")
	protected static WebElement section3headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-2")
	protected static WebElement section3panelTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-header-3")
	protected static WebElement section4headerTab3;
	
	@FindBy(id = "ui-accordion-accordion_fill-panel-3")
	protected static WebElement section4panelTab3;
	
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

