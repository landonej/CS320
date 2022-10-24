/*Landon Johnston Borboa
 * milestone 2, CS 320
 * 9/23/22
 * 
 * */

import java.util.ArrayList;

public class TaskService {
	ArrayList<Task> tasks;
	//Default constructor
	 public TaskService() {
		 tasks = new ArrayList<>();	
	 }
	 
	 
	  // This add's tasks with a unique ID.	 
	 public boolean addTask(Task newTask) {
		 
		 boolean taskExist = false;
		 boolean taskCreated = false;
		 		
		 for (Task task : tasks){		  
		     if (task.getTaskID().equals(newTask.getTaskID())) {
				 taskExist = true;		
				 break;
				 }			 
		 }
		 if (!taskExist) {
			 tasks.add(newTask);
			 taskCreated = true;
			 System.out.println("Task created");
			 return taskCreated;				 
		 }		  
		 else {
			 throw new IllegalArgumentException("task id is a duplicate");
		 }			 
	 }
	 
	
	
	// This deletes a tasks per task ID.
	 public boolean deleteTask(String taskID) {
		 boolean taskDeleted = false;
		 for (Task task : tasks){
			 if (taskID.equals(task.getTaskID())){
				 tasks.remove(task);
				 taskDeleted = true;
				 System.out.println("Task deleted");
				 break; 
			 }
			 
		 }
		return taskDeleted;
			 
	 }
	
	 
	  
	 // Updates Task name by task id
	 public void updateTaskName(String taskID, String updatedName) {
		 for (Task task : tasks) {
				if (taskID.equals(task.getTaskID())) {
					task.setTaskName(updatedName);
					
					break;
				}
				
		 }
		
	 }
	 
	 // Updates Task descripton by task id
	 public void updateTaskDescription(String taskID, String updatedDescription) {
		 for (Task task : tasks) {
			 if (taskID.equals(task.getTaskID())) {
					task.setTaskDescription(updatedDescription);
					
					break;
			 }
		 }
	 }
		 
	


}
	 
	 
	 
	
	
	

