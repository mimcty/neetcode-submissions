class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dict = new HashMap<>();

        for (String word : strs) {
            // for each word, maintain a numerical representation
            int[] seen = new int[26];
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                seen[index]++;
            }
            String seenStr = Arrays.toString(seen);
            if (dict.containsKey(seenStr)) {
                List<String> seenAnagrams = dict.get(seenStr);
                seenAnagrams.add(word);
                dict.put(seenStr, seenAnagrams);
            } else {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                dict.put(seenStr, anagrams);
            }
        }
        Collection<List<String>> vals = dict.values();
        List<List<String>> list = new ArrayList<>(vals);
        return list;
    }
}
