class Solution {
    public boolean isPalindrome(String s) {
        String valid = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int j = s.length() - 1;
        for (int i = 0; i < j; i++) {
            while (i < j && !valid.contains(Character.toString(s.charAt(i)))) {
                i++;
            }
            while (j > i && !valid.contains(Character.toString(s.charAt(j)))) {
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
