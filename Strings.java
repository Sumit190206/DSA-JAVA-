import java.util.*;

public class Strings {

    //------------------Print Function-------------------------
    public static void printL(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
    }
    //------------------Palindrome Function-----------------------
    public static boolean palindrom(String str){
        int n =str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    //----------------Displacemant--------------------------------------
    public static int distance(String str){
        str.toUpperCase();
        int y=0;
        int x=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
             else if(str.charAt(i)=='E'){
                x++;
            }
            else {
                x--;
            }
            
        }
        int result =(int) Math.pow(x, 2) + (int) Math.pow(y, 2);
        int distance = (int) Math.sqrt(result);
        return distance;
    }

    // --------------Substring-------------------------
    public static void subString(String str,int start,int end){
        String sub="";
        for(int i=start;i<end;i++){
            sub+=str.charAt(i);
        }
        System.out.print(sub);
    }


        //------------convet word first letter to upper case------------
        public static String toupper(String str){
            StringBuilder sb = new StringBuilder("");
            sb.append(Character.toUpperCase(str.charAt(0)));
            for(int i=1 ;i<str.length();i++){
                if(str.charAt(i)==' '&& i<str.length()-1){
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
                }
                else{
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
    // --------------------campression------------------------
    public static String campression(String str){
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ----------------concatenate------------- 
        String firstname="Sumit";
        String lastname="Patil";
        String fullname =firstname + " " + lastname;
        System.out.println(fullname);
        // printL(firstname);

        //-------------palindrome---------
         String name="racecar";
         System.out.println("Given string is palindrome ::"+ palindrom(name));


        //--------------------displacement--------------------------
        String dist = "WNEENESENNN";
         System.out.println("Dispalcemaent is ::" + distance(dist));


        // ------------------substring--------------
        String sub="helloworld";
         subString(sub, 0, 5);

        //sub.substring(3,5);

        // upper case

        String str="hi i am sumit";
        System.out.println(toupper(str));

        // -------------compression-----------------
        String CompString="aaabbbccdefff";
        System.out.println("compresed string is :: "+ campression(CompString));
        
        sc.close();
    }
    
}
