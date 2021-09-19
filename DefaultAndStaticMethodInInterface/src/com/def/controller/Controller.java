package com.def.controller;

import java.util.ArrayList;
import java.util.List;

import com.def.Interface.MyInterface;
import com.def.InterfaceImp.InterfaceImpl;
import com.def.model.Students;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface=new InterfaceImpl();
		List <Students> StudentList=new ArrayList<>();
		StudentList.add(new Students("cparvaiz", 19));
		StudentList.add(new Students("bsajad", 50));
		StudentList.add(new Students("atahira", 45));
		List<Students> sortStudents=myInterface.sortStudents(StudentList);
		for(Students students: sortStudents)
		{
			System.out.println("the studentds are \t:"+students.getName()+"\t the age is\t"+students.getAge());
		}
		System.out.println("-----------------------------------------------");
		MyInterface.greet("parvaiz");
		System.out.println("-----------------------------------------------");
		List<Integer> li=new ArrayList<Integer>();
		li.add(500);
		li.add(200);
		li.add(300);
		li.add(400);
		Integer maxNum=myInterface.getmax(li);
		System.out.println("the maxnum is  \t "+maxNum);
		myInterface.sum();
	}

}
