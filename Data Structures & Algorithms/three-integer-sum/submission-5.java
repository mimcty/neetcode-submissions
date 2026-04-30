class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < nums.length / 2; start++) {
            int i = start + 1;
            int j = nums.length - 1;
            
            if (start > 0 && nums[start] == nums[start - 1]) {
                continue;
            }

            while (i < j) {
                int sum = nums[start] + nums[i] + nums[j];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[start], nums[i], nums[j]));
                    while (i < j && nums[i+1] == nums[i]) {
                        i = i + 1;
                    }
                    while (i < j && nums[j-1] == nums[j]) {
                        j = j - 1;
                    }
                    i++;
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return result;
    }
}
