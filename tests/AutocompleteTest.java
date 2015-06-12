package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.AutocompleteLogic;
import utils.Drivers;
import utils.commUtil;

public class AutocompleteTest {

	pageObjects.Autocomplete autocomplete = PageFactory.initElements(
			Drivers.driver, pageObjects.Autocomplete.class);
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
		Drivers.driver.get("http://demoqa.com/autocomplete/");
	}

	@Test
	public void testAutocompletePageTitle() {
		AutocompleteLogic.validateAutocompletePageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(AutocompleteLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(AutocompleteLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(AutocompleteLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(AutocompleteLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(AutocompleteLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(AutocompleteLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(AutocompleteLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(AutocompleteLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(AutocompleteLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(AutocompleteLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(AutocompleteLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(AutocompleteLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(AutocompleteLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(AutocompleteLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(AutocompleteLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(AutocompleteLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(AutocompleteLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(AutocompleteLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(AutocompleteLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		AutocompleteLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		AutocompleteLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		AutocompleteLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		AutocompleteLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		AutocompleteLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		AutocompleteLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		AutocompleteLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToRegistration() {
		AutocompleteLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		AutocompleteLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		AutocompleteLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		AutocompleteLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		AutocompleteLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		AutocompleteLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		AutocompleteLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		AutocompleteLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		AutocompleteLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		AutocompleteLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		AutocompleteLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		AutocompleteLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		AutocompleteLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		AutocompleteLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		AutocompleteLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		AutocompleteLogic.redirectToGeneratorLink();
	}

	/**
	 * Tests for the autocomplete functionality tab1
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void validAutoCompleteDropDown() throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteDropDown());
	}

	/**
	 * Tests for the autocomplete functionality tab2
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void validAutoCompleteColdFusionDropDown()
			throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteColdFusionDropDown());
	}

	@Test
	public void validAutoCompleteHaskellDropDown() throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteHaskellDropDown());
	}

	/**
	 * Tests for the autocomplete functionality tab3
	 * 
	 * @throws InterruptedException
	 */

	@Test
	public void validAutoCompleteCategoriesTab() throws InterruptedException {
		assertTrue(AutocompleteLogic.validAutoCompleteCategoriesTab());
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(AutocompleteLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
