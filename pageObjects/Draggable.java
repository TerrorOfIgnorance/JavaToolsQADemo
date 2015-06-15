package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Draggable page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class Draggable {

	/**
	 * The main draggable menu in center of page (5 tabs)
	 */
	
    @FindBy(id="ui-id-1")
    protected static WebElement defaultFunctionalityTab;//tab1

    @FindBy(id="ui-id-2")
    protected static WebElement constrainMovementTab;//tab2
    
    @FindBy(id="ui-id-3")
    protected static WebElement cursorStyleTab;//tab3
    
    @FindBy(id="ui-id-4")
    protected static WebElement eventsTab;//tab4
   
    @FindBy(id="ui-id-5")
    protected static WebElement DraggableAndSortableTab;//tab5
    
    /**
     * Default functionality tab's element
     */
    
    @FindBy(id="draggable")
    protected static WebElement draggableDivTab1;
    
    /**
     * Constraint Movement tab's movable divs along axis
     */
    
    @FindBy(xpath=".//*[@id='draggabl']/p")
    protected static WebElement verticleDraggableDiv;
    
    @FindBy(xpath=".//*[@id='draggabl2']/p")
    protected static WebElement horizontalDraggableDiv;
    
    /**
     * Constraint Movement tab's within another DOM element
     */
    
    @FindBy(id="draggabl3")
    protected static WebElement withinBoxDraggableDiv;
    
    @FindBy(id="draggabl5")
    protected static WebElement withinParentDraggableDiv;
    
    @FindBy(xpath=".//*[@id='containment-wrapper']/div[2]")
    protected static WebElement parentDiv;
    
    @FindBy(id="containment-wrapper")
    protected static WebElement withDOMBoxDiv;
    
    /**
     * Cursor style tab's divs
     */

    @FindBy(id="drag")
    protected static WebElement stickToCenterDraggableDiv;
    
    @FindBy(id="drag2")
    protected static WebElement left5Top5DraggableDiv;
    
    @FindBy(xpath = ".//*[@id='ui-id-3']/li[2]")
    protected static WebElement left5Top5DivCrosshairCursor;
    
    @FindBy(id="drag3")
    protected static WebElement bottomValueDraggableDiv;
    
    /**
     * Events tab's divs
     */
    
    @FindBy(xpath=".//*[@id='tabs-5']/div/div")
    protected static WebElement eventsDiv;
    
    @FindBy(id="dragevent")
    protected static WebElement eventDraggableDiv;
    
    @FindBy(xpath=".//*[@id='event-start']/span[2]")
    protected static WebElement startCount;
    
    @FindBy(xpath=".//*[@id='event-drag']/span[2]")
    protected static WebElement dragCount;
    
    @FindBy(xpath=".//*[@id='event-stop']/span[2]")
    protected static WebElement stopCount;
    
    /**
     * Draggable and Sortable tab's divs
     *
     */
    
    @FindBy(xpath=".//*[@id='tabs-7']/div")
    protected static WebElement draggableAndSortableDiv;
    
    @FindBy(id="draggablebox")
    protected static WebElement draggableBox;
    
    @FindBy(id="sortablebox")
    protected static WebElement sortableBox;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 1')]")
    protected static WebElement item1Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 2')]")
    protected static WebElement item2Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 3')]")
    protected static WebElement item3Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 4')]")
    protected static WebElement item4Div;
    
    @FindBy(xpath=".//*[@id='sortablebox']/li[contains(.,'Item 5')]")
    protected static WebElement item5Div;
    

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
    
