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
    
    public static void main(String[] args) {
        int n = 5;
        // System.out.print(fib(n));
        int arr[]={1,2,2,4,4,3};
        // System.out.println(sortedarr(arr, 0)); 
        // System.out.println(firstOcc(arr, 0, 3));
        int x=2;
        System.out.println(pow(x, n));
    }
    
}
