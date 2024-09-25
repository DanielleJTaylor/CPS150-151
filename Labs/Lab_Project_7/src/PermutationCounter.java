

	
	
	public class PermutationCounter
	{
	    private int n;

	    public PermutationCounter(int numberOfItems)
	    {
	       n = numberOfItems;
	    }
	    
	    public long getCount()
	    {
	    	return getCount(n);
	    }

	    public long getCount(int n)
	    {
	    	 // Your work here
	    	int num = n;
	    	if (n<= 1) {
	    		return 1;
	    	}
	    	else
	    	{
	    		return getCount(n-1) * num;
	    	}
	   }
	    
	   
	} // end class PermutationCounter


