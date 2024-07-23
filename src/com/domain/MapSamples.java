package com.domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSamples 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(1, "Privith");
		hm.put(2,"Shiva");
		hm.put(3, "Sathya");
		hm.put(3, "Sai");
		//System.out.println(hm);
		
		for(Map.Entry<Integer, String> i : hm.entrySet())
		{
			System.out.println(i.getKey());
			System.out.println(i.getValue());
		}
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		
		lhm.put("#00000", "White");
		lhm.put("#99999", "Black");
		
		for(Map.Entry<String, String> i1 : lhm.entrySet())
		{
			System.out.println(i1.getKey());
			System.out.println(i1.getValue());
		}
		
		TreeMap<String, String> tm = new TreeMap<String, String>();
		
		tm.put("Privith@gmail.com", "12345");
		tm.put("Shiva@gmail.com", "54321");
		tm.put("Sathya@gmail.com", "12345");
		
		for(Map.Entry<String, String> i2 : tm.entrySet())
		{
			System.out.println(i2.getKey());
			System.out.println(i2.getValue());
		}

	}

}
