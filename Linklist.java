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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
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

    public static void main(String[] args) {
        Linklist ll = new Linklist();
       ll.addFirst(2);
       ll.addFirst(1);
       ll.addLast(3);
       ll.addLast(4);
       ll.printList();
    }
    
}
