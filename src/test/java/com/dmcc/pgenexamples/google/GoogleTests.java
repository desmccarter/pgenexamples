package com.dmcc.pgenexamples.google;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.google.GooglePage;

public class GoogleTests extends TestAbstract {
	
	@Before
	public void setup(){
		init();
	}
	
	@After
	public void teardown(){
		deinit();
	}
	
	@Test
	public void test01ImFeelingLucky() throws PageException{
		GooglePage page = new GooglePage().navigate();
		
		page.setQ("BJSS Location");
		page.clickIMFeelingLucky();
	}
	
	@Test
	public void test02Search() throws PageException{
		//GooglePage page = new GooglePage().navigate();
		
		//page.setQ("BJSS Location");
		//page.clickGoogleSearch();
	}
}
