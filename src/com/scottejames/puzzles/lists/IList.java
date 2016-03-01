package com.scottejames.puzzles.lists;

public interface IList {

	void addElement(Object o);
	Object get(Integer index);
	void reverseList();
	String toString();

}