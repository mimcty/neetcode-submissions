class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> dict = new HashMap<>();

        for (String str : strs) {
            char[] key = new char[26];
            for (int i = 0; i < str.length(); i++) {
                key[(int) str.charAt(i) - 97]++;
            }
            String keyStr = new String(key);
            dict.computeIfAbsent(keyStr, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(dict.values());
    }
}
