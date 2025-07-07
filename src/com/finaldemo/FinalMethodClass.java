package com.finaldemo;

public class FinalMethodClass {
	public FinalMethodClass() {
		System.out.println("this is a default constructor ");
	}
	
	final int a=50;
	
	final void show()
	{
		System.out.println("value of a "+ a);
	}
	

}
