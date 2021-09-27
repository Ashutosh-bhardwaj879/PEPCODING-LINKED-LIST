class main26 {
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
                head = tail = temp;
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

        public static int findIntersection(LinkedList one, LinkedList two) {
            Node t1 = one.head;
            Node t2 = two.head;

            int delta = Math.abs(one.size - two.size);

            if (one.size > two.size) {
                for (int i = 0; i < delta; i++) {
                    t1 = t1.next;
                }
            } else {
                for (int i = 0; i < delta; i++) {
                    t2 = t2.next;
                }
            }

            while (t1 != t2) {
                t1 = t1.next;
                t2 = t2.next;
            }
            return t1.data;
        }

    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);
        l1.addLast(6);
        l1.addLast(7);
        l2.addLast(8);
        l2.addLast(9);
        l2.addLast(5);
        l2.addLast(6);
        l2.addLast(7);
        l1.printList();
        l2.printList();
        System.out.println(LinkedList.findIntersection(l1, l2));
    }
}
