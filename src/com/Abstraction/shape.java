package com.Abstraction;

public abstract class shape {

	protected float area;
	
	//abstract method 
	public abstract void calArea();
	
	//solid method 
	public void show()
	{
		System.out.println("Area of  the shape is : "+ area);
	}
	
}