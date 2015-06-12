package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Resizable;
import utils.Drivers;
import utils.commUtil;

public class ResizableLogic extends Resizable {
	
	/**
	 * boolean to validate the page title
	 */

	public static boolean validateResizablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Resizable | Demoqa");
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
	
	public static void redirectToSmallHomeLink() {
		smallHomeLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/") {
			boolean toSmallHomeLink = true;
			Assert.assertTrue(toSmallHomeLink);
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
	 * Logic for mouse interactions
	 * defaultFunctionalityTab (tab1)
	 */

	public static boolean validCornerResizeTab1() {
		defaultFunctionalityTab.click();
		Point location1 = cornerDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerDivClickedToResize, 300, 200).build();
		dragAndDropby.perform();
		Point location2 = cornerDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	

	public static boolean validBottomResizeTab1() {
		defaultFunctionalityTab.click();
		Point location1 = bottomDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomDivClickedToResize, 0, 300).build();
		dragAndDropby.perform();
		Point location2 = bottomDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validRightResizeTab1() {
		defaultFunctionalityTab.click();
		Point location1 = rightDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightDivClickedToResize,300,0).build();
		dragAndDropby.perform();
		Point location2 = rightDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * Animate Tab(tab2)
	 */
	
	public static boolean validCornerResizeTab2() {
		animateTab.click();
		Point location1 = cornerAnimateDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerAnimateDivClickedToResize, 300, 200).build();
		dragAndDropby.perform();
		Point location2 = cornerAnimateDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	

	public static boolean validBottomResizeTab2() {
		animateTab.click();
		Point location1 = bottomAnimateDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomAnimateDivClickedToResize, 0, 300).build();
		dragAndDropby.perform();
		Point location2 = bottomAnimateDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validRightResizeTab2() {
		animateTab.click();
		Point location1 = rightAnimateDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightAnimateDivClickedToResize,300,0).build();
		dragAndDropby.perform();
		Point location2 = rightAnimateDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * Constrain Resize Tab(tab3)
	 */
	
	public static boolean validRightConstrainResizeTab3() {
		constrainResizeAreaTab.click();
		Point location1 = rightConstrainDivClickedToResize.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightConstrainDivClickedToResize,-100,0).build();
		dragAndDropby.perform();
		Point location2 = rightConstrainDivClickedToResize.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCornerConstrainResizeTab3() {
		constrainResizeAreaTab.click();
		Point location1 = cornerConstrainDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerConstrainDivClickedToResize,-100,100).build();
		dragAndDropby.perform();
		Point location2 = cornerConstrainDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validBottomConstrainResizeTab3() {
		constrainResizeAreaTab.click();
		Point location1 = bottomConstrainDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomConstrainDivClickedToResize,-100,100).build();
		dragAndDropby.perform();
		Point location2 = bottomConstrainDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	/**
	 * check to see if once moved to outer bound of constraint div can it move further
	 */
	
	public static boolean validResizeStaysWithConstrianTab3() {
		constrainResizeAreaTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerConstrainDivClickedToResize,400,400).build();
		dragAndDropby.perform();
		Point location2 = cornerConstrainDivClickedToResize.getLocation();
		Action dragAndDropby2 = builder
				.dragAndDropBy(cornerConstrainDivClickedToResize,400,400).build();
		dragAndDropby2.perform();
		Point location3 = cornerConstrainDivClickedToResize.getLocation();
		if (location2.equals(location3)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Logic for mouse interactions
	 * Helper Tab(tab4)
	 */
	
	public static boolean validRightHelperResizeTab4() {
		helperTab.click();
		Point location1 = rightHelperDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightHelperDivClickedToResize,200,0).build();
		dragAndDropby.perform();
		Point location2 = rightHelperDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCornerHelperResizeTab4() {
		helperTab.click();
		Point location1 = cornerHelperDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerHelperDivClickedToResize,200,200).build();
		dragAndDropby.perform();
		Point location2 = cornerHelperDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validBottomHelperResizeTab4() {
		helperTab.click();
		Point location1 = bottomHelperDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomHelperDivClickedToResize,200,200).build();
		dragAndDropby.perform();
		Point location2 = bottomHelperDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	/**
	 * Logic for mouse interactions
	 * Max/Min size Tab(tab5)
	 */
	
	public static boolean validRightMaxMinResizeTab5() {
		maxMinSizeTab.click();
		Point location1 = rightMaxMinDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(rightMaxMinDivClickedToResize,200,0).build();
		dragAndDropby.perform();
		Point location2 = rightMaxMinDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validCornerMaxMinResizeTab5() {
		maxMinSizeTab.click();
		Point location1 = cornerMaxMinDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerMaxMinDivClickedToResize,200,200).build();
		dragAndDropby.perform();
		Point location2 = cornerMaxMinDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validBottomMaxMinResizeTab5() {
		maxMinSizeTab.click();
		Point location1 = bottomMaxMinDivClickedToResize.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(bottomMaxMinDivClickedToResize,0,200).build();
		dragAndDropby.perform();
		Point location2 = bottomMaxMinDivClickedToResize.getLocation();
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}
	
	public static boolean validMaxResizeTab5() {
		maxMinSizeTab.click();
		int location1x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location1y = cornerMaxMinDivClickedToResize.getLocation().getY();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerMaxMinDivClickedToResize,1000,1000).build();
		dragAndDropby.perform();
		int location2x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location2y = cornerMaxMinDivClickedToResize.getLocation().getY();
		if ((location1x + 1000)==(location2x)||(location1y + 1000)==(location2y)){
			return false;
		}
		return true;
	}
	
	public static boolean validMinResizeTab5() {
		maxMinSizeTab.click();
		int location1x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location1y = cornerMaxMinDivClickedToResize.getLocation().getY();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(cornerMaxMinDivClickedToResize,-1000,-1000).build();
		dragAndDropby.perform();
		int location2x = cornerMaxMinDivClickedToResize.getLocation().getX();
		int location2y = cornerMaxMinDivClickedToResize.getLocation().getY();
		if ((location1x - 1000)==(location2x)||(location1y - 1000)==(location2y)){
			return false;
		}
		return true;
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
}
