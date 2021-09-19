package com.def.model;

public class Students implements Comparable<Students>{// comparable interface is used so that we can use the user defined sorting .

	private String name;
	private Integer age;
	/**
	 * @param name
	 * @param age
	 */
	public Students(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	
	//here we are overridding the compareto method which is the abstract method in the Comparable interface.
	@Override
	public int compareTo(Students o) { //here we are providing the body for the compare to method which takes the argument of the student object
		
		// TODO Auto-generated method stub
		
		return this.name.compareTo((o.getName()));//this means the current class instance which means name is present in same class
	}
	
}
