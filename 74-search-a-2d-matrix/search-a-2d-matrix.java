class Solution {
    public boolean searchinRow(int[][] matrix,int target,int row){
        int n=matrix[0].length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target==matrix[row][mid]){
                return true;
            }
            else if(target>matrix[row][mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        //BS on the row
        int m=matrix.length,n=matrix[0].length;

        int startRow=0,endRow=m-1;
        while(startRow<=endRow){
            int midRow=startRow+(endRow-startRow)/2;

            if(target>=matrix[midRow][0] && target<= matrix[midRow][n-1]){
                //found the row =>BS on this row
               return searchinRow(matrix, target, midRow);
            }
            else if(target>= matrix[midRow][0]){
                //down => right
                startRow=midRow+1;
            }
            else{
                //up => left
                endRow=midRow-1;

            }
        }
        return false;
    }
}