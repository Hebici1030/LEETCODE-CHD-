package HASHSET;

public class NO202 {
	 public boolean isHappy(int n) {
	        int slow =n;
	        int fast = nextNum(n);
	        while(fast!=1&&slow!=fast)
	        {
	            slow = nextNum(slow);
	            fast = nextNum(nextNum(fast));
	        }
	        return fast==1;
	    }
	    private int nextNum(int n)
	    {
	        int result = 0;
	        while(n!=0)
	        {
	            int temp =n%10;
	            result+=temp*temp;
	            n/=10;
	        }
	        return result;
	    }
}
