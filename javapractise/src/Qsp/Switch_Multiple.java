package Qsp;

import java.net.InetAddress;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch_Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
       System.out.println("enter choice ");
        int choice=sc.nextInt();
        switch(choice) {
            case 1:
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }

                System.out.println("factorial  is :" + fact);
                break;
            case 2:
                int count = 0;

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(n + "prime number");
                } else {
                    System.out.println(n + "not prime ");
                }
                break;
            case 3:
                System.out.println("Enter 2 numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Before Swap: " + a + " " + b);
                a = a + b;
                b = a - b;
                a = a - b;
                System.out.println("After Swap: " + a + " " + b);
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    int p = n * i;

                    System.out.println(n + "*" + i + "=" + p);
                }
                break;
            default:
                System.out.println("invalid data");
                break;

        }
    }
}
