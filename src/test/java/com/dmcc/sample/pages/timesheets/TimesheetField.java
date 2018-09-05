package com.dmcc.sample.pages.timesheets;

import com.dmcc.pagegen.fields.FieldUtils;

public enum TimesheetField {
	Pw(0),
	LogIn(1),
	Mydomain(2),
	Username(3),
	RememberUn(4),
	Save(5),
	Cancel(6),
	Continue(7),
	Back(8),
	HintBackDomain(9);

	private int intVal = -1;

	public String toString(){
		return FieldUtils.toString(this.name());
	}

	TimesheetField(final int intVal){
		this.intVal = intVal;
	}
}
