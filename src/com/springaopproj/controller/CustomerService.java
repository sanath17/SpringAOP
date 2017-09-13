package com.springaopproj.controller;

public class CustomerService {
	
	private String name;
	private String url;
	
	
	public void getName() {
		System.out.println("customer name is :  "+this.name);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getUrl() {
		System.out.println("customer name is :  "+this.url);
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
