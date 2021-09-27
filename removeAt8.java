class main8 {
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

        public void removeLast() {
            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                tail = temp;
                temp.next = null;
                size--;
            }
        }

        public void removeAt(int index) {
            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else if (index < 0 || index >= size) {
                System.out.println("index out of bounds");
            } else if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
    }
}
