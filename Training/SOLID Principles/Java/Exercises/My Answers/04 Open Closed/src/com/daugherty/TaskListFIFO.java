package com.daugherty;
import java.util.ArrayList;
import java.util.List;

public class TaskListFIFO extends TaskList{

    public TaskListFIFO(List<Task> list) {
        super(list);
    }

    @Override
    public Task getNextTask() {
        if(this.hasMoreTasks()) {
            return this.getList().remove(0);
        }
        return null;
    }
}
