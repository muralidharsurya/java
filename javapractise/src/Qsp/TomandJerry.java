package Qsp;

import java.util.Scanner;

public class TomandJerry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name ");
        int num=sc.nextInt();
        if (num%2==0&&num>10&&num<25){
            System.out.println("tomy");
        }
        else if(num%2!=0&&num>10&&num<25){
            System.out.println("jerry");
    }
        else {
            System.out.println("toma and jerry");
        }
}}
