package Patterns;

public class P9 {
    public static void main(String[] args) {

        for(int row=1;row<=4;row++) {
            for (int col = 1; col <= 4; col++) {///888

                if (row<=col)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }}
}

