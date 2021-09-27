class main23 {
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

        private boolean IsPalindromeHelper(Node right) {
            if (right == null) {
                return true;
            }

            boolean result = IsPalindromeHelper(right.next);

            if (result == false) {
                return false;
            } else if (right.data != left.data) {
                return false;
            } else {
                left = left.next;
                return true;
            }

        }

        Node left;

        public boolean IsPalindrome() {
            left = head;
            return IsPalindromeHelper(head);
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(4);
        list.addLast(1);
        list.printList();
        System.out.println(list.IsPalindrome());

    }
}