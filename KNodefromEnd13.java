class main13 {
    static class Node {
        int data;
        Node next;
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

        public int KthFromLast(int k) {
            Node slow = head;
            Node fast = head;
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
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
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.printList();
        System.out.println(list.KthFromLast(0));
        System.out.println(list.KthFromLast(1));
        System.out.println(list.KthFromLast(2));
        System.out.println(list.KthFromLast(3));
        System.out.println(list.KthFromLast(4));
    }

}
