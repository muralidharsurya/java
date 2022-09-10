package Patterns;

public class P10 {
    public static void main(String[] args) {

        for(int row=4;row>=1;row--) {
            for (int col = 1; col <= 4; col++) {///888

                if (row<=col)
                    System.out.print(" *  ");
                else
                    System.out.print("  ");
            }
            System.out.println();
}}}
