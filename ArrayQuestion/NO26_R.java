package ArrayType;

public class NO26_R {
	//×Ô¼ºÐ´µÄ AC100%
	 public int removeDuplicates(int[] nums) {
	        int slowindex =0;
	        int size = nums.length;
	        for(int i=1;i<size;i++)
	        {
	            if(nums[i]!=nums[slowindex])
	            {
	               nums[++slowindex]=nums[i];
	            }else
	            {
	               continue;
	            }
	        }
	        return slowindex+1;
	    }
}
