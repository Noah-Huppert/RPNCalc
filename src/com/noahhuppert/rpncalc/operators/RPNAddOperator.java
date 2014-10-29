package com.noahhuppert.rpncalc.operators;

import com.noahhuppert.rpncalc.RPNIntegerItem;
import com.noahhuppert.rpncalc.RPNStack;
import com.noahhuppert.rpncalc.RPNStackItem;

import java.util.ArrayList;

public class RPNAddOperator extends RPNOperator {

	public RPNAddOperator() {
		super("+", 2);
	}

	public void evaluate(RPNStack stack) {
        ArrayList<Integer> items = RPNOperatorHelper.getInts(stack, nArguments);

        if(items == null){
            typeError();
            return;
        }

        stack.push(items.get(0) + items.get(1));
	}
	
}
