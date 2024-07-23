package com.domain;

import java.util.ArrayList;

public class ArrayListSample
{

	public static void main(String[] args)
	{
		//It stores an Insertion order
		ArrayList<String> al = new ArrayList<String>();
		al.add("Privith");
		al.add("Sathya");
		al.add("Privith");
		al.add("Shiva");
		
		// Only three ways are their for printing or accessing data present in set.
		// Below are the two ways.
		
		System.out.println("1st way to access/print/display data from ArrayList: ");
		System.out.println(al);
		System.out.println("*********");
		
		
		System.out.println("2nd way to access/print/display data from ArrayList: ");
		for(int i = 0; i <= al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}
		System.out.println("*********");
		
		System.out.println("3rd way to access/print/display data from ArrayList: ");
		for(String s : al) 
		{
			System.out.println(s);
		}
		System.out.println("*********");
		
		al.add(2,"Vamshi");
		System.out.println(al);
		System.out.println("********");
		
		al.set(3,"sai");
		System.out.println(al);
		System.out.println("********");
		
		String s = al.get(1);
		System.out.println(s);
		System.out.println("********");
		
	}

}
