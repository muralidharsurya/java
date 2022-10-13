package arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no.of elements ");
      int   n =sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        float averag;

        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum"+sum);
        averag=sum/n;
        System.out.println(averag);



    }
}
