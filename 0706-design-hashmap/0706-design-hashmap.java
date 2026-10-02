class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] table;

    public MyHashMap() {
        table = new Node[1000];
    }

    public void put(int key, int value) {

        int index = key % 1000;

        Node curr = table[index];

        while (curr != null) {

            if (curr.key == key) {
                curr.value = value;
                return;
            }

            curr = curr.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    public int get(int key) {

        int index = key % 1000;

        Node curr = table[index];

        while (curr != null) {

            if (curr.key == key) {
                return curr.value;
            }

            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {

        int index = key % 1000;

        Node curr = table[index];
        Node prev = null;

        while (curr != null) {

            if (curr.key == key) {

                if (prev == null) {
                    table[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }

                return;
            }

            prev = curr;
            curr = curr.next;
        }
    }
}