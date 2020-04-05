package com.cogemnto.driver;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.beust.jcommander.Parameter;
import com.cogemnto.configurations.configurations;

public class Driver {
	public WebDriver dr;
@BeforeClass
@Parameters({"browser"})
	public void initialize(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", configurations.browserPath + "chromedriver.exe");
			dr.manage().timeouts().implicitlyWait(configurations.implicitWait, TimeUnit.SECONDS);
			dr.get(configurations.url);

		}
		dr.manage().window().maximize();
	}
}
