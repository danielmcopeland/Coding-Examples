package com.daugherty.gadgets;

import com.daugherty.math.ICalculator;
import com.daugherty.time.IWatch;

public class CalculatorWatch implements ICalculator, IWatch {


    @Override
    public int calculateAdd(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public long getUNIXEpochTime() {
        return System.currentTimeMillis();
    }
}
