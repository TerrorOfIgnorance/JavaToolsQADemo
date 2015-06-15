package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Droppable page Implemented locating through xpath
 * only when no other means applied.
 * 
 * @author jPayne
 */

public class Droppable {

	/**
	 * The main droppable menu in center of page (5 tabs)
	 */

	@FindBy(id = "ui-id-1")
	protected static WebElement defaultFunctionalityTab;// tab1

	@FindBy(id = "ui-id-2")
	protected static WebElement acceptTab;// tab2

	@FindBy(id = "ui-id-3")
	protected static WebElement preventPropagationTab;// tab3

	@FindBy(id = "ui-id-4")
	protected static WebElement revertDraggableTab;// tab4

	@FindBy(id = "ui-id-5")
	protected static WebElement shoppingCartDemoTab;// tab5

	/**
	 * Default functionality tab's divs and elements
	 */

	@FindBy(id = "draggableview")
	protected static WebElement tab1DraggableBox;

	@FindBy(id = "droppableview")
	protected static WebElement tab1DroppableBox;
	
	@FindBy(xpath =".//*[@id='droppableview']/p")
	protected static WebElement droppableBoxMessage;

	/**
	 * Accept tab's divs and elements
	 */

	@FindBy(xpath = ".//*[@id='tabs-2']/div")
	protected static WebElement centralActionDivTab2;

	@FindBy(id = "draggableaccept")
	protected static WebElement tab2DraggableAcceptBox;

	@FindBy(id = "draggable-nonvalid")
	protected static WebElement tab2DraggableNonValidBox;
	
	@FindBy(xpath =".//*[@id='droppableaccept']/p")
	protected static WebElement tab2DroppableAcceptBox;

	/**
	 * Prevent propagation tab's divs and elements
	 */

	@FindBy(xpath = ".//*[@id='tabs-3']/div")
	protected static WebElement centralActionDivTab3;

	@FindBy(id = "draggableprop")
	protected static WebElement tab3DraggableBox;

	@FindBy(id="droppableprop")
	protected static WebElement tab3OuterDroppableBox1;
	
	@FindBy(xpath =".//*[@id='droppableprop']/p")
	protected static WebElement tab3OuterDroppableBox1Message;
	
	@FindBy(id="droppable-inner" )
	protected static WebElement tab3InnerDroppableBox1;
	
	@FindBy(xpath =".//*[@id='droppable-inner']/p")
	protected static WebElement tab3InnerDroppableBox1Message;
	
	@FindBy(id="droppableprop2")
	protected static WebElement tab3OuterDroppableBox2;
	
	@FindBy(xpath =".//*[@id='droppableprop2']/p")
	protected static WebElement tab3OuterDroppableBox2Message;
	
	@FindBy(id="droppable2-inner" )
	protected static WebElement tab3InnerDroppableBox2;
	
	@FindBy(xpath =".//*[@id='droppable2-inner']/p")
	protected static WebElement tab3InnerDroppableBox2Message;
	
	/**
	 * Revert draggable Position tab's divs and elements
	 */

	@FindBy(xpath = ".//*[@id='tabs-4']/div")
	protected static WebElement centralActionDivTab4;

	@FindBy(id = "draggablerevert")
	protected static WebElement tab4DraggableRevertBox;
	
	@FindBy(id = "draggablerevert2")
	protected static WebElement tab4DraggableRevertNotDroppedBox;
	
	@FindBy(id="droppablerevert")
	protected static WebElement tab4DroppableBox;
	
	@FindBy(xpath = ".//*[@id='droppablerevert']/p")
	protected static WebElement tab4DroppableBoxMessage;
	

	/**
	 * Shopping cart tab's divs and elements
	 */
	
	@FindBy(id="ui-accordion-catalog-header-0")
	protected static WebElement tShirtsTab;
	
	@FindBy(id="ui-accordion-catalog-header-1")
	protected static WebElement bagsTab;
	
	@FindBy(id="ui-accordion-catalog-header-2")
	protected static WebElement gadgetsTab;
	
	@FindBy(id="cart")
	protected static WebElement cartDiv;
	
	@FindBy(xpath=".//*[@id='cart']/div/ol")
	protected static WebElement droppableCartDiv;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-0']/ul/li[contains(.,'Lolcat Shirt')]")
	protected static WebElement lolCatShirtItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-0']/ul/li[contains(.,'Cheezeburger Shirt')]")
	protected static WebElement cheezeburgerShirtItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-0']/ul/li[contains(.,'Buckit Shirt')]")
	protected static WebElement buckitShirtItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-1']/ul/li[contains(.,'Zebra Striped')]")
	protected static WebElement zebraStripedBagItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-1']/ul/li[contains(.,'Black Leather')]")
	protected static WebElement blackLeatherBagItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-1']/ul/li[contains(.,'Alligator Leather')]")
	protected static WebElement alligatorLeatherItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-2']/ul/li[contains(.,'iPhone')]")
	protected static WebElement iPhoneItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-2']/ul/li[contains(.,'iPod')]")
	protected static WebElement iPodItem;
	
	@FindBy(xpath = ".//*[@id='ui-accordion-catalog-panel-2']/ul/li[contains(.,'iPad')]")
	protected static WebElement iPadItem;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[1]")
	protected static WebElement firstItemInCart;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[2]")
	protected static WebElement secondItemInCart;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[3]")
	protected static WebElement thirdItemInCart;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[4]")
	protected static WebElement fourthItemInCart;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[5]")
	protected static WebElement fifthItemInCart;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[6]")
	protected static WebElement sixthItemInCart;
	
	@FindBy(xpath = ".//*[@id='cart']/div/ol/li[7]")
	protected static WebElement seventhItemInCart;
	
	
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
