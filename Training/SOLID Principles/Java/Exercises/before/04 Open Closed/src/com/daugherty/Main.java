package com.daugherty;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task firstTask = new Task("Master the Open-Closed principle");
        Task secondTask = new Task("Learn HTML");
        Task thirdTask = new Task("Go have fun");

        Task[] arrayOfTasks = new Task[] {firstTask, secondTask, thirdTask};

        TaskList myTaskList = new TaskList(Arrays.asList(arrayOfTasks));
        while(myTaskList.hasMoreTasks()) {
            Task nextTask = myTaskList.getNextTask();
            System.out.println("Task: " + nextTask);
        }
    }
}
