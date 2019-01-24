package com.daugherty;

public class Main {
    public static void main(String[] args) {
        DataLoaderAndFormatter loaderAndFormatter = new DataLoaderAndFormatter();
        String loadedData = loaderAndFormatter.loadData();
        System.out.println("Loaded data:\n" + loadedData);

        String formattedData = loaderAndFormatter.formatData(loadedData);
        System.out.println("Formatted data:\n" + formattedData);
    }
}
