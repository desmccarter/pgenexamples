package com.dmcc.sample.pages.lastminute;

import com.dmcc.pagegen.fields.FieldUtils;

public enum LastminuteField {
	DpSearchFrom(0),
	DpSearchTo(1),
	DpCheckIn(2),
	DpCheckOut(3),
	GoingTo(4),
	LeavingFrom(5);

	protected String[] actualValues = {
		"Dp Search From",
		"Dp Search To",
		"Dp Check In",
		"Dp Check Out",
		"Going To",
		"Leaving From",
	};

	private int intVal;

	public String toString(){
		return actualValues[intVal];
	}

	LastminuteField(final int intVal){
		this.intVal = intVal;
	}
}
