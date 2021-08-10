package org.login;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Employee {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		//System.out.println(l);
		int size=l.size();
		//System.out.println(size);
		Object value=l.get(2);
		//System.out.println(value);
		l.remove(2);
		System.out.println(l);
		l.add(4,1000);
		System.out.println(l);
		l.set(6, 20000);
		System.out.println(l);
		l.set(2,500);
		System.out.println(l);
	}
}
