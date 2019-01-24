package com.daugherty.gadgets;

import com.daugherty.math.ICalculator;
import com.daugherty.time.IWatch;

public class CalculatorWatch implements IWatch,ICalculator {

    @Override
    public long getUNIXEpochTime() {
        return  System.currentTimeMillis();
    }

    @Override
    public int calculateAdd(int numberOne, int numberTwo) {
        return numberOne+numberTwo;
    }
}
