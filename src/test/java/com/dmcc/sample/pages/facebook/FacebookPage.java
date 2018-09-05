package com.dmcc.sample.pages.facebook;

import com.dmcc.pagegen.exceptions.PageException;
import com.dmcc.sample.pages.facebook.FacebookField;
import com.dmcc.pagegen.page.mccarterp.McCarterPage;

public class FacebookPage extends McCarterPage{

private final String url="https://www.facebook.com";
private final String rRoot="../pgenexamples/src/test/resources";

	public FacebookPage navigate()throws PageException {
		this.setResourcesRoot(rRoot);
		this.navigate(url);
		return this;
	}

	public void setEmail(final String value) throws PageException{
		this.setValue(FacebookField.Email, value);
	}

	public void clickEmail()throws PageException{
		this.click(FacebookField.Email);
	}

	public void setPass(final String value) throws PageException{
		this.setValue(FacebookField.Pass, value);
	}

	public void clickPass()throws PageException{
		this.click(FacebookField.Pass);
	}

	public void clickLogIn()throws PageException{
		this.click(FacebookField.LogIn);
	}

	public void setFirstname(final String value) throws PageException{
		this.setValue(FacebookField.Firstname, value);
	}

	public void clickFirstname()throws PageException{
		this.click(FacebookField.Firstname);
	}

	public void setLastname(final String value) throws PageException{
		this.setValue(FacebookField.Lastname, value);
	}

	public void clickLastname()throws PageException{
		this.click(FacebookField.Lastname);
	}

	public void setRegEmail(final String value) throws PageException{
		this.setValue(FacebookField.RegEmail, value);
	}

	public void clickRegEmail()throws PageException{
		this.click(FacebookField.RegEmail);
	}

	public void setRegEmailConfirmation(final String value) throws PageException{
		this.setValue(FacebookField.RegEmailConfirmation, value);
	}

	public void clickRegEmailConfirmation()throws PageException{
		this.click(FacebookField.RegEmailConfirmation);
	}

	public void setRegSecondContactpoint(final String value) throws PageException{
		this.setValue(FacebookField.RegSecondContactpoint, value);
	}

	public void clickRegSecondContactpoint()throws PageException{
		this.click(FacebookField.RegSecondContactpoint);
	}

	public void setRegPasswd(final String value) throws PageException{
		this.setValue(FacebookField.RegPasswd, value);
	}

	public void clickRegPasswd()throws PageException{
		this.click(FacebookField.RegPasswd);
	}

	public void clickSex()throws PageException{
		this.click(FacebookField.Sex);
	}

	public void clickRemove()throws PageException{
		this.click(FacebookField.Remove);
	}

	public void clickSignUp()throws PageException{
		this.click(FacebookField.SignUp);
	}

	public void clickU0J()throws PageException{
		this.click(FacebookField.U0J);
	}

	public void clickWebsubmit()throws PageException{
		this.click(FacebookField.Websubmit);
	}

	public void clickU016()throws PageException{
		this.click(FacebookField.U016);
	}

}
