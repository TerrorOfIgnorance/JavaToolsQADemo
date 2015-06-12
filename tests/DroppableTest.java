package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.DroppableLogic;
import utils.Drivers;
import utils.commUtil;

public class DroppableTest {

	pageObjects.Droppable droppable = PageFactory.initElements(Drivers.driver,
			pageObjects.Droppable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@BeforeClass
	public static void beforeClass() throws MalformedURLException {

		// Drivers.driver = Drivers.browser("chrome");
		// commUtil.launchBrowser("http://demoqa.com/");

		Drivers.driver = Drivers.browser("firefox");
		commUtil.launchBrowser("http://demoqa.com/");
		Drivers.driver.manage().window().maximize();

		// Drivers.driver = Drivers.browser("internetExplorer");
		// commUtil.launchBrowser("http://demoqa.com/");
	}

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/droppable/");
	}

	@Test
	public void testDroppablePageTitle() {
		DroppableLogic.validateDroppablePageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(DroppableLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(DroppableLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(DroppableLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(DroppableLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(DroppableLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(DroppableLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(DroppableLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(DroppableLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(DroppableLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(DroppableLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(DroppableLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(DroppableLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(DroppableLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(DroppableLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(DroppableLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(DroppableLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(DroppableLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(DroppableLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(DroppableLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		DroppableLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		DroppableLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		DroppableLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		DroppableLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		DroppableLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		DroppableLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		DroppableLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToRegistration() {
		DroppableLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		DroppableLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		DroppableLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		DroppableLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		DroppableLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		DroppableLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		DroppableLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		DroppableLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		DroppableLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		DroppableLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		DroppableLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		DroppableLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		DroppableLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		DroppableLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		DroppableLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		DroppableLogic.redirectToGeneratorLink();
	}

	/**
	 * Test for mouse movements and drops of elements tab1
	 */

	@Test
	public void validDragDivTab1() {
		assertTrue(DroppableLogic.validDragDivTab1());
	}

	@Test
	public void validDropDivResponseTab1() {
		assertTrue(DroppableLogic.validDropDivResponseTab1());
	}

	/**
	 * Test for mouse movements and drops of elements Accept tab (tab2)
	 */

	@Test
	public void validDragNonValidToAccept() {
		assertTrue(DroppableLogic.validDragNonValidToAccept());
	}

	@Test
	public void validDraggableAcceptBoxToDroppableAccept() {
		assertTrue(DroppableLogic.validDraggableAcceptBoxToDroppableAccept());
	}

	/**
	 * Test for mouse movements and drops of elements Greedy inner box on Box2
	 * Prevent propagation tab (tab3)
	 */

	@Test
	public void validTab3DraggableBoxToOuterBox1() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToOuterBox1());
	}

	@Test
	public void validTab3DraggableBoxToInnerBox1() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToInnerBox1());
	}

	@Test
	public void validTab3DraggableBoxToOuterBox2() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToOuterBox2());
	}

	@Test
	public void validTab3DraggableBoxToInnerBox2() {
		assertTrue(DroppableLogic.validTab3DraggableBoxToInnerBox2());
	}

	/**
	 * Mouse movement draggablity and reverting tests
	 * Revert Draggable Position tab (tab4)
	 * @throws InterruptedException 
	 */

	@Test
	public void draggableBoxRevertsAndMessageChanges() throws InterruptedException {
		assertTrue(DroppableLogic.draggableBoxRevertsAndMessageChanges());
	}
	
	@Test
	public void draggableBoxRevertsToDroppableBoxAndMessageChanges() throws InterruptedException {
		assertTrue(DroppableLogic.draggableBoxRevertsToDroppableBoxAndMessageChanges());
	}
	
	/**
	 * Mouse movement draggablity tests
	 * Shopping cart demo tab (tab5)
	 * @throws InterruptedException 
	 */
	
	@Test
	public void draggingItemsToCart() throws InterruptedException  {
		assertTrue(DroppableLogic.draggingItemsToCart());
	}


	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(DroppableLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}