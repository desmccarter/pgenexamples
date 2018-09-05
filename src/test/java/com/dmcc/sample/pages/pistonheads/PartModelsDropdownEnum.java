package com.dmcc.sample.pages.pistonheads;

public enum PartModelsDropdownEnum {
	SelectModel(0);

	protected String[] actualValues = {
		"Select Model"
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	PartModelsDropdownEnum(final int intVal){
		this.intVal = intVal;
	}
}
