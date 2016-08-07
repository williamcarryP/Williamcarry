private static int findMinCoins(final int[]coins, final int sum){
    int[] calculationsCache = new int[sum+1];
    for(int i = 0; i <= sum; i++){
        calculationsCache[i] = Integer.MAX_VALUE;
    }
    calculationsCache[0]=0;/*sum 0 , can be made with 0 coins*/
    for(int i = 1; i <= sum; i++){
        for(int j = 0; j < coins.length; j++){
            if(i >= coins[j] && i - coins[j] >= 0 && calculationsCache[i-coins[j]]+1 < calculationsCache[i]){
                calculationsCache[i] = calculationsCache[i-coins[j]]+1;
            }
        }
    }
    return calculationsCache[sum];
}