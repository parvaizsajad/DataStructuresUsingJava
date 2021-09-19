package com.def.Interface;

import java.util.Collections;
import java.util.List;

import com.def.model.Students;

public interface MyInterface{
	//if we want a method in an interface we need to use the default keyword before the method signature.
	default public List<Students> sortStudents(List<Students> studentList){
		Collections.sort(studentList);
		return studentList;
	}
//	another simple normal method with its body
 default public void sum() {
	 int age=18;
	 int name=19;
	 System.out.println("the sum is:\t"+(name+age));
 }
 //now we are creating the static method inside our interface
 public static void greet(String name)
 {
	 System.out.println("welcome \t"+name);
 }
 // now we are creating the abstract method which was there before 8 also
 public abstract Integer getmax(List<Integer> integerList);

}
