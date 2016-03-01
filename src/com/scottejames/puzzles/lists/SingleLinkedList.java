package com.scottejames.puzzles.lists;
public class SingleLinkedList implements IList{

	public Node _head = null;
	public Node _tail = null;
	public int _length = 0;
	
	public SingleLinkedList()
	{
		
	}
	
	public void addElement(Object o)
	{
		_length++;
		Node n = new Node(o);
		if (_head == null)
		{
			_head = n;
			_tail = _head;
		}
		else
		{
			_head.setNext(n);
			_head = n;
		}
	}
	
	public void reverseList()
	{

		Node current = null;
		Node prev = null;
		Node next = null;
		
		current = _tail;
		while (current!=null)
		{
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		_tail = prev;

	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		Node n = _tail;
		while(n!=null)
		{
			sb.append(n.toString());
			n = n.getNext();
			if (n!=null){
				sb.append(" -> ");
			}
			
		}
		return sb.toString();
	}

	public void displayString()
	{
		Node n = _tail;
		while (n!=null)
		{
			String next = n.getNext()==null?"null":n.getNext().toString();
			
			System.out.println("(" + n.toString() + ") -> (" + next + ")");
			
			n = n.getNext();
		}
	}
	
	@Override
	public Object get(Integer index) {
		
		Node n = _tail;
		for (int i=0; i< index; i++)
		{
			n= n.getNext();
		}
		return n;
	}
}
