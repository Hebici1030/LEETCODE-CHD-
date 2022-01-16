package January;

public class NO747 {
	public int dominantIndex(int[] nums) {
        int max1 =-1;
        int max2 =-1;
        int maxindex =-1;
        for(int i=0;i<nums.length;++i)
        {
            if(nums[i]>max1)
            {
                max2 =max1;
                max1 = nums[i];
                maxindex = i;
            }else if(nums[i]>max2)
            {
                max2 = nums[i];
            }
        }
        return max1>=(max2*2)?maxindex:-1;
    }
}
