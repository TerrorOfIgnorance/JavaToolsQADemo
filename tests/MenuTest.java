package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.MenuLogic;
import utils.Drivers;
import utils.commUtil;

public class MenuTest {
	
	pageObjects.Menu menu = PageFactory.initElements(Drivers.driver,pageObjects.Menu.class);
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
		Drivers.driver.get("http://demoqa.com/menu/");
	}

	@Test
	public void testMenuPageTitle() {
		MenuLogic.validateMenuPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(MenuLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(MenuLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(MenuLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(MenuLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(MenuLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(MenuLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(MenuLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(MenuLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(MenuLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(MenuLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(MenuLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(MenuLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(MenuLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(MenuLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(MenuLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(MenuLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(MenuLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(MenuLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(MenuLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(MenuLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(MenuLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(MenuLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(MenuLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(MenuLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(MenuLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		MenuLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		MenuLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		MenuLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		MenuLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		MenuLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		MenuLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		MenuLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		MenuLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		MenuLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		MenuLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		MenuLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		MenuLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		MenuLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		MenuLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		MenuLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		MenuLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		MenuLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		MenuLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		MenuLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		MenuLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		MenuLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		MenuLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		MenuLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Visibility Tests for sub menus
	 */
	
	@Test
	public void homeSubMenusAreDisplayed() {
		assertTrue(MenuLogic.homeSubMenusAreDisplayed());
	}
	
	@Test
	public void fAQSubMenusAreDisplayed() {
		assertTrue(MenuLogic.fAQSubMenusAreDisplayed());
	}
	
	@Test
	public void newsSubMenusAreDisplayed() {
		assertTrue(MenuLogic.newsSubMenusAreDisplayed());
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(MenuLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}

}
