package java8;

import java.util.Date;
import java.util.function.*;

public class Predicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Predicate	
  Predicate<String> pd= (s)-> s.length() <= 5;
  System.out.println(pd.test("par")); 
  //Function
  Function<Integer,Integer> sqme=(i)->i*i;
  System.out.println("the multiple of a number with itself is \t"+sqme.apply(5));
  //consumer
  Consumer<Integer> cn=(i)->System.out.println("this is the consumer example"+i*i);
  cn.accept(5);
  //Supplier
  Supplier<Integer> sp=()->25;
  System.out.println("this is the supplier "+sp.get());
  Supplier<Date> curd= ()->new Date();
  System.out.println(curd.get());
  
  
	}

}
