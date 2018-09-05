package com.dmcc.pgenexamples;

import com.dmcc.pagegen.page.webdriver.WebDriverUtils;

public abstract class TestAbstract {

	private final String CHROME_DRIVER_WIN32_LOCATION = "src/test/resources/webdriver/chromedriver.exe";
	
	protected void init(){
		System.setProperty("browser", "chrome");
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_WIN32_LOCATION);
	}
	
	protected void deinit(){
		WebDriverUtils.closeAllWebDrivers();
	}
	
}
