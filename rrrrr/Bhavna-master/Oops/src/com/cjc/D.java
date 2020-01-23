package com.cjc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D {
	//List<String> list = List.of("Java", "Kotlin", "Groovy");
/*	List<String> listOfString = new List<>();

	listOfString.add("Java");

	listOfString.add("Kotlin");

	listOfString.add("Groovy");

	listOfString.add("Scala");

	listOfString = Collections.unmodifiableList(listOfString);*/
	public static void main(String[] args) {
		
		 List<String> list=new ArrayList<String>();
		 list.add("A");
		 list.add("B");
		 list.add("A");
		 list.add("C");
		 
		 List<String> nonDup=new ArrayList<>();
		 
		 Iterator<String> itr=list.iterator();
		 while(itr.hasNext())
		 {
			 String s=itr.next();
		      if(nonDup.contains(s))
		      {
		    	  itr.remove();
		      }
		      else
		      {
		    	  nonDup.add(s);
		      }
		 
		 }
		System.out.println(nonDup);
		
		
		
		
		
	}
	

}
