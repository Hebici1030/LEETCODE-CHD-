package GreedyAlgorithm;

public class NO605 {
	//缺点没有用到贪心思想
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int size = flowerbed.length;
	        int tag=1;
	        int res=0;
	      for(int i=0;i<size;i++)
	      {
	          if(flowerbed[i]==1)
	          {
	              tag=0;
	              continue;
	          }else
	          {
	              tag++;
	          }
	          if(tag==3)
	          {
	              res++;
	              tag=1;
	          }
	      }
	      if(tag==2)
	      {
	          res++;
	      }
	      return n<=res;
	    }
}
