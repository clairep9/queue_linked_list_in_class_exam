package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TaskMethod {

    private Queue<Task> taskQueue;

    public TaskMethod() {
        taskQueue = new LinkedList<>();
    }

    public void taskInitialize() {
        taskQueue.add(new Task("Clean dishes", 3));
        taskQueue.add(new Task("Do laundry", 2));
        taskQueue.add(new Task("Walk the dog", 1));
        taskQueue.add(new Task("Pay bills", 2));
    }

    public void addTaskToQueue(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        taskQueue.add(task);
    }

    public Task processNextTaskFromQueue() {
        return taskQueue.poll();
    }

    public Task peekAtNextTaskInQueue() {
        return taskQueue.peek();
    }

    public int getTaskQueueSize() {
        return taskQueue.size();
    }

    public List<Task> getTasksWithPriority(int priority) {
        List<Task> result = new ArrayList<>();
        for (Task task : taskQueue) {
            if (task.getPriority() == priority) {
                result.add(task);
            }
        }
        return result;
    }
    
    public void moveTaskToBack(int numberOfPositions) {
        if (numberOfPositions <= 0 || numberOfPositions >= taskQueue.size()) {
            throw new IllegalArgumentException("Invalid number of positions");
        }

        for (int i = 0; i < numberOfPositions; i++) {
            Task task = taskQueue.poll();
            taskQueue.add(task);
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
