package ArrayType;

public class NO283_An {
	//
	 public void moveZeroes(int[] nums) {
	        int slowindex =0;
	        int size  = nums.length;
	        for(int i=0;i<size;i++)
	        {
	            if(nums[i]!=0)
	            {
	                nums[slowindex++]=nums[i];
	            }
	        }
	        while(slowindex<size)
	        {
	            nums[slowindex++]=0;
	        }
	    }
}
