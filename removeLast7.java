class main7 {
    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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
    }
}
