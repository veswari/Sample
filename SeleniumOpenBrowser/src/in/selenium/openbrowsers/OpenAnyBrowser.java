package in.selenium.openbrowsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAnyBrowser 
{
	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream(".\\Config\\Config.properties");
		Properties p=new Properties();
		p.load(fis);
		//Scanner sc=new Scanner(System.in);
		System.out.printf("Please enter browser name");
		String browserName=p.getProperty("browserName");
		
		WebDriver driver1=OpenAnyBrowser2.openBrowser(browserName);
		driver1.get("http://www.newtours.demoaut.com/");
		//OpenAnyBrowser2.openBrowser(browserName);
		//Navigation n=driver.navigate();
		//Other way to go the link
		
		driver1.navigate().to("http://www.newtours.demoaut.com/");
				
	}	
	
}