package lists;

public class LinkedList<E> {
	
	private Entry<E> head;
	private Entry<E> tail;
	private Entry<E> current;
	
	public LinkedList(E element){
		head = new Entry<E>(element);
		current = head;
		tail = head;
	}
	
	public void add(E element){
		// Create new entry
		if (head == null){
			head = new Entry<E>(element);
			current = head;
			tail = head;
		} else {
			Entry<E> lastEntry = last();
			Entry<E> newLast = new Entry<E>(element);
			lastEntry.setNext(newLast);
			tail = newLast;
		}
	}
	
	public Entry<E> last(){
		return tail;
	}
	
	
	
	
	public E next(){
		if (current != null){
			E nextElement = current.getElement();
			current = current.getNext();
			return nextElement;
		}
		return null;
	}
	
	public boolean hasNext(){
		return current != null;
	}
	
	
	
	
	private class Entry <E> {
		// Hold the object
		private E element;
		private Entry<E> next;
		
		public Entry(E element){
			this.element = element;
		}
		
		public void setNext(Entry<E> newNext){
			this.next = newNext;
		}
		
		public E getElement(){
			return element;
		}
		
		public Entry<E> getNext(){
			return next;
		}
	}
	
	
	public static void main (String[] args){
		System.out.println("Inside Linked List");
		// Create a linked list of integers
		LinkedList<String> myLL = new LinkedList<String>("First");
		myLL.add("Second");
		myLL.add("Third");
		
		while(myLL.hasNext()){
			System.out.println(myLL.next());
		}
		
		
	}
	
}