package com.daugherty;

public class Main {

    public static void main(String[] args) {
        DataLoader loader = new DataLoader();
        String loadedData = loader.loadData();
        System.out.println("Loaded data:\n" + loadedData);

        DataFormatter formatter = new DataFormatter();
        String formattedData = formatter.formatData(loadedData);
        System.out.println("Formatted data:\n" + formattedData);
    }
}
