package com.dmcc.sample.pages.ocado;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.ocado.OcadoField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class OcadoPage extends McCarterPage{

private final String url="https://www.ocado.com/webshop/quickReg.do";
private final String rRoot="../pgenexamples/src/test/resources";

	public OcadoPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setEntry(final String value) throws PageException{
		this.setValue(OcadoField.Entry, value);
	}

	public void clickEntry()throws PageException{
		this.click(OcadoField.Entry);
	}

	public void clickCustomerRegistrationOffersFlag()throws PageException{
		this.click(OcadoField.CustomerRegistrationOffersFlag);
	}

	public void setCustomerFirstName(final String value) throws PageException{
		this.setValue(OcadoField.CustomerFirstName, value);
	}

	public void clickCustomerFirstName()throws PageException{
		this.click(OcadoField.CustomerFirstName);
	}

	public void setCustomerLastName(final String value) throws PageException{
		this.setValue(OcadoField.CustomerLastName, value);
	}

	public void clickCustomerLastName()throws PageException{
		this.click(OcadoField.CustomerLastName);
	}

	public void setCustomerLogin(final String value) throws PageException{
		this.setValue(OcadoField.CustomerLogin, value);
	}

	public void clickCustomerLogin()throws PageException{
		this.click(OcadoField.CustomerLogin);
	}

	public void setCustomerPassword(final String value) throws PageException{
		this.setValue(OcadoField.CustomerPassword, value);
	}

	public void clickCustomerPassword()throws PageException{
		this.click(OcadoField.CustomerPassword);
	}

	public void setPostcode(final String value) throws PageException{
		this.setValue(OcadoField.Postcode, value);
	}

	public void clickPostcode()throws PageException{
		this.click(OcadoField.Postcode);
	}

	public void clickSearch()throws PageException{
		this.click(OcadoField.Search);
	}

	public void clickRegisterUsingPayPal()throws PageException{
		this.click(OcadoField.RegisterUsingPayPal);
	}

	public void clickRegister()throws PageException{
		this.click(OcadoField.Register);
	}

	public void clickMultiSearchLink()throws PageException{
		this.click(OcadoField.MultiSearchLink);
	}

	public void clickButtonRegisterSubmit()throws PageException{
		this.click(OcadoField.ButtonRegisterSubmit);
	}

	public void setCustomerTitle(final CustomerTitleEnum value) throws PageException{
		this.setValue(OcadoField.CustomerTitle, value.toString());
	}

	public void clickCustomerTitle()throws PageException{
		this.click(OcadoField.CustomerTitle);
	}

}
