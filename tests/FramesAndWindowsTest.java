package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.FramesAndWindowsLogic;
import utils.Drivers;
import utils.commUtil;

public class FramesAndWindowsTest {
	
	pageObjects.FramesAndWindows framesAndWindows = PageFactory.initElements(Drivers.driver,pageObjects.FramesAndWindows.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@BeforeClass
	public static void beforeClass() throws MalformedURLException {

		 Drivers.driver = Drivers.browser("chrome");
		 commUtil.launchBrowser("http://demoqa.com/");

//		Drivers.driver = Drivers.browser("firefox");
//		commUtil.launchBrowser("http://demoqa.com/");
//		Drivers.driver.manage().window().maximize();

		// Drivers.driver = Drivers.browser("internetExplorer");
		// commUtil.launchBrowser("http://demoqa.com/");
	}

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/frames-and-windows/");
	}

	@Test
	public void testFramesAndWindowsPageTitle() {
		FramesAndWindowsLogic.validateFramesAndWindowsPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(FramesAndWindowsLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(FramesAndWindowsLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(FramesAndWindowsLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(FramesAndWindowsLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		FramesAndWindowsLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		FramesAndWindowsLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		FramesAndWindowsLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		FramesAndWindowsLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		FramesAndWindowsLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		FramesAndWindowsLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		FramesAndWindowsLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		FramesAndWindowsLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		FramesAndWindowsLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		FramesAndWindowsLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		FramesAndWindowsLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		FramesAndWindowsLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		FramesAndWindowsLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		FramesAndWindowsLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		FramesAndWindowsLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		FramesAndWindowsLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		FramesAndWindowsLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		FramesAndWindowsLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		FramesAndWindowsLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		FramesAndWindowsLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		FramesAndWindowsLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() throws InterruptedException {
		FramesAndWindowsLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		FramesAndWindowsLogic.redirectToGeneratorLink();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(FramesAndWindowsLogic.aboutUsFooterIsDisplayed());
	}
	
	/**
	 * Testing if the links open new Windows or tabs
	 * For Tab 1, Tab2, and Tab3
	 */
	
	@Test
	public void testValidNewTabOpened() {
		FramesAndWindowsLogic.validNewTabOpened();
	}
	
	@Test
	public void testValidNewWindowOpened() {
		FramesAndWindowsLogic.validNewWindowOpened();
	}
	
	@Test
	public void testValidNewFramesetOpened() {
		FramesAndWindowsLogic.validNewFramesetOpened();
	}
	

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
