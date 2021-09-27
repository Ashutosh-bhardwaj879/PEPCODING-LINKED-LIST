class main5 {
    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int getFirst() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                return temp.data;
                // return tail.data;
            }
        }

        public void addFirst(int value) {
            Node temp = new Node();
            temp.data = value;
            temp.next = head;
            head = temp;
            if(size==0) {
                tail=temp;
            }
            size++;
        }
    }
}
