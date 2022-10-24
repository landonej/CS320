/*Landon Johnston Borboa
 * milestone 2, CS 320
 * 9/23/22
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaskServiceTest {
	// Declares a new instance with the following 
	Task task = new Task("12345", "Super Task", "This is the task about blah");	
	
	TaskService taskService = new TaskService();
	
		

   
   //tests adding a task with unique ID.
	@Test
	void testAddingTask() {
		assertEquals(true, taskService.addTask(task));
		
	}

   // deletes the task per taskId.
	@Test
	void testDeleteTask() {
		taskService.addTask(task);
		assertEquals(true, taskService.deleteTask("12345"));
	
	}
		
	// updates name per taskID
	@Test
	void testUpdateName() {
		taskService.addTask(task);
		taskService.updateTaskName("12345", "Cool Task");
		assertTrue(task.getTaskName().equals("Cool Task"));
	} 
	
	// updates description per taskID
	@Test
	void testUpdateDescription() {
		taskService.addTask(task);
		taskService.updateTaskDescription("12345", "This task is defintely about cooking");
		assertTrue(task.getTaskDescription().equals("This task is defintely about cooking"));
	}

			
			
}
