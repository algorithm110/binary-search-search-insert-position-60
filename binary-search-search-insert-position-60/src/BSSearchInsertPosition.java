
public class BSSearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		// write your code here
		// empty array
		if (nums.length == 0)
			return 0;
		
		
		// target less than the first ele or larger than the last one
		if (target <= nums[0] )
			return 0;
		else if (target > nums[nums.length - 1])
			return nums.length;
		
		// target within the range
		
		int begin = 0;
		int end = nums.length -1 ;
		int mid = 0;
		
		while (begin + 1 < end) {
			mid = begin + (end - begin)/2;
			
			if (target == nums[mid])
				return mid;
			else if (target < nums[mid])
				end = mid;
			else if (target > nums[mid])
				begin = mid;
		}
		
		if (target == nums[begin])
			return begin;
		else if (target == nums[end])
			return end;
		else return end;
	
	}
}
