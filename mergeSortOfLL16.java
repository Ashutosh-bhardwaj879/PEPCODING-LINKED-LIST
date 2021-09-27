

class main16 {
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

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static LinkedList mergeTwoSortedList(LinkedList l1, LinkedList l2) {
            Node one = l1.head;
            Node two = l2.head;

            LinkedList res = new LinkedList();

            while (one != null && two != null) {
                if (one.data < two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                res.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                res.addLast(two.data);
                two = two.next;
            }

            return res;
        }

        public static Node midNode(Node head, Node tail) {
            Node fast = head;
            Node slow = head;
            while (fast.next != tail && fast != tail) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public static LinkedList mergeSort(Node head, Node tail) {
            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }
            // Node mid = LinkedList.midNode(head, tail);
            Node mid = midNode(head, tail);
            // LinkedList fsh = LinkedList.mergeSort(head, mid);
            LinkedList fsh = mergeSort(head, mid);
            LinkedList ssh = mergeSort(mid.next, tail);
            LinkedList cl = mergeTwoSortedList(fsh, ssh);
            // LinkedList cl = LinkedList.mergeTwoSortedList(fsh, ssh);
            return cl;
        }

    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(-1);
        list1.addLast(0);
        list1.addLast(23);
        list1.addLast(44);
        list1.addLast(5);
        list1.printList();
        Node mid = LinkedList.midNode(list1.head, list1.tail);
        System.out.println(mid.data);
        LinkedList merged = LinkedList.mergeSort(list1.head, list1.tail);
        merged.printList();
        Node mid1 = LinkedList.midNode(merged.head, merged.tail);
        System.out.println(mid1.data);
    }
}
