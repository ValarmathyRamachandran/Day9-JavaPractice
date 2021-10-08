package javapractice;

public class ContactInfo {
	String FirstName;
	String LastName;
	String Address;
	String State;
	String Zip;
	String PhoneNumber;
	String Email;
	
	
//	public void AddContactInfo(String firstName,String lastName,String address,String state,String zip,String phonenumber,String email)
//	{
//		this.FirstName=firstName;
//		this.LastName=lastName;
//		this.LastName=lastName;
//	}
	
	public void Print(ContactInfo contactInfo)
	{
		System.out.println("FirstName: "+contactInfo.FirstName);
		System.out.println("LastName: "+contactInfo.LastName);
		System.out.println("Address: "+contactInfo.Address);
		System.out.println("State: "+contactInfo.State);
		System.out.println("Zip: "+contactInfo.Zip);
		System.out.println("Phone Number: "+contactInfo.PhoneNumber);
		System.out.println("E-mail: "+contactInfo.Email);
	}
	}


