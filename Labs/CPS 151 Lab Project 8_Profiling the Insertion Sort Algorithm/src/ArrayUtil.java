/*
 * ArrayUtil.java
 */

/**
 * Contains utility methods for array manipulation.
 */
public class ArrayUtil
{
    private ArrayUtil(){} // prevents object instantiation
    
    /*
     * Creates/return int array filled with random values.
     */
    public static int[] randomIntArray(int length, int n)
    {
        int[] a = new int[length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int) (Math.random() * n);
        }

        return a;
    } // end randomIntArray method

    /*
     * Swaps two array entries @ i and j.
     */
    public static void swap(int[] a, int i, int j)
    {
        if (i>=0 && i<a.length && j>=0 && j<a.length)
        {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    } // end swap method
    
    /*
     * Indicates whether array is sorted
     */
    public static boolean isSorted(int[] a)
    {
    	boolean sorted = true;
    	
    	for (int i=0; i<a.length-1 && sorted; i++)
    	{
    		sorted = a[i] <= a[i+1];
    	}
    	
    	return sorted;
    } // end isSorted method
} // end class ArrayUtil
