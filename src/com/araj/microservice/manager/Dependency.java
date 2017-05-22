package com.araj.microservice.manager;

public class Dependency {
	private String name = "";
	private int count = 0;
	private String url = "";
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	public Dependency(String name, int count, String url) {
		// TODO Auto-generated constructor stub
		setName(name);
		setCount(count);
		setUrl(url);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
