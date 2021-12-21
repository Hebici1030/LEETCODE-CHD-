package HASHSET;

public class NO349 {
	  public int[] intersection(int[] nums1, int[] nums2) {
	Set<Integer> result = new HashSet();
    if(nums1==null||nums2==null)return null;
    int len = nums1.length;
    for(int i =0;i<len;i++)
    {
        if(cheakIsExit(nums2,nums1[i]))
        {
            result.add(nums1[i]);
        }
    }
    
     int finalResule[] =new int [result.size()];
    int start =0;
    for(int item:result)
    {
        finalResule[start++]=item;
    }
    return finalResule;
}
private static boolean cheakIsExit(int []nums,int cur)
{
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==cur){return true;}
    }
    return false;
}
}
