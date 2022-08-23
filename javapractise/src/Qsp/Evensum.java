package Qsp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Evensum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int num=sc.nextInt();
        int sum=0;int rem;
        while(num>0){
            rem=num%10;
            num=num/10;

        if(rem%2==0){
            sum=sum+rem;
            System.out.println(rem);
        }

        }
        System.out.println(sum);

    }
}
