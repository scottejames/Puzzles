package com.scottejames.puzzles.lists;

public class ListTest {
	public static void main(String [] args)
	{
		SingleLinkedList l = new SingleLinkedList();
		
		l.addElement("One");
		l.addElement("Two");
		l.addElement("Three");
		
		l.displayString();
		l.reverseList();
		l.displayString();
		
		System.out.println(l.get(0).toString());
		System.out.println(l.get(1).toString());
		System.out.println(l.get(2).toString());


	}
}
