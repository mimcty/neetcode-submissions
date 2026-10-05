class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();

        for (String word : strs) {
            int[] intArr = new int[26];
            for (int i = 0; i < word.length(); i++) {
                int order = word.charAt(i) - 'a';
                intArr[order]++;
            }
            String strArr = Arrays.toString(intArr);
            dict.putIfAbsent(strArr, new ArrayList<>());
            dict.get(strArr).add(word);
        }
        return new ArrayList(dict.values());
    }
}
