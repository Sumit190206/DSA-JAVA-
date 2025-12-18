public class patters {
    //*********************************************************************************************************************************** */
    public static void hollow_rectangle(int row,int coloum){
        //outer loop
        for(int i=1;i<=row;i++){
            //inner loop
            for(int j =1;j<=coloum;j++){
                if(i==1 || i==row ||j==1||j==coloum){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    //*************************************************************************************************************************************** */
    public static void pyramid(int n){
        for(int i = 1;i<=n;i++ ){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //************************************************************************************** */
    public static void numbers (int n){
        for(int i =1 ;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    /**************************************************************************************************************** */
    public static void triangle_number(int n){
        int a=1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+ "  ");
                a++;
            }
            System.out.println("");
        }
    }/**************************************************************** */
    public static void zero_one(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // pyramid(5);
        // triangle_number(5);
        zero_one(4);
    }
}