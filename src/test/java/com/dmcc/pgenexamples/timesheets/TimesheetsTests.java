package com.dmcc.pgenexamples.timesheets;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.facebook.FacebookPage;
import com.dmcc.sample.pages.timesheets.TimesheetsPage;

public class TimesheetsTests extends TestAbstract {
	@Before
	public void setup(){
		init();
	}
	
	@After
	public void teardown(){
		deinit();
	}
	
	@Test
	public void test01() throws PageException{
		TimesheetsPage page = new TimesheetsPage().navigate();
		
		page.setUsername("des.mccarter@bjss.com");
		page.setPw("Y3sterdaysnews");
		page.clickContinue();
	}
	
}
