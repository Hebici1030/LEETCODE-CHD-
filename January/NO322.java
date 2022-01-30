package January;

public class NO322 {
	 int max = Integer.MAX_VALUE;
     int []dp =new int[amount+1];
   
     for (int j = 0; j < dp.length; j++) {
         dp[j] = max;
     }  dp[0] = 0;
     for(int i=0;i<coins.length;++i)
     {
         for(int j=coins[i];j<amount+1;++j)
         {
                 if (dp[j - coins[i]] != max) {
                 //选择硬币数目最小的情况
                 dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
             }
         }
     }
     return dp[amount] == max ? -1 : dp[amount];
}
