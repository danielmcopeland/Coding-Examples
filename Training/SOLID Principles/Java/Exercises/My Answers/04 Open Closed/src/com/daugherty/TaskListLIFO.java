package com.daugherty;

import java.util.List;

public class TaskListLIFO extends TaskList {
    /**
     * Constructor
     *
     * @param list an array filled with Tasks
     */
    public TaskListLIFO(List<Task> list) {
        super(list);
    }

    @Override
    public Task getNextTask() {
        if(this.hasMoreTasks()) {

            return this.getList().remove(getList().size()-1);
        }
        return null;
    }
}
