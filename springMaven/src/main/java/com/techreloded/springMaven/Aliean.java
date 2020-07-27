package com.techreloded.springMaven;

public class Aliean {
	
	private int age;
	
	private Computer computer;
	
	public Aliean() {
		System.out.println("Aliean created......");
	}
	
	

	

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		System.out.println("Age set");
		this.age = age;
	}
	
	public void code() {
		System.out.println("I'm codeing...");
		computer.compile();
	}



	public Computer getComputer() {
		return computer;
	}



	public void setComputer(Computer computer) {
		this.computer = computer;
	}
}
