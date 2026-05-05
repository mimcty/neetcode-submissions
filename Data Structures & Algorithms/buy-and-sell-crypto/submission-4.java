class Solution {
    public int maxProfit(int[] prices) {
        int maxGain = 0;
        int i = 0, j = 1;

        while (j < prices.length) {
            if (prices[j] >= prices[i]) {
                maxGain = Math.max(maxGain, prices[j] - prices[i]);
            } else {
                i = j;
            }
            j++;
        }
        return maxGain;
    }
}
