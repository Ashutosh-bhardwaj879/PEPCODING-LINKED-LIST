class main3 {

    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void removeFirst() {
            if (size == 0) {
                System.out.println("linkedlist empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {

    }
}
