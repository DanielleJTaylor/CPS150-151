import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] HashmapSolution(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		
		int length_of_nums = nums.length;
		
		for (int i=0; i<length_of_nums; i++) {
			int complement = target - nums[i];
			
			if (numMap.containsKey(complement)){
				return new int[] {numMap.get(complement),i};
			}
			
			numMap.put(nums[i], i); //adds element to map matched with i
		}
		 return new int[]{}; // If no solution found
	}
	
	public static void main(String[] args) {
		
		int[] nums = {0,3,3,2,4};
		int target = 7;
		System.out.println(Arrays.toString(HashmapSolution(nums,target)));

	}

}
