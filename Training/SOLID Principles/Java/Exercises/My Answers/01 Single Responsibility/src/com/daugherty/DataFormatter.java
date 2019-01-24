package com.daugherty;

public class DataFormatter {
    public String formatData(String unformattedData) {
        /* Formats the given data;
         in the current implementation it just replaces whitespaces " " with new lines "\n" */
        return unformattedData.replace(" ", "\n");
    }
}
