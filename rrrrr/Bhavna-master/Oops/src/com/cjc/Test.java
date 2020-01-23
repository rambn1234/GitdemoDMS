package com.cjc;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account ac=new Account();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(oos);
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account ac1=(Account)ois.readObject();
		System.out.println(ac1.uname);
		System.out.println(ac1.pwd);
		
		
	}

}
