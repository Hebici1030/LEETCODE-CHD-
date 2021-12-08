package ArrayType;

public class NO367 {
	 public boolean isPerfectSquare(int num) {
	        if(num==1)return true;
	        int left=0;int right = (num>>1)+1;
	        while(left<=right)
	        {
	            int mid = left+((right-left)>>1);
	            if(num/mid<mid)
	            {
	                right =mid-1;
	            }else if(num/mid>mid)
	            {
	                left =mid+1;
	            }else
	            {
	                if(num%mid==0) return true;
	                left = right+1;
	            }      
	        }

	        return false;
	    }
}
