package January;

public class NO541 {
	 public String reverseStr(String s, int k) {
	        //˫ָ��
	        //ÿ����һ��2k��ִ��һ��˫ָ����ǰk������ת
	        char []res = s.toCharArray();
	        int left =0,right =0;
	        for(int i=0;i<s.length();i+=2*k)
	        {
	            left = i;
	            right = Math.min(s.length()-1,i+k-1);
	            while(left<right)
	            {
	                char temp = res[left];
	                res[left] =res[right];
	                res[right]=temp;
	                --right;++left;
	            }
	        }
	        return new String(res);
	    }
}
