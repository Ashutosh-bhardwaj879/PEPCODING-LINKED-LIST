class main4 {

    public static class Node {
        Node next;
        int data;
    }

    public static class LinkedList {
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
                for (int i = 0; i < size-1; i++) {
                    temp = temp.next;
                }
                return temp.data;
                // return tail.data;
            }
        }

        public int getAt(int index) {
            if (size == 0) {
                System.out.println("list os empty");
                return -1;
            } else if (index < 0 || index >= size) {
                System.out.println("index out of range");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void display() {
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
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        System.out.println(list.getLast());
        
    }
}
