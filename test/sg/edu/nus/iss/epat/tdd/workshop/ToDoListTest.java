package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures
   private ToDoList todoList;
   private Task task;
   private Task taskCompleted;
   private Task taskCompleted1;
   public ToDoListTest() {
      super();
   }
   @Before
   public void setUp() throws Exception {
      task=new Task("Task1",false);
      taskCompleted=new Task("Task2",true);
      taskCompleted1=new Task("Task3",true);
      todoList=new ToDoList();
      // Initialise Test Fixtures

   }

   @After
   public void tearDown() throws Exception {
      // Uninitialise test Fixtures

   }

   @Test
   public void testAddTask() {
      todoList.addTask(task);
      assertEquals(todoList.getTask("Task1"),task);
   }

   @Test
   public void testGetStatus() {
      todoList.addTask(task);
      assertFalse(todoList.getTask("Task1").isComplete());

   }

   @Test
   public void testRemoveTask() {
      todoList.addTask(task);
      todoList.removeTask("Task1");
      assertNull(todoList.getTask("Task1"));
   }

   @Test
   public void testGetCompletedTasks() {
      todoList.addTask(task);
      todoList.addTask(taskCompleted);
      todoList.addTask(taskCompleted1);
      Collection<Task> completedTasks=new ArrayList<Task>();
      completedTasks.add(taskCompleted);
      completedTasks.add(taskCompleted1);
      assertEquals(todoList.getCompletedTasks(),completedTasks);
   }
}
