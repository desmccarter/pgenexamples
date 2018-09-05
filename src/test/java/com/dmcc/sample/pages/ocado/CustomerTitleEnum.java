package com.dmcc.sample.pages.ocado;

public enum CustomerTitleEnum {
	Mrs(0),
	Miss(1),
	Ms(2),
	Mr(3),
	Mx(4),
	Dr(5);

	protected String[] actualValues = {
		"Mrs",
		"Miss",
		"Ms",
		"Mr",
		"Mx",
		"Dr",
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	CustomerTitleEnum(final int intVal){
		this.intVal = intVal;
	}
}
