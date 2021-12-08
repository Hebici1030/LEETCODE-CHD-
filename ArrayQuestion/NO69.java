package ArrayType;

public class NO69 {
	  public int mySqrt(int x) {
	        if(x==1)return 1;
	        int left=0,right=(x>>1)+1;
	        while(right-left>1)
	        {
	            int mid = left+((right-left)>>1);
	            if(x/mid<mid)
	            {
	                right = mid;
	            }else left=mid;
	        }
	        return left;
	    }
}
