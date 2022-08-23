package Qsp;

import java.util.Scanner;


public class AA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" movie name");
        String mn = sc.next();
        System.out.println("actor name");
        String an = sc.next();
        if (mn.equals("Arya") && an.equals("alluarjun")) {
            System.out.println("feel my love");
        }
        else {
            System.out.println("love is gone");
        }
    }
}