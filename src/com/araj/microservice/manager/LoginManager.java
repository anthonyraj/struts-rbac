package com.araj.microservice.manager;

// Manage the Thread Pool for Login Manager
public class LoginManager extends ThreadManager {
	
	public LoginManager(String url, int threadNo) {
		super(url,threadNo);
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("Starting the Thread Pool for Microservice Depdendency : "+this.getURL()+" | thread No : "+this.getThreadno());
		this.invokeURL();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		String url = "login-manager";
		
		while (count<=10) {
			LoginManager login = new LoginManager(url,count);
			login.start(); // Start the thread
			count++;
		}
		
	}

}
