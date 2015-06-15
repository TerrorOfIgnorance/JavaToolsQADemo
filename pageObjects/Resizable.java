package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Resizable page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Resizable {

	/**
	 * The main resizable menu in center of page (5 tabs)
	 */
	
	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement animateTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement constrainResizeAreaTab;// tab3

	@FindBy(id = "ui-id-4")
	protected static WebElement helperTab;// tab4

	@FindBy(id = "ui-id-5")
	protected static WebElement maxMinSizeTab;// tab5
	
	/**
	 * Default functionality tab's divs 
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-1']/div")
	protected static WebElement centralActionDivTab1;
	
	@FindBy(id = "resizable")
	protected static WebElement resizableDiv;
	
	@FindBy(xpath = ".//*[@id='resizable']/div[1]")
	protected static WebElement rightDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable']/div[2]")
	protected static WebElement bottomDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable']/div[3]")
	protected static WebElement cornerDivClickedToResize;
	
	/**
	 * Animate tab's divs 
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-2']/div")
	protected static WebElement centralActionDivTab2;
	
	@FindBy(id = "resizableani")
	protected static WebElement resizableAnimateDiv;
	
	@FindBy(xpath = ".//*[@id='resizableani']/div[1]")
	protected static WebElement rightAnimateDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableani']/div[2]")
	protected static WebElement bottomAnimateDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableani']/div[3]")
	protected static WebElement cornerAnimateDivClickedToResize;
	
	/**
	 * Constrain resize area tab's divs 
	 */
	
	
	@FindBy(id = "container1")
	protected static WebElement constrainDiv;
	
	@FindBy(id = "resizableconstrain")
	protected static WebElement resizableConstrainBoxDiv;
	
	@FindBy(xpath = ".//*[@id='resizableconstrain']/div[1]")
	protected static WebElement rightConstrainDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableconstrain']/div[2]")
	protected static WebElement bottomConstrainDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizableconstrain']/div[3]")
	protected static WebElement cornerConstrainDivClickedToResize;
	
	
	/**
	 * Helper tab's divs 
	 */
	
	@FindBy(id = "resizable_helper")
	protected static WebElement resizableHelperDiv;
	
	@FindBy(xpath = ".//*[@id='resizable_helper']/div[1]")
	protected static WebElement rightHelperDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_helper']/div[2]")
	protected static WebElement bottomHelperDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_helper']/div[3]")
	protected static WebElement cornerHelperDivClickedToResize;
	
	/**
	 * Max/Min size tab's divs 
	 */
	
	@FindBy(xpath = ".//*[@id='tabs-5']/div")
	protected static WebElement centralActionDivTab5;
	
	@FindBy(id = "resizable_max_min")
	protected static WebElement resizableMaxMinDiv;
	
	@FindBy(xpath = ".//*[@id='resizable_max_min']/div[1]")
	protected static WebElement rightMaxMinDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_max_min']/div[2]")
	protected static WebElement bottomMaxMinDivClickedToResize;
	
	@FindBy(xpath = ".//*[@id='resizable_max_min']/div[3]")
	protected static WebElement cornerMaxMinDivClickedToResize;
	
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

