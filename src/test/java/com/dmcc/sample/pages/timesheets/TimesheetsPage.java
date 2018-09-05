package com.dmcc.sample.pages.timesheets;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.timesheets.TimesheetField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class TimesheetsPage extends McCarterPage{

private final String url="https://bjss.my.salesforce.com";
private final String rRoot="../pgenexamples/src/test/resources";

	public TimesheetsPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setPw(final String value) throws PageException{
		this.setValue(TimesheetField.Pw, value);
	}

	public void clickPw()throws PageException{
		this.click(TimesheetField.Pw);
	}

	public void clickLogIn()throws PageException{
		this.click(TimesheetField.LogIn);
	}

	public void setMydomain(final String value) throws PageException{
		this.setValue(TimesheetField.Mydomain, value);
	}

	public void clickMydomain()throws PageException{
		this.click(TimesheetField.Mydomain);
	}

	public void setUsername(final String value) throws PageException{
		this.setValue(TimesheetField.Username, value);
	}

	public void clickUsername()throws PageException{
		this.click(TimesheetField.Username);
	}

	public void clickRememberUn()throws PageException{
		this.click(TimesheetField.RememberUn);
	}

	public void clickSave()throws PageException{
		this.click(TimesheetField.Save);
	}

	public void clickCancel()throws PageException{
		this.click(TimesheetField.Cancel);
	}

	public void clickContinue()throws PageException{
		this.click(TimesheetField.Continue);
	}

	public void clickBack()throws PageException{
		this.click(TimesheetField.Back);
	}

	public void clickHintBackDomain()throws PageException{
		this.click(TimesheetField.HintBackDomain);
	}

}
