import java.util.*;
public class QueueB {
    static class Queue {
        static int  arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
            size = n;
            rear =-1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("array is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i< rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
        // ============  QUEUE USING TWO STACK  ===================
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isempty(){
            return s1.isEmpty();
        }

        public static void addd(int data){
           while(!s1.isEmpty()){
            s2.push(s1.pop());
           }
           s1.push(data);
           while (!s2.isEmpty()) {
            s1.push(s2.pop());
           }
        }
        public static int remoove(){
            if(isempty()){
                System.out.println("QUEUE IS EMPTY");
                return-1;
            }
            return s1.pop();
        }
        public static int peekk(){
            if(isempty()){
                System.out.println("QUEUE IS EMPTY");
                return-1;
            }
            return s1.peek();
        }
    }
    // =============circular queue======================
    static class QueueCi {
        static int  arr[];
        static int size;
        static int front;
        static int rear;
        QueueCi(int n){
            arr=new int[n];
            size = n;
            rear =-1;
            front =-1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isfull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isfull()){
                System.out.println("array is full");
                return;
            }
            if(front ==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int result = arr[front];
            if(front == rear){
                front =-1;
                rear = -1;
            }
            else{
                front =(front+1)%size;
            }
            return result;
        }
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    static class  Node{
       int data;
       Node next;

       Node(int data){
        this.data=data;
        this.next = null;
       }
    }
    static class QueueLL{
       static Node head = null;
       static Node tail = null;
       
       public static boolean isEmpty(){
        return head == null && tail ==null;
       }
       public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail =newNode;
            return;
        }
        tail.next=newNode;
        tail = newNode;
       }
       public static int remove(){
        if(isEmpty()){
            return-1;
        }
        Node temp = head;
        if(head == tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
        return temp.data;
       }
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
       }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.addd(1);
        q.addd(2);
        q.addd(3);
        while(!q.isempty()){
            System.out.println(q.peekk());
            q.remoove();
        }
        }
    }

    

