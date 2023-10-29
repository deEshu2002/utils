// Enter an array of stock prices prices, 
// you can perform at most max_ktransactions, 
// each transaction requires additional consumption feeThere is a handling fee,
// and after each transaction, you need to go through cooldownThere is a freezing period of 3 days before the next transaction can be made.
// Please calculate and return the maximum profit that can be obtained. 

int maxProfit_all_in_one(int max_k, int[] prices, int cooldown, int fee){
    int n = prices.length;

    if(n <= 0){
        return 0;
    }

    if(max_k > n/2){
        // infinite number of transactions possible
    }

    for(int i = 0; i < n; i++){
        dp[i][0][0] = 0;
        dp[i][0][1] = Integer.MIN_VALUE;
    }


    int[][][] dp = new int[n][k+1][2];

    for(int i = 0; i < n; i++){
        for( int k = max_k; k >= 1; k--){

            if(i-1 == -1){
                dp[i][k][0] = 0;
                dp[i][k][1] = -prices[i] - fee;
                continue;
            }

            if(i - cooldown < 0){
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][0] = Math.max(dp[i-1][k][1], - prices[i] - fee);
                continue;
            }

            dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
            dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-cooldown][0] - prices[i] - fee);
        }
    }
    return dp[n-1][max_k][0];
}
