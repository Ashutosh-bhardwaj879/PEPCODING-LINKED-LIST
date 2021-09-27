import java.util.*;

class main12 {
    class LLtoQueueAdapter {
        LinkedList<Integer> list = new LinkedList<Integer>();

        int size() {
            return list.size();
        }

        void add(int val) {
            list.addLast(val);
        }

        int remove() {
            if (size() == 0) {
                System.out.println("queue underflow");
                return -1;
            } else {
                return list.removeFirst();
            }
        }

        int peek() {
            if (size() == 0) {
                System.out.println("queue underflow");
                return -1;
            } else {
                return list.getFirst();
            }
        }
    }
}
