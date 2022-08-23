package Qsp;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();
        for (int i=1;i<=10;i++){
           int p=num*i;

            System.out.println(num+"*"+i+"="+p);
            
        }
    }
}
