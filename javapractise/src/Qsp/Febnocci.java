package Qsp;

import java.util.Scanner;

public class Febnocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println(a+" "+b);
        for (int i=1;i<=n;i++){
            c=a+b;
             a=b;
                b=c;

            System.out.println(" "+c);


        }
    }
}
