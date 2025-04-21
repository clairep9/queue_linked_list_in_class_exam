package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TaskMethod {

    private Queue<Task> taskQueue;

    public TaskMethod() {
    
    }

    public void taskInitialize() {
        taskQueue.add(new Task("Clean dishes", 3));
        taskQueue.add(new Task("Do laundry", 2));
        taskQueue.add(new Task("Walk the dog", 1));
        taskQueue.add(new Task("Pay bills", 2));
    }

    public void addTaskToQueue(Task task) {
 
    }

    public Task processNextTaskFromQueue() {
  
    }

    public Task peekAtNextTaskInQueue() {
       
    }

    public int getTaskQueueSize() {
    
    }

    public List<Task> getTasksWithPriority(int priority) {

    }
    
    public void moveTaskToBack(int numberOfPositions) {
  
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


    }
}
