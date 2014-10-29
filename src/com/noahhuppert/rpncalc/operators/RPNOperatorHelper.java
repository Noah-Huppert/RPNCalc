package com.noahhuppert.rpncalc.operators;

import com.noahhuppert.rpncalc.RPNIntegerItem;
import com.noahhuppert.rpncalc.RPNStack;
import com.noahhuppert.rpncalc.RPNStackItem;

import java.util.ArrayList;

/**
 * Created by block7 on 10/29/14.
 */
public class RPNOperatorHelper {
    public static ArrayList<Integer> getInts(RPNStack stack, int ammountOfItems){
        ArrayList<RPNStackItem> items = new ArrayList<RPNStackItem>();
        ArrayList<Integer> ints = new ArrayList<Integer>();

        int i = 0;
        for(;i < ammountOfItems; i++){
            items.add(stack.pop());
        }

        if(i != ammountOfItems){
            return null;
        }

        for(RPNStackItem item : items){
            if(!(item instanceof RPNIntegerItem)){
                return null;
            } else{
                ints.add(((RPNIntegerItem) item).myInt);
            }
        }

        return ints;
    }
}
