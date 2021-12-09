package ArrayType;

public class NO977 {
	public int[] sortedSquares(int[] nums) {
        int leftIndex = 0,rightIndex = nums.length-1;
        int []res= new int[nums.length];
        int index = nums.length-1;
        while(leftIndex<=rightIndex)
        {
            if(nums[leftIndex]*nums[leftIndex]<nums[rightIndex]*nums[rightIndex])
            {
                res[index--]=nums[rightIndex]*nums[rightIndex];
                --rightIndex;
            }else
            {
                res[index--]=nums[leftIndex]*nums[leftIndex];
                ++leftIndex;
            }
        }
        return res;
    }
}
