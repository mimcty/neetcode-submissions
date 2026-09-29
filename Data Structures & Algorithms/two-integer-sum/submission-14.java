class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            dict.put(nums[i], i);
        }

        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];

            if (dict.containsKey(secondNum)) {
                int secondIdx = dict.get(secondNum);
                if (secondIdx != i) {
                    answer[0] = i;
                    answer[1] = secondIdx;
                    break;
                }

            }
        }
        return answer;
    }
}
