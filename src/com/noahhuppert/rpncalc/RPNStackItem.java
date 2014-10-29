package com.noahhuppert.rpncalc;

public abstract class RPNStackItem {
	public RPNStackItem next;
	public String myString;
	
	public RPNStackItem() {
	}
	
	public RPNStackItem(String s) {
		myString = s;
	}
	
	public String toString() {
		return myString;
	}
}
