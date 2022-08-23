package QspModule2;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PalArm {
    public static void armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Neumber");
        int num = sc.nextInt(), arm = 0, rem, temp = num;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            arm = arm + rem * rem * rem;

        }
        if (arm == temp) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");

        }
        System.out.println(num);
    }
    public static void palindrom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Neumber");
        int num = sc.nextInt(), rev=0, rem, cp = num;
        while (num > 0) {
            rem = num % 10;
            num = num/10;
            rev = rev*10+ rem;
        }
        if (rev == cp) {
            System.out.println("plindrom");
        } else {
            System.out.println("not palindrom");
        }
    }

    public static void main(String[] args) {
        armstrong();
        palindrom();
    }

}