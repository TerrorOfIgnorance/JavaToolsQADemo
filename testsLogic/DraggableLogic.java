package testsLogic;


import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Draggable;
import utils.Drivers;
import utils.commUtil;

public class DraggableLogic extends Draggable {

	/**
	 * boolean to validate the page title
	 */

	public static boolean validateDraggablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Draggable | Demoqa");
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
	 * Default functionality tab (tab1)
	 * Mouse movement's logic to test dragging ability
	 */
	
	public static boolean validDragDivTab1() {
		defaultFunctionalityTab.click();
		Point location1 = draggableDivTab1.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(draggableDivTab1,200,100).build();
				dragAndDropby.perform();
				Point location2 = draggableDivTab1.getLocation();
				System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		} 
			return true;
	}
	
	/**
	 * Constrain movement tab (tab2)
	 * Mouse movement's logic to test dragging abilities
	 */
	
	public static boolean dragVerticleDivTab2() {
		constrainMovementTab.click();
		Point location1 = verticleDraggableDiv.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(verticleDraggableDiv,100,100).build();
				dragAndDropby.perform();
				Point location2 = verticleDraggableDiv.getLocation();
				System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		} 
        // checks if the div moved horizontally 
		// resulting in a failure of functionality
		if (location2.getX() != (location1.getX())){ 
			return false;
		}
			return true;
	}
	
	public static boolean dragHorizontalDivTab2() {
		constrainMovementTab.click();
		Point location1 = horizontalDraggableDiv.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(horizontalDraggableDiv,100,100).build();
				dragAndDropby.perform();
				Point location2 = horizontalDraggableDiv.getLocation();
				System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		} 
        // checks if the div moved vertically 
		// resulting in a failure of functionality
		if (location2.getY() != (location1.getY())){ 
			return false;
		}
			return true;
	}
	
	public static boolean dragWithinBoxDivTab2() {
		constrainMovementTab.click();
		Point location1 = withinBoxDraggableDiv.getLocation();
		System.out.println(location1 +"location 1 for stays within box div");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(withinBoxDraggableDiv,600,100).build();
				dragAndDropby.perform();
				Point location2 = withinBoxDraggableDiv.getLocation();
				System.out.println(location2 +"location 2 for stays within box div");
		if (location2.equals(location1)) {
			return false;
		}
		//if the location2 is beyond these bounds then 
		//the withinBoxDraggableDiv is being moved beyond the
		//containment box, meaning a failure of functionality
		if (location2.getX()> 815 || location2.getY()> 600){
			System.out.println("The div didn't remain in the box div");
			return false;
		}
			return true;
	}
	
	public static boolean dragWithinParentDivTab2() {
		constrainMovementTab.click();
		Point location1 = withinParentDraggableDiv.getLocation();
		System.out.println(location1 +"location 1 for withinParentDraggableDiv");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(withinParentDraggableDiv,100,100).build();
				dragAndDropby.perform();
				Point location2 = withinParentDraggableDiv.getLocation();
				System.out.println(location2 +"location 2 for withinParentDraggableDiv");
		if (location2.equals(location1)) {
			return false;
		}
		//if the location2 is beyond these bounds then 
		//the withinParentDraggableDiv is being moved beyond the
		// parent box, meaning a failure of functionality
		if (location2.getX()> 421 || location2.getY()< 544){
			System.out.println("The div didn't remain in the parent div");
			return false;
		}
			return true;
	}
	
	
	/**
	 * Cursor Style tab (tab3)
	 * Mouse movement's logic and cursor locations to test dragging abilities
	 */
	
	public static boolean validCursorTypeCrosshair(){
		cursorStyleTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.clickAndHold(left5Top5DraggableDiv).build();
				dragAndDropby.perform();
				String cursorType = left5Top5DivCrosshairCursor.getCssValue("cursor");
				System.out.println(cursorType);
				return true;
		
	}
	
	/**
	 * Events tab (tab4)
	 * Mouse movement's logic to test dragging abilities
	 */
	public static boolean dragEventDivTab4() {
		eventsTab.click();
		Point location1 = eventDraggableDiv.getLocation();
		System.out.println(location1 +"location 1 for eventDraggableDiv");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				Point location2 = eventDraggableDiv.getLocation();
				System.out.println(location2 +"location 2 for eventDraggableDiv");
		if (location2.equals(location1)) {
			return false;
		}
			return true;
	}
	
	public static boolean dragEventDivValidStartCounterTab4() {
		eventsTab.click();
		String startcount1 = startCount.getText();
		System.out.println(startcount1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				String startcount2 = startCount.getText();
				System.out.println(startcount2);
		if (startcount1.equals(startcount2)) {
			return false;
		}
			return true;
	}
	
	public static boolean dragEventDivValidStopCounterTab4() {
		eventsTab.click();
		String stopcount1 = stopCount.getText();
		System.out.println(stopcount1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				String stopcount2 = stopCount.getText();
				System.out.println(stopcount2);
		if (stopcount1.equals(stopcount2)) {
			return false;
		}
			return true;
	}
	
	public static boolean dragEventDivValidDragCounterTab4() {
		eventsTab.click();
		String dragCount1 = dragCount.getText();
		System.out.println(dragCount);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(eventDraggableDiv,200,200).build();
				dragAndDropby.perform();
				String dragCount2 = dragCount.getText();
				System.out.println(dragCount2);
		if (dragCount1.equals(dragCount2)) {
			return false;
		}
			return true;
	}
	
	/**
	 * Draggable and Sortable tab (tab5)
	 * Mouse movement's logic to test dragging abilities
	 * @throws InterruptedException 
	 */
	
	public static boolean validDragMeDownTab5() throws InterruptedException {
		DraggableAndSortableTab.click();
		Point location1 = draggableBox.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder.dragAndDropBy(draggableBox,200,400).build();
				dragAndDropby.perform();
				Thread.sleep(2000);
				Point location2 = draggableBox.getLocation();
		if (location1.equals(location2)) {
			return true;
		}
			return false;
	}
	
	public static boolean validDragItem1ToBottom() throws InterruptedException  {
		DraggableAndSortableTab.click();
		Point alphaLocationOfItem1 = item1Div.getLocation();
		System.out.println(alphaLocationOfItem1);
		Point alphaLocationOfItem5 = item5Div.getLocation();
		System.out.println(alphaLocationOfItem5);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.clickAndHold(item1Div)
				.moveByOffset(0,100)
				.release(item1Div)
				.build();
				dragAndDrop.perform();
				Thread.sleep(2000);
				Point locationOfItem1 = item1Div.getLocation();
				System.out.println(locationOfItem1);
		if (alphaLocationOfItem5.equals(locationOfItem1)) {
			return true;
		}
			return false;
	}
	
	public static boolean validDragItem5ToTop() throws InterruptedException  {
		DraggableAndSortableTab.click();
		Point alphaLocationOfItem1 = item1Div.getLocation();
		System.out.println(alphaLocationOfItem1);
		Point alphaLocationOfItem5 = item5Div.getLocation();
		System.out.println(alphaLocationOfItem5);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.clickAndHold(item5Div)
				.moveByOffset(0,-100)
				.release(item5Div)
				.build();
				dragAndDrop.perform();
				Thread.sleep(2000);
				Point locationOfItem5 = item5Div.getLocation();
				System.out.println(locationOfItem5);
		if (alphaLocationOfItem1.equals(locationOfItem5)) {
			return true;
		}
			return false;
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
