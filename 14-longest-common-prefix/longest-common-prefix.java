class Solution {
    public String longestCommonPrefix(String[] s) {
        String ans = "";
        for (int i=0;i<s[0].length();i++) {
            for (int j=0;j<s.length-1;j++) {

                 if (i>=s[j].length() ||
                    i >=s[j+1].length() ||
                    s[j].charAt(i)!=s[j+1].charAt(i)) {
                    return ans;
                }
            }
            ans += s[0].charAt(i);
        }
        return ans;
    }
}