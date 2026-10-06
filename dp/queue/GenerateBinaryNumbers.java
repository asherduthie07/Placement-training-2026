import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Generate binary numbers from 1 to n. Enter n: ");
        int n = scanner.nextInt();

        Queue<String> queue = new LinkedList<>();
        if (n > 0) {
            queue.add("1");
        }

        for (int i = 1; i <= n; i++) {
            String current = queue.remove();
            System.out.print(current + " ");
            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println();
        scanner.close();
    }
}
