package SlidingWindow;

public class NO209_BADtime {
	//����ѭ������ ���� N^2
	 public int minSubArrayLen(int target, int[] nums) {
	        int res=nums.length+1;
	        int size= nums.length;
	        int sum ;
	        for(int i=0;i<size;i++)
	        {
	            sum = 0;
	            for(int j=i;j<size;j++)
	            {
	                //���䣺
	                sum += nums[j];
	                //���������� Ӧ������һ��ֵ���ۼ� ������ ����i j���
	                if(sum<target)continue;
	                else
	                {
	                    if(res>=(j-i+1))res=(j-i)+1;
	                    break;
	                }

	            }
	        }
	        if(res==nums.length+1)res=0;
	        return res;
	    }
}
