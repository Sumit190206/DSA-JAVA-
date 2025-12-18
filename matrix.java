import java.util.*;

public class matrix {
    // -------------print matrix---------------
    public static void print(int matrix[][]){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //search element in matrix --------
    public static boolean search(int matrix[][], int key){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Found ");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    // sprial matrix
    public static void sprial(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcolm =0;
        int endcolm=matrix[0].length-1;
        while(startrow<=endrow && startcolm<=endcolm){
            for(int j=startcolm;j<=endcolm;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcolm]+" ");
            }
            for(int j =endcolm-1;j>=startcolm;j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            for(int i = endrow-1;i>=startrow+1;i--){
                if(startcolm == endcolm){
                    break;
                }
                System.out.print(matrix[i][startcolm]+" ");
            }
            startcolm++;
            startrow++;
            endcolm--;
            endrow--;
            
        }
        
        System.out.println("");
    }

    //--------------digonal sum------------
    public static int digonalsum(int matrix[][]){
        int sum = 0;
        for (int i =0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
         Scanner sc= new Scanner(System.in);

         //input 2d array:
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
           }
         }
         // print 2d array:
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                 System.out.print(matrix[i][j] + " ");
             }
             System.out.println();
         }
         int mat[][]={{1,2,3,4},
                         {5,6,7,8},
                     {9,10,11,12},
               {13,14,15,16}};
        search(matrix, 5);
        sprial(mat);
        int arr[][] = {{1,2,3,},{3,4,5,},{6,8,9}};
        System.out.println("sum of digonal is ::" + digonalsum(arr));
        sc.close();
    }
    
}
