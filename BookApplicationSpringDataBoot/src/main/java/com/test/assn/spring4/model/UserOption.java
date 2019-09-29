package com.test.assn.spring4.model;

public enum UserOption {
	ADD_BOOK("a"),	
	DELETE_SUBJECT("b"),
	DELETE_BOOK("c"),
	SEARCH_BOOK("d"),
	SEARCH_SUBJECT("e"),
	EXIT("f");	
	
	private String option;
	
	UserOption(String option) {
		this.option = option;
	}
	
	public String getOption() {
		return option;
	}	
}
