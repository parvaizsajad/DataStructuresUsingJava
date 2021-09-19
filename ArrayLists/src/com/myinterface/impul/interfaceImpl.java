package com.myinterface.impul;

import java.util.Collections;
import java.util.List;

import com.myinterface.MyInterface;

public  class interfaceImpl implements MyInterface {

	@Override
	public int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
		
	}

	public int getmax(List<Integer> integerList) {
		int max= Collections.max(integerList);
		return max;

	

//	@Override
//	public Integer maxi(List<Integer> li) {
//		// TODO Auto-generated method stub
//		Integer sor=Collections.max(li);
//		return sor;
//	}

	
	}


	
	

}
