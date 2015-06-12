package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.ContactLogic;
import utils.Drivers;
import utils.commUtil;

public class ContactTest {
	
	pageObjects.Contact contact = PageFactory.initElements(Drivers.driver, pageObjects.Contact.class);
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
		Drivers.driver.get("http://demoqa.com/contact/");
	}
	@Test
	public void testContactPageTitle() {
		ContactLogic.validateContactPageTitle();
	
	}
	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(ContactLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(ContactLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(ContactLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(ContactLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(ContactLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(ContactLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(ContactLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(ContactLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(ContactLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(ContactLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(ContactLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(ContactLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(ContactLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(ContactLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(ContactLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(ContactLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(ContactLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(ContactLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(ContactLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(ContactLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(ContactLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(ContactLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(ContactLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(ContactLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(ContactLogic.gplusLinkIsClickable());
	}
	
	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		ContactLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		ContactLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		ContactLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		ContactLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab() throws InterruptedException {
		ContactLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		ContactLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		ContactLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		ContactLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		ContactLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		ContactLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		ContactLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		ContactLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		ContactLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		ContactLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		ContactLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		ContactLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		ContactLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		ContactLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		ContactLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		ContactLogic.redirectToFramesAndWindowsLink();
	}
	@Test
	public void testRedirectToDesignerLink() {
		ContactLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		ContactLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Tests for contact validation
	 */
	
	@Test
	public void errorDisplayedWhenEmailNull() {
		ContactLogic.errorDisplayedWhenEmailNull();
	}

	@Test
	public void errorDisplayedWhenNameNull() {
		ContactLogic.errorDisplayedWhenNameNull();
	}
	
	@Test
	public void errorDisplayedWhenNameEmailNull() {
		ContactLogic.errorDisplayedWhenNameEmailNull();
	}
	
	@Test
	public void successWithValidEmailName() throws Exception {
		ContactLogic.successWithValidEmailName();
	}

	/** 
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(ContactLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}