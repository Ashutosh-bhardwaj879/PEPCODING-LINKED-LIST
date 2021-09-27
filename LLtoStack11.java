import java.util.LinkedList;

class main11 {
    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter() {
            list = new LinkedList<Integer>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
        }

        int pop() {
            if (size() == 0) {
                System.out.println("stack underflow");
                return -1;
            }
            return list.removeFirst();
        }

        int top() {
            if (size() == 0) {
                System.out.println("stack underflow");
                return -1;
            }
            return list.getFirst();
        }
    }

    public static void main(String[] args) {

    }
}
