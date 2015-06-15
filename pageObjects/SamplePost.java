package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The page object for the Sample Post page
 * Implemented locating through xpath only when no other means applied.
 * @author jPayne
 */

public class SamplePost {
	/**
	 * Sample Post page headers links and paragraphs
	 */
	@FindBy(css = "a[href*='http://demoqa.com/category/uncategorized/']")
	protected static WebElement uncategorizedLink;
	
	@FindBy(xpath = ".//*[@id='breadcrumbs']/li[1]/a")
	protected static WebElement smallHomeLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/header/div/span[1]/a/time")
	protected static WebElement samplePostDateLink;
	
	@FindBy(xpath = ".//*[@id='post-377']/header/div/span[2]/span/a")
	protected static WebElement adminLink;
	
	@FindBy(className = "entry-content")
	protected static WebElement postParagraph;
	
	@FindBy(css = "a[rel='bookmark']")
	protected static WebElement permalinkLink;
	
	@FindBy(xpath = ".//*[@id='main']/p[1]")
	protected static WebElement likeTheArticleButton;
	
	@FindBy(className = "ipt_kb_like_article_info pull-right text-info")
	protected static WebElement numberOfPeopleWhoLiked;
	
	@FindBy(css = "a[rel='next']")
	protected static WebElement toNextPostLink;
	
	@FindBy(xpath = ".//*[@id='main']/div[1]/div[1]/a/img")
	protected static WebElement avatarImageLink;
	
	@FindBy(xpath = ".//*[@id='main']/div[1]/h4/a")
	protected static WebElement toArticlesWrittenByPosterLink;
	
	@FindBy(id = "author")
	protected static WebElement nameInputField;
	
	@FindBy(id = "email")
	protected static WebElement emailInputField;
	
	@FindBy(id = "url")
	protected static WebElement urlInputField;
	
	@FindBy(id = "comment")
	protected static WebElement commentInputField;
	
	@FindBy(id = "submit")
	protected static WebElement postCommentButton;
	
	/**
	 * Top menu links and tabs MAIN MENU
	 */
	
	@FindBy(className = "site-anchor")
	protected static WebElement demoqaLink;

	@FindBy(css = "a[href*='http://demoqa.com/']")
	protected static WebElement HomeLink;

	@FindBy(css = "a[href*='http://demoqa.com/about-us/']")
	protected static WebElement aboutUsLink;

	@FindBy(css = "a[href*='http://demoqa.com/services/']")
	protected static WebElement servicesLink;

	@FindBy(className = "dropdown-toggle")
	protected static WebElement demoTab;

	@FindBy(css = "a[href*='http://demoqa.com/blog/']")
	protected static WebElement blogLink;

	@FindBy(css = "a[href*='http://demoqa.com/contact/']")
	protected static WebElement contactTab;

	/**
	 *  The two options from the demo dropdown
	 */

	@FindBy(xpath = ".//*[@id='menu-item-73']/a")
	protected static WebElement draggableLinkFromDemoTab;

	@FindBy(xpath = ".//*[@id='menu-item-153']/a")
	protected static WebElement tabsLinkFromDemoTab;
	
	/**
	 * Social networking links
	 */

	@FindBy(className = "facebook")
	protected static WebElement facebookLink;

	@FindBy(className = "twitter")
	protected static WebElement twitterLink;

	@FindBy(className = "gplus")
	protected static WebElement gplusLink;

	/**
	 *  The about box footer at bottom of page
	 */

	@FindBy(id = "footer-widget-1")
	protected static WebElement aboutUsFooter;

	/**
	 * The designer and generator links at bottom of page
	 */

	@FindBy(css = "a[href*='http://toolsqa.com/']")
	protected static WebElement designerLink;

	@FindBy(css = "a[href*='http://oneiricindia.com/']")
	protected static WebElement generatorLink;
}


