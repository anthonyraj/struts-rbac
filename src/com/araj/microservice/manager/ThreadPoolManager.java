package com.araj.microservice.manager;

import java.util.*;

public class ThreadPoolManager {
	private ArrayList <Dependency> pool = null;
	
	public ThreadPoolManager(ArrayList<Dependency> pool) {
		// TODO Auto-generated constructor stub
		this.pool = pool;
	}
	
	public void setPool(ArrayList<Dependency> pool) {
		this.pool = pool;
	}
	
	public ArrayList<Dependency> getPool() {
		return pool;
	}
	
	public void createThread(String threadName, int threadNo) {
		ThreadManager tm = new ThreadManager(threadName,threadNo);
		tm.start();
	}
	
	public void start() {
		for (Dependency d: pool) {
			System.out.println("Init threads for : "+d.getName()+" | "+d.getUrl());
			for(int i=0; i<=d.getCount(); i++) {
				createThread(d.getName(),i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Dependency> pool = new ArrayList<Dependency>();
		
		Dependency d = new Dependency("LoginManager",10,"http://araj.com/login" );
		pool.add(d);
		d = new Dependency("RBACManager",10,"http://araj.com/rbac" );
		pool.add(d);
		
		ThreadPoolManager poolManager = new ThreadPoolManager(pool);
		poolManager.start();
	}

}
