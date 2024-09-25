package reversing_array;

public class reversing_class {
	  public static void reverse(int[] array)
	    {
	        int[] result = new int[array.length];
	        
	        int index1 = 0;
	        int index2 = result.length-1;
	        
	        while (index1 < array.length && index2 >= 0)
	        {
	            result[index2] = array[index1];
	            
	            index1++;
	            index2--;
	        }
	        
	        for (int i = 0; i < array.length; i++)
	        {
	            array[i] = result[i];
	        }
	    }

}
