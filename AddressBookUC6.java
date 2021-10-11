package com.bridgeLabz;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

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
		String addressName;
	//	Dictionary<String, ArrayList<ContactInfo>> dictionary = new Dictionary<String,ArrayList<ContactInfo>>();
		Map<String, ArrayList<ContactInfo>> map = new HashMap<String, ArrayList<ContactInfo>>();
		mainmenu();
		
		int mainMenuChoice=scan.nextInt();
		//outer while
		while(mainMenuChoice<=2)
		{
			//show books
			if(mainMenuChoice==1)
			{
				for(int i=0;i<map.size();i++)
				{
					System.out.println("List of AddressBook:" + map.keySet().toArray()[i]);
				}
			 //2 mainMenuChoice++;
			  mainmenu();
			  mainMenuChoice=scan.nextInt();
			}
		else if(mainMenuChoice==2) //create new book
			{
			//Creating new map within inner loop. 
			Map<String, ArrayList<ContactInfo>> innerMap = new HashMap<String, ArrayList<ContactInfo>>();
		System.out.println("please Enter the Address Book name:");
		
		addressName = scan.next();
	
		System.out.println("Address Book name:" + addressName);
		
    	
    	    int choice = 0;
    	  //  choice = scan.nextInt();
    	   // System.out.println("Press Enter Key");
    		menu();
    		choice = scan.nextInt();
		// Instantiate AddressBook object
		AddressBook objAddressBook = new AddressBook();
		
		ContactInfo objContactInfo=new ContactInfo();
		
		ArrayList<ContactInfo> lstContactInfo=new ArrayList<ContactInfo>();
		
		while (choice<=6) {
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
					innerMap.clear();
					innerMap.put(addressName, lstContactInfo);
					map.putAll(innerMap);
					System.out.println("Number of Contacts :"+lstContactInfo.size());
					System.out.println("Contact Information is Added Successfully\n");
					
					menu();
					choice = scan.nextInt();
				}
			
			
			 else if (choice == 2) {
				System.out.println("Enter the First Name to search in order to edit:");
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
				System.out.println("Invalid entry");
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
	    	} 
			else if (choice == 5){
				System.out.println("You have successfully existed the Address Book");
				System.exit(0);
			}
			else if(choice==6)
			{
				mainmenu();
				mainMenuChoice=scan.nextInt();
				break;
			}
	    	else
	    		System.out.println("Invalid option, please select another choice\n");		
		}
			}
	
		}
		
		}
    public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Edit a contact from your address book.");
		System.out.println("3.Delete a contact from your address book.");
		System.out.println("4.Print out information of your contacts.");
		System.out.println("5.Quit.");
		System.out.println("6.Go to Main Menu");
		System.out.println("Enter your menu choice:");
		
    }
    
    public static void mainmenu() {
		System.out.println("1.Show Address Books");
		System.out.println("2.Create Address Book");
    }
}
