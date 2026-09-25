 public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int totalNumbers = (n * (n + 1)) / 2; 
        int m = n; 
        int count = 0;              

        for (int i = 0; i < totalNumbers; i++) {
            System.out.print("*");
            count++;

            if (count == m) {
                System.out.println();   
                m--;  
                count = 0;              
            }
        }
    }
}
