package javaProject;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		System.out.println("Enter the firstName and lastName: ");
		Scanner strInput= new Scanner(System.in);
		String firstNameOfeWorker= strInput.nextLine();
		String lastNameOfWorker= strInput.nextLine();
		Email email=new Email(firstNameOfeWorker, lastNameOfWorker);
		System.out.println("Your Information:"+ email.showInfo());
		
		// Close.
		strInput.close();
		

	}

}
class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLenth= 10;
	private String department;
	private String email;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private	String companySuffix= "anyone.com";
	// Constructor to receive firstName and lastName.
	public Email(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName= lastName;
		// Call a method for the department and return the department.
		this.department= setDepartment();
		System.out.println("Department "+ this.department);
		// Call a method that return a random password.
		this.password= randomPassword(defaultPasswordLenth);
		System.out.println("Your password is: "+ this.password);
		// Combine element to generate  email
		email= firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your password is: "+email);
		
	}
	// Ask for the department
	
	private String setDepartment() {
		System.out.print("New worker: "+firstName+" "+lastName+"."
				+ " Department Code :"+"\n"
						+"1. for Sales"+
		"\n"+"2.for Development "+"\n"+ "3.for Accounting"+ "\n"+"0 for none"+"\n"+"Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice= in.nextInt();
		in.close();
		
		if(depChoice== 1) {return "Sales";}
		else if(depChoice==2) {return "Develpoment";}
		else if(depChoice==3) {return "Accounting";}
		else {return "none";}
		
		
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%^&*";
		char []password = new char[length];
		for(int i=0 ; i<length; i++) { 
			int random=  (int)(Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(random);
		}
		return new String(password);
		
	}
	// Set the mailBox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailBoxCapacity= capacity;
	}
	// Get the mailBox capacity
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	
	
	// Set the alternate mail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail= altEmail;
		
	}
	public String getAlternateEmail() {return alternateEmail;}
	
	// change the password
	public void setChangePassword(String password) {
		this.password= password;
	}
	public String  getChangePassword() {return password;}
	
	public String showInfo() {
		System.out.println();
		return "Display name: "+firstName+" "+lastName+" \n"+
				"Company Email: "+email+"\n"+"MailboxBoxCapacity: "+mailBoxCapacity+" MB";
				
	}

	

}
