package ArrayType;

public class NO26 {
	  public int removeDuplicates(int[] nums) {
	        //javaԭ��ɾ������������ظ���
	        if(nums.length<=1)
	        {
	            return nums.length;
	        }
	        int res=0;
	        int i =0;
	        while(i<nums.length)
	        {
	            if(nums[i]==nums[res])
	            {
	                i++;
	                continue;
	            }else
	            {
	                nums[++res]=nums[i++];
	            }
	        }
	        return res+1;
	    }
}
