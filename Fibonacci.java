import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = input.nextInt();

        int first = 0;
        int second = 1;

        while (first <= limit) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        input.close();
    }
}
