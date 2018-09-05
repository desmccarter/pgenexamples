package com.dmcc.pgenexamples.lastminute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.facebook.FacebookPage;
import com.dmcc.sample.pages.lastminute.GoingToEnum;
import com.dmcc.sample.pages.lastminute.LastminutePage;
import com.dmcc.sample.pages.lastminute.LeavingFromEnum;
import com.dmcc.sample.pages.ocado.CustomerTitleEnum;
import com.dmcc.sample.pages.ocado.OcadoPage;

public class LastMinuteTests extends TestAbstract {
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
		LastminutePage page = new LastminutePage().navigate();

		page.setLeavingFrom(LeavingFromEnum.RomeAllairportsItaly);
		page.setGoingTo(GoingToEnum.MonterotondoItaly);
	}
}
