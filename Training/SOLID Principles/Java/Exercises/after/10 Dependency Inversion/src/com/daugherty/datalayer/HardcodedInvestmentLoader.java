package com.daugherty.datalayer;

import com.daugherty.model.Investment;

public class HardcodedInvestmentLoader implements IInvestmentLoader {

    public Investment[] getAllInvestments() {
        // Returns a hardcoded list of possible investments (other implementations may connect to databases for the same purpose)
        return new Investment[] {
                new Investment("Risky business", 100, 200),
                new Investment("Startup", 50, 175),
                new Investment("Savings account", 1, 2),
                new Investment("Stocks account", 8, 7),
                new Investment("High-frequency trading", 40, 20)
        };
    }

}
