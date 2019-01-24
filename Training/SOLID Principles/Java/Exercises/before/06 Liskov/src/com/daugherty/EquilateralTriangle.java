package com.daugherty;

public class EquilateralTriangle extends Triangle {

    @Override
    public int getPerimeter() {
        return 3 * this.sideOneLength;
    }

}
