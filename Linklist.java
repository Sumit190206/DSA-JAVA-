public class Linklist {
    public static class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            }

        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail=newNode;
        }

        public void printList(){
            if(head == null){
                System.out.println("linked list is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->" );
                temp=temp.next;
            }
            System.out.println("NULL");
        }

        public void add(int index,int data){
            if(index == 0 ){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i =0;
            while(i <index-1){
                temp=temp.next;
                i++; 
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        public int removeFirst(){
            if(size ==0){
                System.out.println("link list is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val = head.data;
                head=tail=null;
                return val;
            }
            int val =  head.data;
            head=head.next;
            size--;
            return val;
        }

        public int removeLast(){
            if(size==0){
                  System.out.println("link list is empty");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val = head.data;
                head=tail=null;
                return val;
            }
            Node prev = head;
            for(int i = 0 ; i < size-2;i++){
                prev=prev.next;
            }
            int val = prev.next.data;
            prev.next=null;
            tail = prev;
            size--;
            return val;

        }

        public int itsearch(int key){
            int i=0;
            Node temp = head;
            while(temp!=null){
                if(temp.data==key){
                    // System.out.print("KEY FOUND AT INDEX :: " + i);
                    return i;
                }
                    temp=temp.next;
                    i++;
            }
            // System.err.println("key not found");
            return -1;
        }
         
        public int helper(Node head,int key){
            if(head == null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next, key);
            if(idx == -1){
                return -1;
            }
            return idx+1;
        }

        public int research(int key){
            return helper(head.next,key);
        }

    public static void main(String[] args) {
        Linklist ll = new Linklist();
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(3);
       ll.add(1, 4);
       ll.addLast(5);
       ll.printList();
       System.out.println(ll.size);
       ll.removeFirst();
       ll.printList();
       ll.removeLast();
       ll.printList();
        System.out.println(ll.size);
        System.out.println(ll.research(9));
    }
    
}
