package com.domain;

import java.util.ArrayList;

public class ArrayListAddingObject
{

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("sathya");
		al.add("Privith");
		al.add("Shiva");
		
		Student s1 = new Student(101, "Sai");
		Student s2 = new Student(102, "Ravi");
		Student s3 = new Student(103, "Mahesh");
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		for(Student s : al1) 
		{
			System.out.println(s.id);
			System.out.println(s.name);
		}
		
	}

}

class Student
{
	public int id;
	public String name;
	
	public Student(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
}