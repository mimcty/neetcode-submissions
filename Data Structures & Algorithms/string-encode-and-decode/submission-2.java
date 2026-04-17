class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String s : strs) {
            encoded += String.format("%d#%s", s.length(), s);
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j += 1;
            }
            int len = Integer.parseInt(str.substring(i, j));
            
            j += 1;
            String word = str.substring(j, j + len);
            decoded.add(word);
            
            i = j + len;
        }
        return decoded;
    }
}
