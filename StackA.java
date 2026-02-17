import java.util.ArrayList;
public class StackA {
    static class Stack {
        static ArrayList<Integer>list= new ArrayList<>();

        public static Boolean isEmpty(){
            return list.size() == 0;
    }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top = list.get(list.size()-1);
            int remove = list.removeLast();
            return remove;
        }
        public static int peek(){
            int top = list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        ArrayList<Integer> list = new ArrayList<>();
        s.push(1);
        s.push(2);
        s.push(3);
       System.out.println(s.pop());
       System.out.println(s.peek());
        
    }
}