import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3]; 
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a " + i + " row");
            for (int j = 0; j < 3; j++) {
                a[i][j] = scan.nextInt();
            }
           // System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter b " + i + " row");
            for (int j = 0; j < 3; j++) {
                b[i][j] = scan.nextInt();
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
