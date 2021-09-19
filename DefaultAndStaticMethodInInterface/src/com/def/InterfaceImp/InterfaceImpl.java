package com.def.InterfaceImp;

import java.util.Collections;
import java.util.List;

import com.def.Interface.MyInterface;

public class InterfaceImpl implements MyInterface {



	@Override
	public Integer getmax(List<Integer> integerList) {
		Integer max= Collections.max(integerList);
		return max;
	}

}
