package January;

public class NO459 {
	 public int strStr(String haystack, String needle) {
	        if(needle.length()==0)return 0;
	        int []next =new int[needle.length()];
	        getNext(needle,next);
	        int index = tomatch(haystack,needle,next);
	        return index;
	    }
	    
	   
	    private void  getNext(String needle,int []next)
	    {
	        int j=-1;
	        next[0]=j;
	        for(int i=1;i<needle.length();++i)
	        {
	            while(j>=0&&needle.charAt(i)!=needle.charAt(j+1))j=next[j];
	            if(needle.charAt(i)==needle.charAt(j+1))++j;
	            next[i]=j;
	        }
	    }
	    private int tomatch(String haystack,String needle,int []next)
	    {
	        int j=-1;
	        for(int i=0;i<haystack.length();++i)
	        {
	            while(j>=0&&haystack.charAt(i)!=needle.charAt(j+1))
	            {
	                j =next[j];
	            }
	            if(haystack.charAt(i)==needle.charAt(j+1))++j;
	            if(j==needle.length()-1)
	            {
	                return i-needle.length()+1;
	            }
	        }
	        return -1;
	    }
}
