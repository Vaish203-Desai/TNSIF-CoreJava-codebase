package com.finaldemo;

final class FinalClass{
	
	void show ()
	{
		System.out.println("Final class cannot be inherited");
	}
}



public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass f=new FinalClass();
		f.show();


	}

}
