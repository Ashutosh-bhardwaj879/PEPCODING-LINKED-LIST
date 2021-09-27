class main9 {

    static class Node {
        Node next;
        int data;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

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

        private Node getNode(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        // reverse linked list data iterative
        public void reverseDI() {
            int low = 0;
            int high = size - 1;
            while (low < high) {
                Node left = getNode(low);
                Node right = getNode(high);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                low++;
                high--;
            }
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addFirst(2);
        l.addFirst(3);
        l.addFirst(4);
        l.addFirst(5);
        l.printList();
        l.reverseDI();
        l.printList();
    }

}
