class Solution {
    public int maxProfit(int[] prices) {
        int maxGain = 0;
        int i = 0;
        int j = 0;

        while (i < prices.length) {
            while (j < prices.length && prices[j] >= prices[i]) {
                maxGain = Math.max(maxGain, prices[j] - prices[i]);
                j++;
            }
            i = j;
            j++;
        }
        return maxGain;
    }
}
