package com.daugherty;

import java.util.ArrayList;
import java.util.List;

public abstract class TaskList {

    protected ArrayList<Task> list;

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

    public abstract Task getNextTask(); // Other concrete classes need to implement this method so they can be instantiated

}
