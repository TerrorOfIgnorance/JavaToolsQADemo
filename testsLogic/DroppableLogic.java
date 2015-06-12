package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Droppable;
import utils.Drivers;
import utils.commUtil;

public class DroppableLogic extends Droppable {

	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateDroppablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(), "Droppable | Demoqa");
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

	public static void redirectToSmallHomeLink() {
		smallHomeLink.click();
		if (Drivers.driver.getCurrentUrl() == "http://demoqa.com/") {
			boolean toSmallHomeLink = true;
			Assert.assertTrue(toSmallHomeLink);
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
	 * Default functionality tab (tab1) Mouse movement's logic to test dropping
	 * ability
	 */

	public static boolean validDragDivTab1() {
		defaultFunctionalityTab.click();
		Point location1 = tab1DraggableBox.getLocation();
		System.out.println(location1);
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(tab1DraggableBox, 300, 100).build();
		dragAndDropby.perform();
		Point location2 = tab1DraggableBox.getLocation();
		System.out.println(location2);
		if (location2.equals(location1)) {
			return false;
		}
		return true;
	}

	public static boolean validDropDivResponseTab1() {
		defaultFunctionalityTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab1DraggableBox,
				tab1DroppableBox).build();
		dragAndDrop.perform();
		if (droppableBoxMessage.getText().equals("Dropped!")) {
			return true;
		}
		return false;
	}

	/**
	 * Accept tab (tab2) Mouse movement's logic to test dropping ability
	 */

	public static boolean validDragNonValidToAccept() {
		acceptTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab2DraggableNonValidBox,
				tab2DroppableAcceptBox).build();
		dragAndDrop.perform();
		if (tab2DroppableAcceptBox.getText().equals(
				"accept: ‘#draggableaccept’")) {
			return true;
		}
		return false;
	}

	public static boolean validDraggableAcceptBoxToDroppableAccept() {
		acceptTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab2DraggableAcceptBox,
				tab2DroppableAcceptBox).build();
		dragAndDrop.perform();
		if (tab2DroppableAcceptBox.getText().equals("Dropped!")) {
			return true;
		}
		return false;
	}

	/**
	 * Prevent Propagation tab (tab3) Mouse movement's logic to test dropping
	 * ability
	 */

	public static boolean validTab3DraggableBoxToOuterBox1() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3OuterDroppableBox1).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Dropped!")
				&& tab3InnerDroppableBox1Message.getText().equals(
						"Inner droppable (not greedy)")
				&& tab3OuterDroppableBox2Message.getText().equals(
						"Outer droppable")
				&& tab3InnerDroppableBox2Message.getText().equals(
						"Inner droppable (greedy)")) {
			return true;
		}
		return false;
	}

	public static boolean validTab3DraggableBoxToInnerBox1() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3InnerDroppableBox1).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Dropped!")
				&& tab3InnerDroppableBox1Message.getText().equals("Dropped!")
				&& tab3OuterDroppableBox2Message.getText().equals(
						"Outer droppable")
				&& tab3InnerDroppableBox2Message.getText().equals(
						"Inner droppable (greedy)")) {
			return true;
		}
		return false;
	}

	public static boolean validTab3DraggableBoxToOuterBox2() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3OuterDroppableBox2).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Outer droppable")
				&& tab3InnerDroppableBox1Message.getText().equals(
						"Inner droppable (not greedy)")
				&& tab3OuterDroppableBox2Message.getText().equals("Dropped!")
				&& tab3InnerDroppableBox2Message.getText().equals(
						"Inner droppable (greedy)")) {
			return true;
		}
		return false;
	}

	public static boolean validTab3DraggableBoxToInnerBox2() {
		preventPropagationTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab3DraggableBox,
				tab3InnerDroppableBox2).build();
		dragAndDrop.perform();
		if (tab3OuterDroppableBox1Message.getText().equals("Outer droppable")
				&& tab3InnerDroppableBox1Message.getText().equals(
						"Inner droppable (not greedy)")
				&& tab3OuterDroppableBox2Message.getText().equals(
						"Outer droppable")
				&& tab3InnerDroppableBox2Message.getText().equals("Dropped!")) {
			return true;
		}
		return false;
	}

	/**
	 * Revert draggable position tab (tab4) Mouse movement's logic to test
	 * dropping and reverting abilities
	 * 
	 * @throws InterruptedException
	 */

	public static boolean draggableBoxRevertsAndMessageChanges()
			throws InterruptedException {
		revertDraggableTab.click();
		Point location1 = tab4DraggableRevertBox.getLocation();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(tab4DraggableRevertBox,
				tab4DroppableBox).build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		Point location2 = tab4DraggableRevertBox.getLocation();
		if (tab4DroppableBoxMessage.getText().equals("Dropped!")
				&& location1.equals(location2)) {
			return true;
		}
		return false;
	}

	public static boolean draggableBoxRevertsToDroppableBoxAndMessageChanges()
			throws InterruptedException {
		revertDraggableTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder.dragAndDrop(
				tab4DraggableRevertNotDroppedBox, tab4DroppableBox).build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		Point locationx = tab4DraggableRevertNotDroppedBox.getLocation();
		Action dragAndDrop2 = builder.dragAndDropBy(
				tab4DraggableRevertNotDroppedBox, 200, 200).build();
		dragAndDrop2.perform();
		Thread.sleep(2000);
		Point locationy = tab4DraggableRevertNotDroppedBox.getLocation();
		if (tab4DroppableBoxMessage.getText().equals("Dropped!")
				&& locationy.equals(locationx)) {
			return true;
		}
		return false;
	}

	/**
	 * Shopping Cart demo tab (tab5) Mouse movement's logic to test dropping
	 * abilities
	 * 
	 * @throws InterruptedException
	 * 
	 */

	public static boolean draggingItemsToCart() throws InterruptedException {
		shoppingCartDemoTab.click();
		tShirtsTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropItem1 = builder.dragAndDrop(cheezeburgerShirtItem,droppableCartDiv).build();
				dragAndDropItem1.perform();
				Thread.sleep(1000);
				bagsTab.click();
		Action dragAndDropItem2 = builder.dragAndDrop(zebraStripedBagItem,droppableCartDiv).build();
				dragAndDropItem2.perform();
				Thread.sleep(1000);
		Action dragAndDropItem4 = builder.dragAndDrop(alligatorLeatherItem,droppableCartDiv).build();
				dragAndDropItem4.perform();
				Thread.sleep(1000);
				gadgetsTab.click();
		Action dragAndDropItem3 = builder.dragAndDrop(iPodItem,droppableCartDiv).build();
				dragAndDropItem3.perform();
				Thread.sleep(3000);				
		if (firstItemInCart.getText().equals("Zebra Striped")
				&&
				secondItemInCart.getText().equals("Alligator Leather")
				) {
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