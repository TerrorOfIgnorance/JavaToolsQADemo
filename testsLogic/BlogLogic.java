package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Blog;
import utils.Drivers;
import utils.commUtil;

public class BlogLogic extends Blog{
	
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateBlogPageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Blog | Demoqa | Just another WordPress site");
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	/**
	 * Booleans for all Clickable elements, Check if clickable
	 */

	public static boolean demoqaLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(demoqaLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean HomeLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(HomeLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean aboutUsLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(aboutUsLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean servicesLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(servicesLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean demoTabIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(demoTab);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean blogLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(blogLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean contactTabIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(contactTab);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean draggableLinkFromDemoTabIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(draggableLinkFromDemoTab);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean registrationLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(registrationLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean draggableLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(draggableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean droppableLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(droppableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean resizableLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(resizableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean selectableLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(selectableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean sortableLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(sortableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean accordionWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(accordionWidgetLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean autoCompleteWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(autoCompleteWidgetLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean datepickerWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(datepickerWidgetLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean menuWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(menuWidgetLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean sliderWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(sliderWidgetLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tabsWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(sortableLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean tooltipWidgetLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(tooltipWidgetLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean framesAndWindowsLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(framesAndWindowsLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean facebookLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(facebookLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean twitterLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(twitterLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean gplusLinkIsClickable() {
		try {
			ExpectedConditions.elementToBeClickable(gplusLink);
			commUtil.implicitWait(5);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/**
	 * Methods for redirecting to new urls
	 */

	public static void redirectToAboutUs() {
		aboutUsLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/about-us/") {
			boolean toAboutUs = true;
			Assert.assertTrue(toAboutUs);
		}
	}

	public static void redirectToServices() {
		servicesLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/services/") {
			boolean toServices = true;
			Assert.assertTrue(toServices);
		}
	}

	public static void redirectToBlog() {
		blogLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/blog/") {
			boolean toblogLink = true;
			Assert.assertTrue(toblogLink);
		}
	}

	public static void redirectToContactTab() {
		contactTab.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/contact/") {
			boolean toContactTab = true;
			Assert.assertTrue(toContactTab);
		}
	}

	public static void redirectToDraggableFromDemoTab()
			throws InterruptedException {
		demoTab.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(draggableLinkFromDemoTab));
		element.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/draggable/") {
			boolean toDraggableFromDemoTab = true;
			Assert.assertTrue(toDraggableFromDemoTab);
		}
	}

	public static void redirectToTabsLinkFromDemoTab()
			throws InterruptedException {
		demoTab.click();
		WebDriverWait wait = new WebDriverWait(Drivers.driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(tabsLinkFromDemoTab));
		element.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/tabs/") {
			boolean toTabsFromDemoTab = true;
			Assert.assertTrue(toTabsFromDemoTab);
		}
	}

	public static void redirectToRegistration() {
		registrationLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/registration/") {
			boolean toRegistrationLink = true;
			Assert.assertTrue(toRegistrationLink);
		}
	}

	public static void redirectToDraggableLink() {
		draggableLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/draggable/") {
			boolean toDraggableLink = true;
			Assert.assertTrue(toDraggableLink);
		}
	}

	public static void redirectToDroppableLink() {
		droppableLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/droppable/") {
			boolean toDroppableLink = true;
			Assert.assertTrue(toDroppableLink);
		}
	}

	public static void redirectToResizableLink() {
		resizableLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/resizable/") {
			boolean toResizableLink = true;
			Assert.assertTrue(toResizableLink);
		}
	}

	public static void redirectToSelectableLink() {
		selectableLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/selectable/") {
			boolean toSelectableLink = true;
			Assert.assertTrue(toSelectableLink);
		}
	}

	public static void redirectToSortableLink() {
		sortableLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sortable/") {
			boolean toSortableLink = true;
			Assert.assertTrue(toSortableLink);
		}
	}

	public static void redirectToAccordionWidgetLink() {
		accordionWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/accordion/") {
			boolean toAccordionWidgetLink = true;
			Assert.assertTrue(toAccordionWidgetLink);
		}
	}

	public static void redirectToAutoCompleteWidgetLink() {
		autoCompleteWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/autocomplete/") {
			boolean toAutoCompleteWidgetLink = true;
			Assert.assertTrue(toAutoCompleteWidgetLink);
		}
	}

	public static void redirectToDatepickerWidgetLink() {
		datepickerWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/datepicker/") {
			boolean toDatepickerWidgetLink = true;
			Assert.assertTrue(toDatepickerWidgetLink);
		}
	}

	public static void redirectToMenuWidgetLink() {
		menuWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/menu/") {
			boolean toMenuWidgetLink = true;
			Assert.assertTrue(toMenuWidgetLink);
		}
	}

	public static void redirectToSliderWidgetLink() {
		sliderWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/slider/") {
			boolean toSliderWidgetLink = true;
			Assert.assertTrue(toSliderWidgetLink);
		}
	}

	public static void redirectToTabsWidgetLink() {
		tabsWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/slider/") {
			boolean toTabsWidgetLink = true;
			Assert.assertTrue(toTabsWidgetLink);
		}
	}

	public static void redirectToTooltipWidgetLink() {
		tooltipWidgetLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/tooltip/") {
			boolean toTooltipWidgetLink = true;
			Assert.assertTrue(toTooltipWidgetLink);
		}
	}

	public static void redirectToFramesAndWindowsLink() {
		framesAndWindowsLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/frames-and-windows/") {
			boolean toFramesAndWindowsLink = true;
			Assert.assertTrue(toFramesAndWindowsLink);
		}
	}

	public static void redirectToDesignerLink() {
		designerLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://www.toolsqa.com/") {
			boolean toDesignerLink = true;
			Assert.assertTrue(toDesignerLink);
		}
	}

	public static void redirectToGeneratorLink() {
		generatorLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://oneiricindia.com/") {
			boolean toGeneratorLink = true;
			Assert.assertTrue(toGeneratorLink);
		}
	}
	
	
	/**
	 * Blog specific Url redirects
	 */
	
	
	public static void redirectToSmallLowerHomeLink() {
		smallLowerHomeLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/") {
			boolean toSmallLowerHomeLink = true;
			Assert.assertTrue(toSmallLowerHomeLink);
		}
	}
	public static void redirectToSamplePost2HeaderLink() {
		samplePost2HeaderLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2HeaderLink = true;
			Assert.assertTrue(toSamplePost2HeaderLink);
		}
	}
	public static void redirectToSamplePost2DateLink() {
		samplePost2DateLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2DateLink = true;
			Assert.assertTrue(toSamplePost2DateLink);
		}
	}
	public static void redirectToSamplePost2ImageLink() {
		samplePost2ImageLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2ImageLink = true;
			Assert.assertTrue(toSamplePost2ImageLink);
		}
	}
	
	public static void redirectToSamplePost2ReadMoreButton() {
		samplePost2ReadMoreButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post2/") {
			boolean toSamplePost2ReadMoreButton = true;
			Assert.assertTrue(toSamplePost2ReadMoreButton);
		}
	}
	
	public static void redirectToSamplePostHeaderLink() {
		samplePostHeaderLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostHeaderLink = true;
			Assert.assertTrue(toSamplePostHeaderLink);
		}
	}
	
	public static void redirectToSamplePostDateLink() {
		samplePostDateLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostDateLink = true;
			Assert.assertTrue(toSamplePostDateLink);
		}
	}
	
	public static void redirectToSamplePostImageLink() {
		samplePostImageLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostImageLink = true;
			Assert.assertTrue(toSamplePostImageLink);
		}
	}
	

	public static void redirectToSamplePostReadMoreButton() {
		samplePostReadMoreButton.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/sample-post/") {
			boolean toSamplePostReadMoreButton = true;
			Assert.assertTrue(toSamplePostReadMoreButton);
		}
	}
	
	
	
	
	
	
	/**
	 * Visibility booleans
	 */

	public static boolean aboutUsFooterIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(aboutUsFooter);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean samplePost2ParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(samplePost2Paragraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	public static boolean samplePostParagraphIsDisplayed() {
		try {
			ExpectedConditions.visibilityOf(samplePostParagraph);
			commUtil.implicitWait(10);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
