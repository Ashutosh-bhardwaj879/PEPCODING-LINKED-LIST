class main10 {
    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void printList() {
            if(head == null) {
                System.out.println("linkedlist is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void addFirst(int value) {
            Node temp = new Node();
            temp.data = value;
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("linkedlist is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public void reversePI() {
            Node prev = null;
            Node current = head;

            while (current != null) {
                Node upcoming = current.next;
                current.next = prev;
                prev = current;
                current = upcoming;
            }
            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.printList();
        l.reversePI();
        l.printList();
    }
}
