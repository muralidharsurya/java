package Patterns;

public class p3 {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                if (row == 3 && col == 3)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
