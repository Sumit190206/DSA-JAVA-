public class Backtracking {
    // nQueens
    public static void nQueens(char arr[][],int row){
        if(row == arr.length){
            printarr(arr);
            return;
        }
        

        for(int j=0;j<arr.length;j++){
            if(isSafe(arr, row, j)){
                 arr[row][j]='Q';
                 nQueens(arr, row+1);
                 arr[row][j]='x';
  
            }
           
        }
    }
    public static boolean isSafe(char arr[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q')
            return false;
        }
        for(int i=row-1 ,j=col-1;i>=0 && j>=0;i--,j--){
           if( arr[i][j]=='Q')
            return false;
        }
         for(int i=row-1 ,j=col+1;i>=0 && j<arr.length;i--,j++){
           if( arr[i][j]=='Q')
            return false;
        }
        return true;

    }
    public static void printarr(char arr[][]){
        System.out.println("_____________________________________");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    //Grid
    public static int Grid(int i,int j,int n, int m) {
        if(i ==n-1&& j==m-1){
            return 1;
        }else if(i==n||i==n){
            return 0;
        }
        int w1= Grid(i+1, j, n, m);
        int w2= Grid(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[]){
        int n=4;
        char board[][] = new char[n][n]; 
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        nQueens(board, 0);

    }
    
}
