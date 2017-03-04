package in.selenium.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{
	public static void main(String[] args)
	{
		//1.Open Browser
		System.setProperty("webdriver.chrome.driver","C:\\seleniuutrainingbyjitendra\\downloads\\Selenium Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver chromedriver=new ChromeDriver();
		
		//2.Open URL
		chromedriver.get("http://www.newtours.demoaut.com/");
	}
}
