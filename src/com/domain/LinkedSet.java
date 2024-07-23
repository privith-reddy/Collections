package com.domain;

import java.util.LinkedHashSet;

public class LinkedSet 
{

	public static void main(String[] args) 
	{
		//It stores an Insertion order
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Privith");
		lhs.add("Sathya");
		lhs.add("Shiva");
		
		// Only two ways are their for printing or accessing data present in set.
		// Below are the two ways.
		
		System.out.println("1st way of print data in set");
		System.out.println(lhs);
		
		System.out.println("********");
		
		System.out.println("2nd way of print data in set");
		for(String s : lhs ) 
		{
			System.out.println(s);
		}
		System.out.println("********");
		
		
		
	}

}
