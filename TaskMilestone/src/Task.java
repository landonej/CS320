/*
 * Landon Johnston Borboa
 * milestone 2, CS 320
 * 9/23/22
 * 
 * */

public class Task {
	
	private String taskID;
	private String taskName;
	private  String taskDescription;
	
	// Default constructor
	Task(){
		
		this.setTaskID("Intial");
		this.taskName = "Intial";
		this.taskDescription = "Intial";
	}
	
	Task(String taskID, String taskName, String taskDescription){
		
		this.setTaskID(taskID);
		this.setTaskName(taskName);		
		this.setTaskDescription(taskDescription);
	}
	
	 
	 // Checks for unique task ID  and  is not longer than 10 characters. It also can not be null.	 if it passes it sets the variable
	public void setTaskID(String taskID){
		if (taskID == null || taskID.length() >= 10) {
			throw new IllegalArgumentException("Error:");			
			
		}
		else {
		   this.taskID = taskID;
		}
		
	}
	
	// Checks for task name is not longer than 20 characters. It also can not be null. if it passes it sets the variable
	public void setTaskName(String taskName){
		if (taskName == null || taskName.length() >= 20) {
			throw new IllegalArgumentException("Error:");			
			
		}
		else {
		    this.taskName = taskName;
		}
			
		}
	

	// Checks for task description is not longer than 50 characters. It also can not be null. if it passes it sets the variable
	public void setTaskDescription(String taskDescription){
		if (taskDescription == null || taskDescription.length() >= 50) {
			throw new IllegalArgumentException("Error:");			
			
		}
		else {
		    this.taskDescription = taskDescription;
		}
		
	}
	
	// This return the taskID variable
	public String getTaskID() {
		return this.taskID;
		
		
	}
	// This return the taskName variable
	public String getTaskName() {
		return this.taskName;
			
			
		}
	
	// This return the task Description variable
	public String getTaskDescription() {
		return this.taskDescription;		
		
	}
}
