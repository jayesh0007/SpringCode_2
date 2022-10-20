package com.aop.dlf.secondexample;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public void working() {
		System.out.print("Hello:"+ name.toUpperCase() +" - Happy to have you in:");
	}
	
	public int calculateibm(int a,int b) {
		return a+b;
	}

	public int calculateyashtech(int a,int b) {
		return a*b;
	}
	
	public void badmein() {
		throw new MyException("from method");
		
	}

}
