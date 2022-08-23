package Qsp;

import java.util.Scanner;
public class PrimeNumber2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");// methode 1
       int num = sc.nextInt();
       int count = 0;

       for (int i = 1; i <= num; i++) {
           if (num % i == 0) {
               count++;
           }
       }
       if (count == 2){
           System.out.println(num + "prime number");
       }

       else{
           System.out.println(num + "not prime ");
       }


// method 2

 /*  boolean status=true;     // another method prime number
   for (int i=2;i<num;i++){
       if (num%i==0){
           status=false;
           break;
       }
   }
   if(status==tru e)
       System.out.println(num + "prime");
   else
           System.out.println(num + "not prime");*/

   }
    }
