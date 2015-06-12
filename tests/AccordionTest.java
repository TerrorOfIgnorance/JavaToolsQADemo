package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.AccordionLogic;
import utils.Drivers;
import utils.commUtil;

public class AccordionTest {
	
	pageObjects.Accordion accordion = PageFactory.initElements(Drivers.driver,pageObjects.Accordion.class);
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
		Drivers.driver.get("http://demoqa.com/accordion/");
	}

	@Test
	public void testAccordionPageTitle() {
		AccordionLogic.validateAccordionPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(AccordionLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(AccordionLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(AccordionLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(AccordionLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(AccordionLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(AccordionLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(AccordionLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(AccordionLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(AccordionLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(AccordionLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(AccordionLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(AccordionLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(AccordionLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(AccordionLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(AccordionLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(AccordionLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(AccordionLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(AccordionLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(AccordionLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		AccordionLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		AccordionLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		AccordionLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		AccordionLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		AccordionLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		AccordionLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		AccordionLogic.redirectToSmallHomeLink();
	}
	
	@Test
	public void testRedirectToRegistration() {
		AccordionLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		AccordionLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		AccordionLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		AccordionLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		AccordionLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		AccordionLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		AccordionLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		AccordionLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		AccordionLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		AccordionLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		AccordionLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		AccordionLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		AccordionLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		AccordionLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		AccordionLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		AccordionLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Tests for whether paragraphs are displayed when tabs are clicked
	 * tab1
	 */
	
	@Test
	public void section1DisplaysParagraph() {
		assertTrue(AccordionLogic.section1DisplaysParagraph());
	}

	@Test
	public void section2DisplaysParagraph() {
		assertTrue(AccordionLogic.section2DisplaysParagraph());
	}
	
	@Test
	public void section3DisplaysParagraph() {
		assertTrue(AccordionLogic.section3DisplaysParagraph());
	}
	
	@Test
	public void section4DisplaysParagraph() {
		assertTrue(AccordionLogic.section4DisplaysParagraph());
	}
	
	/**
	 * Tests for whether paragraphs are displayed when tabs are clicked
	 * tab2
	 */
	
	@Test
	public void section1DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section1DisplaysParagraphTab2());
	}

	@Test
	public void section2DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section2DisplaysParagraphTab2());
	}
	
	@Test
	public void section3DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section3DisplaysParagraphTab2());
	}
	
	@Test
	public void section4DisplaysParagraphTab2() {
		assertTrue(AccordionLogic.section4DisplaysParagraphTab2());
	}
	
	@Test
	public void toggleButtonDisplaysArrowsTab2() throws InterruptedException {
		assertTrue(AccordionLogic.toggleButtonDisplaysArrowsTab2());
	}
	

	/**
	 * Tests for whether paragraphs are displayed when tabs are clicked
	 * tab3
	 */
	
	@Test
	public void section1DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section1DisplaysParagraphTab3());
	}

	@Test
	public void section2DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section2DisplaysParagraphTab3());
	}
	
	@Test
	public void section3DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section3DisplaysParagraphTab3());
	}
	
	@Test
	public void section4DisplaysParagraphTab3() {
		assertTrue(AccordionLogic.section4DisplaysParagraphTab3());
	}
	
	
	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(AccordionLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}