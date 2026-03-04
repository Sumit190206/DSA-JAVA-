import java.util.*;
public class StackA {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    // static class Stack {
// --------------------------Stack opration using arraylist----------------------------
    //     static ArrayList<Integer>list= new ArrayList<>();

    //     public static Boolean isEmpty(){
    //         return list.size() == 0;
    // }
    //     public static void push(int data){
    //         list.add(data);
    //     }
    //     public static int pop(){
    //         int top = list.get(list.size()-1);
    //         int remove = list.removeLast();
    //         return remove;
    //     }
    //     public static int peek(){
    //         int top = list.get(list.size()-1);
    //         return top;
    //     }
// ---------------------------Stack opration using Linked list----------------------------
    //     static Node head = null;
    //     public static boolean isEmpty(){
    //         return head == null;
    //     }
    //     public static void push(int data){
    //         Node temp = new Node(data);
    //         if(isEmpty()){
    //            head = temp;
    //            return;
    //         } 
    //         temp.next =head;
    //         head=temp;
    //     }
    //     public static int pop(){
    //         if(isEmpty()){
    //             return-1;
    //         }
    //        int top = head.data;
    //        head = head.next;
    //        return top;
    //     }
    //     public static int peek(){
    //         if(isEmpty()){
    //             return -1 ;
    //         }
            
    //         return head.data;
    //     }
    // }
    // ============reverse a string====================
    public static void reverseString(Stack<Character>s,String str){
        for(int i= 0;i<str.length();i++){
            s.push(str.charAt(i));
         }
         StringBuilder result = new StringBuilder();
         while(!s.isEmpty()){
            result.append(s.pop());
            
         }
        System.out.println(result.toString());
         
        }
   //===============reverse a string==================== 
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
// ================reverse a stack====================
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    // =================Stock span=======================
    public static void stockSpan(int stock[] , int span[]){
        span[0]=1;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for(int i = 1;i<stock.length;i++){
            int currentPrice = stock[i];
            while(!s.isEmpty() && currentPrice > stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else {
                int pre = s.peek();
                span[i]=i-pre;
            }
            s.push(i);
        }
        
    }
    // ================= valide parentheses================
    public static boolean valideParentheses(String str){
            Stack<Character>s = new Stack<>();
           for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if (ch =='(' || ch =='[' || ch =='{') {
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='('&& ch ==')' || s.peek()=='[' && ch ==']' || s.peek()=='{'&& ch == '}'){
                    s.pop();
                }
                else{
                    return false;
                }
            }
           }
           if(s.isEmpty()){
            return true;
           }
           else{
            return false;
           }
        }
        // =============finding next grater=================
   
    public static boolean duplicateParentheses(String str){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        if(ch == ')'){
            int count =0;
            while(s.peek() != '('){
                s.pop();
                count++;
            }
            if(count<1){
                return true;
            }
           else{
            s.pop();
           }
        }
        else{
            s.push(ch);
        }
        }
     return false;
    }

    // ==============Max area of histogram================
    public static void maxArea(int arr[]){
        int maxarea =0;
        int nsr[]= new int[arr.length];
        int nsl[]=new int[arr.length];
        Stack<Integer> s = new Stack<>();
        // right smaller
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // left smaller
        s = new Stack<>();
         for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // area=height *width (width = right smaller - left smaller - 1)
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int area= height * width;
            maxarea=Math.max(maxarea,area);
        }
        System.out.println("THE MAXIMUM AREA OF HISTOGRAM IS : "+ maxarea);

    }

    public static void main(String[] args) {
    int arr[]={2,1,5,6,2,3};
    maxArea(arr);
    }
}

// ============ LEET CODE 155================-
class MinStack {
    Stack<Integer>s;
    Stack<Integer>minStack;
    public MinStack() {
        s= new Stack<>();
        minStack= new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
  public void pop() {
    if (s.isEmpty()) return;

    int removed = s.pop();
    if (!minStack.isEmpty() && removed == minStack.peek()) {
        minStack.pop();
    }
}

    
    public int top() {   
    return s.peek();  
}
    
    
    public int getMin() {
    if (minStack.isEmpty()) {
        throw new RuntimeException("Stack is empty");
    }
    return minStack.peek();
}
}
