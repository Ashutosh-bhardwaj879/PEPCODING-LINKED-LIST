class main21 {
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

        public void reversePRHelper(Node node) {
            if (node == null) {
                return;
            }
            reversePRHelper(node.next);

            if (node == tail) {
                // nothing to do
            } else {
                node.next.next = node;
            }
        }

        public void reversePR() {
            reversePRHelper(head);
            head.next = null;
            Node temp = head;
            head = tail;
            tail = temp;
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
        list.reversePR();
        list.printList();
    }
}
