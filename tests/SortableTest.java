package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.SortableLogic;
import utils.Drivers;
import utils.commUtil;

public class SortableTest {
	pageObjects.Sortable sortable = PageFactory.initElements(Drivers.driver,pageObjects.Sortable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@BeforeClass
	public static void beforeClass() throws MalformedURLException {

		 Drivers.driver = Drivers.browser("chrome");
		 commUtil.launchBrowser("http://demoqa.com/");

	//	Drivers.driver = Drivers.browser("firefox");
	//	commUtil.launchBrowser("http://demoqa.com/");
		Drivers.driver.manage().window().maximize();

		// Drivers.driver = Drivers.browser("internetExplorer");
		// commUtil.launchBrowser("http://demoqa.com/");
	}

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/sortable/");
	}

	@Test
	public void testSortablePageTitle() {
		SortableLogic.validateSortablePageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(SortableLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(SortableLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(SortableLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(SortableLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(SortableLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(SortableLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(SortableLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(SortableLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(SortableLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(SortableLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(SortableLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(SortableLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(SortableLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(SortableLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(SortableLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(SortableLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(SortableLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(SortableLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(SortableLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(SortableLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(SortableLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(SortableLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(SortableLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(SortableLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(SortableLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		SortableLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		SortableLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		SortableLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		SortableLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		SortableLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		SortableLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		SortableLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		SortableLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		SortableLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		SortableLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		SortableLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		SortableLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		SortableLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		SortableLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		SortableLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		SortableLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		SortableLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		SortableLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		SortableLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		SortableLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		SortableLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		SortableLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		SortableLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Testing the sortability of list items in tab1
	 * @throws InterruptedException 
	 */
	
	@Test
	public void validSortItem1ToItem7() throws InterruptedException {
		assertTrue(SortableLogic.validSortItem1ToItem7());
	}
	
	/**
	 * Testing the sortability of grid items in tab3
	 *
	 */
	
	@Test
	public void validSortGrid() throws InterruptedException {
		assertTrue(SortableLogic.validSortGrid());
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(SortableLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}