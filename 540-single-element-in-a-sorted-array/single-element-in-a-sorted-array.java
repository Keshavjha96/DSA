class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int st=0,end=n-1;
        if(n==1) return nums[0];

        while(st<=end){
            int mid =st+(end-st)/2;

            if(mid == 0 && nums[0]!=nums[1]) return nums[mid];
            if(mid==n-1 && nums[n-1]!=nums[n-2]) return nums[n-1];

            if(nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]) return nums[mid];

            if(mid % 2==0){//even
            if(nums[mid-1]==nums[mid]){//left
                end=mid-1;
            }
            else{
                st=mid+1;//right
            }
         }
            else{//odd
                if(nums[mid-1]==nums[mid]){
                st=mid +1;//right
            } 
            else{
                end=mid-1;//left
            }
            }
        }
        return -1;
    }
}