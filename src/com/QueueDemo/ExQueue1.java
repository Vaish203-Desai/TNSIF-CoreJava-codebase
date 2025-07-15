package com.QueueDemo;
import java.util.*;

public class ExQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> r=new LinkedList<Integer>();
		
		r.add(60);
		r.add(10);
		r.add(12);
		r.add(20);
		r.add(3);
		r.add(13);

		System.out.println(r);
		
		int positionPeek=r.peek();
		System.out.println(positionPeek);
		
		int positionElement=r.element();
		System.out.println(positionElement);
		
		System.out.println(r.remove(12));
		System.out.println("12 is deleted"+ r);
	}
	

}
