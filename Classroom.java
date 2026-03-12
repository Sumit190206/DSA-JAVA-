import java.util.*;;
public class Classroom {
    public static void interLeaves(Queue<Integer>q){
        int  size = q.size();
        Queue<Integer>q2 = new LinkedList<>();
        for(int i = 0; i<size/2;i++){
            q2.add(q.remove());
        }
        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }

    }
    public static void queueReversal(Queue<Integer>q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
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
    public static void main(String[] args) {
       stack s = new stack();
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);

       while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
       }
    }
}
