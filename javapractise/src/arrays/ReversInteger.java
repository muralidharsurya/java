package arrays;

import java.util.Scanner;

public class ReversInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array");
        int size   =sc.nextInt();//5
        int a[]=new int[size];
        int sum=0;
        for (int i=0;i<size;i++) {
            a[i] = sc.nextInt();

        }
        // printing
        for (int j=size-1;j>=0;j--) {
           // sum =sum+i;
            sum= sum+a[j];

        }
        System.out.println(sum);
    }
}

