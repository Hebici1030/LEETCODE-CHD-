package GreedyAlgorithm;

import java.util.Arrays;

public class no455 {
	    public int findContentChildren(int[] g, int[] s) {
	        Arrays.sort(g);
	        Arrays.sort(s);
	        int child=0;
	        int cookie = 0;
	        while(child<g.length&&cookie<s.length)
	        {
	            if(g[child]<=s[cookie])
	            {
	                ++child;
	            }
	            ++cookie;
	        }
	        return child;
	    }
	
}
