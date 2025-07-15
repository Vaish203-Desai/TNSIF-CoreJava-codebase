package com.ListDemo;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
		List list =new ArrayList();
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Vaish");
		list.add("Desai");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(12.5f);
		list.add(10);
		
		System.out.println("list is :"+list);
		System.out.println(list.size());
		System.out.println(list.contains(1));
		System.out.println(list.remove(12.5f));
		System.out.println("list is :"+list);
		System.out.println(list.lastIndexOf(20));
		System.out.println(list);
		
		
		//using Generics we accept specific type of data
		List<String> names=new ArrayList<String>();
		names.add("vaish");
		names.add(null);
		names.add("desai");
		names.add("Vaish");
		names.add("Data");
		System.out.println("list is :"+names);
		System.out.println("list size is :"+names.size());
		System.out.println("list is :"+names.indexOf("desai"));
		
		//traversing in list
		Iterator<String> i=names.iterator();
		while(i.hasNext()) {
			String nm=i.next();
			System.out.println(nm+ " ");
			
		}
		
		
	}

}
