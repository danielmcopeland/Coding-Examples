package com.daugherty;

public class Main {

    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        String loadedData = dataLoader.loadData();
        System.out.println("Data loaded: " + loadedData);
    }
}
