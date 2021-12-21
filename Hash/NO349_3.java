package HASHSET;

public class NO349_3 {
	   public int[] intersection(int[] nums1, int[] nums2) {
	        if(nums1==null||nums2==null)return null;
	        Set<Integer> num1 = new HashSet();
	        Set<Integer> num2 = new HashSet();
	        for(int i:nums1)
	        {
	            num1.add(i);
	        }
	        for(int i:nums2)
	        {
	            if(num1.contains(i))
	            {
	                num2.add(i);
	            }
	        }
	       int[] result = new int[num2.size()];
	       int start=0;
	       for(int item:num2)
	       {
	           result[start++]=item;
	       }
	       return result;
	    }

}
