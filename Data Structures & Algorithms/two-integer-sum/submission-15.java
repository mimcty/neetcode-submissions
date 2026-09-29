class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            dict.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (dict.containsKey(secondNum) && dict.get(secondNum) != i) {
                return new int[]{i, dict.get(secondNum)};
            }
        }
        return new int[]{};
    }
}
