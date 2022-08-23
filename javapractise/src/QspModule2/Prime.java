package QspModule2;

import java.util.Scanner;

public class Prime {
    // user define methode
    public static void findprime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt(),count=0;
        for (int i=1;i<=num;i++){
            if(num%i==0)
            count++;
        }
        if(count==2){
            System.out.println("prime number");
        }
        else {
            System.out.println("not prime number");
        }
    }

    public static void main(String[] args) {
        // calling  of method
        findprime();
        findprime();
        findprime();
    }

}

