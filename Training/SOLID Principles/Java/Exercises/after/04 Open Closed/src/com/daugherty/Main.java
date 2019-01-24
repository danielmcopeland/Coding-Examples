package com.daugherty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task firstTask = new Task("Master the Open-Closed principle");
        Task secondTask = new Task("Learn HTML");
        Task thirdTask = new Task("Go have fun");

        Task[] arrayOfTasks = new Task[] {firstTask, secondTask, thirdTask};

        // TaskList is now abstract, so it cannot be directly instantiated
        // TaskList myTaskList = new TaskList(Arrays.asList(arrayOfTasks));

        TaskList fifoTaskList = new FIFOTaskList(Arrays.asList(arrayOfTasks));
        System.out.println("First task added, first task to complete:");
        while(fifoTaskList.hasMoreTasks()) {
            Task nextTask = fifoTaskList.getNextTask();
            System.out.println("Task: " + nextTask);
        }

        System.out.println("\n");

        TaskList lifoTaskList = new LIFOTaskList(Arrays.asList(arrayOfTasks));
        System.out.println("Last task added, last task to complete:");
        while(lifoTaskList.hasMoreTasks()) {
            Task nextTask = lifoTaskList.getNextTask();
            System.out.println("Task: " + nextTask);
        }
    }
}
