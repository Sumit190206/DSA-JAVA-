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
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // interLeaves(q);
        queueReversal(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() + "  ");
        }
        System.out.println();
        Deque<Integer>d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d);
    }
}
