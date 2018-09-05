package com.dmcc.sample.pages.facebook;

import com.dmcc.pagegen.fields.FieldUtils;

public enum FacebookField {
	Email(0),
	Pass(1),
	LogIn(2),
	Firstname(3),
	Lastname(4),
	RegEmail(5),
	RegEmailConfirmation(6),
	RegSecondContactpoint(7),
	RegPasswd(8),
	Sex(9),
	Remove(10),
	SignUp(11),
	U0J(12),
	Websubmit(13),
	U016(14);

	private int intVal = -1;

	public String toString(){
		return FieldUtils.toString(this.name());
	}

	FacebookField(final int intVal){
		this.intVal = intVal;
	}
}
