package arrays;

import java.util.Scanner;

public class ByUsing {  // by using scanner class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter size of array");
        int size   =sc.nextInt();//5
         int a[]=new int[size];

         for (int i=0;i<size;i++){
             a[i]=sc.nextInt();
         }

         // printing
        for (int j=0;j<size;j++) {
            System.out.println(a[j]);
        }
    }
}
