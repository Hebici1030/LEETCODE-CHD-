package January;

public class NO1049 {
	 int sum = 0;
     for (int i : stones) {
         sum += i;
     }
     int target = sum >> 1;
     //��ʼ��dp����
     int[] dp = new int[target + 1];
     for (int i = 0; i < stones.length; i++) {
         //���õ���
         for (int j = target; j >= stones[i]; j--) {
             //���������Ҫô�ţ�Ҫô����
             dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
         }
     }
     return sum - 2 * dp[target];
}
