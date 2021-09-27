class main6 {
    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public int getFirst() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                return temp.data;
                // return tail.data;
            }
        }

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

        public void addAt(int index, int value) {
            if (index < 0 || index > size) {
                System.out.println("invalid argument");
            } else if (index == 0) {
                addFirst(value);
            } else if (index == size) {
                addLast(value);
            } else {
                Node newNode = new Node();
                newNode.data = value;
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }
    }
}
