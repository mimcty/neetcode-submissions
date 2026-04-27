class Solution {
    public boolean isPalindrome(String s) {
        String valid = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            while (!valid.contains(Character.toString(s.charAt(i)))) {
                if (i == s.length() - 1) {
                    return true;
                }
                i++;
            }
            while (!valid.contains(Character.toString(s.charAt(j)))) {
                if (j == 0) {
                    return true;
                }
                j--;
            }
            if ((Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))) {
                return false;
            }
            j--;
        }
        return true;
    }
}
