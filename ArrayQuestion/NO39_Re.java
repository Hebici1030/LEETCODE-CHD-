package ArrayType;

public class NO39_Re {
	 public int[] searchRange(int[] nums, int target) {
	        int [] ans = new int[]{-1,-1};
	        int left  =0,right = nums.length-1;
	        int  size = nums.length;
	        while(left<=right)
	        {
	             int mid = left+((right-left)>>1);
	             if(nums[mid] < target)
	             {
	                left = mid+1;
	             }else if(nums[mid] > target)
	             {
	                  right = mid-1;
	             }else
	             {
	                 int start = mid;
	                int end = mid;
	                while (start >= 0 && nums[start] == target) {
	                    start--;
	                }
	                while (end <= size - 1 && nums[end] == target) {
	                    end++;
	                }
	                ans[0] = start + 1;
	                ans[1] = end - 1;
	                return ans;
	        }
	    }
	    return  ans;
	    }
}
