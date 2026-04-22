class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> dict = new HashMap<>();

        for (String str : strs) {
            int[] key = new int[26];
            for (int i = 0; i < str.length(); i++) {
                key[((int) str.charAt(i) - 97)]++;
            }
            dict.computeIfAbsent(Arrays.toString(key), k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(dict.values());
    }
}
