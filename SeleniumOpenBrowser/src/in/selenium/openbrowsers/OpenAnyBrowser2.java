package in.selenium.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class OpenAnyBrowser2 
{
	
	public static WebDriver openBrowser(String bn)
	{
		if(bn.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.FireFox.driver",".\\AllBrowsers\\gecodriver.exe");
		
			FirefoxDriver firefoxdriver1=new FirefoxDriver();
		
			firefoxdriver1.get("http://www.newtours.demoaut.com/");
			return firefoxdriver1;
		}
		else if(bn.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\seleniuutrainingbyjitendra\\downloads\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		
			ChromeDriver chromedriver=new ChromeDriver();
		
			Options o=chromedriver.manage();
			
			Window w=o.window();
			w.maximize();
			return chromedriver;
			//chromedriver.manage().window().maximize;
			
			
		}
	
		else
		{	
			System.setProperty("phantomjs.binarypath","\\C:\\seleniuutrainingbyjitendra\\downloads\\Jan 24th Download\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	
			PhantomJSDriver driver=new PhantomJSDriver();
		}	
		return null;
	
}	
}

