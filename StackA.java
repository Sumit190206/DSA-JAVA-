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
    public static void pushAtBottom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
    //    Stack s = new Stack();
        // ArrayList<Integer> list = new ArrayList<>();
         Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(4);
        s.push(3);
        pushAtBottom(s,5);
        while(!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
        }
      
        
    }
}