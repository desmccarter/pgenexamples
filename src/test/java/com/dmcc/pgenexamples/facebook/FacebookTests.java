package com.dmcc.pgenexamples.facebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.ocado.CustomerTitleEnum;
import com.dmcc.sample.pages.ocado.OcadoPage;

public class FacebookTests extends TestAbstract {
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
		OcadoPage page = new OcadoPage().navigate();
		
		page.setCustomerTitle(CustomerTitleEnum.Dr);
		page.setCustomerFirstName("Fredrick");
		page.setCustomerLastName("The Great");
		page.setCustomerLogin("myname01@hotmail.com");
		page.setCustomerPassword("mycustomerpassword");
		page.setPostcode("SE153DZ");
		page.clickCustomerRegistrationOffersFlag();
		page.clickButtonRegisterSubmit();
	}
}
