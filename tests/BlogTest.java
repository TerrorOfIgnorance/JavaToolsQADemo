package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.BlogLogic;
import utils.Drivers;
import utils.commUtil;

public class BlogTest {
	
	pageObjects.Blog blog = PageFactory.initElements(Drivers.driver, pageObjects.Blog.class);
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
		Drivers.driver.get("http://demoqa.com/blog/");
	}
	@Test
	public void testBlogPageTitle() {
		BlogLogic.validateBlogPageTitle();
	}
	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(BlogLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(BlogLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(BlogLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(BlogLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(BlogLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(BlogLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(BlogLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(BlogLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(BlogLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(BlogLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(BlogLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(BlogLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(BlogLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(BlogLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(BlogLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(BlogLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(BlogLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(BlogLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(BlogLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(BlogLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(BlogLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(BlogLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(BlogLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(BlogLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(BlogLogic.gplusLinkIsClickable());
	}
	
	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		BlogLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		BlogLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		BlogLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		BlogLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab() throws InterruptedException {
		BlogLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		BlogLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToRegistration() {
		BlogLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		BlogLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		BlogLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		BlogLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		BlogLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		BlogLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		BlogLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		BlogLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		BlogLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		BlogLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		BlogLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		BlogLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		BlogLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		BlogLogic.redirectToFramesAndWindowsLink();
	}
	@Test
	public void testRedirectToDesignerLink() {
		BlogLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		BlogLogic.redirectToGeneratorLink();
	}
	/**
	 * Blog page specific redirect Tests
	 */
	
	@Test
	public void testRedirectToSmallLowerHomeLink() {
		BlogLogic.redirectToSmallLowerHomeLink();
	}
	
	@Test
	public void testRedirectToSamplePost2HeaderLink() {
		BlogLogic.redirectToSamplePost2HeaderLink();
	}
	
	@Test
	public void testRedirectToSamplePost2DateLink() {
		BlogLogic.redirectToSamplePost2DateLink();
	}
	
	@Test
	public void testRedirectToSamplePost2ImageLink() {
		BlogLogic.redirectToSamplePost2ImageLink();
	}
	
	@Test
	public void testRedirectToSamplePost2ReadMoreButton() {
		BlogLogic.redirectToSamplePost2ReadMoreButton();
	}
	
	@Test
	public void testRedirectToSamplePostHeaderLink() {
		BlogLogic.redirectToSamplePostHeaderLink();
	}
	
	@Test
	public void testRedirectToSamplePostDateLink() {
		BlogLogic.redirectToSamplePostDateLink();
	}
	
	@Test
	public void testRedirectToSamplePostImageLink() {
		BlogLogic.redirectToSamplePostImageLink();
	}
	
	@Test
	public void testRedirectToSamplePostReadMoreButton() {
		BlogLogic.redirectToSamplePostReadMoreButton();
	}
	
	/** 
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(BlogLogic.aboutUsFooterIsDisplayed());
	}
	
	@Test
	public void samplePost2ParagraphIsDisplayed() {
		assertTrue(BlogLogic.samplePost2ParagraphIsDisplayed());
	}
	
	@Test
	public void samplePostParagraphIsDisplayed() {
		assertTrue(BlogLogic.samplePostParagraphIsDisplayed());
	}
	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}
