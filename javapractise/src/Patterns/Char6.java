package Patterns;

public class Char6 {
    public static void main(String[] args) {
        char b = 'A';
        for (char row = 'A'; row <= 'C'; row++) {
            for (char col = 'A'; col <='C'; col++) {
                System.out.print(b);
                b++;

            }
            System.out.println();
        }
    }}