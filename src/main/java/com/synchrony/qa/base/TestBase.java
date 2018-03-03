package com.synchrony.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.synchrony.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try{
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:/Users/USER/workspace/SynchronyBank/src/main/java/com/synchrony/"
					+ "qa/config/config.properties");
			prop.load(ip);	
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static void initalization(){
		String browserName =prop.getProperty("browser");
		 if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\backup dell\\learning\\Selenium\\chromedriver.exe");
			driver= new ChromeDriver();
		 }
		/*if (browserName.equals("IE")) {
			System.setProperty("Webdriver.ie.driver", "D:\\backup dell\\learning\\SeleniumIEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}*/
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:/backup dell/learning/Selenium/geckodriver");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	
}
