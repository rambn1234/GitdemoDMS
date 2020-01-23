package com.cjc;

import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Student>{
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Student o)
	{
		
	
				return this.id-o.id; 
	
	}
 public static void main(String[] args) {
	
	 Student s=new Student();
	 s.setId(1);
	 s.setName("Nikhil");
	 
	 Student s1=new Student();
	 s.setId(2);
	 s.setName("Ram");
     
	 Set< Student> s4=new HashSet<>();
	 s4.add(s);
	 s4.add(s1);
	 
	 for(Student ss:s4)
	 {
		System.out.println( ss.getId());
		System.out.println(ss.getName());
		 
	 }
 
 }
	
}
