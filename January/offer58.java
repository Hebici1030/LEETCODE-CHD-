package January;

public class offer58 {
	  public String reverseLeftWords(String s, int n) {
	        StringBuffer res =new StringBuffer(s);
	        reverse(res,0,n-1);
	        reverse(res,n,s.length()-1);
	        return res.reverse().toString();
	    }
	    public void reverse(StringBuffer sb,int left,int right)
	    {
	        while(left<right)
	        {
	            char temp = sb.charAt(left);
	            sb.setCharAt(left++,sb.charAt(right));
	            sb.setCharAt(right--,temp);
	        }
	    }
}
