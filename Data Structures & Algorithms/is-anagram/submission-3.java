class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int sAsciiVal = (int) s.charAt(i) - 'a';
            arr[sAsciiVal]++;

            int tAsciiVal = (int) t.charAt(i) - 'a';
            arr[tAsciiVal]--;
        }
        
        return Arrays.stream(arr).allMatch(x -> x == 0);
    }
}
