import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int count = input.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Sum = " + sum(numbers));
        input.close();
    }

    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
