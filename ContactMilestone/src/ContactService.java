/*Landon Johnston Borboa
 * milestone 1, CS 320
 * 9/15/22
 * 
 * */

import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact> contacts;
	
	//Default constructor
	 public ContactService() {
		 contacts = new ArrayList<>();		 
	 }
	 
	 
	 // Adds contact to array
	 public boolean addingContact(Contact newContact) {
		 boolean contactExist = false;
		 boolean contactCreated = false;
		 		
		 for (Contact contact : contacts){		  
		     if (contact.getContactID().equals(newContact.getContactID())) {
				 contactExist = true;		
				 break;
				 }			 
		 }
		 if (!contactExist) {
			 contacts.add(newContact);
			 contactCreated = true;
			 System.out.println("Contact created");
			 return contactCreated;				 
		 }		  
		 else {
			 throw new IllegalArgumentException("Contact id is a duplicate");
		 }			 
	 }
		
	 
	 
	 //deletes contact
	 public boolean deleteContact(String contactID) {
		 boolean contactDeleted = false;
		 for (Contact contact : contacts){
			 if (contactID.equals(contact.getContactID())){
				 contacts.remove(contact);
				 contactDeleted = true;
				 System.out.println("Contact deleted");
				 break;
				 
				 
			 }
			 
		 }
		return contactDeleted;
		 
		
			 
	 }
	
	 // Updates first name by contact id
	 public void updateFirstName(String contactID, String updatedFirstName) {
		 for (Contact contact : contacts) {
				if (contactID.equals(contact.getContactID())) {
					contact.setFirstName(updatedFirstName);
					
					break;
				}
				
		 }
		
	 }
	 
	 // Updates last name by contact id
	 public void updateLastName(String contactID, String updatedLastName) {
		 for (Contact contact : contacts) {
				if (contactID.equals(contact.getContactID())) {
					contact.setLastName(updatedLastName);
					
					break;
				}
		 }
	 }
	 
	 // Updates address by contact id
	 public void updateAddress(String contactID, String updatedAddress) {
		 for (Contact contact : contacts) {
				if (contactID.equals(contact.getContactID())) {
					contact.setAddress(updatedAddress);
					
					break;
				}
		 }
	 }
	 
	 // Updates number by contact id
	 public void updateNumber(String contactID, String updatedNumber) {
		 for (Contact contact : contacts) {
				if (contactID.equals(contact.getContactID())) {
					contact.setNumber(updatedNumber);
					
					break;
				}
		 }
	 }
	 
	 
	

}
