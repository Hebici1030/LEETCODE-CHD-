package January;

public class NO343 {
	int []dp = new int[n+1];
    dp[0]=0;dp[1]=1;
    for(int i=2;i<n+1;++i)
    {
        for(int j=1;j<=i-1;++j)
        {
            dp[i]=Math.max(dp[i],(i-j)*j);
            dp[i]=Math.max(dp[i],dp[j]*(i-j));
        }
    }
    return dp[n];
}
