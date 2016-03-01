package com.scottejames.puzzles.lists;

public class DoubleLinkedList implements IList {

	public Node _head = null;
	public Node _tail = null;
	public int _length = 0;
	
	public DoubleLinkedList()
	{
		
	}
	
	/* (non-Javadoc)
	 * @see IList#addElement(java.lang.Object)
	 */
	@Override
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
			n.setPrevious(_head);
			_head = n;
		}
	}

	/* (non-Javadoc)
	 * @see IList#get(java.lang.Integer)
	 */
	@Override
	public Object get(Integer index)
	{
		Node n = _tail;
		for (int i=0; i< index; i++)
		{
			n= n.getNext();
		}
		return n;
	}
	/* (non-Javadoc)
	 * @see IList#reverseList()
	 */
	@Override
	public void reverseList()
	{
		Node current = null;
		Node temp = null;
		
		current = _tail;
		
		while (current!=null)
		{
			temp = current.getPrevious();
			
			current.setPrevious(current.getNext());
			current.setNext(temp);
			current = current.getPrevious();
		}
		
		temp = _head;
		_head = _tail;
		_tail = temp;
	}
	
	
	public void displayString()
	{
		Node n = _tail;
		while (n!=null)
		{
			String previous = n.getPrevious()==null?"null":n.getPrevious().toString();
			String next = n.getNext()==null?"null":n.getNext().toString();
			
			System.out.println("(" + previous + ") <- (" + n.toString() + ") -> (" + next + ")");
			
			n = n.getNext();
		}
	}
	/* (non-Javadoc)
	 * @see IList#toString()
	 */
	@Override
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
	
}
