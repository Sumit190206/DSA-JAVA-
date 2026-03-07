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
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    
}
