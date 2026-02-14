public class Linklist {

    // CREATING A CLASS NODE 
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
        // ADDING A NODE AT STARING POSITION
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
        // ADDING A NODE AT LAST
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
        // FUNCTION TO PRINT A LINKED LIST
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
        // ADDING A NEW NODE AT A SPECIFIC INDEX
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
        // FUNCTION TO REMOVE ELEMENTS FROM FRONT SIDE
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
        // FUNCTION  TO REMOVE ELEMENT FROM REAR PART
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
        // FUNCTION TO SEARCH IN LINKED LIST ITRATIVE APPROCH
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
        //  HELPER FUNCTION
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
        // FUNCTION TO SEARCH IN LINKED LIST IN RECARSIVE APPROCH
        public int research(int key){
            return helper(head,key);
        }
        // FUNCTION TO REVERSE A LIST
        public void reverse(){
            Node prev=null;
            Node curr = tail=head;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next=prev;//here link is reversed
                prev=curr;
                curr=next;
            }
            head=prev;  
        }
        // FUNCTION TO FIND MIDDLE ELEMENT
        public Node findMiddle(Node head){
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        // CHECK WATHER A LIST IS PALINDROME OR NOT
        public boolean checkPal(){
            if(head == null || head.next == null){
                return true;
            }
            Node mid= findMiddle(head);
            Node prev=null;
            Node curr=mid;
            Node next;

            while(curr != null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }

            Node left=head;
            Node right = prev;
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                right=right.next;
                left=left.next;
            }

            return true;
        }
        // CHECK WATHER LIST IS IN CYCLE FORM OR NOT
        public boolean isCycle(Node head){ 
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast=fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        // REMOVING CYCLE 
        public static void removeCycle(){
            Node slow =head;
            boolean cycle=false;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow=slow.next;
                fast=fast.next.next;
                if(slow ==fast){
                    cycle = true;
                    break;
                }
            }
            if(cycle == false){
                return;
            }
            slow= head;
            Node prev = null;
            while(slow != fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;
             
        }
        public Node getmid(Node head){
            Node slow = head;
            Node fast =head.next;
            while (fast  != null && fast.next != null) {
                slow=slow.next;
                fast=fast.next.next;
                
            }
            return slow;
        }


        // MERGE SORT IN LINKED LIST   
        public Node mergeSort(Node head){
            if(head == null || head.next == null){
                return head;
            }
            Node mid= getmid(head);

            Node rightHalf = mid.next;
            mid.next=null;
            Node leftpart = mergeSort(head);
            Node rightPart = mergeSort(rightHalf);
            
            return merge(leftpart,rightPart);

        }

    public static void main(String[] args) {
    //     Linklist ll = new Linklist();
    //    ll.addFirst(2);
    //    ll.addFirst(1);
    //    ll.addLast(4);
    //    ll.add(2, 3);
    //    ll.addLast(5);
    //    ll.printList();
    //    System.out.println(ll.size);
    //    ll.addFirst(4);
    //    ll.removeFirst(); 
    //    ll.printList();
    //    ll.removeLast();
    //    ll.printList();
    //     System.out.println(ll.size);
    //     System.out.println(ll.research(3));
    //     ll.reverse();
    //     ll.printList();
        System.out.println();


        Linklist ll2 = new Linklist();
        ll2.addFirst(1);
        ll2.addLast(2);
        ll2.addLast(2);
        ll2.addLast(1);
        ll2.printList();
        System.out.println(ll2.checkPal());

    }
    
}
