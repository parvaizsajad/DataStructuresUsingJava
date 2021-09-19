package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.myinterface.MyInterface;
import com.myinterface.impul.interfaceImpl;
import com.students.students;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi=new interfaceImpl();
		List<students> li=new ArrayList<students>();
		li.add(new students(20, "parvaiz"));
		li.add(new students(10,"aabid"));
		li.add(new students(50,"sajad"));
		List<students> stu=mi.studentList(li);
		System.out.println("------------------------------------------");
	
		stu.forEach((s)->System.out.println(s.getAge()+"\t"+s.getName()));
		System.out.println("---------------------------------------------");
		for(students st:stu)
		{
			System.out.println(st.getName()+" \t"+st.getAge());
		}
	
	System.out.println(mi.sum(45, 5));	
	List<Integer> li2=new ArrayList<Integer>();
	li2.add(500);
	li2.add(200);
	li2.add(300);
	li2.add(400);
	Integer maxNum=mi.getmax(li2);
	System.out.println("the maxnum is  \t "+maxNum);
	}
	

}
