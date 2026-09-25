/**
 * pattern1
 */
/** 
public class pattern1 {
public static void main(String[] args) {
    int n = 4;
    for ( int i = 0; i<n; i ++){
        System.out.println("****");
    }
}
}
*/

// ( OR )

/**
public class pattern1 {
public static void main(String[] args) {
    int n = 4;
    for ( int i = 0; i<n; i ++){
        for ( int j =0; j<n; j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
}
 
*/

public class pattern1 {
public static void main(String[] args) {
    int n = 4;
    int m = n*n;
    for ( int i = 1; i<m+1; i ++){
        System.out.print("*");
        if ( i %n==0){
            System.out.println("");
        }
    }
}
}