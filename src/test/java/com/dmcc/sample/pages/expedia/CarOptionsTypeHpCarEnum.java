package com.dmcc.sample.pages.expedia;

public enum CarOptionsTypeHpCarEnum {
	Nopreference(0),
	Economy(1),
	Compact(2),
	Midsize(3),
	Standard(4),
	Fullsize(5),
	Premium(6),
	Luxury(7);

	protected String[] actualValues = {
		"No preference",
		"Economy",
		"Compact",
		"Midsize",
		"Standard",
		"Fullsize",
		"Premium",
		"Luxury",
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	CarOptionsTypeHpCarEnum(final int intVal){
		this.intVal = intVal;
	}
}
