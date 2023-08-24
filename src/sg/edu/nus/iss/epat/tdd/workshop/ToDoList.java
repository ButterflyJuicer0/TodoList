package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.*;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      this.tasks.put(task.getDescription(),task);
      // Add code here
   }

   public void completeTask(String description) {
      this.tasks.get(description).setComplete(true);
      // Add code here
   }

   public boolean getStatus(String description) {
      // Add code here
      return this.tasks.get(description).isComplete();

   }

   public Task getTask(String description) {
      // Add code here
      return this.tasks.get(description);

   }

   public Task removeTask(String description) {
      // Add code here
      this.tasks.remove(description);
      return null;
   }

   public Collection<Task> getAllTasks() {
      
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      Iterator<String> iterator=this.tasks.keySet().iterator();
      List<Task> completedTasks=new ArrayList<Task>();
      while(iterator.hasNext()){
         String key=iterator.next();
         if(tasks.get(key).isComplete()){
            completedTasks.add(tasks.get(key));
         }

      }
      return completedTasks;
   }
}
