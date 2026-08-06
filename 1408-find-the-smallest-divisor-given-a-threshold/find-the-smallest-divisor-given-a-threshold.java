class Solution {

    int sumOfD(int[] nums, int divisor) {
        int sum = 0;
        for (int num:nums){
            sum += (num+divisor-1)/divisor;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int low = 1, high = max;
        while (low <= high) {
            int mid = low+(high-low) / 2;
            if (sumOfD(nums,mid)<=threshold) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return low;
    }
}