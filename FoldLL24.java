class main24 {
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

        public void foldHelper(Node right, int flag) {
            if (right == null) {
                return;
            }

            foldHelper(right.next, flag + 1);

            if (flag > size / 2) {
                Node temp = left.next;
                left.next = right;
                right.next = temp;
                left = temp;
            } else if (flag == size / 2) {
                tail = right;
                tail.next = null;
            }

        }

        Node left;

        public void fold() {
            left = head;
            foldHelper(head, 0);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        //list.addLast(6);
        list.printList();
        list.fold();
        list.printList();
    }
}
