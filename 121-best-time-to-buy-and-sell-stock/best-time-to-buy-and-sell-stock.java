class Solution {
    public int maxProfit(int[] prices) {
        int min= Integer.MAX_VALUE;
        int maxProfit= 0;
        for(int price:prices){
            if(price<min){
                min= price;
            } else{
                int profit= price-min;
                maxProfit= Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}