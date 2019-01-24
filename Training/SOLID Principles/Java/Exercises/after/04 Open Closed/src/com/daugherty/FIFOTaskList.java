package com.daugherty;

import java.util.List;

/**
 * First in, first out (FIFO)
 */
public class FIFOTaskList extends TaskList {

    /**
     * Constructor
     * @param list an array filled with Tasks
     */
    public FIFOTaskList(List<Task> list) {
        super(list);
    }

    @Override
    public Task getNextTask() {
        if(this.hasMoreTasks()) {
            return this.list.remove(0);
        } else {
            return null;
        }
    }
}
