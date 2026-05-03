class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int minHeight = Math.max(heights[i], heights[j]);
        int maxA =  (Math.min(heights[i], heights[j])) * (j - i);

        while (i < j) {
            int currA = (Math.min(heights[i], heights[j])) * (j - i);
            if (currA > maxA) {
                maxA = currA;
            }

            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxA;
    }
}
