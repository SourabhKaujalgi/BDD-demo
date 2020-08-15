package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobjectdemo {
    public WebDriver driver;
    By search=(By.xpath("//input[@type='search']"));
	public Pageobjectdemo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getsearch()
	{
		 return driver.findElement(By.xpath("//input[@type='search']"));
	}
	
	
	//driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
}

		

