package javapractice;

import java.util.*;

class ContactInfo {
	String FirstName;
	String LastName;
	String Address;
	String State;
	String Zip;
	String PhoneNumber;
	String Email;
	
	
	
	public void Print(ArrayList<ContactInfo> contactInfo)
	{
		for(int i=0;i<contactInfo.size();i++)
		{
		System.out.println("FirstName: "+contactInfo.get(i).FirstName);
		System.out.println("LastName: "+contactInfo.get(i).LastName);
		System.out.println("Address: "+contactInfo.get(i).Address);
		System.out.println("State: "+contactInfo.get(i).State);
		System.out.println("Zip: "+contactInfo.get(i).Zip);
		System.out.println("Phone Number: "+contactInfo.get(i).PhoneNumber);
		System.out.println("E-mail: "+contactInfo.get(i).Email);
		System.out.print("\n");
		}
	}
	}


public class AddressBook {
    public static void main(String[] args)  {
    	Scanner scan = new Scanner(System.in);
    	
    	    int choice = 0;
    		menu();
    		choice = scan.nextInt();
		// Instantiate AddressBook object
		AddressBook objAddressBook = new AddressBook();
		
		ContactInfo objContactInfo=new ContactInfo();
		
		ArrayList<ContactInfo> lstContactInfo=new ArrayList<ContactInfo>();
		
		while (choice<=5) {
			if (choice == 1) {
				    ContactInfo singleObject=new ContactInfo();
					System.out.println("Enter the First Name:");
					singleObject.FirstName = scan.next();
					System.out.println("Enter the Last Name:");
					singleObject.LastName = scan.next();
					System.out.println("Enter the Address:");
					singleObject.Address = scan.next();
					System.out.println("Enter your state:");
					singleObject.State = scan.next();
					System.out.println("Enter the Zip :");
					singleObject.Zip = scan.next();
					System.out.println("Enter the Phone Number:");
					singleObject.PhoneNumber = scan.next();
					System.out.println("Enter your email:");
					singleObject.Email = scan.next();
					lstContactInfo.add(singleObject);
					System.out.println("Number of Contacts :"+lstContactInfo.size());
					System.out.println("Contact Information is Added Successfully\n");
					
					menu();
					choice = scan.nextInt();
				}
			
			
			/* else if (choice == 2) {
				System.out.println("Enter the First Name to search:");
				String searchText = scan.next();
				for(int i=0;i<lstContactInfo.size();i++)
				{
					if(searchText.toLowerCase().equals(lstContactInfo.get(i).FirstName.toLowerCase()))
					{
						System.out.println("Enter the First Name:");
						lstContactInfo.get(i).FirstName = scan.next();
						System.out.println("Enter the Last Name:");
						lstContactInfo.get(i).LastName = scan.next();
						System.out.println("Enter the Address:");
						lstContactInfo.get(i).Address = scan.next();
						System.out.println("Enter your state:");
						lstContactInfo.get(i).State = scan.next();
						System.out.println("Enter the Zip :");
						lstContactInfo.get(i).Zip = scan.next();
						System.out.println("Enter the Phone Number:");
						lstContactInfo.get(i).PhoneNumber = scan.next();
						System.out.println("Enter your email:");
						lstContactInfo.get(i).Email = scan.next();
						System.out.println("Contact Information Edited Successfully\n");
					}
				}
				menu();
				choice = scan.nextInt();
			}
	    	else if (choice == 3)
	    	{
	    		System.out.println("Enter the First Name to Search:");
			String searchText = scan.next();
			for(int i=0;i<lstContactInfo.size();i++)
			{
				if(searchText.toLowerCase().equals(lstContactInfo.get(i).FirstName.toLowerCase()))
				{
					lstContactInfo.remove(i);
					System.out.println("Contact Information deleted Successfully\n");
				}
			}
			menu();
			choice = scan.nextInt();
	    	}
	    	else if (choice == 4)
	    	{
	    		System.out.println("Displayed Contact Information:");
	    		objContactInfo.Print(lstContactInfo);
				menu();
				choice = scan.nextInt();
	    	} */
	    	else
	    		System.out.println("Invalid option, please select another choice\n");		
		}
		}
    public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		//System.out.println("2.Edit a contact from your address book.");
		//System.out.println("3.Delete a contact from your address book.");
		//System.out.println("4.Print out information of your contacts.");
		//System.out.println("5.Quit.");
		System.out.println("Enter your menu choice:");
		
    }
}
