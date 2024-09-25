/** A class of static methods for sorting an array of integers
    from smallest to largest.
    @author Frank M. Carrano
*/

public class IntegerSorter
{
	private static int counter = 0;
	
	/*
	   This program demonstrates the insertion sort algorithm by
	   sorting an array that is filled with random numbers.
	*/
	public static void main(String[] args)
	{ 
	    final int FIRST_SIZE = 10000;
	    final int LAST_SIZE = 90000;
	   
	    System.out.println("Array Size\tNumber of Comparisons");
	   
	    for (int size = FIRST_SIZE; size <= LAST_SIZE; size+=10000) {
	        int[] a = ArrayUtil.randomIntArray(size, size);
	        IntegerSorter.resetCounter();
	        IntegerSorter.insertionSort(a);
	        if (ArrayUtil.isSorted(a)) {
	            System.out.println(size + "\t" + IntegerSorter.getCounter());
	        }
	    } // end for loop
	} // end main method
	
    public static void insertionSort(int[] a)
    {
        insertionSort(a, 0, a.length - 1);
	} // end insertionSort
   
	public static void insertionSort(int[] a, int first, int last)
	{
		for (int unsorted = first + 1; unsorted <= last; unsorted++)
		{  
         // Assertion: a[first] <= a[first + 1] <= ... <= a[unsorted - 1]
			int firstUnsorted = a[unsorted];
			insertInOrder(firstUnsorted, a, first, unsorted - 1);
		} // end for
	} // end insertionSort
   
   // Inserts a given entry into the sorted array 
   // segment extending from a[begin] to a[end].
	private static void insertInOrder(int entryToInsert, int[] a, 
                                     int begin, int end)
	{
		int index = end;
		while ((index >= begin))
		{
			counter++;
			if (entryToInsert < a[index]) {
				a[index + 1] = a[index];   // make room
				index--;
			} else {
			    break;                     //  found place for entry; stop
			} // end if/else
		} // end while
		
		// Assertion: a[index + 1] is available
		a[index + 1] = entryToInsert; // insert
      
      // Assertion: a[begin] <= a[begin + 1] <= ... <= a[end + 1]
	} // end insertInOrder
	
	public static int getCounter() {
		return counter;
	}
	
	public static void resetCounter() {
		counter =  0;
	}
	
}  // end IntegerSorter

