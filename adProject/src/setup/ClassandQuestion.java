package setup;

import java.util.ArrayList;

public class ClassandQuestion {
	
	public static void main(String[] args) {
		
		String[] questions = new String[5];
		
		// Question options
		questions[0] = "In what city were you born?";
		questions[1] = "What is the name of your favorite pet?";
		questions[2] = "What is your mother's maiden name?";
		questions[3] = "What high school did you attend?";
		questions[4] = "What was the name of your elementary school?";
		
	}

}

abstract class User {
	
	private String firstName;
	private String lastName;
	private String address;
	private int zipCode;
	private String state;
	private String username;
	private String password;
	private String email;
	private int ssn;
	private int securityQuestion;
	private string answer;
	
	ArrayList<Integer> flights = new ArrayList<>();
	
	protected User() {
	}
	
	// all setting up variables 
	public void setFirst(String h) {
		this.firstName = h;	
	}
	
	public void setLast(String j) {
		this.lastName = j;
	}
	
	public void setAddress(String k) {
		this.address = k;
	}
	
	public void setZip(int l) {
		this.zipCode = l;
	}
	
	public void setState(String a) {
		this.state = a;
	}
	
	public void setUsername(String s) {
		this.username = s;
	}
	
	public void setPassword(String d) {
		this.password = d;
	}
	
	public void setEmail(String f) {
		this.email = f;
	}
	
	public void setSSN(int g) {
		this.ssn = g;
	}
	
	public void whichQuestion(int q) {
		this.securityQuestion = q;
	}
	
	public void setAnswer(String w) {
		this.answer = w;
	}
	
	// Flights on account
	public void bookFlight(int e) {
		flights.add(e);
	}
	
	public void removeFlight(int r) {
		flights.remove(r);
	}
	
}

class Customer extends User {
	
	boolean isAdmin = false;
	
	Customer(){
	}
	
}

class Admin extends User {
	
	boolean isAdmin = true;
	
	Admin(){
	}
	
}