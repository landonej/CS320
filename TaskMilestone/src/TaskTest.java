/*Landon Johnston Borboa
 * milestone 2, CS 320
 * 9/23/22
 * 
 * */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

	
	// Test the default constructor
	@Test
	 void testTaskClasses() {
		Task task = new Task();
		assertTrue(task.getTaskID().equals("Intial"));
		assertTrue(task.getTaskName().equals("Intial"));
		assertTrue(task.getTaskDescription().equals("Intial"));
		
	 }
	
	// Tests the constructor 
	@Test
	 void testTaskClass() {
		Task task = new Task("12345", "Super Task", "This is the task about blah");
		assertTrue(task.getTaskID().equals("12345"));
		assertTrue(task.getTaskName().equals("Super Task"));
		assertTrue(task.getTaskDescription().equals("This is the task about blah"));
		
		
	 }
	
	//This tests if the taskID length cannot be more than 10 characters	
	@Test
	void testIDLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "Super Task", "This is the task about blah");
		}
		
	   );
   }
	
	// Test if task ID is not Null
	@Test
	void testIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "JSuper Task", "This is the task about blah");
		}
		
	   );
		
	}
	
	
	
	   //The Task Name cannot be longer than 20 characters.  	
		
		@Test
		void testNameLength() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("12345", "Super Task thats super cool and cooler", "This is the task about blah");
			}
			
		   );
	   }
		
		// Test that the Name cannot be null
		@Test
		void testNameNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("12345", null, "This is the task about blah");
			}
			
		   );
		}
		
		// Test if description cannot be longer than 50 characters.
			@Test
			void testDescriptioLength() {
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Task("12345", "Super Task", "This is the task about blah and blah and blah and blah and blah");
				}
				
			   );
		   }
			
			// Test if description cannot be null.
			 
			@Test
			void testDescriptionNull() {
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Task("12345", "Super Task", null);
				}
				
			   );
			}
		

}
