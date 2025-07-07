package com.first;

public class typeCasting {

	public static void main(String[] args) {
		// converting Types of data : Narrowing- larger DT into Smaller, Widening- smaller DT into larger
		
		int a= 56;
		float marks = 87.80f;
		long no = 9420271015l;
		char ch= 'v';
		
		
		System.out.println("Marks in natural no."+ (int)marks);
		System.out.println("Marks in decimal no."+ marks);
		System.out.println( (float)a);
		System.out.println((long)a);
		System.out.println("long into int: "+ (int)no);
		System.out.println("Char into int :"+ (int)ch);
		System.out.println("char into float   :"+ (char)marks);

	}

}
