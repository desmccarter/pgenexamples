package com.dmcc.pgenexamples.ocado;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.facebook.FacebookPage;
import com.dmcc.sample.pages.ocado.CustomerTitleEnum;
import com.dmcc.sample.pages.ocado.OcadoPage;

public class OcadoTests extends TestAbstract {
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
		page.setCustomerFirstName("FredrickD");
		page.setCustomerLastName("The Great");
		page.setCustomerLogin("myname02@hotmail.com");
		page.setCustomerPassword("mycustomerpassword");
		page.setPostcode("SE153DZ");
		page.clickCustomerRegistrationOffersFlag();
		page.clickButtonRegisterSubmit();
	}
}
