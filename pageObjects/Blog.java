package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Blog page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class Blog {

	/**
	 * Blog page specific headers links and paragraphs
	 */
	@FindBy(xpath = ".//*[@id='breadcrumbs']/li[1]/a")
	protected static WebElement smallLowerHomeLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/header/h2/a")
	protected static WebElement samplePost2HeaderLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/header/div/span[1]/a/time")
	protected static WebElement samplePost2DateLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/div[2]/a/img")
	protected static WebElement samplePost2ImageLink;
	
	@FindBy(xpath = ".//*[@id='post-379']/div[4]/p")
	protected static WebElement samplePost2Paragraph;
	
	@FindBy(xpath = ".//*[@id='post-379']/footer/p[2]/a")
	protected static WebElement samplePost2ReadMoreButton;
	
	@FindBy(xpath = ".//*[@id='post-377']/header/h2/a")
	protected static WebElement samplePostHeaderLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/header/div/span[1]/a/time")
	protected static WebElement samplePostDateLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/div[2]/a/img")
	protected static WebElement samplePostImageLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/div[4]/p")
	protected static WebElement samplePostParagraph;
	
	@FindBy(xpath = ".//*[@id='post-377']/footer/p[2]/a")
	protected static WebElement samplePostReadMoreButton;
	
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

	/**
	 *  The two options from the demo dropdown
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
	 *  The about box footer at bottom of page
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
