/*Landon Johnston Borboa

 *  milestone 3 , CS 320
 *   9/29/22
 *   
 */

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {
	
	
	LocalDate apptDate = LocalDate.of(2023, Month.FEBRUARY, 27);
		
		
	
		

	// declares appointment with current values
	Appointment appointment = new Appointment("123456", apptDate, "this is for an appointment");
	Appointment dupappt = new Appointment("123456", apptDate, "this is for an appointment");
	
	AppointmentService appointmentService = new AppointmentService();
	
		


   //Test adding an appointment with unique ID.
	@Test
	void testAddingAppointment() {
		assertEquals(true, appointmentService.addingAppointment(appointment));
		
	}
	
		
		
   // deletes the appointment per contactId.
	@Test
	void testDeleteAppointment() {
		appointmentService.addingAppointment(appointment);
		assertEquals(true, appointmentService.deleteAppointment("123456"));
	
	}
	
	

}
