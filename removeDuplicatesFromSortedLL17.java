
class main17 {
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

        public int getFirst() {
            if (size == 0) {
                System.out.println("List empty");
                return -1;
            }
            return head.data;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("linklist is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
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

        public void removeDuplicates() {
            LinkedList res = new LinkedList();
            while (this.size() > 0) {
                int value = this.getFirst();
                this.removeFirst();
                if (res.size() == 0 || res.tail.data != value) {
                    res.addLast(value);
                }
            }
            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(1);
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(4);
        l1.addLast(6);
        l1.printList();
        l1.removeDuplicates();
        l1.printList();
    }
}