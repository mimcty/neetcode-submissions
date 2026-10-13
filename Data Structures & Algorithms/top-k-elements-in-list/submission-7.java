class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] countingArr = new int[2001];
        for (int num : nums) {
            countingArr[num + 1000]++;
        }

        List<List<Integer>> frequencyArr = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            frequencyArr.add(new ArrayList<>());
        }

        // index is the num in nums, +1000
        for (int i = 0; i < 2001; i++) {
            int freq = countingArr[i];
            if (freq > 0) {
                frequencyArr.get(freq).add(i - 1000);
            }
        }

        // now frequencyArr stores frequencies as index and at each bucket, 
        // has an arraylist with the nums that have those frequencies
        int[] solution = new int[k];
        int count = 0;

        for (int i = nums.length; i > 0; i--) {
            List<Integer> listOfNums = frequencyArr.get(i);
            for (int n : listOfNums) {
                solution[count] = n;
                count++;
                if (count == k) {
                    return solution;
                }
            }
        }
        return new int[k];
    }
}
