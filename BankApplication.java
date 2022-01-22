package javaProject;

import java.util.Scanner;

class BankApplication{
	public static void main(String[] args) {
		System.out.println("Enter Name of User : ");
        System.out.println("Enter the Id of the user:  ");
        Scanner strInput = new Scanner(System.in);
        String nameOfUser= strInput.nextLine();
        String idOfTheUser= strInput.nextLine();
		BankAccount obj= new BankAccount(nameOfUser,idOfTheUser);
		System.out.println("Your Name is: "+nameOfUser);
		System.out.println("Your ID is: "+idOfTheUser);
		obj.showMenu();
		strInput.close();
	}
	
}
class BankAccount {
	private int balance ;
	private int previousTransaction;
	private String customerName;
	private String customerId;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setPreviousTransaction(int previousTransaction) {
		this.previousTransaction = previousTransaction;
	}
	BankAccount(String  customerName,  String customerId){
		this.customerName= customerName;
		this.customerId= customerId;
		
		
	}
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance +amount;
			previousTransaction= amount;
			
		}
	}
	void withDraw(int amount) {
		if (amount != 0) {
			balance = balance -amount;
			previousTransaction= -amount;
			
		}
	}
	void getPreviousTransaction() {
		if (previousTransaction>0) {
			System.out.println("Deposited: "+previousTransaction);
			
		}
		else if (previousTransaction<0) {
			System.out.println("withDrawned: "+Math.abs(previousTransaction));
			
			
		}else {
			System.out.println("No Transaction Occured! "
					+ "");
			
		}
	}
	void showMenu() {
		System.out.println("=================================");
		char option = '\0';
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome: "+customerName);
		System.out.println("Your Id is: "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance->"+"\n"+ 
		"B. Deposit-> "+
		"\n"+"C. WithDraw-> "+
		"\n"+"D. previousTransaction ->"+" \n"+"E. Exit()"+"\n");
		do {
			System.out.println("=================================");
			System.out.println("Enter the option:");
			option= input.next().charAt(0);
			System.out.println();
			switch(option) {
			case 'A':
				System.out.println("-----------------------------");
				System.out.println("Balance: "+balance);
				System.out.println("-----------------------------");
				System.out.println();
				break;
			case 'B':
				System.out.println("-----------------------------");
				System.out.println("Enter the amount to be deposit:");
				int amount= input.nextInt();
				deposit(amount);
				System.out.println("-----------------------------");
				System.out.println();
				break;
			case 'C':
				System.out.println("-----------------------------");
				System.out.println("Enter the withDraw ");
				int amount1= input.nextInt();
				withDraw(amount1);
				System.out.println("-----------------------------");
				System.out.println();
				break;
			case 'D':
				System.out.println("-----------------------------");
				getPreviousTransaction();
				System.out.println("-----------------------------");
				System.out.println();
				break;
			case 'E':
				break;
			default:
				System.out.println("Invalid Option please Enter again: ");
				break;
			
			}
			
		}while(option!= 'E');
		System.out.println("Thank You for using our services!");
		input.close();
		
	}
}
