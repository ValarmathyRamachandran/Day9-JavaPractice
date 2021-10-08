package javapractice;

import java.util.*;

public class AddressBook {
    public static void main(String[] args)  {
    		Scanner scan = new Scanner(System.in);
    	
    		menu();
		
		// Instantiate AddressBook object
		AddressBook objAddressBook = new AddressBook();
		
		ContactInfo objContactInfo=new ContactInfo();
			 
		int choice = 0;
		while (choice<=5) {
			if (choice == 1) {
					System.out.println("Enter the First Name:");
					objContactInfo.FirstName = scan.next();
					System.out.println("Enter the Last Name:");
					objContactInfo.LastName = scan.next();
					System.out.println("Enter the Address:");
					objContactInfo.Address = scan.next();
					System.out.println("Enter your state:");
					objContactInfo.State = scan.next();
					System.out.println("Enter the Zip :");
					objContactInfo.Zip = scan.next();
					System.out.println("Enter the Phone Number:");
					objContactInfo.PhoneNumber = scan.next();
					System.out.println("Enter your email:");
					objContactInfo.Email = scan.next();
					
		    		
				}
			
			
			else if (choice == 2) {
				System.out.println("What is the first name of the contact you want to edit?");
				 objContactInfo.FirstName = scan.next();
				
	    	}
	    	else if (choice == 3)
			{
				System.out.println("What is the first name of the contact you want to Delete?");
				 objContactInfo.FirstName = scan.next();			
				 }
	    	else if (choice == 4)
			{
				System.out.println("Prints the Contact Information of Address Book");
	    		objContactInfo.Print(objContactInfo);
			}
	    	
	    	
	    	else {	
	    	menu();
			choice = scan.nextInt();
			
		}
		}
    public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Edit a contact from your address book.");
		System.out.println("3.Delete a contact from your address book.");
		System.out.println("4.Print out information of your contacts.");
		System.out.println("Enter your menu choice:");
		
    }
    
    
}
