package com.scottejames.puzzles.lists;

public class Node {

	private Node _next = null;
	private Node _previous = null;
	private Object _value = null;

	public Node(Object value, Node previous, Node next) {
		_next = next;
		_previous = previous;
		_value = value;
	}

	public Node(Object value) {
		_value = value;
		_next = null;
		_previous = null;
	}

	public Node getNext() {
		return _next;
	}

	public Node getPrevious() {
		return _previous;
	}

	public void setNext(Node next) {
		_next = next;
	}

	public void setPrevious(Node previous) {
		_previous = previous;
	}

	public String toString() {
		return "<"+ _value + ">";
	}
}
