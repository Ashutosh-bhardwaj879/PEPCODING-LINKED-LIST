class main19 {
    static class Node {
        int data;
        Node next;
    }

    static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void removeFirst() {
            if (size == 0) {
                System.out.println("list is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
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

        public int size() {
            return size;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("list is empty");
                return -1;
            }
            return head.data;
        }

        public void kReverse(int k) {
            LinkedList prev = null;

            while (this.size > 0) {
                LinkedList current = new LinkedList();

                if (this.size >= k) {

                    for (int i = 0; i < k; i++) {

                        int value = this.getFirst();
                        this.removeFirst();
                        current.addFirst(value);
                    }

                } else {
                    int os = this.size();
                    for (int i = 0; i < os; i++) {

                        int value = this.getFirst();
                        this.removeFirst();
                        current.addLast(value);
                    }
                }

                if (prev == null) {
                    prev = current;
                } else {
                    prev.tail.next = current.head;
                    prev.tail = current.tail;
                    prev.size += current.size;
                }
            }
            this.head = prev.head;
            this.tail = prev.tail;
            this.size = prev.size;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);
        l.printList();
        l.kReverse(8);
        l.printList();
    }
}
