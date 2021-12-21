package HASHSET;

public class NO349_2 {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet();
        Set<Integer> num2 = new HashSet();
        for(int i:nums1)
        {
            num1.add(i);
        }
        for(int j:nums2)
        {
            num2.add(j);
        }
       num1.retainAll(num2);
       int[] result = new int[num1.size()];
       int start=0;
       for(int item:num1)
       {
           result[start++]=item;
       }
       return result;
    }

}
