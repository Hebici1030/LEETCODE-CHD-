package January;

public class offer05 {
	 public String replaceSpace(String s) {
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<s.length();i++)
	        {
	            char a = s.charAt(i);
	            if(a==' ')sb.append("%20");
	            else
	            {
	                sb.append(a);
	            }
	        }
	        return sb.toString();
	    }
}
