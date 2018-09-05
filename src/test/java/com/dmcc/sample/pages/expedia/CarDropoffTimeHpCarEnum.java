package com.dmcc.sample.pages.expedia;

public enum CarDropoffTimeHpCarEnum {
	VALUE_OF_0000(0),
	VALUE_OF_0015(1),
	VALUE_OF_0030(2),
	VALUE_OF_0045(3),
	VALUE_OF_0100(4),
	VALUE_OF_0115(5),
	VALUE_OF_0130(6),
	VALUE_OF_0145(7),
	VALUE_OF_0200(8),
	VALUE_OF_0215(9),
	VALUE_OF_0230(10),
	VALUE_OF_0245(11),
	VALUE_OF_0300(12),
	VALUE_OF_0315(13),
	VALUE_OF_0330(14),
	VALUE_OF_0345(15),
	VALUE_OF_0400(16),
	VALUE_OF_0415(17),
	VALUE_OF_0430(18),
	VALUE_OF_0445(19),
	VALUE_OF_0500(20),
	VALUE_OF_0515(21),
	VALUE_OF_0530(22),
	VALUE_OF_0545(23),
	VALUE_OF_0600(24),
	VALUE_OF_0615(25),
	VALUE_OF_0630(26),
	VALUE_OF_0645(27),
	VALUE_OF_0700(28),
	VALUE_OF_0715(29),
	VALUE_OF_0730(30),
	VALUE_OF_0745(31),
	VALUE_OF_0800(32),
	VALUE_OF_0815(33),
	VALUE_OF_0830(34),
	VALUE_OF_0845(35),
	VALUE_OF_0900(36),
	VALUE_OF_0915(37),
	VALUE_OF_0930(38),
	VALUE_OF_0945(39),
	VALUE_OF_1000(40),
	VALUE_OF_1015(41),
	VALUE_OF_1030(42),
	VALUE_OF_1045(43),
	VALUE_OF_1100(44),
	VALUE_OF_1115(45),
	VALUE_OF_1130(46),
	VALUE_OF_1145(47),
	VALUE_OF_1200(48),
	VALUE_OF_1215(49),
	VALUE_OF_1230(50),
	VALUE_OF_1245(51),
	VALUE_OF_1300(52),
	VALUE_OF_1315(53),
	VALUE_OF_1330(54),
	VALUE_OF_1345(55),
	VALUE_OF_1400(56),
	VALUE_OF_1415(57),
	VALUE_OF_1430(58),
	VALUE_OF_1445(59),
	VALUE_OF_1500(60),
	VALUE_OF_1515(61),
	VALUE_OF_1530(62),
	VALUE_OF_1545(63),
	VALUE_OF_1600(64),
	VALUE_OF_1615(65),
	VALUE_OF_1630(66),
	VALUE_OF_1645(67),
	VALUE_OF_1700(68),
	VALUE_OF_1715(69),
	VALUE_OF_1730(70),
	VALUE_OF_1745(71),
	VALUE_OF_1800(72),
	VALUE_OF_1815(73),
	VALUE_OF_1830(74),
	VALUE_OF_1845(75),
	VALUE_OF_1900(76),
	VALUE_OF_1915(77),
	VALUE_OF_1930(78),
	VALUE_OF_1945(79),
	VALUE_OF_2000(80),
	VALUE_OF_2015(81),
	VALUE_OF_2030(82),
	VALUE_OF_2045(83),
	VALUE_OF_2100(84),
	VALUE_OF_2115(85),
	VALUE_OF_2130(86),
	VALUE_OF_2145(87),
	VALUE_OF_2200(88),
	VALUE_OF_2215(89),
	VALUE_OF_2230(90),
	VALUE_OF_2245(91),
	VALUE_OF_2300(92),
	VALUE_OF_2315(93),
	VALUE_OF_2330(94),
	VALUE_OF_2345(95);

	protected String[] actualValues = {
		"00:00",
		"00:15",
		"00:30",
		"00:45",
		"01:00",
		"01:15",
		"01:30",
		"01:45",
		"02:00",
		"02:15",
		"02:30",
		"02:45",
		"03:00",
		"03:15",
		"03:30",
		"03:45",
		"04:00",
		"04:15",
		"04:30",
		"04:45",
		"05:00",
		"05:15",
		"05:30",
		"05:45",
		"06:00",
		"06:15",
		"06:30",
		"06:45",
		"07:00",
		"07:15",
		"07:30",
		"07:45",
		"08:00",
		"08:15",
		"08:30",
		"08:45",
		"09:00",
		"09:15",
		"09:30",
		"09:45",
		"10:00",
		"10:15",
		"10:30",
		"10:45",
		"11:00",
		"11:15",
		"11:30",
		"11:45",
		"12:00",
		"12:15",
		"12:30",
		"12:45",
		"13:00",
		"13:15",
		"13:30",
		"13:45",
		"14:00",
		"14:15",
		"14:30",
		"14:45",
		"15:00",
		"15:15",
		"15:30",
		"15:45",
		"16:00",
		"16:15",
		"16:30",
		"16:45",
		"17:00",
		"17:15",
		"17:30",
		"17:45",
		"18:00",
		"18:15",
		"18:30",
		"18:45",
		"19:00",
		"19:15",
		"19:30",
		"19:45",
		"20:00",
		"20:15",
		"20:30",
		"20:45",
		"21:00",
		"21:15",
		"21:30",
		"21:45",
		"22:00",
		"22:15",
		"22:30",
		"22:45",
		"23:00",
		"23:15",
		"23:30",
		"23:45",
	};

	private int intVal = -1;

	public String toString(){
		return actualValues[intVal];
	}

	CarDropoffTimeHpCarEnum(final int intVal){
		this.intVal = intVal;
	}
}
