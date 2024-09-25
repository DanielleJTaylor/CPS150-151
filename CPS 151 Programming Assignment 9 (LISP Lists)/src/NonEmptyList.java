/*
	 *NonEmptyList.java
	 * Danielle Taylor, taylord24
	 */


	/*
	 * NonEmptyList.java
	 * Danielle Taylor, taylord24
	 */

	/*
	 *
	 * Name: Danielle Taylor
	 * User Name: taylord24
	 * Assignment: 9
	 *
	 *Description:
	 * 
	 * NonEmptyList and EmptyList extend LispList
	 * 
	 * The EmptyList class has no instance variables.
Its head and tail methods simply throw an UnsupportedOperationException, and its empty method returns true.
The NonEmptyList class has instance variables for the head (Object) and tail (LispList).
Its head and tail methods are accessors for its instance variables, and its empty method returns false.
	 *
	 */


public class NonEmptyList implements LispList {
	
	Object head;
	LispList tail;
	
	public NonEmptyList(Object obj, LispList list) {
		head = obj;
		tail = list;
		}
	
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object head() {
		// TODO Auto-generated method stub
		return this.head;
	}

	@Override
	public LispList tail() {
		// TODO Auto-generated method stub
		return this.tail;
	}
	
	
	 public String toString() { return head() + " " + tail().toString(); }

	 
	@Override
	public LispList cons(Object obj) {
		return new NonEmptyList(obj, this);
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
	
		return 1 + tail.length();

	}

	@Override
	public LispList merge(LispList other) {
		//Adds the head of the list then call the merge method again and adds the head of the tail
		//repeats taking a head from each list until merge
		return new NonEmptyList(this.head, other.merge(this.tail));
	}

	@Override
	public boolean contains(Object obj) {
		LispList temp = tail;
		if (this.head.equals(obj)) {
			return true;
		}
		return temp.contains(obj);
		
		
		}

	@Override
	public LispList append(LispList other) {
		// TODO Auto-generated method stub
		return new NonEmptyList(new NonEmptyList(this.head, this.tail), other);
	}

	 
}
