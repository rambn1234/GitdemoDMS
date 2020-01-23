package com.cjc;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<String>();
    word.add("Tom");
    word.add("Jones");
    word.add("Sam");
    word.add("Jamie");
    word.add("Robie");
    word.add("Helen");
    word.add("Tom");

    ArrayList<String> nonDupList = new ArrayList<String>();

    Iterator<String> itr = word.iterator();
    while(itr.hasNext())
    {
    String dupWord = itr.next();
    if(nonDupList.contains(dupWord))
    {
        itr.remove();
    }else
    {
        nonDupList.add(dupWord);
    }
    }
  System.out.println(nonDupList);
}}
