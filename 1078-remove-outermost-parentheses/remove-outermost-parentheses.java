class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        int balance=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(balance>0){
                    ans.append('(');
                }
                balance++;
            }
            else{
                balance--;
                if(balance>0){
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }
}