package com.dmcc.sample.pages.pistonheads;

public enum BikeModelsDropdownEnum {
	SelectModel(0);

	protected String[] actualValues = {
		"Select Model"
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	BikeModelsDropdownEnum(final int intVal){
		this.intVal = intVal;
	}
}
