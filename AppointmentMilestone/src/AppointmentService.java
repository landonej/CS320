/*Landon Johnston Borboa
 *  milestone 3 , CS 320
 *   9/29/22
 *   
 */

import java.util.ArrayList;
import java.util.Date;

public class AppointmentService {
	ArrayList<Appointment> appointments;

  
	Date currentDate = new Date();
	//Default constructor
	public AppointmentService(){
		appointments = new ArrayList<>();		
		
		
	}

	
	
	// This Creates appointments
	 public boolean addingAppointment(Appointment newAppointment) {
		 
		 boolean appointmentCreated = false;
		 
			 appointments.add(newAppointment);
			 appointmentCreated = true;
			 System.out.println("Appointment created");
			  
			 
			
			
			 return appointmentCreated;				 
		 		  
					 
	 }
	 
	 //deletes appointment
	 public boolean deleteAppointment(String appointmentID) {
		 boolean appointmentDeleted = false;
		 for (Appointment appointment : appointments){
			 if (appointmentID.equals(appointment.getAppointmentID())){
				 appointments.remove(appointment);
				 appointmentDeleted = true;
				 System.out.println("Appointment deleted");
				 break;			 
				 
			 }
			 
		 }
		return appointmentDeleted; 
		
			 
	 }
		
}
