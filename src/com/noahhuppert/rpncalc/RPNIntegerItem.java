package com.noahhuppert.rpncalc;

public class RPNIntegerItem extends RPNStackItem {
	  public int myInt;
	  
	  RPNIntegerItem(int i) {
		  myInt = i;
	  }
	  
	  public String toString() {
		  return String.valueOf(myInt);
	  }
}
