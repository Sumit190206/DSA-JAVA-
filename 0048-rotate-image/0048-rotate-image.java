class Solution {
    public void rotate(int[][] matrix) {
        int first = 0;
        int second = 1;
        int n = matrix.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            for(int i=0;i<n;i++){
            int temp = matrix[start][i];
            matrix[start][i]=matrix[end][i];
            matrix[end][i]= temp;
          }
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            for(int j= i+1;j<n;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
    }
}