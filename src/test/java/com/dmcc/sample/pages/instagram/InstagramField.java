package com.dmcc.sample.pages.instagram;

import com.dmcc.pagegen.fields.FieldUtils;

public enum InstagramField {
	EmailOrPhone(0),
	FullName(1),
	Username(2),
	Password(3),
	Next(4),
	OptionValueAfAfrikaansOptionOptionValueCsETinaOptionOptionValueDaDanskOptionOptionValueDeDeutschOptionOptionValueElOptionOptionValueEnEnglishOptionOptionValueEsEspaOlEspaAOptionOptionValueEsLaEspaOlOptionOptionValueFiSuomiOptionOptionValueFrFranAisOptionOptionValueIdBahasaIndonesiaOptionOptionValueItItalianoOptionOptionValueJaOptionOptionValueKoOptionOptionValueMsBahasaMelayuOptionOptionValueNbNorskOptionOptionValueNlNederlandsOptionOptionValuePlPolskiOptionOptionValuePtBrPortuguSBrasilOptionOptionValuePtPortuguSPortugalOptionOptionValueRuOptionOptionValueSvSvenskaOptionOptionValueThOptionOptionValueTlFilipinoOptionOptionValueTrTRkEOptionOptionValueZhCnOptionOptionValueZhTwOptionOptionValueBnOptionOptionValueGuOptionOptionValueHiOptionOptionValueHrHrvatskiOptionOptionValueHuMagyarOptionOptionValueKnOptionOptionValueMlOptionOptionValueMrOptionOptionValueNeOptionOptionValuePaOptionOptionValueSiOptionOptionValueSkSlovenInaOptionOptionValueTaOptionOptionValueTeOptionOptionValueViTiNgViTOptionOptionValueZhHkOptionOptionValueBgOptionOptionValueFrCaFranAisCanadaOptionOptionValueRoRomNOptionOptionValueSrOptionOptionValueUkOption(5),
	CookiesPolicy(6),
	Terms(7),
	DataPolicy(8),
	LogIn(9),
	AboutUs(10),
	Support(11),
	Press(12),
	API(13),
	Jobs(14),
	Privacy(15),
	Directory(16),
	Profiles(17),
	Hashtags(18);

	protected String[] actualValues = {
		"Email Or Phone",
		"Full Name",
		"Username",
		"Password",
		"Next",
		" Option Value AfAfrikaans Option Option Value Cs E Tina Option Option Value DaDansk Option Option Value DeDeutsch Option Option Value El Option Option Value EnEnglish Option Option Value EsEspa Ol Espa A Option Option Value Es LaEspa Ol Option Option Value FiSuomi Option Option Value FrFran Ais Option Option Value IdBahasa Indonesia Option Option Value ItItaliano Option Option Value Ja Option Option Value Ko Option Option Value MsBahasa Melayu Option Option Value NbNorsk Option Option Value NlNederlands Option Option Value PlPolski Option Option Value Pt BrPortugu S Brasil Option Option Value PtPortugu S Portugal Option Option Value Ru Option Option Value SvSvenska Option Option Value Th Option Option Value TlFilipino Option Option Value TrT Rk E Option Option Value Zh Cn Option Option Value Zh Tw Option Option Value Bn Option Option Value Gu Option Option Value Hi Option Option Value HrHrvatski Option Option Value HuMagyar Option Option Value Kn Option Option Value Ml Option Option Value Mr Option Option Value Ne Option Option Value Pa Option Option Value Si Option Option Value SkSloven Ina Option Option Value Ta Option Option Value Te Option Option Value ViTi Ng Vi T Option Option Value Zh Hk Option Option Value Bg Option Option Value Fr CaFran Ais Canada Option Option Value RoRom N Option Option Value Sr Option Option Value Uk Option",
		"Cookies Policy",
		"Terms",
		"Data Policy",
		"Log In",
		"About Us",
		"Support",
		"Press",
		"API",
		"Jobs",
		"Privacy",
		"Directory",
		"Profiles",
		"Hashtags",
	};

	private int intVal;

	public String toString(){
		return actualValues[intVal];
	}

	InstagramField(final int intVal){
		this.intVal = intVal;
	}
}
