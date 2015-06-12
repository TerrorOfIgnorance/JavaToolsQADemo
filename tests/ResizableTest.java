package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.ResizableLogic;
import utils.Drivers;
import utils.commUtil;

public class ResizableTest {

	pageObjects.Resizable resizable = PageFactory.initElements(Drivers.driver,
			pageObjects.Resizable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@BeforeClass
	public static void beforeClass() throws MalformedURLException {

		 Drivers.driver = Drivers.browser("chrome");
		 commUtil.launchBrowser("http://demoqa.com/");
		 Drivers.driver.manage().window().maximize();

//		Drivers.driver = Drivers.browser("firefox");
//		commUtil.launchBrowser("http://demoqa.com/");

		// Drivers.driver = Drivers.browser("internetExplorer");
		// commUtil.launchBrowser("http://demoqa.com/");
	}

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/resizable/");
	}

	@Test
	public void testDroppablePageTitle() {
		ResizableLogic.validateResizablePageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(ResizableLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(ResizableLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(ResizableLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(ResizableLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(ResizableLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(ResizableLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(ResizableLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(ResizableLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(ResizableLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(ResizableLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(ResizableLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(ResizableLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(ResizableLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(ResizableLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(ResizableLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(ResizableLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(ResizableLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(ResizableLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(ResizableLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		ResizableLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		ResizableLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		ResizableLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		ResizableLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		ResizableLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		ResizableLogic.redirectToTabsLinkFromDemoTab();
	}
	
	@Test
	public void testRedirectToSmallHomeLink() {
		ResizableLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToRegistration() {
		ResizableLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		ResizableLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		ResizableLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		ResizableLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		ResizableLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		ResizableLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		ResizableLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		ResizableLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		ResizableLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		ResizableLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		ResizableLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		ResizableLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		ResizableLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		ResizableLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		ResizableLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		ResizableLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Tests for the divs abilities to resize
	 * tab 1
	 */
	
	@Test
	public void validCornerResizeTab1() {
		assertTrue(ResizableLogic.validCornerResizeTab1());
	}
	
	@Test
	public void validBottomResizeTab1() {
		assertTrue(ResizableLogic.validBottomResizeTab1());
	}
	
	@Test
	public void validRightResizeTab1() {
		assertTrue(ResizableLogic.validRightResizeTab1());
	}
	
	/**
	 * Tests for the divs abilities to resize
	 * tab 2
	 */
	
	@Test
	public void validCornerResizeTab2() {
		assertTrue(ResizableLogic.validCornerResizeTab1());
	}
	
	@Test
	public void validBottomResizeTab2() {
		assertTrue(ResizableLogic.validBottomResizeTab1());
	}
	
	@Test
	public void validRightResizeTab2() {
		assertTrue(ResizableLogic.validRightResizeTab2());
	}
	
	/**
	 * Tests for the divs abilities to resize
	 * tab 3
	 */
	
	@Test
	public void validRightConstrainResizeTab3() {
		assertTrue(ResizableLogic.validRightConstrainResizeTab3());
	}
	
	@Test
	public void validCornerConstrainResizeTab3() {
		assertTrue(ResizableLogic.validCornerConstrainResizeTab3());
	}
	
	@Test
	public void validBottomConstrainResizeTab3() {
		assertTrue(ResizableLogic.validBottomConstrainResizeTab3());
	}
	
	@Test
	public void validResizeStaysWithConstrianTab3() {
		assertTrue(ResizableLogic.validResizeStaysWithConstrianTab3());
	}
	
	/**
	 * Tests for the divs abilities to resize
	 * tab 4
	 */
	
	@Test
	public void validRightHelperResizeTab4() {
		assertTrue(ResizableLogic.validRightHelperResizeTab4());
	}
	
	@Test
	public void validCornerHelperResizeTab4() {
		assertTrue(ResizableLogic.validCornerHelperResizeTab4());
	}
	
	@Test
	public void validBottomHelperResizeTab4() {
		assertTrue(ResizableLogic.validBottomHelperResizeTab4());
	}
	
	/**
	 * Tests for the divs abilities to resize
	 * tab 5
	 */
	
	@Test
	public void validRightMaxMinResizeTab5() {
		assertTrue(ResizableLogic.validRightMaxMinResizeTab5());
	}
	
	@Test
	public void validCornerMaxMinResizeTab5() {
		assertTrue(ResizableLogic.validCornerMaxMinResizeTab5());
	}
	
	@Test
	public void validBottomMaxMinResizeTab5() {
		assertTrue(ResizableLogic.validBottomMaxMinResizeTab5());
	}
	
	@Test
	public void validMaxResizeTab5() {
		assertTrue(ResizableLogic.validMaxResizeTab5());
	}
	
	@Test
	public void validMinResizeTab5() {
		assertTrue(ResizableLogic.validMinResizeTab5());
	}
	
	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(ResizableLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
