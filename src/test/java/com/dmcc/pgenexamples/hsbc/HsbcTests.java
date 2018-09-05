package com.dmcc.pgenexamples.hsbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.hsbc.HsbcPage;


public class HsbcTests extends TestAbstract {
	@Before
	public void setup(){
		init();
	}
	
	@After
	public void teardown(){
		deinit();
	}
	
	@Test
	public void test01RegisterForOnlineBanking() throws PageException{
		HsbcPage page = new HsbcPage().navigate();
		
		page.clickLogOn();
		page.clickRegisterForOnlineBanking();
		page.clickContinueBtn2();
	}
}
