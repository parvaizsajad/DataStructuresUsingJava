package com.students;

public class students implements Comparable<students> {
private Integer age;
private String name;



public students(Integer age, String name) {
	super();
	this.age = age;
	this.name = name;
}



public Integer getAge() {
	return age;
}



public String getName() {
	return name;
}



@Override
public int compareTo(students o) {
	
	return this.getAge().compareTo(o.age);
}

}
