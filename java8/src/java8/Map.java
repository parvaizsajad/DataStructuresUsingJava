package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new  ArrayList<>() ;
		arr.add(12);
		arr.add(4);
		arr.add(6);
		arr.add(1);
		arr.add(7);
		arr.stream().map(i->i*2).forEach(i->System.out.println(i));
		//List<Integer> li =arr.stream().map(i->i-1).collect(Collectors.toList());
		//li.forEach(System.out::println);
		arr.stream().map(i->i*2).forEach(System.out::println);
		
	}

}
