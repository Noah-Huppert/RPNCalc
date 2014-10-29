package com.noahhuppert.rpncalc;

import com.noahhuppert.rpncalc.operators.RPNOperator;

import java.util.ArrayList;

public class RPNStack {
	RPNStackItem top;  // points to first item in stack
	
	ArrayList<RPNOperator> operators;   // list of registered operators
	
	// CONSTRUCTOR
	public RPNStack() {
		operators = new ArrayList<RPNOperator>();
	}
	
	// UTILITY METHODS
	RPNOperator lookupOperator(String opString) {
		for (RPNOperator op: operators) {
			if (opString.equals(op.mySymbol))
				return op;
		}
		return null;
	}
	
	public void print() {
		for (RPNStackItem i = top; i != null; i = i.next)
			System.out.println(i);
	}
	
	public void registerOperator(RPNOperator op) {
		if (lookupOperator(op.mySymbol) != null) {
			System.err.println("Duplicate operator: " + op.mySymbol);
		} else {
			operators.add(op);
		}
	}

	
	// PUSH OPERATIONS; different types supported
	public void push(RPNStackItem item) {
		if (item instanceof RPNOperator) {
			push(((RPNOperator) item).mySymbol);
		} else {
			item.next = top;
			top = item;
		}
	}
	
	public void push(String token) {
		int iValue;	
		RPNOperator opValue;
		try {
			iValue = Integer.parseInt(token);
			RPNIntegerItem intItem = new RPNIntegerItem(iValue);
			push(intItem);
		} catch (NumberFormatException notAnInt) {
			if ((opValue = lookupOperator(token)) != null) {
				opValue.evaluate(this);
			} else {
				System.err.println("Ignoring unknown token: " + token);
			}
		}
				
	}
	
	public void push(int i) {
		push(new RPNIntegerItem(i));
	}
	
	// POP METHOD
	public RPNStackItem pop() {
		if (top == null) {
			System.err.println("pop: empty stack error.");
			return null;
		}
		RPNStackItem oldTop = top;
		top = top.next;
		return oldTop;
	}
	

}
