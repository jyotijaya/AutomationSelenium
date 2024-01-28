package com.intra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void TC_01()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Babul\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.out.println("Launching Browser");
		WebDriver driver=new ChromeDriver();
		System.out.println("Quit browser");
		driver.quit();
	}
	
	
}
