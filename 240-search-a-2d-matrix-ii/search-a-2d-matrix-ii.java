class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length,n=arr[0].length;
        int r=0,c=n-1;
        while(r<m && c>=0){  //TC=m+n
           if(target==arr[r][c]){
            return true;
           }
           else if(target < arr[r][c]){
            c--;
           }
           else{
            r++;
           }
        }
        return false;
        }
    }
    