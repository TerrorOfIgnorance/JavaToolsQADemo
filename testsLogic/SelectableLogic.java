package testsLogic;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Selectable;
import utils.Drivers;
import utils.commUtil;

public class SelectableLogic extends Selectable{
	
	/**
	 * Boolean to validate the page title
	 */

	public static boolean validateSelectablePageTitle() {
		try {
			Assert.assertEquals(Drivers.driver.getTitle(),
					"Selectable | Demoqa");
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
	 * mouse interactions 
	 * Default functionality tab1
	 * @throws InterruptedException 
	 */
	
	public static boolean validSelectableItem1()  {
		defaultFunctionalityTab.click();
		String AlphaColorOfItem1 =item1.getCssValue("color");
		System.out.println(AlphaColorOfItem1);
		item1.click();
		String OmegaColorOfItem1 =item1.getCssValue("color");
		System.out.println(OmegaColorOfItem1);
		if (AlphaColorOfItem1.equals(OmegaColorOfItem1)){
			return false;
		}
		return true;
	}
	
	public static boolean validSelectableItems() throws InterruptedException {
		defaultFunctionalityTab.click();
		String AlphaColorOfItem1 =item1.getCssValue("color");
		String AlphaColorOfItem2 =item2.getCssValue("color");
		String AlphaColorOfItem3 =item3.getCssValue("color");
		String AlphaColorOfItem4 =item4.getCssValue("color");
		String AlphaColorOfItem5 =item5.getCssValue("color");
		String AlphaColorOfItem6 =item6.getCssValue("color");
		String AlphaColorOfItem7 =item7.getCssValue("color");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.dragAndDrop(item1,item7).build();
		dragAndDrop.perform();
		Thread.sleep(2000);
		String OmegaColorOfItem1 =item1.getCssValue("color");
		String OmegaColorOfItem2 =item2.getCssValue("color");
		String OmegaColorOfItem3 =item3.getCssValue("color");
		String OmegaColorOfItem4 =item4.getCssValue("color");
		String OmegaColorOfItem5 =item5.getCssValue("color");
		String OmegaColorOfItem6 =item6.getCssValue("color");
		String OmegaColorOfItem7 =item7.getCssValue("color");
		if (AlphaColorOfItem1.equals(OmegaColorOfItem1)|| 
				AlphaColorOfItem2.equals(OmegaColorOfItem2)|| 
				AlphaColorOfItem3.equals(OmegaColorOfItem3)|| 
				AlphaColorOfItem4.equals(OmegaColorOfItem4)|| 
				AlphaColorOfItem5.equals(OmegaColorOfItem5)|| 
				AlphaColorOfItem6.equals(OmegaColorOfItem6)|| 
				AlphaColorOfItem7.equals(OmegaColorOfItem7) ) {
			return false;
		}
		return true;
	}
	
	/**
	 * mouse interactions 
	 * Display as grid tab2
	 */
	
	public static boolean validGridSelectableItems() {
		displayAsGridTab.click();
		String AlphaColorOfGrid1 =grid1.getCssValue("color");
		String AlphaColorOfGrid2 =grid2.getCssValue("color");
		String AlphaColorOfGrid3 =grid3.getCssValue("color");
		String AlphaColorOfGrid4 =grid4.getCssValue("color");
		String AlphaColorOfGrid5 =grid5.getCssValue("color");
		String AlphaColorOfGrid6 =grid6.getCssValue("color");
		String AlphaColorOfGrid7 =grid7.getCssValue("color");
		String AlphaColorOfGrid8 =grid8.getCssValue("color");
		String AlphaColorOfGrid9 =grid9.getCssValue("color");
		String AlphaColorOfGrid10 =grid10.getCssValue("color");
		String AlphaColorOfGrid11 =grid11.getCssValue("color");
		String AlphaColorOfGrid12 =grid12.getCssValue("color");
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDropby = builder
				.dragAndDropBy(grid1,500,500).build();
		dragAndDropby.perform();
		String OmegaColorOfGrid1 =grid1.getCssValue("color");
		String OmegaColorOfGrid2 =grid2.getCssValue("color");
		String OmegaColorOfGrid3 =grid3.getCssValue("color");
		String OmegaColorOfGrid4 =grid4.getCssValue("color");
		String OmegaColorOfGrid5 =grid5.getCssValue("color");
		String OmegaColorOfGrid6 =grid6.getCssValue("color");
		String OmegaColorOfGrid7 =grid7.getCssValue("color");
		String OmegaColorOfGrid8 =grid8.getCssValue("color");
		String OmegaColorOfGrid9 =grid9.getCssValue("color");
		String OmegaColorOfGrid10 =grid10.getCssValue("color");
		String OmegaColorOfGrid11 =grid11.getCssValue("color");
		String OmegaColorOfGrid12 =grid12.getCssValue("color");
		if (AlphaColorOfGrid1.equals(OmegaColorOfGrid1)|| 
				AlphaColorOfGrid2.equals(OmegaColorOfGrid2)|| 
				AlphaColorOfGrid3.equals(OmegaColorOfGrid3)|| 
				AlphaColorOfGrid4.equals(OmegaColorOfGrid4)|| 
				AlphaColorOfGrid5.equals(OmegaColorOfGrid5)|| 
				AlphaColorOfGrid6.equals(OmegaColorOfGrid6)|| 
				AlphaColorOfGrid7.equals(OmegaColorOfGrid7)|| 
				AlphaColorOfGrid8.equals(OmegaColorOfGrid8)|| 
				AlphaColorOfGrid9.equals(OmegaColorOfGrid9)|| 
				AlphaColorOfGrid10.equals(OmegaColorOfGrid10)|| 
				AlphaColorOfGrid11.equals(OmegaColorOfGrid11)|| 
				AlphaColorOfGrid12.equals(OmegaColorOfGrid12)) {
			return false;
		}
		return true;
	}
	
	/**
	 * mouse interactions 
	 * Serialize tab3
	 */

	public static boolean validSerializeSelectableItems() {
		serializeTab.click();
		Actions builder = new Actions(Drivers.driver);
		Action dragAndDrop = builder
				.dragAndDrop(serializeItem1,serializeItem6).build();
		dragAndDrop.perform();
		if(!(selectResult.getText().equals("#1#2#3#4#5#6"))){
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