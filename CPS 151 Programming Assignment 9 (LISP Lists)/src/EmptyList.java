/*
	 *EmptyList.java
	 * Danielle Taylor, taylord24
	 */


	/*
	 * EmptyList.java
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


public class EmptyList implements LispList {
	
	public EmptyList() {

	}
	
	
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object head() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public LispList tail() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	
	  public String toString() { return ""; }

	@Override
	public LispList cons(Object obj) {
		return new NonEmptyList(obj,this);
	}


	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public LispList merge(LispList other) {
		// TODO Auto-generated method stub
		return other;
	}


	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public LispList append(LispList other) {
		// TODO Auto-generated method stub
		return other;
	}
	  
	  
}
