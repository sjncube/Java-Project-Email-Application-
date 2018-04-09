package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String altenateEmail;
	private int mailboxCapacity = 200;
	private int passwordLength = 8;
	private String email;
	
	//Constructor for firstName and lastName;
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("Email Created for: "+this.firstName+ this.lastName+"\n");
		
		//calling the department method and returning department
		this.department = setDepartment();
		//System.out.println(this.department);
		
		//calling and generating a random password
		this.password = randomPassword(passwordLength);
		
		//generate email syntax respecting company norm
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+ department +".akts.co.za";
		
		//System.out.println("Welcome your email is "+ email);
		
		//System.out.println("Your password is: "+this.password);
	}
	
	//Ask for Department
	private String setDepartment() {
		System.out.println("Choose Department\n1.Sales\n2.Development\n3.Accounting");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		
		if (depChoice == 1)
			return "Sales";
		else if (depChoice == 2)
			return "developement";
		else if (depChoice == 3)
			return "Accounting";
		else
			return "Choose correct Department number";
	}
	
	//creating a random password
	private String randomPassword(int length) {
		
		String setPassword = "abcdefghijklmNOPQRSTUVWXYZ0123456789@#$%";
		char[] password = new char[length];
		for (int i = 0; i<length; i++) {
			int random = (int)(Math.random()*setPassword.length());
			password[i] = setPassword.charAt(random);
		}
		return new String(password);	
	}
	
	//setting a Mail box capacity
	public void setMailBoxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}
	
	//setting alternative email
	public void setAltenativeEmail(String altenateEmail) {
		this.altenateEmail = altenateEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAltenativeEmail() {
		return altenateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	public String getInfo() {
		System.out.println("Welcome new employee to AKTS limited find your details bellow:\n");
		return "Name: "+firstName + 
			   "\nCompany email: "+email + 
			   "\nMailBoxCapacity: "+ mailboxCapacity + "mb"+
			   "\nPassword: "+password;	
	}
}