package GreedyAlgorithm;

public class NO605anther {
	//˼·�������ܲ����Ļ�
	 public boolean canPlaceFlowers(int[] flowerbed, int n) {
	        int res=0;
	        int size= flowerbed.length;
	        for(int i=0;i<size;i++)
	        {
	            if(flowerbed[i]==0&&
	            		/*
	            		 * //ֵ��ѧϰ�ĵ� ���ж�ʱ�������ж�i�ı߽����⣬����������Ͳ��ᷢ������
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
