package tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import testsLogic.SelectableLogic;
import utils.Drivers;
import utils.commUtil;

public class SelectableTest {
	pageObjects.Selectable selectable = PageFactory.initElements(Drivers.driver,pageObjects.Selectable.class);
	static DesiredCapabilities capability = new DesiredCapabilities();

	@BeforeClass
	public static void beforeClass() throws MalformedURLException {

		 Drivers.driver = Drivers.browser("chrome");
		 commUtil.launchBrowser("http://demoqa.com/");

		//Drivers.driver = Drivers.browser("firefox");
	    //commUtil.launchBrowser("http://demoqa.com/");

	//	 Drivers.driver = Drivers.browser("internetExplorer");
	//	 commUtil.launchBrowser("http://demoqa.com/");
		 Drivers.driver.manage().window().maximize();
	}

	@Before
	public void beforeEachTest() {
		Drivers.driver.get("http://demoqa.com/selectable/");
	}

	@Test
	public void testSelectablePageTitle() {
		SelectableLogic.validateSelectablePageTitle();
	}

	/**
	 * Are the Clickable Elements Clickable Tests
	 * 
	 */

	@Test
	public void demoqaLinkIsClickable() {
		assertTrue(SelectableLogic.demoqaLinkIsClickable());
	}

	@Test
	public void HomeLinkIsClickable() {
		assertTrue(SelectableLogic.HomeLinkIsClickable());
	}

	@Test
	public void aboutUsLinkIsClickable() {
		assertTrue(SelectableLogic.aboutUsLinkIsClickable());
	}

	@Test
	public void servicesLinkIsClickable() {
		assertTrue(SelectableLogic.servicesLinkIsClickable());
	}

	@Test
	public void demoTabIsClickable() {
		assertTrue(SelectableLogic.demoTabIsClickable());
	}

	@Test
	public void blogLinkIsClickable() {
		assertTrue(SelectableLogic.blogLinkIsClickable());
	}

	@Test
	public void contactTabIsClickable() {
		assertTrue(SelectableLogic.contactTabIsClickable());
	}

	@Test
	public void draggableLinkFromDemoTabIsClickable() {
		assertTrue(SelectableLogic.draggableLinkFromDemoTabIsClickable());
	}

	@Test
	public void registrationLinkIsClickable() {
		assertTrue(SelectableLogic.registrationLinkIsClickable());
	}

	@Test
	public void draggableLinkIsClickable() {
		assertTrue(SelectableLogic.draggableLinkIsClickable());
	}

	@Test
	public void droppableLinkIsClickable() {
		assertTrue(SelectableLogic.droppableLinkIsClickable());
	}

	@Test
	public void resizableLinkIsClickable() {
		assertTrue(SelectableLogic.resizableLinkIsClickable());
	}

	@Test
	public void selectableLinkIsClickable() {
		assertTrue(SelectableLogic.selectableLinkIsClickable());
	}

	@Test
	public void sortableLinkIsClickable() {
		assertTrue(SelectableLogic.sortableLinkIsClickable());
	}

	@Test
	public void accordionWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.accordionWidgetLinkIsClickable());
	}

	@Test
	public void autoCompleteWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.autoCompleteWidgetLinkIsClickable());
	}

	@Test
	public void datepickerWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.datepickerWidgetLinkIsClickable());
	}

	@Test
	public void menuWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.menuWidgetLinkIsClickable());
	}

	@Test
	public void sliderWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.sliderWidgetLinkIsClickable());
	}

	@Test
	public void tabsWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.tabsWidgetLinkIsClickable());
	}

	@Test
	public void tooltipWidgetLinkIsClickable() {
		assertTrue(SelectableLogic.tooltipWidgetLinkIsClickable());
	}

	@Test
	public void framesAndWindowsLinkIsClickable() {
		assertTrue(SelectableLogic.framesAndWindowsLinkIsClickable());
	}

	@Test
	public void facebookLinkIsClickable() {
		assertTrue(SelectableLogic.facebookLinkIsClickable());
	}

	@Test
	public void twitterLinkIsClickable() {
		assertTrue(SelectableLogic.twitterLinkIsClickable());
	}

	@Test
	public void gplusLinkIsClickable() {
		assertTrue(SelectableLogic.gplusLinkIsClickable());
	}

	/**
	 * Do the links redirect to the correct URL Tests
	 */

	@Test
	public void testRedirectToAboutUs() {
		SelectableLogic.redirectToAboutUs();
	}

	@Test
	public void testRedirectToServices() {
		SelectableLogic.redirectToServices();
	}

	@Test
	public void testRedirectToBlog() {
		SelectableLogic.redirectToBlog();
	}

	@Test
	public void testRedirectToContactTab() {
		SelectableLogic.redirectToContactTab();
	}

	@Test
	public void testRedirectToDraggableFromDemoTab()
			throws InterruptedException {
		SelectableLogic.redirectToDraggableFromDemoTab();
	}

	@Test
	public void testRedirectToTabsLinkFromDemoTab() throws InterruptedException {
		SelectableLogic.redirectToTabsLinkFromDemoTab();
	}
	
	@Test
	public void testRedirectToSmallHomeLink() {
		SelectableLogic.redirectToSmallHomeLink();
	}

	@Test
	public void testRedirectToRegistration() {
		SelectableLogic.redirectToRegistration();
	}

	@Test
	public void testRedirectToDraggableLink() {
		SelectableLogic.redirectToDraggableLink();
	}

	@Test
	public void testRedirectToDroppableLink() {
		SelectableLogic.redirectToDroppableLink();
	}

	@Test
	public void testRedirectToResizableLink() {
		SelectableLogic.redirectToResizableLink();
	}

	@Test
	public void testRedirectToSelectableLink() {
		SelectableLogic.redirectToSelectableLink();
	}

	@Test
	public void testRedirectToSortableLink() {
		SelectableLogic.redirectToSortableLink();
	}

	@Test
	public void testRedirectToAccordionWidgetLink() {
		SelectableLogic.redirectToAccordionWidgetLink();
	}

	@Test
	public void testRedirectToAutoCompleteWidgetLink() {
		SelectableLogic.redirectToAutoCompleteWidgetLink();
	}

	@Test
	public void testRedirectToDatepickerWidgetLink() {
		SelectableLogic.redirectToDatepickerWidgetLink();
	}

	@Test
	public void testRedirectToMenuWidgetLink() {
		SelectableLogic.redirectToMenuWidgetLink();
	}

	@Test
	public void testRedirectToSliderWidgetLink() {
		SelectableLogic.redirectToSliderWidgetLink();
	}

	@Test
	public void testRedirectToTabsWidgetLink() {
		SelectableLogic.redirectToTabsWidgetLink();
	}

	@Test
	public void testRedirectToTooltipWidgetLink() {
		SelectableLogic.redirectToTooltipWidgetLink();
	}

	@Test
	public void testRedirectToFramesAndWindowsLink() {
		SelectableLogic.redirectToFramesAndWindowsLink();
	}

	@Test
	public void testRedirectToDesignerLink() {
		SelectableLogic.redirectToDesignerLink();
	}

	@Test
	public void testRedirectToGeneratorLink() {
		SelectableLogic.redirectToGeneratorLink();
	}
	
	/**
	 * Mouse interacations / selectability Tests
	 * @throws InterruptedException 
	 */
	
	@Test
	public void testValidSelectableItem1(){
		assertTrue(SelectableLogic.validSelectableItem1());
	}
	
	@Test
	public void testValidSelectableItems() throws InterruptedException {
		assertTrue(SelectableLogic.validSelectableItems());
	}
	
	@Test
	public void testValidGridSelectableItems() {
		assertTrue(SelectableLogic.validGridSelectableItems());
	}
	
	@Test
	public void testValidSerializeSelectableItems() {
		assertTrue(SelectableLogic.validSerializeSelectableItems());
	}
	
	/**
	 * Visibility Tests
	 */

	@Test
	public void aboutUsFooterIsDisplayed() {
		assertTrue(SelectableLogic.aboutUsFooterIsDisplayed());
	}

	@AfterClass
	public static void afterClass() {
		Drivers.driver.quit();
	}
}