package HASHSET;

public class NO1 {
	 public int[] twoSum(int[] nums, int target) {
	        //ͨ��Hash���ٲ�����һ����
	        Map<Integer,Integer>  map = new HashMap<Integer,Integer>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(map.containsKey(target-nums[i]))
	            {
	                return new int []{i,map.get(target-nums[i])};
	            }
	            map.put(nums[i],i);
	        }

	        return new int[0];
	    }
}
