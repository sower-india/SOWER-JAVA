package com.sower.rdbms.constants;

public enum RDBMSConstants {
	
	FALSE(Boolean.FALSE),
	TRUE(Boolean.TRUE),
	NA("N/A")
	;
	
	
	private String constant;
	private boolean bValue;
	private RDBMSConstants(boolean  value) {
		this.bValue=value;
	}
	private RDBMSConstants(String constant) {
		this.constant=constant;
	}
	public String getStringValue(){
		return this.constant.toUpperCase();
	}

	public boolean getBooleanValue(){
		return this.bValue;
	}
}
