package emailApp;
import java.util.*;

public class Email {

	private String firstName ;
	private String lastName ;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordlength = 10;
	private String email;
	private String alternateEmail;
	private String companySuffix = "mycompany.com";
	
	//Constructor to receive the first name and last name
	public Email(String firstName , String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);
		//Call a method asking for the department and return the department
		this.department =  setDepartment();
		//System.out.println("Department : "+ this.department );
		
		//Call a method that returns the random password
		this.password = randomPwd(defaultPasswordlength);
		System.out.println("Your password is : "+ this.password);
		
		//Creating email syntax
		email =  firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+this.department+"."+companySuffix;
		//System.out.println("Your email is : " +email);
		
	}
	
	//Ask for the department
	private String setDepartment(){
		System.out.println("Department CODES\n1. Sales\n2. Development\n3. Accounting\n0. None\nEnter the department ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) return "sales";
		else if(deptChoice ==  2)  return "devp";
		else if(deptChoice == 3) return "acnt";
		else return "";
		
	}
	
	//Generate a random password
	private String randomPwd(int length){
		String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] pass = new char[length];
		for(int i=0;i<length;i++){
			int rand = (int)(Math.random() * password.length());
			pass[i]= password.charAt(rand);
		}
		return new String(pass);
	}
	
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altmail){
		this.alternateEmail = altmail;
	}
	
	
	//Change the password
	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapcity(){ return mailboxCapacity;}
	public String getAlternateEmail() { return alternateEmail;}
	public String getPassword() { return password; }
	
	
	public String showInfo(){
		return "NAME : " + firstName+ " "+lastName+"\n"+
				"Company Email : " + email + "\n"+
				"MailBox Capacity : " +mailboxCapacity+"MB";		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
