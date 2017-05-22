package com.araj.microservice.manager;

public class ThreadManager extends Thread {
	private String url = "";
	private int threadno = -1;
	
	public ThreadManager (String url, int threadNo) {
		this.url = url;
		this.threadno = threadNo;
	}
	
	public String getURL() {
		return this.url;
	}
	
	public void setURL(String url) {
		this.url = url;
	}
	
	public boolean invokeURL() {
		boolean resp = false;
		System.out.println("Fired url : "+getURL());
		resp = true;
		return resp;
	}
	
    public int getThreadno() {
		return threadno;
	}

	public void setThreadno(int threadno) {
		this.threadno = threadno;
	}

	public void run() {
        System.out.println("Hello from a thread : "+getURL()+" | "+getThreadno());
    }

    public static void main(String args[]) {
        (new ThreadManager("login-manager",10)).start();
    }

}