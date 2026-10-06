import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = scanner.next();

        int[] count = new int[256];
        Queue<Character> queue = new LinkedList<>();

        for (char ch : text.toCharArray()) {
            count[ch]++;
            queue.add(ch);

            while (!queue.isEmpty() && count[queue.peek()] > 1) {
                queue.remove();
            }

            if (queue.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
