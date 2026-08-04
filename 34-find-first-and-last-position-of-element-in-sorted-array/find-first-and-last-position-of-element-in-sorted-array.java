class Solution {
      int lowerBound(int[] nums, int target) {
        // code here
        int n=nums.length;
        int lo=0,hi=n-1;
        int ans=n;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>=target){
                ans=mid;
                hi=mid-1;
            } 
            else lo=mid+1;
        }
        return ans;
    }
       int upperBound(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = n;
        while (lo<=hi) {
            int mid=lo+(hi-lo) / 2;

            if (nums[mid]>target) {
                ans=mid;
                hi=mid-1;
            } else {
                lo=mid+1;
            }
        }
        return ans;
    }
   public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);
        // Target doesn't exist
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }
        int last = upperBound(nums, target) - 1;
        return new int[]{first, last};
    }
}