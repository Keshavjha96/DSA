class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int ele:piles){
                max=Math.max(max,ele); 
        }
        int lo=1,hi=max,speed=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(hours(mid,piles)<=h){
                hi=mid-1;
                speed =mid;
            }
            else lo=mid+1;
        }
        return speed;
    }
    private long hours(int speed,int[] piles){
        long hour=0;
        for(int ele:piles){
        if(ele%speed==0) hour+=ele/speed;
        else hour+=(ele/speed+1);
        }
        return hour;
    }
}