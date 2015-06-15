package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {

	/**
	 * The main menu menu in center of page (2 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement simpleMenu;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement menusWithSubMenus;// tab2
	
	/**
	 * Simple Menu and Menu with Sub Menu tab's elements
	 */
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/a")
	protected static WebElement homeMenuTab;	
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[2]/a")
	protected static WebElement aboutMenuTab;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[3]/a")
	protected static WebElement contactMenuTab;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[4]/a")
	protected static WebElement fAQMenuTab;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/a")
	protected static WebElement newsMenuTab;
	
	/**
	 *  Menu with Sub Menu's sub menus tab's elements
	 */
	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[1]/a")
	protected static WebElement subHomeMenuTab;	
	
	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[2]/a")
	protected static WebElement subAboutMenuTab;

	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[3]/a")
	protected static WebElement subContactMenuTab;

	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[4]/a")
	protected static WebElement subFAQMenuTab;

	@FindBy(xpath ="/html/body/div/div/div[1]/main/article/div/div/div[2]/div/div/ul/li[5]/a")
	protected static WebElement subNewsMenuTab;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[1]/a")
	protected static WebElement homeSubMenuItem1;	
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[2]/a")
	protected static WebElement homeSubMenuItem2;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[3]/a")
	protected static WebElement homeSubMenuItem3;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[1]/ul/li[4]/a")
	protected static WebElement homeSubMenuItem4NamedItem3;

	@FindBy(xpath =".//*[@id='navigate']/ul/li[4]/ul/li[1]/a")
	protected static WebElement fAQSubMenuItem1;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[4]/ul/li[2]/a")
	protected static WebElement fAQSubMenuItem3;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/ul/li[1]/a")
	protected static WebElement newsSubMenuItem1;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/ul/li[2]/a")
	protected static WebElement newsSubMenuItem2;
	
	@FindBy(xpath =".//*[@id='navigate']/ul/li[5]/ul/li[3]/a")
	protected static WebElement newsSubMenuItem3;
	
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
