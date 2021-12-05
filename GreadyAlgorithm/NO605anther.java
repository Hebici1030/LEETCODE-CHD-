package GreedyAlgorithm;

public class NO605anther {
	//思路：尽可能插入多的花
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int res=0;
	        int size= flowerbed.length;
	        for(int i=0;i<size;i++)
	        {
	            if(flowerbed[i]==0&&
	            		/*
	            		 * //值得学习的点 或判断时可以先判断i的边界问题，这样子数组就不会发生报错
	            		 */
	            		
	              (i+1==size||flowerbed[i+1]==0)
	              &&(i==0||flowerbed[i-1]==0)
	              )
	              {
	                  flowerbed[i]=1;
	                  res++;
	              }
	        }
	        return res>=n;
	    }
}
