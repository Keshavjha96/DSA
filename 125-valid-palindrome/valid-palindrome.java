class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        return check(0, sb.toString());
    }
    public boolean check(int i,String s){
        if(i>=s.length()/2){
            return true;
        }

        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return check(i+1,s);
    }
}