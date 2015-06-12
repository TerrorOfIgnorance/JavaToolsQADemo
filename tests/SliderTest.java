package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SliderLogic;
import utils.Drivers;
import utils.commUtil;

public class SliderTest {
	
	pageObjects.Slider slider = PageFactory.initElements(Drivers.driver,pageObjects.Slider.class);
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
		
		Drivers.driver.get("http://demoqa.com/slider/");
	}

	@Test
	public void testSliderPageTitle() {
		SliderLogic.validateSliderPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(SliderLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(SliderLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(SliderLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(SliderLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(SliderLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(SliderLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(SliderLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(SliderLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(SliderLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(SliderLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(SliderLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(SliderLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(SliderLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(SliderLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(SliderLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(SliderLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(SliderLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(SliderLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(SliderLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(SliderLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(SliderLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(SliderLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(SliderLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(SliderLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(SliderLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		SliderLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		SliderLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		SliderLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		SliderLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		SliderLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		SliderLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		SliderLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		SliderLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		SliderLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		SliderLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		SliderLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		SliderLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		SliderLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		SliderLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		SliderLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		SliderLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		SliderLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		SliderLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		SliderLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		SliderLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		SliderLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		SliderLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		SliderLogic.redirectToGeneratorLink();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(SliderLogic.aboutUsFooterIsDisplayed());
	}
	/**
	 * Mouse movement functionality to test slider
	 * 
	 */
	
	@Test
	public void testMoveTheSlider() {
		assertTrue(SliderLogic.moveTheSlider());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}