class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j = numbers.length - 1;
        int sum = 0;
        int[] ret = new int[2];
        for (int i = 0; i < j; i++) {
            System.out.println(numbers[i]);
            System.out.println(numbers[j]);
            if (numbers[i] != numbers[j]) {
                sum = numbers[i] + numbers[j];
            } else {
                i++;
            }
            System.out.println(sum);

            if (sum < target) {
                continue;
            } else if (sum > target) {
                j--;
                i--;
            } else {
                ret[0] = i + 1;
                ret[1] = j + 1;
            }
        }
        return ret;
    }
}
