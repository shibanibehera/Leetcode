class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                boolean found = true;
                for(int j = 1; j < needle.length(); j++) {
                    if(haystack.charAt(i + j) != needle.charAt(j)) {
                        found = false;
                        break;
                    }
                }
                if(found) return i;
            }
        }
        return -1;
    }
}
