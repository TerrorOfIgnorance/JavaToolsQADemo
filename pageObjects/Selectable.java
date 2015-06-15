package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Selectable page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Selectable {

	/**
	 * The main selectable menu in center of page (3 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement displayAsGridTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement serializeTab;// tab3

	/**
	 * Default functionality tab's selectable list items
	 */
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 1')]")
	protected static WebElement item1;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 2')]")
	protected static WebElement item2;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 3')]")
	protected static WebElement item3;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 4')]")
	protected static WebElement item4;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 5')]")
	protected static WebElement item5;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 6')]")
	protected static WebElement item6;
	
	@FindBy(xpath=".//*[@id='selectable']/li[contains(.,'Item 7')]")
	protected static WebElement item7;
	
	/**
	 * Display as grid tab's selectable list items
	 */
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'1')]")
	protected static WebElement grid1;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'2')]")
	protected static WebElement grid2;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'3')]")
	protected static WebElement grid3;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'4')]")
	protected static WebElement grid4;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'5')]")
	protected static WebElement grid5;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'6')]")
	protected static WebElement grid6;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'7')]")
	protected static WebElement grid7;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'8')]")
	protected static WebElement grid8;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'9')]")
	protected static WebElement grid9;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'10')]")
	protected static WebElement grid10;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'11')]")
	protected static WebElement grid11;
	
	@FindBy(xpath = ".//*[@id='selectable_grid']/li[contains(.,'12')]")
	protected static WebElement grid12;
	
	/**
	 * Serialize tab's selectable list items
	 */
	
	@FindBy(id="select-result")
	protected static WebElement selectResult;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 1')]")
	protected static WebElement serializeItem1;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 2')]")
	protected static WebElement serializeItem2;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 3')]")
	protected static WebElement serializeItem3;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 4')]")
	protected static WebElement serializeItem4;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 5')]")
	protected static WebElement serializeItem5;
	
	@FindBy(xpath = ".//*[@id='selectable-serialize']/li[contains(.,'Item 6')]")
	protected static WebElement serializeItem6;
	
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


