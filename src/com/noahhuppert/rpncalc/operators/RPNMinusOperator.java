package com.noahhuppert.rpncalc.operators;

import com.noahhuppert.rpncalc.RPNIntegerItem;
import com.noahhuppert.rpncalc.RPNStack;
import com.noahhuppert.rpncalc.RPNStackItem;

import java.util.ArrayList;

/**
 * Created by block7 on 10/29/14.
 */
public class RPNMinusOperator extends RPNOperator{

    public RPNMinusOperator() {
        super("-", 2);
    }

    public void evaluate(RPNStack stack) {
        ArrayList<Integer> items = RPNOperatorHelper.getInts(stack, nArguments);

        if(items == null){
            typeError();
            return;
        }

        stack.push(items.get(1) - items.get(0));
    }
}
