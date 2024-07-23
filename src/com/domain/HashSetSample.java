package com.domain;

import java.util.HashSet;

public class HashSetSample 
{

	public static void main(String[] args) 
	{
		//{10,20,30,40,50} - It stores in Random Order or UnOrdered
		HashSet<Integer> hs = new HashSet<Integer>();
		// int --> Integer(Wrapper class)
		// float ---> Float, double ---> Double
		
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		
		System.out.println("Printing the data in HashSet");
		
		for(int i : hs) // for each loop
		{
			System.out.println(i);
		}
		System.out.println("*******");
		
		/*boolean b = hs.contains(20);
		System.out.println("Finding HashSet Or Not: " + b);
		System.out.println("*******");
		
		boolean b1 = hs.isEmpty();
		System.out.println("IsEmpty or not: " + b1);
		System.out.println("*******");
		
	    hs.remove(30);
		for(int i : hs) 
		{
			System.out.println(i);
		}
		System.out.println("********");
		
		hs.clear();
		for(int i : hs) 
		{
			System.out.println(i);
		}
		System.out.println("********");
		

		boolean b2 = hs.isEmpty();
		System.out.println("IsEmpty or not: " + b2);
		System.out.println("*******");*/
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(40);
		hs1.add(50);
		hs1.add(60);
		
        System.out.println("Printing the data in HashSet1");
		
		for(int i : hs1) // for each loop
		{
			System.out.println(i);
		}
		System.out.println("*******");
		
		hs.addAll(hs1);
		System.out.println("Printing the data in HashSet1");
		for(int i : hs) // for each loop
		{
			System.out.println(i);
		}
		System.out.println("*******");
		
		Object o = hs.clone();
		System.out.println(o);
		
		int s = hs.size();
		System.out.println("Size of HashSet 1: " + s);
		
		
	
	}
}
