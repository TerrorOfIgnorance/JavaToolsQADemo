package utils;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Drivers {
	
	private static final String HUB = "http://mdci01:4444/wd/hub";
	public static WebDriver driver = null;
	private static String[] drivers = {"chrome","firefox","internetExplorer"};
	static DesiredCapabilities capability = new DesiredCapabilities();
	public static WebDriver browser (String browser){
		try {
			if(browser.equalsIgnoreCase("internetExplorer")){
				System.setProperty("webdriver.ie.driver","C:\\Users\\jpayne\\Desktop\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				
			}
			if(browser == drivers[0]){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\jpayne\\Desktop\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}
			else{
				capability.setBrowserName("firefox");
				driver = new RemoteWebDriver(new URL(HUB), capability);
			}			
		}catch (Exception e){
			return null;
		}
		return driver;
	}
}
