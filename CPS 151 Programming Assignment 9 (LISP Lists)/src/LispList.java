/*
	 *LispList.java
	 * Danielle Taylor, taylord24
	 */


	/*
	 * LispList.java
	 * Danielle Taylor, taylord24
	 */

	/*
	 *
	 * Name: Danielle Taylor
	 * User Name: taylord24
	 * Assignment: 9
	 *
	 * Description:
	 * 
	 * NonEmptyList and EmptyList extend LispList
	 * 
	 * The EmptyList class has no instance variables.
Its head and tail methods simply throw an UnsupportedOperationException, and its empty method returns true.
The NonEmptyList class has instance variables for the head (Object) and tail (LispList).
Its head and tail methods are accessors for its instance variables, and its empty method returns false.
	 *
	 */
	
	public interface LispList
    {
       boolean empty();
       Object head();
       LispList tail();
       
       
       String toString();
       
       
       LispList cons(Object obj);
       LispList NIL  = new EmptyList();
       
       int length();
       LispList merge(LispList other);
       boolean contains(Object obj);
       LispList append(LispList other);
    }
	 
