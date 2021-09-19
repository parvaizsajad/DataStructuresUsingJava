package linkedHashMap;

import java.time.LocalDate;

import linkedHashMap.LinkedHashMap.Inner.core;

public class LinkedHashMap {
	int outer=10;
	class Inner{
		String name;
		class core extends Inner{
			public core(String name) {
				this.name=name;
				// TODO Auto-generated constructor stub
			}
			LocalDate date;
			public void showDate() {
				System.out.println("the date is\t"+date.now());
				
			}
		}
		
	 public void display() {
		
		
		 LinkedHashMap hm= new LinkedHashMap();
		 System.out.println("The id is \t"+hm.outer);
		 System.out.println("Hi my name is \t"+name);
		 
        
	 }
	 
	}

	public static void main(String[] args) {
		LinkedHashMap ot =new LinkedHashMap();
		//Inner in=ot.new Inner("parvaiz");
//in.display();
core c=ot.new Inner().new core("parvaiz");
c.showDate();
c.display();





	}

	
}
