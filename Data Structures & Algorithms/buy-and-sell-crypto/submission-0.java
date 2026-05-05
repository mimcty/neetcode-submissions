class Solution {
    public int maxProfit(int[] prices) {
        int maxGain = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int gain = prices[i] - min;
                if (gain > maxGain) {
                    maxGain = gain;
                }
            }
        }
        return maxGain;
    }
}
