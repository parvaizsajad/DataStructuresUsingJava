package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList<Integer> arr=new  ArrayList<>() ;
		arr.add(12);
		arr.add(4);
		arr.add(6);
		arr.add(1);
		arr.add(7);
		
		System.out.println("this is stream example in one line");
		arr.stream().filter(i->i%2==0).forEach(x->System.out.println(x));
		System.out.println("this is the stream example in one line");

	//this is from the stream	
	List<Integer> newal =arr.stream().filter(i->i>5).collect(Collectors.toList());
		newal.forEach(System.out::println);
		System.out.println("this is end of stream");
		//end of the stream
	
		List<Integer> arrfm= findmeth(arr);
		
		for(Integer i:arrfm) {
			System.out.println(i);
		}

	}
public static List<Integer> findmeth(ArrayList<Integer> arry){
	List<Integer> li= new ArrayList<Integer>();
	for(Integer i:arry) {
		if(i<5) {
			li.add(i);
		}
	}
	return li;
	
}
	

}
