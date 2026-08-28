class Solution {
    public int findMin(int[] nums) {
        int low=0,hi=nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=hi){
            int mid=low+(hi-low)/2;
            //search space is already sorted
            //then always nums[low] will be smaller
            //in that search space
            if(nums[low]<=nums[hi]){
                ans=Math.min(ans,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
              ans = Math.min(ans, nums[low]);
                low=mid+1;
            }
            else{
                hi=mid-1;
               ans = Math.min(ans, nums[mid]);
            }
        }
        return ans;
    }
}