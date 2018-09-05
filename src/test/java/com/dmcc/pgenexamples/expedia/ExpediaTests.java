package com.dmcc.pgenexamples.expedia;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.pgenexamples.TestAbstract;
import com.dmcc.sample.pages.expedia.ExpediaPage;
import com.dmcc.sample.pages.expedia.PackageRoomsHpPackageEnum;
import com.dmcc.sample.pages.facebook.FacebookPage;
import com.dmcc.sample.pages.ocado.CustomerTitleEnum;
import com.dmcc.sample.pages.ocado.OcadoPage;

public class ExpediaTests extends TestAbstract {
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
		ExpediaPage page = new ExpediaPage().navigate();
		
		page.setPackageOriginHpPackage("London, England, UK (LHR-Heathrow)");
		page.setPackageDestinationHpPackage("Rome City Centre, Rome, Italy");
		page.setPackageDepartingHpPackage("14/08/2018");
		page.setPackageReturningHpPackage("31/08/2018");
		page.setPackageRoomsHpPackage(PackageRoomsHpPackageEnum.VALUE_OF_3);
	}
}
