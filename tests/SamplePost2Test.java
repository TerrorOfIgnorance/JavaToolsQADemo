package tests;

import static org.junit.Assert.*;
import java.net.MalformedURLException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import testsLogic.SamplePost2Logic;
import utils.Drivers;
import utils.commUtil;

public class SamplePost2Test {

	pageObjects.SamplePost2 samplePost2 = PageFactory.initElements(
			Drivers.driver, pageObjects.SamplePost2.class);
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
		Drivers.driver.get("http://demoqa.com/sample-post2/");
	}

	@Test
	public void testSamplePost2PageTitle() {
		SamplePost2Logic.validateSamplePost2PageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(SamplePost2Logic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(SamplePost2Logic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(SamplePost2Logic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(SamplePost2Logic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(SamplePost2Logic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(SamplePost2Logic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(SamplePost2Logic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(SamplePost2Logic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(SamplePost2Logic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(SamplePost2Logic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(SamplePost2Logic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		SamplePost2Logic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		SamplePost2Logic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		SamplePost2Logic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		SamplePost2Logic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		SamplePost2Logic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		SamplePost2Logic.redirectToTabsLinkFromDemoTab();
	}

	@Test
	public void testRedirectToDesignerLink() {
		SamplePost2Logic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		SamplePost2Logic.redirectToGeneratorLink();
	}

	@Test
	public void testRedirectToUncategorizedLink() {
		SamplePost2Logic.redirectToUncategorizedLink();
	}

	@Test
	public void testRedirectToSmallHomeLink() {
		SamplePost2Logic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToSamplePost2DateLink() {
		SamplePost2Logic.redirectToSamplePost2DateLink();
	}

	@Test
	public void testRedirectToAdminLink() {
		SamplePost2Logic.redirectToAdminLink();
	}

	@Test
	public void testRedirectToPermalinkLink() {
		SamplePost2Logic.redirectToPermalinkLink();
	}

	@Test
	public void testRedirectToPreviousPostLink() {
		SamplePost2Logic.redirectToPreviousPostLink();
	}

	@Test
	public void testRedirectToAvatarImageLink() {
		SamplePost2Logic.redirectToAvatarImageLink();
	}

	@Test
	public void testRedirectToArticlesWrittenByPosterLink() {
		SamplePost2Logic.redirectToArticlesWrittenByPosterLink();
	}

	/**
	 * Tests for the like it button and its counter
	 */
	@Test
	public void likeItButtonChanged() {
		SamplePost2Logic.likeItButtonChanged();
	}

	/**
	 * Tests for comment validation
	 */

	@Test
	public void errorPageDisplayedWhenEmailNull() {
		SamplePost2Logic.errorPageDisplayedWhenEmailNull();
	}

	@Test
	public void errorPageDisplayedWhenNameNull() {
		SamplePost2Logic.errorPageDisplayedWhenNameNull();
	}

	@Test
	public void errorPageDisplayedWhenNameEmailNull() {
		SamplePost2Logic.errorPageDisplayedWhenNameEmailNull();
	}

	@Test
	public void errorPageDisplayedCommentsNull() {
		SamplePost2Logic.errorPageDisplayedCommentsNull();
	}

	@Test
	public void validCommentPosted() throws Exception {
		SamplePost2Logic.validCommentPosted();
	}

	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(SamplePost2Logic.aboutUsFooterIsDisplayed());
	}

	@Test
	public void postParagraphIsDisplayed() {
		assertTrue(SamplePost2Logic.postParagraphIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}

}
