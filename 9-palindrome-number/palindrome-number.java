class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
          int n=x;
          if(x<0){
            return false;
            }
        while(x!=0){
            int lastdigit=x%10;
            x=x/10;
            rev=(rev*10)+lastdigit;
        }
        if(rev==n){
            return true;
        }
        else return false;
    }
}