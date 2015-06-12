package tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Registration;
import testsLogic.RegistrationLogic;
import utils.Drivers;
import utils.commUtil;

public class RegistrationTest extends Registration {
	
	pageObjects.Registration registration = PageFactory.initElements(Drivers.driver, pageObjects.Registration.class);
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
		Drivers.driver.get("http://demoqa.com/registration/");
	}

	@Test
	public void testRegistrationPageTitle() {
		RegistrationLogic.validateRegistrationPageTitle();
	}
	
	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(RegistrationLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(RegistrationLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(RegistrationLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(RegistrationLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(RegistrationLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(RegistrationLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(RegistrationLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(RegistrationLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(RegistrationLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(RegistrationLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(RegistrationLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(RegistrationLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(RegistrationLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(RegistrationLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(RegistrationLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(RegistrationLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(RegistrationLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(RegistrationLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(RegistrationLogic.gplusLinkIsClickable());
	}
	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		RegistrationLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		RegistrationLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		RegistrationLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		RegistrationLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab() throws InterruptedException {
		RegistrationLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		RegistrationLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		RegistrationLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		RegistrationLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		RegistrationLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		RegistrationLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		RegistrationLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		RegistrationLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		RegistrationLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		RegistrationLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		RegistrationLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		RegistrationLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		RegistrationLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		RegistrationLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		RegistrationLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		RegistrationLogic.redirectToFramesAndWindowsLink();
	}
	@Test
	public void testRedirectToDesignerLink() {
		RegistrationLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		RegistrationLogic.redirectToGeneratorLink();
	}
	
	/** 
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(RegistrationLogic.aboutUsFooterIsDisplayed());
	}
	@Test
	public void passwordStrengthIndicatorIsDisplayed() {
		assertTrue(RegistrationLogic.passwordStrengthIndicatorIsDisplayed());
	}
	
	/**
	 * Form Validation Testing 
	 */
	
	@Test
	public void testvalidFillInFormWithExistingData() {
		RegistrationLogic.validFillInFormWithExistingData();
	}
	@Test
	public void testvalidFillInFormWithRandomData() throws Exception {
		RegistrationLogic.validFillInFormWithRandomData();
	}
	/**
	 * Testing if the error messages all displayed when fields are null and submit is clicked
	 */
	
	@Test
	public void fieldErrorMessagesDisplayed() {
		assertTrue(RegistrationLogic.fieldErrorMessagesDisplayed());
	}
	
	/**
	 * Test for picture upload (using autoIT)
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	
	@Test
	public void testValidUploadedPicture() throws IOException, InterruptedException {
		assertTrue(RegistrationLogic.validUploadedPicture());
	}
	

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
