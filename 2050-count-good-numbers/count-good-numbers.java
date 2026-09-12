class Solution {
    int M = 1000000007;
    int findPower(long a,long b){
        if(b==0) return 1;

        long half=findPower(a,b/2);
        long result=(half*half)%M;

        if(b%2==1){
            result=(result*a)%M;
        } 
        return (int)result;
    }
    public int countGoodNumbers(long n) {
        long even = findPower(5,(n+1)/2);
        long odd = findPower(4,n/2);
        long answer = (even*odd)%M;

        return (int) answer;
    }
}