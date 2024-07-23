package com.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class AssignmentOne 
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
		
		int loc = all.indexOf("about us");
		System.out.println(loc);
		
		all.set(loc, "About us");
		System.out.println(all);
		System.out.println("*******");
		
		
		all.add("enquiry");
		System.out.println(all);
		System.out.println("***********");
		
		
		int loc1 = all.indexOf("placements");
		all.add(loc1 + 1, "projects");
		System.out.println(all);
		System.out.println("*********");
		
		String str = all.get(3);
		String rev = "";
		/*StringBuilder sb = new StringBuilder();
		sb.append(str);
		str = sb.reverse().toString();
		all.set(3, str);
		System.out.println(all);*/
		for(int i = str.length()-1; i>=0;i--) 
		{
			rev += str.charAt(i);
		}
		all.set(3, rev);
		System.out.println(all);
		System.out.println("********");
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("palle");
		hs1.add("technologies");
		
		all.addAll(hs1);
		System.out.println(all);
		System.out.println("*******");
		
		HashSet<String> hs2 = new HashSet<String>();
		
		hs2.add("Skill");
		hs2.add("gun");
		hs2.add("technologies");
		hs2.add("placements");
		
		all.retainAll(hs2);
		System.out.println(all);
		
		
		

	}

}
