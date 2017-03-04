package in.selenium.openbrowsers;


import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFox1 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.FireFox.driver","\\C:\\seleniuutrainingbyjitendra\\downloads\\Selenium Downloads");
		
		FirefoxDriver firefoxdriver1=new FirefoxDriver();
		
		firefoxdriver1.get("http://www.newtours.demoaut.com/");
	}
}


