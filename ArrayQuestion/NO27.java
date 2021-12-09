package ArrayType;

public class NO27 {
	//快慢指针可以不用显式的写出来 快慢指针实质上只要一个递进的速度大于等即可
	//所以while这一部分可以直接用一次for循环 for循环的速度必然大于慢指针
	public int removeElement(int[] nums, int val) {
        //解法二 快慢指针
        int fast = 0,slow = 0;
        int size = nums.length;
        while(fast<size)
        {
            if(nums[fast]!=val)
            {
               nums[slow++]=nums[fast++];
            }else
            {
                ++fast;
            }
        }
        return slow;
    }
}
