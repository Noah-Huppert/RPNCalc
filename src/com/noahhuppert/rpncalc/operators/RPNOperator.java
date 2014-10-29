package com.noahhuppert.rpncalc.operators;

import com.noahhuppert.rpncalc.RPNStack;
import com.noahhuppert.rpncalc.RPNStackItem;

public abstract class RPNOperator extends RPNStackItem {
	public String mySymbol;
	public int nArguments;
	
	
	public RPNOperator(String s, int n) {
		mySymbol = s;
		nArguments = n;
	}
	
	public String toString() {
		return mySymbol;
	}
	
	public void typeError() {
		System.err.println("operator " + mySymbol + ": invalidArguments");
	}
	
	public abstract void evaluate(RPNStack stack);
}
