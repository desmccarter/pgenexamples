package com.dmcc.sample.pages.pistonheads;

public enum CarModelsDropdownEnum {
	SelectModel(0);

	protected String[] actualValues = {
		"Select Model"
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	CarModelsDropdownEnum(final int intVal){
		this.intVal = intVal;
	}
}
