class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=m;
        //transpose nikalo
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                  int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
         for (int i=0;i<n;i++) {
            reverse(matrix[i]);
    }
    
        }
         public void reverse(int[] matrix) {
        int left=0;
        int right=matrix.length - 1;

        while (left<right) {
            int temp = matrix[left];
            matrix[left] = matrix[right];
            matrix[right] = temp;
            left++;
            right--;
    }
}}