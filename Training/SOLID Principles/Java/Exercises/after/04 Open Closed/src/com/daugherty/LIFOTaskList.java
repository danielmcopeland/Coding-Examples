package com.daugherty;

import java.util.List;

/**
 * Last in, first out (LIFO)
 */
public class LIFOTaskList extends TaskList {

    /**
     * Constructor
     * @param list an array filled with Tasks
     */
    public LIFOTaskList(List<Task> list) {
        super(list);
    }

    @Override
    public Task getNextTask() {
        if(this.hasMoreTasks()) {
            // indexes are zero-based
            // so the index of the last element is the length minus one
            int lastTaskIndex = this.list.size() - 1;
            return this.list.remove(lastTaskIndex);
        } else {
            return null;
        }
    }
}
