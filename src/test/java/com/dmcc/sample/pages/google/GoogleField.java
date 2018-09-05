package com.dmcc.sample.pages.google;

import com.dmcc.pagegen.fields.FieldUtils;

public enum GoogleField {
	Q(0),
	GoogleSearch(1),
	IMFeelingLucky(2);

	private int intVal = -1;

	public String toString(){
		return FieldUtils.toString(this.name());
	}

	GoogleField(final int intVal){
		this.intVal = intVal;
	}
}
