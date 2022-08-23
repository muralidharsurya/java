package Qsp;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int rem; int cp=num;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
        if (cp == rev) {
            System.out.println("palindrome number");
        }
            else{
                System.out.println("not palindrome number");
            }

            }
        }

