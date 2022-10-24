/*Landon Johnston Borboa
 *  milestone 3 , CS 320
 *   9/29/22
 *   
 */

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Appointment {
	
	
	
	private String appointmentID;
	private LocalDate appointmentDate;
	private String appointmentDesc;
	
	
	// constructor
	Appointment(){
		//Date todayDate = new Date();
		LocalDate todayDate = LocalDate.now();
		this.appointmentID = "Intial";
		this.appointmentDate = todayDate;
		this.appointmentDesc ="Intial";
		
		
	}
	// constructor
	Appointment(String appointmentID, LocalDate appointmentDate, String appointmentDesc){
	    //System.out.println(appointmentDate);
		this.setAppointmentID(appointmentID);
		this.appointmentDate = appointmentDate;
	    this.setAppointmentDate(appointmentDate);
		this.setAppointmentDesc(appointmentDesc);
		
		
	}
	
	
	
	
	// Sets appointment ID string that is not longer than 10 characters or null
	
	public void setAppointmentID(String appointmentID) {
			
		if (appointmentID == null|| appointmentID.length() >= 10) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.appointmentID = appointmentID;
		}	
			
		}
		
	
	
	// Sets appointment Description string that is not longer than 50 characters or null
	public void setAppointmentDesc(String appointmentDesc) {		
		if (appointmentDesc == null|| appointmentDesc.length() >= 50) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.appointmentDesc = appointmentDesc;
		}	
	}
	
	
	
	//Sets appointment Date that is not before todays date or null
	public void setAppointmentDate(LocalDate date) {
		//System.out.println(date);
		LocalDate currDate = LocalDate.now();      
	   
	    long noOfDaysBetween = ChronoUnit.DAYS.between(currDate, date);
		//System.out.println(noOfDaysBetween);
		//System.out.println(currDate);
		
		
		if(date == null) {		
			
			throw new IllegalArgumentException("Error: Can not be Null");
			
		}
		
		else if (noOfDaysBetween <= 0) {
			throw new IllegalArgumentException("Error: Can not be before todays Date");
			
		}
		else {
			this.appointmentDate = date;		
			}	
		
		
			
	 }
	
	
	
	// Gets the appointment date 
	public LocalDate getAppointmentDate() {
		
		return this.appointmentDate;
	}
	
	// Gets the appointment ID 
	public String getAppointmentID() {
		return this.appointmentID;
	}
	// Gets the appointment Description
	public String getAppointmentDesc() {
		return this.appointmentDesc;
		
	}
	

}
