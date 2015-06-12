package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.AboutUsLogic;
import utils.Drivers;
import utils.commUtil;

public class AboutUsTest {

	pageObjects.AboutUs aboutUs = PageFactory.initElements(Drivers.driver, pageObjects.AboutUs.class);
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
		Drivers.driver.get("http://demoqa.com/about-us/");
	}
	@Test
	public void testAboutUsPageTitle() {
		AboutUsLogic.validateAboutUsPageTitle();
	}
	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(AboutUsLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(AboutUsLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(AboutUsLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(AboutUsLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(AboutUsLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(AboutUsLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(AboutUsLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(AboutUsLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(AboutUsLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(AboutUsLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(AboutUsLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(AboutUsLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(AboutUsLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(AboutUsLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(AboutUsLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(AboutUsLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(AboutUsLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(AboutUsLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(AboutUsLogic.gplusLinkIsClickable());
	}
	
	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		AboutUsLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		AboutUsLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		AboutUsLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		AboutUsLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab() throws InterruptedException {
		AboutUsLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		AboutUsLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		AboutUsLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		AboutUsLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		AboutUsLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		AboutUsLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		AboutUsLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		AboutUsLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		AboutUsLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		AboutUsLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		AboutUsLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		AboutUsLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		AboutUsLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		AboutUsLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		AboutUsLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		AboutUsLogic.redirectToFramesAndWindowsLink();
	}
	@Test
	public void testRedirectToDesignerLink() {
		AboutUsLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		AboutUsLogic.redirectToGeneratorLink();
	}
	
	/** 
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(AboutUsLogic.aboutUsFooterIsDisplayed());
	}
	@Test
	public void aboutUsHeadingIsDisplayed() {
		assertTrue(AboutUsLogic.aboutUsHeadingIsDisplayed());
	}
	@Test
	public void aboutUsParagraphIsDisplayed() {
		assertTrue(AboutUsLogic.aboutUsParagraphIsDisplayed());
	}
	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
