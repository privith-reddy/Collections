package com.domain;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample 
{

	public static void main(String[] args) 
	{
        ArrayList<String> all = new ArrayList<String>();
		
		all.add("home");
		all.add("about us");
		all.add("training");
		all.add("placements");
		System.out.println(all);
		System.out.println("***********");
		
		ListIterator<String> li = all.listIterator();
		

		while(li.hasNext() == true) 
		{
			System.out.println(li.next());
		}
		System.out.println("*********");

		while(li.hasPrevious() == true) 
		{
			System.out.println(li.previous());
		}
		
		

	}

}
