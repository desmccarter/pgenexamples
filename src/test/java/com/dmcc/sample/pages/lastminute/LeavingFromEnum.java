package com.dmcc.sample.pages.lastminute;

public enum LeavingFromEnum {
	RomeAllairportsItaly(0),
	RomeFCOFiumicinoItaly(1),
	RomeCIACiampinoItaly(2),
	RomeXRJItaly(3),
	RomeTiburtinaIRTItaly(4);

	protected String[] actualValues = {
		"Rome All airports, Italy",
		"Rome (FCO) Fiumicino, Italy",
		"Rome (CIA) Ciampino, Italy",
		"Rome (XRJ) , Italy",
		"Rome Tiburtina (IRT) , Italy",
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	LeavingFromEnum(final int intVal){
		this.intVal = intVal;
	}
}
