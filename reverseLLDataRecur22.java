class main22 {
    static class Node {
        Node next;
        int data;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int value) {
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            if (size == 0) {
                tail = head = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void reverseDRHelper(Node right, int floor) {
            if (right == null) {
                return;
            }
            reverseDRHelper(right.next, floor + 1);

            if (floor >= size / 2) {
                int temp = right.data;
                right.data = left.data;
                left.data = temp;

                left = left.next;
            }
        }

        Node left;

        public void reverseDR() {
            left = head;
            reverseDRHelper(head, 0);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.printList();
        list.reverseDR();
        list.printList();
    }
}