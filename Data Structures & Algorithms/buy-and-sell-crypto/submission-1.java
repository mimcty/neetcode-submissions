class Solution {
    public int maxProfit(int[] prices) {
        int maxGain = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                maxGain = Math.max((prices[i] - min), maxGain);
            }
        }
        return maxGain;
    }
}
