import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number count: ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter window size: ");
        int k = scanner.nextInt();

        if (k < 1 || k > count) {
            System.out.println("Window size must be between 1 and the number count.");
            scanner.close();
            return;
        }

        int[] result = new int[count - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        int resultIndex = 0;

        for (int i = 0; i < count; i++) {
            while (!queue.isEmpty() && queue.peekFirst() <= i - k) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && numbers[queue.peekLast()] <= numbers[i]) {
                queue.removeLast();
            }
            queue.addLast(i);

            if (i >= k - 1) {
                result[resultIndex++] = numbers[queue.peekFirst()];
            }
        }

        for (int maximum : result) {
            System.out.print(maximum + " ");
        }
        System.out.println();
        scanner.close();
    }
}
