package com.myinterface;

import java.util.Collections;
import java.util.List;

import com.students.students;

public interface MyInterface {
	default public List<students> studentList(List<students> stuList){
		Collections.sort(stuList);
		return stuList;
		
	}
 public abstract int sum(int num1,int num2);

 public abstract int getmax(List<Integer> integerList);
 

}
