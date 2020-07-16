package com.MQTest;

public class TestDto {

	private String str;
	
	public TestDto() {str = "아무것도 안담김";}
	
	public TestDto(String _str) {str = _str;}
	
	public String getStr() {
		return str;
	}
	
	public void setStr(String _str){
		str = _str;
	}
}
