 import java.util.ArrayList;
  import java.util.List;

  public class TaskManager{
      // Data Structure to hold the objects
      private List<Task> taskList = new ArrayList<>();

        public void addTask(Task task){
          taskList.add(task);
          System.out.println("Task added successfully!");
      }
  }