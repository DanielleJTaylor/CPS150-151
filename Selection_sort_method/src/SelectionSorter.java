import java.util.Arrays;

/**
   The sort method of this class sorts an array, using the selection 
   sort algorithm.
*/
public class SelectionSorter
{
	 /**
    Sorts an array, using selection sort.
    @param a the array to sort
 */
 public static void sort(int[] a)
 { 
	 for (int i = 0; i < a.length -1;i++) { // loops for as length of array
		 int minPos = minimumPosition(a,i); // calls method that finds original position
		 ArrayUtil.swap(a, minPos, i); // swaps the minPos with the i in array a
		 System.out.println(Arrays.toString(a));
	 }
	 
 }

 /**
    Finds the smallest element in a tail range of the array.
    @param a the array to sort
    @param from the first position in a to compare
    @return the position of the smallest element in the
    range a[from] . . . a[a.length - 1]
 */

	private static int minimumPosition(int[] a, int from) {
		// TODO Auto-generated method stub
		int minPos = from;
		for (int i = from+1; i<a.length; i++) { //come from list from minPos to end 
			if (a[i] < a[minPos]) { //checking if a element is less than minPos
				minPos = i;   // if element is less then it's index becomes the minimum index
			}
		}
		return minPos;
	}
}
