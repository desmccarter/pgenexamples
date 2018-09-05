package com.dmcc.sample.pages.ocado;

import com.dmcc.pagegen.fields.FieldUtils;

public enum OcadoField {
	Entry(0),
	CustomerRegistrationOffersFlag(1),
	CustomerFirstName(2),
	CustomerLastName(3),
	CustomerLogin(4),
	CustomerPassword(5),
	Postcode(6),
	Search(7),
	RegisterUsingPayPal(8),
	Register(9),
	MultiSearchLink(10),
	ButtonRegisterSubmit(11),
	CustomerTitle(12);

	private int intVal = -1;

	public String toString(){
		return FieldUtils.toString(this.name());
	}

	OcadoField(final int intVal){
		this.intVal = intVal;
	}
}
