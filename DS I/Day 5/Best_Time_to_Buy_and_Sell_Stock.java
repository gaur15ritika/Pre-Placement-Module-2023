class Solution {
    public int maxProfit(int[] prices) {
      int  maxprof=0;
       int buy=prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
            else if(prices[i]-buy>maxprof){
                maxprof=prices[i]-buy;
            }
        }
        return maxprof;
    }
}
