package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.demoqaLogic;
import utils.Drivers;
import utils.commUtil;

public class demoqaTest extends pageObjects.demoqa {

	pageObjects.demoqa demoqa = PageFactory.initElements(Drivers.driver, pageObjects.demoqa.class);
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
		Drivers.driver.get("http://demoqa.com/");
	}

	@Test
	public void testHomePageTitle() {
		demoqaLogic.validatedemoqaPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 * @return
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(demoqaLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(demoqaLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(demoqaLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(demoqaLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(demoqaLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(demoqaLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(demoqaLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(demoqaLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(demoqaLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(demoqaLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(demoqaLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(demoqaLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(demoqaLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(demoqaLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(demoqaLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(demoqaLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(demoqaLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(demoqaLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(demoqaLogic.gplusLinkIsClickable());
	}

	@Test
	public void uniqueAndCleanLinkIsClickable() {
		assertTrue(demoqaLogic.uniqueAndCleanLinkIsClickable());
	}

	@Test
	public void customerSupportLinkClickable() {
		assertTrue(demoqaLogic.customerSupportLinkClickable());
	}

	@Test
	public void tveryFlexableLinkClickable() {
		assertTrue(demoqaLogic.veryFlexableLinkClickable());
	}

	@Test
	public void tab1Clickable() {
		assertTrue(demoqaLogic.tab1Clickable());
	}

	@Test
	public void tab2Clickable() {
		assertTrue(demoqaLogic.tab2Clickable());
	}

	@Test
	public void tab3Clickable() {
		assertTrue(demoqaLogic.tab3Clickable());
	}

	@Test
	public void tab4Clickable() {
		assertTrue(demoqaLogic.tab4Clickable());
	}

	@Test
	public void tab5Clickable() {
		assertTrue(demoqaLogic.tab5Clickable());
	}

	@Test
	public void designerLinkClickable() {
		assertTrue(demoqaLogic.designerLinkClickable());
	}

	public void generatorLinkClickable() {
		assertTrue(demoqaLogic.generatorLinkClickable());
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void tabDivIsDisplayed() {
		assertTrue(demoqaLogic.tabDivIsDisplayed());
	}

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(demoqaLogic.aboutUsFooterIsDisplayed());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		demoqaLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		demoqaLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		demoqaLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		demoqaLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab() throws InterruptedException {
		demoqaLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		demoqaLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		demoqaLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		demoqaLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		demoqaLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		demoqaLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		demoqaLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		demoqaLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		demoqaLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		demoqaLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		demoqaLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		demoqaLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		demoqaLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		demoqaLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		demoqaLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		demoqaLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToUniqueAndCleanLink() {
		demoqaLogic.redirectToUniqueAndCleanLink();
	}

	@Test
	public void testRedirectToCustomerSupportLink() {
		demoqaLogic.redirectToCustomerSupportLink();
	}

	@Test
	public void testRedirectToVeryFlexableLink() {
		demoqaLogic.redirectToVeryFlexableLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		demoqaLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		demoqaLogic.redirectToGeneratorLink();
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();

	}
}
