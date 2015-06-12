package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.TooltipLogic;
import utils.Drivers;
import utils.commUtil;

public class TooltipTest {
	
	pageObjects.Tooltip tooltip = PageFactory.initElements(Drivers.driver,pageObjects.Tooltip.class);
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
		Drivers.driver.get("http://demoqa.com/tooltip/");
	}

	@Test
	public void testTooltipPageTitle() {
		TooltipLogic.validateTooltipPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(TooltipLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(TooltipLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(TooltipLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(TooltipLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(TooltipLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(TooltipLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(TooltipLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(TooltipLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(TooltipLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(TooltipLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(TooltipLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(TooltipLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(TooltipLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(TooltipLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(TooltipLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(TooltipLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(TooltipLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(TooltipLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(TooltipLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		TooltipLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		TooltipLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		TooltipLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		TooltipLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		TooltipLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		TooltipLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		TooltipLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		TooltipLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		TooltipLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		TooltipLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		TooltipLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		TooltipLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		TooltipLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		TooltipLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		TooltipLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		TooltipLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		TooltipLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		TooltipLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		TooltipLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		TooltipLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		TooltipLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		TooltipLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		TooltipLogic.redirectToGeneratorLink();
	}
	/**
	 * Tooltip specific redirect Tests
	 */
	
	@Test
	public void testRedirectToThemeRollerLink() {
		TooltipLogic.redirectToThemeRollerLink();
	}
	
	/**
	 * Tooltip input and widget functionality
	 * tab1 
	 */
	
	
	@Test
	public void inputAgeValid() {
		assertTrue(TooltipLogic.inputAgeValid());
	}
	
	/**
	 * I would like to implement the following test once I learn how to test
	 * the widgets' elements
	 */
	
	/*@Test
	public void tooltipMessageDisplayed() {
		assertTrue(TooltipLogic.tooltipMessageDisplayed());
	}
	
	@Test
	public void ageInputMessageDisplayed() {
		assertTrue(TooltipLogic.ageInputMessageDisplayed());
	}
	
	@Test
	public void themeRollerMessageDisplayed() {
		assertTrue(TooltipLogic.themeRollerMessageDisplayed());
	}
	
	*//**
	 * Tooltip input and widget functionality
	 * tab2 
	 *//*
	
	@Test
	public void showOptionMessageDisplayed() {
		assertTrue(TooltipLogic.showOptionMessageDisplayed());
	}
	
	@Test
	public void hideOptionMessageDisplayed() {
		assertTrue(TooltipLogic.hideOptionMessageDisplayed());
	}
	
	@Test
	public void openEventOptionMessageDisplayed() {
		assertTrue(TooltipLogic.openEventOptionMessageDisplayed());
	}*/
	
	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(TooltipLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}