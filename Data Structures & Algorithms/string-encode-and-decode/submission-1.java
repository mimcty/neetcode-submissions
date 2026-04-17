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
        int pointer = 0;

        while (pointer < str.length()) {
            String len = "";
            while (str.charAt(pointer) != '#') {
                len += str.charAt(pointer);
                pointer += 1;
            }
            pointer += 1;
            
            String word = "";
            for (int i = Integer.parseInt(len); i > 0; i--) {
                word += str.charAt(pointer);
                pointer += 1;
            }

            decoded.add(word);
        }
        return decoded;
    }
}
