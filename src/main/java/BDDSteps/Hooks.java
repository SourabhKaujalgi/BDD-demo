package BDDSteps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before()
	public void beforevalidation()
	{
		
		System.out.println("This is before smoke test");
	}
	
	@After()
	public void Aftervalidation()
	{
		System.out.println("This is after smoke test");
		
	}
	
	@Before("@Seleniumtest")
	public void OpeningBrowser() throws IOException
	{
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/Global.properties");
		prop = new Properties();
		prop.load(fs);
		System.setProperty("webdriver.chrome.driver","C:\\workspace1\\BDD\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
	}
	
	@After("@Seleniumtest")
	public void Teardown()
	{
		driver.close();
		
	}
	

}