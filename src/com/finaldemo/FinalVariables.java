package com.finaldemo;

public class FinalVariables {
final int x=100;
	
	
	final static int y;
	
	final static int z=10;
	
	void change()
	{
		//a=20;
	//x=30;  final varibles can t be change 
	//z=50; or re assign
	}

	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ", y=" + y +"]";
	}
	
	
	//declare a static block 
	static
	{
		y=20;
		//z=80;  once initialized can't be reassigned
		System.out.println("value of Y : "+ y);
	}
	
	

}
