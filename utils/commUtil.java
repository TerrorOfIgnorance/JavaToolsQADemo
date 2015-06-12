package utils;

import java.util.concurrent.TimeUnit;

public class commUtil {
	public static boolean implicitWait(long time){
		try{
			Drivers.driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
			System.out.println("Waited for " +time+" sec implicitly.");
		}catch(Exception e){
			return false;
		}
		return true;
	}
	public static boolean launchBrowser(String url){
		try{
			Drivers.driver.get(url);
			System.out.println("Browser launched");
		}catch(Exception e){
			return false;
		}
		return true;
	}
}