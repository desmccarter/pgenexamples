package com.dmcc.sample.pages.pistonheads;

public enum BikeMakesDropdownEnum {
	SelectMake(0);

	protected String[] actualValues = {
		"Select Make"
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	BikeMakesDropdownEnum(final int intVal){
		this.intVal = intVal;
	}
}
