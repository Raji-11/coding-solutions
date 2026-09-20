class Solution {

    static int countWays(int n) {
        // add your code here
        if(n==0) return 0;
        if(n<=2) return n; 
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=2;
        dp[2]=4;
        for(int i=3;i<n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n-1];
    }
}
