package com;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee() {
		System.out.println("System cons");
	}
	public Employee(int id) {
		this.id = id;
	}
	public Employee(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Emplyee id is " +id+ " Employee name is " +name);
	}
	
}
