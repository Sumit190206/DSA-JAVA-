import java.util.*;;
public class Classroom {
    // ============== InterLeaves ====================
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

    // leetcode 16 closest sum ============ 
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } 
                else if (sum > target) {
                    right--;
                } 
                else {
                    return sum;
                }
            }
        }

        return closest;
    }

    // ===========  LeetCode Q 2073===============
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        int time = 0;

        for(int i = 0; i < tickets.length; i++){
            q.add(new int[]{tickets[i], i});
        }

        while(true){
            int[] person = q.remove();

            person[0]--;     
            time++;
            if(person[1] == k && person[0] == 0){
                return time;
            }
            if(person[0] > 0){
                q.add(person);
            }
        }
    }


}
