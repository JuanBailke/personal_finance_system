package com.zion.personal_finance_system.entities.enums;

public enum SalarySource {

	JOB(1),
	EXTERNAL_SERVICE(2),
	BONUS(3),
	OTHERS(4);
	
	private int code;
	
	private SalarySource(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static SalarySource valueOf(int code) {
		for(SalarySource value : SalarySource.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid SalarySource code");
	}
}
