public class patter3 {
    public static void main(String[] args) {
        int n = 5;
        int m = (n*(n+1))/2;
        int temp =1;
        int count = 0;

        for ( int i=0; i<m; i++){
            System.out.print("*");
            count  ++;
            if (temp==count){
                System.out.println("");
                count= 0;
                temp++;
            }
        }
    }
}
