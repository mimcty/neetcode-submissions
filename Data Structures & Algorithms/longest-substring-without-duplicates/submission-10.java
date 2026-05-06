class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 1;
        char[] substrChars = new char[95];
        int i = 0, j = 0;

        if (s.length() == 0) {
            return 0;
        }

        while (j < s.length()) {
            int alphabetIndex = ((int) s.charAt(j) - 32);
            if (alphabetIndex < 0 || alphabetIndex > 126) {
                break;
            }

            if (substrChars[alphabetIndex] != 1) {
                substrChars[alphabetIndex] = 1;
                j++;
                if (j == s.length() && (j - i) > longest) {
                    return j - i;
                }   
            } else {
                int curr = j - i;
                if (curr > longest) {
                    longest = curr;
                }
                i++;
                j = i;
                substrChars = new char[95];  
            }
        }
        return longest;
    }
}
