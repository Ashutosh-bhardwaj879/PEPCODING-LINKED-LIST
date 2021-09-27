class main25 {
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

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static int addListHelper(Node one, int pv1, Node two, int pv2, LinkedList res) {

            if (one == null && two == null) {
                return 0;
            }

            int data = 0;

            if (pv1 > pv2) {
                int oc = addListHelper(one.next, pv1 - 1, two, pv2, res);
                data = one.data + oc;

            } else if (pv1 < pv2) {
                int oc = addListHelper(one, pv1, two.next, pv2 - 1, res);
                data = two.data + oc;
            } else {
                int oc = addListHelper(one.next, pv1 - 1, two.next, pv2 - 1, res);
                data = one.data + two.data + oc;
            }

            int nd = data % 10;
            int nc = data / 10;
            res.addFirst(nd);
            return nc;

        }

        public static LinkedList addTwoLists(LinkedList one, LinkedList two) {
            LinkedList res = new LinkedList();
            int oc = addListHelper(one.head, one.size, two.head, two.size, res);
            if (oc > 0) {
                res.addFirst(oc);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list2 = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list2.addLast(6);
        list2.addLast(6);
        list2.addLast(6);
        list2.addLast(6);
        list2.addLast(6);
        list.printList();
        list2.printList();
        LinkedList n = LinkedList.addTwoLists(list, list2);
        n.printList();
    }
}
