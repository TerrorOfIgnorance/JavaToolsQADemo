package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.DatepickerLogic;
import utils.Drivers;
import utils.commUtil;

public class DatepickerTest {
	pageObjects.Datepicker datepicker = PageFactory.initElements(Drivers.driver,pageObjects.Datepicker.class);
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
		Drivers.driver.get("http://demoqa.com/datepicker/");
	}

	@Test
	public void testDatepickerPageTitle() {
		DatepickerLogic.validateDatepickerPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(DatepickerLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(DatepickerLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(DatepickerLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(DatepickerLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(DatepickerLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(DatepickerLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(DatepickerLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(DatepickerLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(DatepickerLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(DatepickerLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(DatepickerLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(DatepickerLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(DatepickerLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(DatepickerLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(DatepickerLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(DatepickerLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(DatepickerLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(DatepickerLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(DatepickerLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		DatepickerLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		DatepickerLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		DatepickerLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		DatepickerLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		DatepickerLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		DatepickerLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		DatepickerLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		DatepickerLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		DatepickerLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		DatepickerLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		DatepickerLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		DatepickerLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		DatepickerLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		DatepickerLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		DatepickerLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		DatepickerLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		DatepickerLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		DatepickerLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		DatepickerLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		DatepickerLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		DatepickerLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		DatepickerLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		DatepickerLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Tab 1 Tests, Datepicker display
	 */

	@Test
	public void testDoesDatePickerDisplayTab1() {
		DatepickerLogic.doesDatePickerDisplayTab1();
	}
	
	/**
	 * Tab 2 Tests, Datepicker display and function
	 */
	
	@Test
	public void testIsDatePickerFunctional(){
		assertTrue(DatepickerLogic.isDatePickerFunctional());
	}
	

	/**
	 * Tab 3 Tests, Datepicker display and function 
	 */
	
	@Test
	public void testIsDatePickerFunctinalTab3() {
		assertTrue(DatepickerLogic.isDatePickerFunctionalTab3());
	}
	
	/**
	 * Tab 4 Tests, Datepicker display and function 
	 */
	
	@Test
	public void testIsDatePickerFunctinalTab4() {
		assertTrue(DatepickerLogic.isDatePickerFunctionalTab4());
	}
	
	/*@Test
	public void testIsFormatCorrect() throws InterruptedException {
		assertTrue(DatepickerLogic.isFormatCorrect());
	}*/
	
	
	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(DatepickerLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
