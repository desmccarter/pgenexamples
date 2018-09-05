package com.dmcc.sample.pages.expedia;

public enum DepartingTimeHpRailEnum {
	Departat(0),
	Arriveby(1);

	protected String[] actualValues = {
		"Depart at",
		"Arrive by",
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	DepartingTimeHpRailEnum(final int intVal){
		this.intVal = intVal;
	}
}
