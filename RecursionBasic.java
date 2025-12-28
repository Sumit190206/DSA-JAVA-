public class RecursionBasic {

// Print number from n to  1 in decreasing order 
public static void printDec(int n){
   
    if(n==1){
        System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    printDec(n-1);
}


// Print number from n to  1 in Increasing Order
public static void printInc(int n){
     if(n==1){
        System.out.print(n+" ");
        return;
    }
    printInc(n-1);
    System.out.print(n+" ");
}


// factorial of n number:
public static int fact(int n ){
    if(n==0){
        return 1;
    }
    int fact1= fact(n-1);
    
    int f= n * fact(n-1);
    return f;
}

// Sum of first n natural number 
public static int sum(int n ){
    if(n==1){
        return 1;
    }
    int s2 = sum(n-1);
    int s1= n+sum(n-1);
    return s1;
}


// nth fibonacci number
public static int fib(int n){
    if(n==0 || n==1){
        return n;
    }
    int s1=fib(n-1);
    int s2=fib(n-2);
    int fibo=s1+s2;
    return fibo;
}
// Check the array is sorted or not 
public static boolean sortedarr(int arr[],int i){
    if(i == arr.length-1){
        return true;
    }
    if(arr[i]>arr[i+1]){
        return false;
    }
    return sortedarr(arr, i+1);
}

// find the first occurence of key in array
public static int firstOcc(int arr[],int i,int key){
    if( arr[i]==key){
        return i;
    }
    if(i == arr.length-1){
        System.out.println("key not found");
        return -1;
    }
    return firstOcc(arr, i+1, key);
}
// power function 
public static int pow(int x,int n){
    if(n==0)
        return 1;
    return x*pow(x, n-1);
}

// Tilling problem
public static int tillaingPro(int n){
    if(n==0 || n==1){
        return 1;
    }
    int vertical=tillaingPro(n-1);

    int horizontal = tillaingPro(n-2);

    int totalways= vertical + horizontal;
    return totalways;
}

// remove duplicate from a string ---
public static void removeDuplicate(String str,int idx,StringBuilder newstr,boolean map[]){
    if(idx==str.length()){
        System.out.println(newstr);
        return;
    }
    char current = str.charAt(idx);
    if(map[current-'a']==true){
        removeDuplicate(str, idx+1, newstr, map);
    }
    else{
        map[current-'a']=true;
        removeDuplicate(str, idx+1, newstr.append(current), map);
    }

}

// friend paring problem --------------
public static int friendPair(int n){
    if(n==1 || n==2){
        return n;
    }
    // single pair
    int singlePair = friendPair(n-1);

    // pair with friend-----
    int fnm2 = friendPair(n-2);
    int pairWay=(n-1)*fnm2;


    // totoal ways 
    int total=singlePair+pairWay;
    return total;
}

// binary string 

public static void binString(int n,int lastplace,String str){
    if(n==0){
        System.out.println(str);
        return;
    }
    binString(n-1, 0, str+="0");
    if(lastplace==0){
        binString(n-1,1,str+="1");
    }
}
    public static void main(String[] args) {
    //   String str="summmittpatill";
    //  removeDuplicate(str, 0, new StringBuilder(""), new boolean [26]); 
     int n=3;
    // System.out.println(friendPair(n));
    binString(n, 0, "");

    }
    
}
