class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqs = new HashMap<>();
        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> sortedFreqs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sortedFreqs.add(new ArrayList<>());
        }

        freqs.forEach((key, value) -> {
            sortedFreqs.get(value - 1).add(key);
        });

        int[] solution = new int[k];
        int count = 0;

        for (int i = sortedFreqs.size() - 1; i >= 0; i--) {
            List<Integer> freq = sortedFreqs.get(i);
            for (Integer num : freq) {
                solution[count] = num;
                count++;
                if (count == k) {
                    return solution;
                }
            }
        }
        return solution;
    }
}
