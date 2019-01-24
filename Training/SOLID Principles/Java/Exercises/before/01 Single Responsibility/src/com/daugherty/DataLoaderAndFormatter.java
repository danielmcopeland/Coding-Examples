package com.daugherty;

public class DataLoaderAndFormatter {

    public String loadData() {
        /* Code that gets the original data;
         in the current implementation, it always returns the same String of data */
        return "-Washington:1789 -Adams:1797 -Jefferson:1801";
    }

    public String formatData(String unformattedData) {
        /* Formats the given data;
         in the current implementation it just replaces whitespaces " " with new lines "\n" */
        return unformattedData.replace(" ", "\n");
    }
}
