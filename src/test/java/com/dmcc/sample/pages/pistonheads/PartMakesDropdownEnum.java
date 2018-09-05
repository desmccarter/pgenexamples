package com.dmcc.sample.pages.pistonheads;

public enum PartMakesDropdownEnum {
	SelectMake(0);

	protected String[] actualValues = {
		"Select Make"
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	PartMakesDropdownEnum(final int intVal){
		this.intVal = intVal;
	}
}
