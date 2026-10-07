class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Integer[] freq = new Integer[nums.length];
        Arrays.fill(freq, 0);
        Map<Integer, Integer> dict = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dict.containsKey(nums[i])) {
                dict.put(nums[i], i);
                freq[i]++;
            } else {
                int firstSeenIndex = dict.get(nums[i]);
                freq[firstSeenIndex]++;
            }
        }
        ArrayList<Integer> topFreq = new ArrayList<>(Arrays.asList(freq));
        topFreq.sort(null);
        topFreq.subList(0, freq.length - k).clear();

        int[] solution = new int[k];
        int count = 0;

        while (!topFreq.isEmpty()) {
            for (int i = 0; i < freq.length; i++) {
                if (topFreq.contains(freq[i])) {
                    solution[count] = nums[i];
                    topFreq.remove(freq[i]);
                    count++;
                }
            }
        }
        return solution;
    }
}
