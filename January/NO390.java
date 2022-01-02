package January;

public class NO390 {
	 public int lastRemaining(int n) {
	        int remain  =n;
	        int first =1;
	        int step = 1;
	        boolean startLeft = true;
	        while(remain>1)
	        {
	            if(startLeft||(remain%2)!=0)first+=step;

	            startLeft= !startLeft;
	            step*=2;
	            remain>>=1;
	        }
	        return first;
	    }
}
