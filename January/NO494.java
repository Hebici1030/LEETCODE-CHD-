package January;

public class NO494 {
	  int n = nums.length;
      int sum=0;
      for(int temp:nums)sum+=temp;
      if(sum+target<0)return 0;
      if((sum+target)%2!=0) return 0;
      int size = (target + sum) / 2;
      if(size < 0) size = -size;
       int[] dp = new int[size + 1];
      dp[0] = 1;
      for (int i = 0; i < nums.length; i++) {
          for (int j = size; j >= nums[i]; j--) {
              dp[j] += dp[j - nums[i]];
          }
      }
      return dp[size];

}
