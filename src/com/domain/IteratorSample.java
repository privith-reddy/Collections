package com.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample 
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
		
		Iterator<String> i = all.iterator();
		
		while(i.hasNext() == true) 
		{
			System.out.println(i.next());
		}
		
		
	}

}
