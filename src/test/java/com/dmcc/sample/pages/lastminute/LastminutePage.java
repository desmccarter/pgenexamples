package com.dmcc.sample.pages.lastminute;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.lastminute.LastminuteField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class LastminutePage extends McCarterPage{

private final String url="https://www.lastminute.com";
private final String rRoot="../pgenexamples/src/test/resources";

	public LastminutePage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setDpSearchFrom(final String value) throws PageException{
		this.setValue(LastminuteField.DpSearchFrom, value);
	}

	public void clickDpSearchFrom()throws PageException{
		this.click(LastminuteField.DpSearchFrom);
	}

	public void setDpSearchTo(final String value) throws PageException{
		this.setValue(LastminuteField.DpSearchTo, value);
	}

	public void clickDpSearchTo()throws PageException{
		this.click(LastminuteField.DpSearchTo);
	}

	public void setDpCheckIn(final String value) throws PageException{
		this.setValue(LastminuteField.DpCheckIn, value);
	}

	public void clickDpCheckIn()throws PageException{
		this.click(LastminuteField.DpCheckIn);
	}

	public void setDpCheckOut(final String value) throws PageException{
		this.setValue(LastminuteField.DpCheckOut, value);
	}

	public void clickDpCheckOut()throws PageException{
		this.click(LastminuteField.DpCheckOut);
	}

	public void setGoingTo(final GoingToEnum value) throws PageException{
		this.setValue(LastminuteField.GoingTo, value.toString());
	}

	public void clickGoingTo()throws PageException{
		this.click(LastminuteField.GoingTo);
	}

	public void setLeavingFrom(final LeavingFromEnum value) throws PageException{
		this.setValue(LastminuteField.LeavingFrom, value.toString());
	}

	public void clickLeavingFrom()throws PageException{
		this.click(LastminuteField.LeavingFrom);
	}

}
