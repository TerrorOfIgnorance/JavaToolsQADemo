package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.DraggableLogic;
import utils.Drivers;
import utils.commUtil;

public class DraggableTest {
	pageObjects.Draggable draggable = PageFactory.initElements(Drivers.driver,
			pageObjects.Draggable.class);
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
		Drivers.driver.get("http://demoqa.com/draggable/");
	}

	@Test
	public void testDraggablePageTitle() {
		DraggableLogic.validateDraggablePageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(DraggableLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(DraggableLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(DraggableLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(DraggableLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(DraggableLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(DraggableLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(DraggableLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(DraggableLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(DraggableLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(DraggableLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(DraggableLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(DraggableLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(DraggableLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(DraggableLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(DraggableLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(DraggableLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(DraggableLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(DraggableLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(DraggableLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		DraggableLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		DraggableLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		DraggableLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		DraggableLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		DraggableLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		DraggableLogic.redirectToTabsLinkFromDemoTab();
	}
	
	@Test
	public void testRedirectToSmallHomeLink() {
		DraggableLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToRegistration() {
		DraggableLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		DraggableLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		DraggableLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		DraggableLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		DraggableLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		DraggableLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		DraggableLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		DraggableLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		DraggableLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		DraggableLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		DraggableLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		DraggableLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		DraggableLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		DraggableLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		DraggableLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		DraggableLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Draggability tests
	 * tab1
	 */
	
	@Test
	public void testValidDragDivTab1() {
		assertTrue(DraggableLogic.validDragDivTab1());
	}
	/**
	 * Draggability tests
	 * tab2
	 */
	
	@Test
	public void testDragVerticleDivTab2() {
		assertTrue(DraggableLogic.dragVerticleDivTab2());
	}
	
	@Test
	public void testDragHorizontalDivTab2() {
		assertTrue(DraggableLogic.dragHorizontalDivTab2());
	}
	
	@Test
	public void testDragWithinBoxDivTab2() {
		assertTrue(DraggableLogic.dragWithinBoxDivTab2());
	}
	
	@Test
	public void testDragWithinParentDivTab2() {
		assertTrue(DraggableLogic.dragWithinParentDivTab2());
	}
	
	/**
	 * Draggability tests
	 * tab3
	 * Can't find a way of determining the cursor type for the following test
	 */
	
	/*@Test
	public void testValidCursorTypeCrosshair() {
		assertTrue(DraggableLogic.validCursorTypeCrosshair());
	}*/
	
	/**
	 * Draggability tests
	 * tab4
	 */
	
	@Test
	public void testDragEventDivTab4(){
		assertTrue(DraggableLogic.dragEventDivTab4());
	}
	
	@Test
	public void testDragEventDivValidStartCounterTab4(){
		assertTrue(DraggableLogic.dragEventDivValidStartCounterTab4());
	}
	
	@Test
	public void testDragEventDivValidStopCounterTab4(){
		assertTrue(DraggableLogic.dragEventDivValidStopCounterTab4());
	}
	
	@Test
	public void testDragEventDivValidDragCounterTab4(){
		assertTrue(DraggableLogic.dragEventDivValidDragCounterTab4());
	}


	/**
	 * Draggability tests
	 * tab5
	 * @throws InterruptedException 
	 */
	
	@Test
	public void testValidDragMeDownTab5() throws InterruptedException{
		assertTrue(DraggableLogic.validDragMeDownTab5());
	}
	
	@Test
	public void testValidDragItem1ToBottom() throws InterruptedException{
		assertTrue(DraggableLogic.validDragItem1ToBottom());
	}
	
	@Test
	public void testValidDragItem5ToTop() throws InterruptedException{
		assertTrue(DraggableLogic.validDragItem5ToTop());
	}
	
	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(DraggableLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}