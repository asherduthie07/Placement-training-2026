import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] grid = new int[rows][columns];

        System.out.println("Enter the grid (0 empty, 1 fresh, 2 rotten):");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                grid[r][c] = scanner.nextInt();
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (grid[r][c] == 2) {
                    queue.add(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;
        int[] rowMove = {-1, 1, 0, 0};
        int[] columnMove = {0, 0, -1, 1};

        while (fresh > 0 && !queue.isEmpty()) {
            int levelSize = queue.size();
            boolean rottedThisMinute = false;

            for (int i = 0; i < levelSize; i++) {
                int[] cell = queue.remove();
                for (int direction = 0; direction < 4; direction++) {
                    int nextRow = cell[0] + rowMove[direction];
                    int nextColumn = cell[1] + columnMove[direction];
                    if (nextRow >= 0 && nextRow < rows && nextColumn >= 0 && nextColumn < columns
                            && grid[nextRow][nextColumn] == 1) {
                        grid[nextRow][nextColumn] = 2;
                        fresh--;
                        rottedThisMinute = true;
                        queue.add(new int[]{nextRow, nextColumn});
                    }
                }
            }

            if (rottedThisMinute) {
                minutes++;
            }
        }

        if (fresh == 0) {
            System.out.println("Minutes to rot all oranges: " + minutes);
        } else {
            System.out.println("Some oranges cannot rot.");
        }
        scanner.close();
    }
}
