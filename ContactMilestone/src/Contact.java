/*Landon Johnston Borboa
 * milestone 1, CS 320
 * 9/15/22
 * 
 * */

public class Contact {
	
	

	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	Contact(){
		
		this.setContactID("Intial");
		this.firstName = "Intial";
		this.lastName = "Intial";
		this.address = "Intial";
		this.phone = "Intial";
	}
	Contact(String contactID, String firstName, String lastName, String address,String phone){
		
		this.setContactID(contactID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setAddress(address);
		this.setNumber(phone);
	}

	//sets contactID if its not null or less than 10
	public void setContactID(String contactID) {
		if (contactID == null|| contactID.length() >= 10) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.contactID = contactID;
		}		
	}

	//sets first name if its not null or less than 10
	public void setFirstName(String firstName) {
		if (firstName == null|| firstName.length() >= 10) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.firstName = firstName;
		}		
	}

	//sets last name if its not null or less than 10
	public void setLastName(String lastName) {
		if (lastName == null|| lastName.length() > 10) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.lastName = lastName;
		}		
	}
	

	//sets address if its not null or less than 30
	public void setAddress(String address) {
		if (address == null|| address.length() >= 30) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.address = address;
		}		
	}
	

	//sets phone if its not null and exactly 10 digits
	
	public void setNumber(String phone) {
		if (phone == null|| phone.length() != 10) {
			throw new IllegalArgumentException("Error:");
		}
		else {
			this.phone = phone;
		}		
	}
	
	
	public String getContactID() {
		return this.contactID;
		
	}
	public String getFirstName() {
		return this.firstName;
		
	}
	public String getLastName() {
		return this.lastName;
		
	}
	public String getAddress() {
		return this.address;
		
	}
	public String getPhone() {
		return this.phone;
		
	}
	
	
}
