import java.util.Stack;

public class QueueUsingTwoStacks {
    static class SimpleQueue {
        private final Stack<Integer> input = new Stack<>();
        private final Stack<Integer> output = new Stack<>();

        void add(int value) {
            input.push(value);
        }

        int remove() {
            moveItemsIfNeeded();
            if (output.isEmpty()) {
                throw new RuntimeException("Queue is empty.");
            }
            return output.pop();
        }

        int peek() {
            moveItemsIfNeeded();
            if (output.isEmpty()) {
                throw new RuntimeException("Queue is empty.");
            }
            return output.peek();
        }

        private void moveItemsIfNeeded() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.remove());
        System.out.println("Next front: " + queue.peek());
    }
}
