import java.util.*;;
public class Classroom {
    // ============== InterLeaves ====================
    public static void interLeaves(Queue<Integer>q){
      
    }
    // =========== Reverse a Queue =============
    public static void queueReversal(Queue<Integer>q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    // ============ Stack using Deque =================
    static class stack {
        Deque<Integer>d= new LinkedList<>();

        public boolean isEmpty(){
            return d.isEmpty();
        }
        public  void push (int data){
            d.addLast(data);
        }
        public  int pop(){
            if(d.isEmpty()){
                return -1;
            }
            return d.removeLast();
        }
        public int peek(){
            if(d.isEmpty()){
                return -1;
            }
            return d.getLast()  ;
        }

            
        }
        // ============= Queue using Deque ============
        static class queue {
        Deque<Integer>d= new LinkedList<>();

        public boolean isEmpty(){
            return d.isEmpty();
        }
        public  void add (int data){
            d.addLast(data);
        }
        public  int remove(){
            if(d.isEmpty()){
                return -1;
            }
            return d.removeFirst();
        }
        public int peek(){
            if(d.isEmpty()){
                return -1;
            }
            return d.getFirst()  ;
        }

            
        }
    public static void main(String[] args) {
       stack s = new stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       System.out.println("Stack :: " + "peek = "+ s.peek());
       while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
       }
       System.out.println();
       queue q = new queue();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       System.out.println("Queue :: " + "peek = "+ q.peek());
       while (!q.isEmpty()) {
        System.out.print(q.remove()+" ");
       }
       System.out.println();
    }
}
