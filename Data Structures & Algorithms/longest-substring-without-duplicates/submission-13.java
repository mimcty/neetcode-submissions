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

            if (substrChars[alphabetIndex] <= i) {
                substrChars[alphabetIndex] = (char) (j + 1);             // 1-indexed because 0 means not seen before in substr
                j++;
                if (j == s.length() && (j - i) > longest) {
                    return j - i;
                }   
            } else {
                int curr = j - i;
                if (curr > longest) {
                    longest = curr;
                }
                i = substrChars[alphabetIndex];
                substrChars[alphabetIndex] = (char) (j + 1);  
                j++;
            }
        }
        return longest;
    }
}
