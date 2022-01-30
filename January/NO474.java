package January;

public class NO474 {
	  int[][] dp = new int[m + 1][n + 1];
      int oneNum, zeroNum;
      for (String str : strs) {
          oneNum = 0;
          zeroNum = 0;
          for (char ch : str.toCharArray()) {
              if (ch == '0') {
                  zeroNum++;
              } else {
                  oneNum++;
              }
          }
          //µ¹Ðò±éÀú
          for (int i = m; i >= zeroNum; i--) {
              for (int j = n; j >= oneNum; j--) {
                  dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
              }
          }
      }
      return dp[m][n];
}
