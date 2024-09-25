
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static void selectionSort(int a[]) {
		
		int n = a.length;
		
		for (int i=0; i<n-1; i++) {
			int min = i;
			
			for(int j=i+1; j<n; j++) {
				if (a[min]>a(j)) {
					min = j;
				}
				}
			}
		}
		
	}
	
}
