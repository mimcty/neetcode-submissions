class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<>();
        for (int num : nums) {
            dict.put(num, num + 1);
        }

        int maxLen = 0;
        for (int key : dict.keySet()) {
            int length = 1;
            int val = dict.get(key);

            if (dict.containsKey(val)) {
                length = getNextItem(dict, val, length);
            }

            if (length > maxLen) {
                maxLen = length;
            }
        };
        return maxLen;
    }

    public int getNextItem(Map<Integer, Integer> dict, int val, int length) {
        int nextVal = dict.get(val);

        length++;
        if (dict.containsKey(nextVal)) {
             return getNextItem(dict, nextVal, length);
        }
        return length;
    }
}
