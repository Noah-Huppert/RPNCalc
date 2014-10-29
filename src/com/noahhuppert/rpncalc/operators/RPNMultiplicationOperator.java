package com.noahhuppert.rpncalc.operators;

import com.noahhuppert.rpncalc.RPNStack;

import java.util.ArrayList;

/**
 * Created by block7 on 10/29/14.
 */
public class RPNMultiplicationOperator extends RPNOperator {
    public RPNMultiplicationOperator(){
        super("*", 2);
    }

    public void evaluate(RPNStack stack) {
        ArrayList<Integer> items = RPNOperatorHelper.getInts(stack, nArguments);

        if(items == null){
            typeError();
            return;
        }

        stack.push(items.get(0) * items.get(1));
    }
}
