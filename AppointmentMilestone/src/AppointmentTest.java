/*Landon Johnston Borboa
 *  milestone 3 , CS 320
 *   9/29/22
 *   
 */

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class AppointmentTest {

	//sets new dates for a past current date and for future appointment date 

	LocalDate apptDate = LocalDate.of(2023, Month.FEBRUARY, 27);
	LocalDate pastDate = LocalDate.of(2019, Month.MAY, 24);
	Appointment appointment = new Appointment("123456", apptDate, "this is for an appointment"
			);
	

	

	//Test the constructor
	
	@Test
	 void testAppointmentClass() {
		
		
		Appointment appointment = new Appointment("123456", apptDate, "this is for an appointment"
				);
		assertTrue(appointment.getAppointmentID().equals("123456"));
		
		assertTrue(appointment.getAppointmentDate().isEqual(apptDate));		
		assertTrue(appointment.getAppointmentDesc().equals("this is for an appointment"));
		
		 
	 }
	
	//This tests if the ID length cannot be more than 10 characters
	@Test
	void testIDLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", apptDate, "this is for an appointment");
		}
		
	   );
   }
	//This tests if the ID length cannot be null
	
		@Test
		void testIDNull() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Appointment(null,  apptDate, "this is for an appointment");
			}
			
		   );
			
		}
			//This tests if the Date is past todays date
		    @Test
			void testDatePast() {
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Appointment("12345678901", pastDate, "this is for an appointment");
				}
				
				
			   );
		   }
			
			//This tests if the date cannot be null
		
			@Test
			void testDateNull() {
				Assertions.assertThrows(NullPointerException.class, () -> {
					new Appointment("123456", null, "this is for an appointment");
				}
				
			   );
	         }
	         
			
			//This tests if the Description length cannot be more than 50 characters
			@Test
			void testDescriptionLength() {
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Appointment("123456", pastDate, "this is for an appointment, Its way to long to be a real so we should cancel it");
				}
				
			   );
		   }
			
			//This tests if the Description length cannot be null
			
			@Test
			void testDescriptionNull() {
				Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Appointment("123456", apptDate, null);
				}
				
			   );
	         }
		

	
}
