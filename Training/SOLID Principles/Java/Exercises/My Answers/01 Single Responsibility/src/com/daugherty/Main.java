package com.daugherty;

public class Main {
    public static void main(String[] args) {
        DataLoader loader = new DataLoader();
        DataFormatter formatter = new DataFormatter();
        String loadedData = loader.loadData();
        System.out.println("Loaded data:\n" + loadedData);


        String formattedData = formatter.formatData(loadedData);
        System.out.println("Formatted data:\n" + formattedData);
    }
}
