package DoubleP;

public class NO167 {
	 public int[] twoSum(int[] numbers, int target) {
	        int begin =0,last = numbers.length-1;
	        int []res = {0,0};
	        while(begin<last)
	        {
	            if(target>numbers[begin]+numbers[last])++begin;
	            else if(target<numbers[begin]+numbers[last])--last;
	            else break;
	        }
	        res[0]=++begin;
	        res[1]=++last;
	        return res;
	    }
}
