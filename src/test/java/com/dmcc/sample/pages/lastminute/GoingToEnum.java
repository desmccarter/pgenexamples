package com.dmcc.sample.pages.lastminute;

public enum GoingToEnum {
	RomeItaly(0),
	PomeziaItaly(1),
	RomeUnitedStates(2),
	RomettaMareaItaly(3),
	CastelnuovodiPortoItaly(4),
	MonterotondoItaly(5),
	RomenoItaly(7),
	RomeovilleUnitedStates(8),
	RomeryFrance(9);

	protected String[] actualValues = {
		"Rome, Italy",
		"Pomezia, Italy",
		"Rome, United States",
		"Rometta Marea, Italy",
		"Castelnuovo di Porto, Italy",
		"Monterotondo, Italy",
		"Romeno, Italy",
		"Romeoville, United States",
		"Romery, France",
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	GoingToEnum(final int intVal){
		this.intVal = intVal;
	}
}
