class Solution {
    public int uniquePaths(int m, int n) {
        // int []dp = new int[n];
        // //Fill the first row with is 
        // java.util.Arrays.fill(dp,1);
        // for(int i=1;i<m;i++){
        //     for(int j=1;j<n;j++){
        //         dp[j] += dp[j-1];
        //     }
        // }
        // return dp[n-1];
//// Another approach using the math or the calculations...

        int N = m+n - 2;
        int k = Math.min(m-1,n-1);
        long res = 1;

        for(int i = 1;i<=k; i++){
            res = res * (N - k + i) / i;
        }
        return (int) res;
    }
}