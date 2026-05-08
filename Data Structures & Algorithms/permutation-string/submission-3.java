class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            map[(int) s1.charAt(i) - 'a'] += 1;
        }
        int i = 0;
        int j = 0;

        while (j < s2.length()) {
            while (j < s2.length() && map[(int) s2.charAt(j) - 'a'] == 0) {
                j++;
                i++;
            }

            int len = 0 + (j - i);
            while (j < s2.length() && map[(int) s2.charAt(j) - 'a'] != 0) {
                map[(int) s2.charAt(j) - 'a'] -= 1;
                j++;
                len++;
            }
            if (len == s1.length()) {
                return true;
            } else {
                if (j == s2.length()) {
                    break;
                }
                while (i < j) {
                    map[(int) s2.charAt(i) - 'a'] += 1;
                    i++;
                    if (s2.charAt(i - 1) == s2.charAt(j)) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
