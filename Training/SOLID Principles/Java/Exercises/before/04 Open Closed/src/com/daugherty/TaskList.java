package com.daugherty;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private ArrayList<Task> list;

    /**
     * Constructor
     * @param list an array filled with Tasks
     */
    public TaskList(List<Task> list){
        this.list = new ArrayList<Task>(list);
    }

    public boolean hasMoreTasks() {
        return (this.list != null && (!this.list.isEmpty()));
    }

    public Task getNextTask() {
        if(this.hasMoreTasks()) {
            return this.list.remove(0);
            // Returns the first element added to the list (oldest element)
            // What if we wanted to get the most recent item added to the list?
        } else {
            return null;
        }
    }

}
