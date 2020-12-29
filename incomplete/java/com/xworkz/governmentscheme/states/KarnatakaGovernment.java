package com.xworkz.governmentscheme.states;

import com.xworkz.governmentscheme.scheme.UnionGovernment;

public class KarnatakaGovernment extends UnionGovernment {
	
   

	public KarnatakaGovernment() {
		super();//constructor
		String names=super.name;//property
		super.name();//method
		System.out.println("Default cons");
		
	}

	@Override
	public void ayushmanBharat() {
		//super();call constructor only in child class constructor
		//super.name; error so we can store the value in separate varibale
		String names=super.name;//property
		super.name();//method
		System.out.println("ayushmanBharat");
		
	}
	
	

}
