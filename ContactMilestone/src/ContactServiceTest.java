/*Landon Johnston Borboa
 * milestone 1, CS 320
 * 9/15/22
 * 
 * */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	
		
		Contact contact = new Contact("12345", "Initial", "Initial","7894 Address",  "8001234567");	
		
		ContactService contactService = new ContactService();
		
			
	
	
       //Test adding a contact with unique ID.
		@Test
		void testAddingContact() {
			assertEquals(true, contactService.addingContact(contact));
			
		}

       // deletes the contacts per contactId.
		@Test
		void testDeleteContact() {
			contactService.addingContact(contact);
			assertEquals(true, contactService.deleteContact("12345"));
		
		}
		
		// updates first name per contactID
		@Test
		void testUpdateFirstName() {
			contactService.addingContact(contact);
			contactService.updateFirstName("12345", "john");
			assertTrue(contact.getFirstName().equals("john"));
		}
		
		// updates last name per contactID
		@Test
		void testUpdateLastName() {
			contactService.addingContact(contact);
			contactService.updateLastName("12345", "jdoe");
			assertTrue(contact.getLastName().equals("jdoe"));
		}
		
		// updates address per contactID
		@Test
		void testUpdateAddress() {
			contactService.addingContact(contact);
			contactService.updateAddress("12345", "119 hawthorne");
			assertTrue(contact.getAddress().equals("119 hawthorne"));
		}
		
		// updates phone per contactID
		@Test
		void testUpdatePhone() {
			contactService.addingContact(contact);
			contactService.updateNumber("12345", "8001234000");
			assertTrue(contact.getPhone().equals("8001234000"));
		}


}

