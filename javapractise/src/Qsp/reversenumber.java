package Qsp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num =sc.nextInt();
        int rev =0;
       while (num >0) {
            int rem = num % 10;
            num = num / 10;
            rev = rev * 10 + rem;


      /*  for(;0<num;){
            int rem=num%10;
            num=num/10;
            rev=rev*10+rem;

        }*/
       // System.out.println(rev);
    }
        System.out.println(rev);
}
}
