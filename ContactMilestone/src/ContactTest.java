/*Landon Johnston Borboa
 * milestone 1, CS 320
 * 9/15/22
 * 
 * */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	 void testContactClass() {
		Contact contact = new Contact();
		assertTrue(contact.getContactID().equals("Intial"));
		assertTrue(contact.getFirstName().equals("Intial"));
		assertTrue(contact.getLastName().equals("Intial"));
		assertTrue(contact.getAddress().equals("Intial"));
		assertTrue(contact.getPhone().equals("Intial"));
		 
	 }
	

	@Test
	 void tesContactClass() {
		Contact contact = new Contact("123456", "john", "jdoe", "101 hickory", "8001234560"
				);
		assertTrue(contact.getContactID().equals("123456"));
		assertTrue(contact.getFirstName().equals("john"));
		assertTrue(contact.getLastName().equals("jdoe"));
		assertTrue(contact.getAddress().equals("101 hickory"));
		assertTrue(contact.getPhone().equals("8001234560"));
		 
	 }
	
	//This tests if the ID length cannot be more than 10 characters
	@Test
	void testIDLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "john", "jdoe", "101 hickory", "8001234560");
		}
		
	   );
    }
	//This tests if the ID length cannot be null
	
	@Test
	void testIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "john", "jdoe", "101 hickory", "8001234560");
		}
		
	   );
    }
	
	//This tests if the First name length cannot be more than 10 characters
	@Test
	void testFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "eaniemeenie", "jdoe", "101 hickory", "8001234560");
		}
		
	   );
    }
	
	//This tests if the First Name length cannot be null
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", null, "jdoe", "101 hickory", "8001234560");
		}
		
	   );
    }
	
	//This tests if the Last name length cannot be more than 10 characters
	@Test
	void tesLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "john", "eaniemeenie", "101 hickory", "8001234560");
		}
		
	   );
    }
	
	//This tests if the Last Name length cannot be null
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "john", null, "101 hickory", "8001234560");
		}
		
	   );
    }
	
	//This tests if the address length cannot be more than 30 characters
	@Test
	void testAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "john", "jdoe", "101 hickory 12331121222212121211", "8001234560");
		}
		
	   );
    }
	
	//This tests if the address length cannot be null
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "john", "jdoe", null, "8001234560");
		}
		
	   );
    }
	
	//This tests if the phone length cannot be  longer than 10 characters
	@Test
	void testPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "john", "jdoe", "101 hickory", "800123456012");
		}
		
	   );
    }
	
	//This tests if the phone length cannot be null
	@Test
	void testPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456", "john", "jdoe", "101 hickory", null);
		}
		
	   );
    }



}

