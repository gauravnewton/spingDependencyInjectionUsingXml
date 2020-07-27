package com.techreloded.springMaven;

public class Aliean {
	
	private int age;
	
	private Laptop laptop;
	
	/*
	 * public Aliean(){ System.out.println("Aliean created......"); }
	 */
	
	public Aliean(int age) {
		this.age = age;
	}

	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
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
		laptop.compile();
	}
}
