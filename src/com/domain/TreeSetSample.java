package com.domain;

import java.util.TreeSet;

public class TreeSetSample 
{

	public static void main(String[] args)
	{
		TreeSet<Integer> ts =  new TreeSet<Integer>();
		ts.add(10);
		ts.add(30);
		ts.add(40);
		ts.add(20);
		//TreeSet will print only ascending order or sorted order 
		
		for(int i : ts) 
		{
			System.out.println(i);
		}
		System.out.println("*********");
		
		
		TreeSet<Integer> ts1 = (TreeSet<Integer>) new TreeSet<Integer>().descendingSet();
		ts1.add(10);
		ts1.add(30);
		ts1.add(40);
		ts1.add(20);
		
		for(int i : ts1) 
		{
			System.out.println(i);
		}
		
		
		
		
	}

}
