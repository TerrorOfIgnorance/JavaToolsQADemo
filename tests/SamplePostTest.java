package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SamplePostLogic;
import utils.Drivers;
import utils.commUtil;

public class SamplePostTest {
	pageObjects.SamplePost samplePost = PageFactory.initElements(
			Drivers.driver, pageObjects.SamplePost.class);
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
		Drivers.driver.get("http://demoqa.com/sample-post/");
	}

	@Test
	public void testSamplePostPageTitle() {
		SamplePostLogic.validateSamplePostPageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(SamplePostLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(SamplePostLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(SamplePostLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(SamplePostLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(SamplePostLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(SamplePostLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(SamplePostLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(SamplePostLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(SamplePostLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(SamplePostLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(SamplePostLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		SamplePostLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		SamplePostLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		SamplePostLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		SamplePostLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		SamplePostLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		SamplePostLogic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToDesignerLink() {
		SamplePostLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		SamplePostLogic.redirectToGeneratorLink();
	}

	@Test
	public void testRedirectToUncategorizedLink() {
		SamplePostLogic.redirectToUncategorizedLink();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		SamplePostLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToSamplePostDateLink() {
		SamplePostLogic.redirectToSamplePostDateLink();
	}

	@Test
	public void testRedirectToAdminLink() {
		SamplePostLogic.redirectToAdminLink();
	}

	@Test
	public void testRedirectToPermalinkLink() {
		SamplePostLogic.redirectToPermalinkLink();
	}

	@Test
	public void testRedirectToNextPostLink() {
		SamplePostLogic.redirectToNextPostLink();
	}

	@Test
	public void testRedirectToAvatarImageLink() {
		SamplePostLogic.redirectToAvatarImageLink();
	}

	@Test
	public void testRedirectToArticlesWrittenByPosterLink() {
		SamplePostLogic.redirectToArticlesWrittenByPosterLink();
	}

	/**
	 * Tests for the like it button and its counter
	 */
	
	@Test
	public void likeItButtonChanged() {
		SamplePostLogic.likeItButtonChanged();
	}

	/**
	 * Tests for comment validation
	 */

	@Test
	public void errorPageDisplayedWhenEmailNull() {
		SamplePostLogic.errorPageDisplayedWhenEmailNull();
	}

	@Test
	public void errorPageDisplayedWhenNameNull() {
		SamplePostLogic.errorPageDisplayedWhenNameNull();
	}

	@Test
	public void errorPageDisplayedWhenNameEmailNull() {
		SamplePostLogic.errorPageDisplayedWhenNameEmailNull();
	}

	@Test
	public void errorPageDisplayedCommentsNull() {
		SamplePostLogic.errorPageDisplayedCommentsNull();
	}

	@Test
	public void validCommentPosted() throws Exception {
		SamplePostLogic.validCommentPosted();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(SamplePostLogic.aboutUsFooterIsDisplayed());
	}

	@Test
	public void postParagraphIsDisplayed() {
		assertTrue(SamplePostLogic.postParagraphIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}

}
